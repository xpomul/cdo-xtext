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
package net.winklerweb.cdoxtext.example.graphix.ui.render;

import net.winklerweb.cdoxtext.example.graphix.GraphixCanvas;
import net.winklerweb.cdoxtext.example.graphix.GraphixElement;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.view.CDOAdapterPolicy;
import org.eclipse.emf.cdo.view.CDOInvalidationPolicy;
import org.eclipse.emf.cdo.view.CDOStaleReferencePolicy;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.progress.UIJob;

public class RendererView extends ViewPart {

	public static final String VIEW_ID = "net.winklerweb.cdoxtext.example.graphix.ui.render.view";
	
	private Composite canvas;
	private GraphixCanvas input;
	private GraphixCanvasRenderer renderer;
	private EContentAdapter contentAdapter = new ContentAdapter(this);
	
	public RendererView() {
		// TODO Auto-generated constructor stub
	}
 
	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout());
		canvas = new Composite(parent, SWT.NONE);
		
		Point size = canvas.getSize();
		renderer  = new GraphixCanvasRenderer(size.x, size.y);
		
		canvas.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {
				super.controlResized(e);
				renderer.setNewOutputSize(canvas.getSize().x, canvas.getSize().y);
			}
		});
		
		canvas.addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				paintCanvas(e.gc, e.x, e.y, e.x+e.width, e.y + e.height);
			}
		});
		
		new RepaintJob().schedule(1000l);
	}
	
	protected void paintCanvas(GC gc, int x, int y, int x2, int y2) {
		if(input == null) {
			Point size = canvas.getSize();
			int centerX = size.x / 2;
			int centerY = size.y / 2;
		
			String defaultString = "No graphics selected";
			Point textSize = gc.textExtent(defaultString);
			gc.drawText(defaultString, centerX - textSize.x/2, centerY - textSize.y/2);		
		}
		else {
			renderer.render(gc);
		}
	}

	@Override
	public void setFocus() {
	}
	
	public void setInput(GraphixCanvas c) {
		if(input != null) {
			input.eAdapters().remove(contentAdapter);
		}
		
		input = c;
		
		if(input != null) {
			input.eAdapters().add(contentAdapter);
			try {
				input.cdoView().options().setInvalidationNotificationEnabled(true);
				input.cdoView().options().addChangeSubscriptionPolicy(CDOAdapterPolicy.ALL);
				input.cdoView().options().setDetachmentNotificationEnabled(true);
				//input.cdoView().options().setInvalidationPolicy(CDOInvalidationPolicy.STRICT);
				//input.cdoView().options().setStaleReferencePolicy(CDOStaleReferencePolicy.PROXY);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		renderer.setCanvas(input);
		canvas.redraw();
	}

	public void scheduleHighlight(GraphixElement element) {
		renderer.getHighlights().add(element);
		new UnhighlightJob(element).schedule(1000l);
	}
	
	class UnhighlightJob extends UIJob {
		private GraphixElement element;

		public UnhighlightJob (GraphixElement element) {
			super("Unhighlighter");
			this.element = element;
		}

		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			renderer.getHighlights().remove(element);
			canvas.redraw();
			return Status.OK_STATUS;
		}
	}

	class RepaintJob extends UIJob {
		public RepaintJob() {
			super("Repainter");
		}

		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			canvas.redraw();
			schedule(500l);
			return Status.OK_STATUS;
		}		
	}

	public void refresh() {
		canvas.redraw();
	}

}
