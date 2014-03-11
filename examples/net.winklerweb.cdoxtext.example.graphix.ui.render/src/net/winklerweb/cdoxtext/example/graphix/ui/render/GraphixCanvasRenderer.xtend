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

import org.eclipse.swt.graphics.GC
import org.eclipse.jface.resource.JFaceResources 
import org.eclipse.swt.graphics.RGB
import java.util.List
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Display
import com.google.common.collect.Lists
import net.winklerweb.cdoxtext.example.graphix.GraphixElement
import net.winklerweb.cdoxtext.example.graphix.GraphixCanvas
import net.winklerweb.cdoxtext.example.graphix.Circle
import net.winklerweb.cdoxtext.example.graphix.Color
import net.winklerweb.cdoxtext.example.graphix.Point

class GraphixCanvasRenderer {
	private double scale
	private long offsetX
	private long offsetY 
	private int outputWidth
	private int outputHeight
	private List<GraphixElement> highlights = Lists::newArrayList
	GraphixCanvas canvas
	
	new(int width, int height) {
		this.outputWidth = width
		this.outputHeight = height
	
		recalculateTransformation()
	}

	def setNewOutputSize(int width, int height) {
		this.outputWidth = width
		this.outputHeight = height
	
		recalculateTransformation()		
	}

	def setCanvas(GraphixCanvas canvas) {
		this.canvas = canvas
		
		recalculateTransformation()
	}

	def void recalculateTransformation() {
		if(canvas == null || canvas.upperRightBounds == null || canvas.lowerLeftBounds == null) 
 			return
 			
		val canvasWidth = canvas.upperRightBounds.x - canvas.lowerLeftBounds.x
		val canvasHeight = canvas.upperRightBounds.y - canvas.lowerLeftBounds.y

		scale = (Math::min(outputWidth, outputHeight) / Math::min(canvasWidth, canvasHeight)) * 0.98;
		offsetX = Math::round(- canvas.lowerLeftBounds.x * scale) + 2;
		offsetY = Math::round(canvas.upperRightBounds.y * scale) + 2;
	}

	def render(GC gc) {
 		 
		for (GraphixElement element : canvas.content) {
			switch element {
				Circle: {
					
					if(element.center != null) 
					{
						val center = toScreen(element.center)
						val centerX = center.key
						val centerY = center.value
						val radius = toScreen(element.radius)
					
						val x = Math::round(centerX - radius)
						val y = Math::round(centerY - radius)
						val w = Math::round(2*radius)
						val h = Math::round(2*radius)
						
						if(highlights.contains(element)) {							
							setHighlightFillStyle(gc)							
						} else {
							setFillStyle(gc, element.fillColor)							
						}
						gc.fillOval(x as int, y as int, w as int, h as int)
	
						setDrawStyle(gc, element.lineColor)
						gc.drawOval(x as int, y as int, w as int, h as int)
					}
				}
			}
		}
	}
	
	def setDrawStyle(GC gc, Color lineColor) {
		if(lineColor == null) {
			return
		}
		
		if(highlights.contains(lineColor)) {
			gc.setForeground(Display::getDefault.getSystemColor(SWT::COLOR_WHITE))
		    gc.setAlpha(255)
		} else {
			gc.setForeground(getRegistryColor(lineColor))
			gc.setAlpha(Math::round(255*lineColor.alpha) as int)
		}
		
		gc.lineWidth = 4
	}

	def setFillStyle(GC gc, Color fillColor) {
		if(fillColor == null) {
			return
		}
		
		if(highlights.contains(fillColor)) {
			gc.setBackground(Display::getDefault.getSystemColor(SWT::COLOR_WHITE))
		    gc.setAlpha(255)
		} else {
			gc.setBackground(getRegistryColor(fillColor))
			gc.setAlpha(Math::round(255*fillColor.alpha) as int)
		}
	}
	
	def setHighlightFillStyle(GC gc) {
		gc.setBackground(Display::getDefault.getSystemColor(SWT::COLOR_WHITE))
		gc.setAlpha(255)
	}

	def getRegistryColor(Color c) {
		val colorRegistry = JFaceResources::colorRegistry
		if(!colorRegistry.hasValueFor("graphix_" + c.name)) {
			colorRegistry.put("graphix_" + c.name, new RGB(Math::round(255*c.red) as int , Math::round(255*c.green) as int, Math::round(255*c.blue) as int))
		}
		else {
			val rgb = colorRegistry.getRGB("graphix_" + c.name)
			if(rgb.red != Math::round(255*c.red) as int || 
				rgb.blue != Math::round(255*c.blue) as int || 
				rgb.green != Math::round(255*c.green) as int) {
			
				colorRegistry.put("graphix_" + c.name, new RGB(Math::round(255*c.red) as int , Math::round(255*c.green) as int, Math::round(255*c.blue) as int))						
			}
		}
		
		colorRegistry.get("graphix_" + c.name)
	}
	
	def toScreen(Point p) {
		p.x*scale + offsetX -> -p.y*scale + offsetY
	}
	
	def toScreen(double d) {
		d*scale
	}
	
	def getHighlights() {
		highlights
	}
}
