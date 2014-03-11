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
package net.winklerweb.cdoxtext.example.graphix.impl;

import net.winklerweb.cdoxtext.example.graphix.GraphixCanvas;
import net.winklerweb.cdoxtext.example.graphix.GraphixElement;
import net.winklerweb.cdoxtext.example.graphix.GraphixPackage;
import net.winklerweb.cdoxtext.example.graphix.Point;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Canvas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.impl.GraphixCanvasImpl#getContent <em>Content</em>}</li>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.impl.GraphixCanvasImpl#getLowerLeftBounds <em>Lower Left Bounds</em>}</li>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.impl.GraphixCanvasImpl#getUpperRightBounds <em>Upper Right Bounds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphixCanvasImpl extends CDOObjectImpl implements GraphixCanvas {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphixCanvasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphixPackage.Literals.GRAPHIX_CANVAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GraphixElement> getContent() {
		return (EList<GraphixElement>)eGet(GraphixPackage.Literals.GRAPHIX_CANVAS__CONTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getLowerLeftBounds() {
		return (Point)eGet(GraphixPackage.Literals.GRAPHIX_CANVAS__LOWER_LEFT_BOUNDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerLeftBounds(Point newLowerLeftBounds) {
		eSet(GraphixPackage.Literals.GRAPHIX_CANVAS__LOWER_LEFT_BOUNDS, newLowerLeftBounds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getUpperRightBounds() {
		return (Point)eGet(GraphixPackage.Literals.GRAPHIX_CANVAS__UPPER_RIGHT_BOUNDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperRightBounds(Point newUpperRightBounds) {
		eSet(GraphixPackage.Literals.GRAPHIX_CANVAS__UPPER_RIGHT_BOUNDS, newUpperRightBounds);
	}

} //GraphixCanvasImpl
