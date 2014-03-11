/**
 * Copyright (c) 2013-2014 Stefan Winkler (Kiel, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Stefan Winkler - initial contribution
 * 
 */
package net.winklerweb.cdoxtext.runtime

import com.google.common.collect.Maps
import com.google.inject.Inject
import com.google.inject.name.Named
import java.util.Collections
import java.util.Map
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.SubMonitor
import org.eclipse.emf.cdo.eresource.CDOResource
import org.eclipse.emf.cdo.internal.ui.CDOLobEditorInput
import org.eclipse.emf.cdo.transaction.CDOTransaction
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin
import org.eclipse.jface.text.IDocument
import org.eclipse.ui.IEditorInput
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory
import org.eclipse.xtext.ui.editor.model.XtextDocument
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider

class CDOXtextDocumentProvider extends XtextDocumentProvider {

	static var Map<IEditorInput, XtextResource> inputToResource = Collections::synchronizedMap(Maps::newHashMap()) 
 
	@Inject
	var ISerializer serializer

	@Inject
	var IResourceForEditorInputFactory resourceForEditorInputFactory

	/* instead of overriding createDocument(element), we just intercept isWorkspaceExternalEditorInput to
	 * regard CDOLobEditorInput as workspace-external.
	 * This makes createDocument do the right thing(s), namely to call setDocumentContent and setupDocument, which we 
	 * override as well.
	 */
	override isWorkspaceExternalEditorInput(Object element) {
		return super.isWorkspaceExternalEditorInput(element) || (element instanceof CDOLobEditorInput)
	}
	
	override setDocumentContent(IDocument document, IEditorInput editorInput, String encoding) throws CoreException {

		// default behavior for all other editor inputs		
		if (!(editorInput instanceof CDOLobEditorInput)) {
			return super.setDocumentContent(document, editorInput, encoding)
		}

		// special behavior for CDOLobEditorInput
		val cdoEditorInput = editorInput as CDOLobEditorInput
		val resource = cdoEditorInput.resource as CDOResource

		val contents = resource.contents.head

		if(contents != null) {
			document.set(serializer.serialize(contents))
		}
 
		val xtextDocument = document as XtextDocument
		val xtextResource = resourceForEditorInputFactory.createResource(editorInput) as XtextResource
		loadResource(xtextResource, xtextDocument.get(), encoding)
		xtextDocument.setInput(xtextResource)

		// we need to remember the XtextResource for saving ...
		inputToResource.put(editorInput, xtextResource)

		return true
	}

	override isModifiable(Object element) {

		if (!(element instanceof CDOLobEditorInput)) {
			return super.isModifiable(element)
		}

		val cdoEditorInput = element as CDOLobEditorInput
		return !cdoEditorInput.resource.cdoView.isReadOnly
	}

	override isReadOnly(Object element) {
		val result = !isModifiable(element)
		return result
	}

	override isDeleted(Object element) {
		return false
	}

	override doSaveDocument(IProgressMonitor monitor, Object element, IDocument document, boolean overwrite) throws CoreException {

		if (!(element instanceof CDOLobEditorInput)) {
			super.doSaveDocument(monitor, element, document, overwrite)
			return
		}

		val mon = SubMonitor::convert(monitor, 5)

		// get original model from CDO
		val cdoEditorInput = element as CDOLobEditorInput
		val res = cdoEditorInput.resource as CDOResource
		val originalStateRoot = res.contents.head
		
		// get modified model from XtextResource
		val documentResource = inputToResource.get(element)
		val newStateRoot = documentResource.contents.head

		// if the resource was empty before
		if(originalStateRoot == null) {
			res.contents.add(newStateRoot)	
		} else {

			// fire up EMFCompare				
			val scope = EMFCompare::createDefaultScope(newStateRoot, originalStateRoot)
	
			val matcherRegistry = EMFCompareRCPPlugin::^default.matchEngineFactoryRegistry
			val compare = EMFCompare::builder().setMatchEngineFactoryRegistry(matcherRegistry).build()
			val result = compare.compare(scope)
	
			val mergerReg = EMFCompareRCPPlugin::^default.mergerRegistry
	
			for (Diff d : result.getDifferences()) {
				mergerReg.getHighestRankingMerger(d).copyLeftToRight(d, null)
			}
		}
		
		val transaction = res.cdoView() as CDOTransaction
		
		transaction.commit(mon.newChild(2))

		if (monitor != null) {
			monitor.done()
		}
	}
}

