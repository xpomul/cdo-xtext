package net.winklerweb.cdoxtext.generator

import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.Grammar
import org.eclipse.emf.codegen.ecore.genmodel.GenDelegationKind

class EMFCDOGeneratorFragment2 extends org.eclipse.xtext.xtext.generator.ecore.EMFGeneratorFragment2 {
	
	override generate() {
		super.generate
		addRequiredBundlesUi()
	}
	
	private def addRequiredBundlesUi() {
		projectConfig.runtime?.manifest?.requiredBundles += "org.eclipse.emf.cdo;visibility:=reexport"
	}
	
	protected override GenModel getGenModel(ResourceSet rs, Grammar grammar) {
		val genModel = super.getGenModel(rs, grammar)
		
		genModel.rootExtendsInterface = "org.eclipse.emf.cdo.CDOObject"
		genModel.rootExtendsClass = "org.eclipse.emf.internal.cdo.CDOObjectImpl"
		genModel.providerRootExtendsClass = "org.eclipse.emf.cdo.edit.CDOItemProviderAdapter"
		genModel.importerID = "org.eclipse.emf.importer.cdo"
		genModel.featureDelegation = GenDelegationKind.DYNAMIC_LITERAL
		genModel.operationReflection = true
		genModel.importOrganizing = true
		
		return genModel
	}
	
}