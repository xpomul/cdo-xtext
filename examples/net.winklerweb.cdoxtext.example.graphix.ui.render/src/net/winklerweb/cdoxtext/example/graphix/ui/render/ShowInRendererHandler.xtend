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
package net.winklerweb.cdoxtext.example.graphix.ui.render

import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.jface.viewers.IStructuredSelection
import net.winklerweb.cdoxtext.example.graphix.GraphixCanvas

class ShowInRendererHandler extends AbstractHandler {
	
	override execute(ExecutionEvent event) throws ExecutionException {
		val selection = (HandlerUtil::getCurrentSelection(event)) as IStructuredSelection
		val canvas = selection.firstElement as GraphixCanvas
		
		val view = (HandlerUtil::getActiveWorkbenchWindow(event).activePage.showView(RendererView::VIEW_ID)) 
		val renderView = view as RendererView
		renderView.input = canvas

		null
	}	
}