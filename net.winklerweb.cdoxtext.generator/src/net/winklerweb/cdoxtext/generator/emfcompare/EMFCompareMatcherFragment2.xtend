package net.winklerweb.cdoxtext.generator.emfcompare

import com.google.inject.Inject
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess

import static extension org.eclipse.xtext.GrammarUtil.*
import static extension org.eclipse.xtext.xtext.generator.model.TypeReference.*
import java.util.List
import org.eclipse.xtext.xtext.generator.model.TypeReference

class EMFCompareMatcherFragment2 extends AbstractXtextGeneratorFragment {

	@Inject
	extension XtextGeneratorNaming

	@Inject FileAccessFactory fileAccessFactory

	override generate() {
		registerGuiceBindingsUi()
		addRequiredBundlesUi()
		registerExtensions()

		generateMatchEngineFactory()
		generateDistanceFunction()
	}

	private static def typeRef(String packageName, String name) {
		return new TypeReference(packageName, name);
	}

	private def matchEngineFactoryName(Grammar grammar) {
		grammar.eclipsePluginBasePackage + ".cdoxtext." + grammar.simpleName + "MatchEngineFactory";
	}

	private def distanceFunctionName(Grammar grammar) {
		grammar.eclipsePluginBasePackage + ".cdoxtext." + grammar.simpleName + "DistanceFunction";
	}

	private def registerGuiceBindingsUi() {
		new GuiceModuleAccess.BindingFactory().addTypeToType(
			"org.eclipse.emf.compare.match.IMatchEngine".typeRef("Factory"), grammar.matchEngineFactoryName.typeRef)
			.addTypeToType("org.eclipse.emf.compare.match.eobject.ProximityEObjectMatcher".typeRef("DistanceFunction"),
				grammar.distanceFunctionName.typeRef)
			.contributeTo(language.eclipsePluginGenModule)
	}

	private def addRequiredBundlesUi() {
		val requiredBundles = #[
			"org.eclipse.emf.compare",
			"org.eclipse.emf.compare.rcp",
			"org.eclipse.emf.compare.rcp.ui"
		];
		projectConfig.eclipsePlugin?.manifest?.requiredBundles?.addAll(requiredBundles)
	}

	private def registerExtensions() {
		val extensionRegistration = '''
			<extension
			      point="org.eclipse.emf.compare.rcp.matchEngine">
			   <engineFactory
			         class="«grammar.eclipsePluginExecutableExtensionFactory»:«grammar.matchEngineFactoryName»"
			         ranking="20">
			   </engineFactory>
			</extension>	
		'''
		projectConfig.eclipsePlugin?.pluginXml?.entries += extensionRegistration
	}

	def generateMatchEngineFactory() {
		fileAccessFactory.createXtendFile(
			grammar.matchEngineFactoryName.typeRef,
			'''
				import com.google.inject.Inject
				import com.google.inject.Provider
				import org.eclipse.emf.compare.match.DefaultComparisonFactory
				import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory
				import org.eclipse.emf.compare.match.DefaultMatchEngine
				import org.eclipse.emf.compare.match.eobject.ProximityEObjectMatcher
				import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl
				
				class «grammar.matchEngineFactoryName.typeRef.simpleName.toFirstUpper» extends MatchEngineFactoryImpl { 
					
					@Inject
					Provider<ProximityEObjectMatcher$DistanceFunction> dfProvider
					
					override getMatchEngine() {
						val matcher = new ProximityEObjectMatcher(dfProvider.get)
						return new DefaultMatchEngine(matcher, new DefaultComparisonFactory(new DefaultEqualityHelperFactory()))
					}	
				}
			'''
		).writeTo(projectConfig.eclipsePlugin.srcGen)

	}

	def generateDistanceFunction() {
		fileAccessFactory.createXtendFile(
			grammar.distanceFunctionName.typeRef,
			'''			
				import com.google.inject.Inject
				import java.util.List
				import org.eclipse.emf.compare.Comparison
				import org.eclipse.emf.compare.match.eobject.ProximityEObjectMatcher$DistanceFunction
				import org.eclipse.emf.ecore.EAttribute
				import org.eclipse.emf.ecore.EObject
				import org.eclipse.emf.ecore.EReference
				import org.eclipse.emf.ecore.EStructuralFeature
				import org.eclipse.emf.ecore.util.EcoreUtil
				import org.eclipse.emf.ecore.util.FeatureMap
				import org.eclipse.emf.ecore.util.FeatureMapUtil
				
				class «grammar.distanceFunctionName.typeRef.simpleName.toFirstUpper» implements ProximityEObjectMatcher$DistanceFunction { 
					
					@Inject
					EcoreUtil$EqualityHelper eqHelper
				
					override distance(Comparison comp, EObject a, EObject b) {
						if (!a.eClass.equals(b.eClass)) {
							return Integer::MAX_VALUE
						}
				
						val eClass = a.eClass
						val size = eClass.featureCount
						
						val matches = eClass.getEAllStructuralFeatures.fold(0, [ count, feature | return count + if(!feature.isDerived && haveEqualFeature(a,b,feature)) 1 else 0 ])
				
						return size - matches
					}
				
					def haveEqualFeature(EObject eObject1, EObject eObject2, EStructuralFeature feature) {
						return eObject1.eIsSet(feature) == eObject2.eIsSet(feature)
								&& if (feature instanceof EReference)  haveEqualReference(eObject1, eObject2, feature as EReference)
								   else haveEqualAttribute(eObject1, eObject2, feature as EAttribute)
					}
				
					def haveEqualReference(EObject eObject1, EObject eObject2, EReference reference) {
						val value1 = eObject1.eGet(reference)
						val value2 = eObject2.eGet(reference)
				
						return if(reference.isMany()) eqHelper.equals(value1 as List<EObject>, value2 as List<EObject>) 
							   else eqHelper.equals(value1 as EObject, value2 as EObject)
					}
				
					def haveEqualAttribute(EObject eObject1, EObject eObject2, EAttribute attribute) {
						val value1 = eObject1.eGet(attribute)
						val value2 = eObject2.eGet(attribute)
				
						if (value1 == null) return value2 == null
						if (value2 == null) return false
						if (FeatureMapUtil::isFeatureMap(attribute)) return equalFeatureMaps(value1 as FeatureMap, value2 as FeatureMap)
						return value1.equals(value2)
					}
				
					def equalFeatureMaps(FeatureMap featureMap1, FeatureMap featureMap2) {
						if (featureMap1.size != featureMap2.size) return false
						
						for (int i : 0 ..<featureMap1.size) {
							
							val feature = featureMap1.getEStructuralFeature(i)
							if (feature != featureMap2.getEStructuralFeature(i)) {
								return false
							}
				
							val value1 = featureMap1.getValue(i)
							val value2 = featureMap2.getValue(i)
				
							if (!equalFeatureMapValues(value1, value2, feature)) {
								return false
							}
						}
				
						return true
					}
				
					def equalFeatureMapValues(Object value1, Object value2, EStructuralFeature feature) {
						if (feature instanceof EReference) {
							return eqHelper.equals(value1 as EObject, value2 as EObject)
						} else {
							return if(value1 == null)  value2 == null 
								   else value1.equals(value2)
						}
					}
				
					override areIdentic(Comparison comp, EObject a, EObject b) {
						return eqHelper.equals(a, b)
					}	
				}
			'''
		).writeTo(projectConfig.eclipsePlugin.srcGen)
	}

}
