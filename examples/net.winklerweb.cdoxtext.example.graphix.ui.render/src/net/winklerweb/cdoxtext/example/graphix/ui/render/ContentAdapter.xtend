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

import org.eclipse.emf.ecore.util.EContentAdapter
import org.eclipse.emf.common.notify.Notification
import net.winklerweb.cdoxtext.example.graphix.Circle
import net.winklerweb.cdoxtext.example.graphix.Point
import net.winklerweb.cdoxtext.example.graphix.Color

class ContentAdapter extends EContentAdapter {
	
	RendererView parent
	
	new(RendererView parent) {
		this.parent = parent
	}
	
	override notifyChanged(Notification notification) {
		super.notifyChanged(notification)
		val source = notification.notifier
		try {
		switch source {
		Circle : 
			parent.scheduleHighlight(source)
		
		Point :  {
			val sourceParent = source.eContainer()
			if(sourceParent instanceof Circle) {
				parent.scheduleHighlight(sourceParent as Circle)
			}
		}
		
		Color : 
			parent.scheduleHighlight(source)
		}
		
		}
		catch(Exception e) {
			parent.refresh();
		}
	}

	
}