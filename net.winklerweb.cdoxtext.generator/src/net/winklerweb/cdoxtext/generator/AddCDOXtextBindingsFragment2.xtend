package net.winklerweb.cdoxtext.generator

import net.winklerweb.cdoxtext.runtime.CDOResourceForEditorInputFactory
import net.winklerweb.cdoxtext.runtime.CDOXtextDocumentProvider
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess

import static extension org.eclipse.xtext.xtext.generator.model.TypeReference.*

class AddCDOXtextBindingsFragment2 extends AbstractXtextGeneratorFragment {
	
	override generate() {
		registerGuiceBindingsUi()
		addRequiredBundlesUi()

	}
	
	private def addRequiredBundlesUi() {
		projectConfig.eclipsePlugin?.manifest?.requiredBundles += "net.winklerweb.cdoxtext.runtime"
	}
	
	private def registerGuiceBindingsUi() {
		new GuiceModuleAccess.BindingFactory()
		.addTypeToType("org.eclipse.xtext.ui.editor.model.XtextDocumentProvider".typeRef, CDOXtextDocumentProvider.typeRef)
		.addTypeToType("org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory".typeRef, CDOResourceForEditorInputFactory.typeRef)
		.contributeTo(language.eclipsePluginGenModule)
	}
	
}