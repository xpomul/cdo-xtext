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
package net.winklerweb.cdoxtext.example.graphix;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Canvas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.GraphixCanvas#getContent <em>Content</em>}</li>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.GraphixCanvas#getLowerLeftBounds <em>Lower Left Bounds</em>}</li>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.GraphixCanvas#getUpperRightBounds <em>Upper Right Bounds</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.winklerweb.cdoxtext.example.graphix.GraphixPackage#getGraphixCanvas()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface GraphixCanvas extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link net.winklerweb.cdoxtext.example.graphix.GraphixElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see net.winklerweb.cdoxtext.example.graphix.GraphixPackage#getGraphixCanvas_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphixElement> getContent();

	/**
	 * Returns the value of the '<em><b>Lower Left Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Left Bounds</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Left Bounds</em>' containment reference.
	 * @see #setLowerLeftBounds(Point)
	 * @see net.winklerweb.cdoxtext.example.graphix.GraphixPackage#getGraphixCanvas_LowerLeftBounds()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getLowerLeftBounds();

	/**
	 * Sets the value of the '{@link net.winklerweb.cdoxtext.example.graphix.GraphixCanvas#getLowerLeftBounds <em>Lower Left Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Left Bounds</em>' containment reference.
	 * @see #getLowerLeftBounds()
	 * @generated
	 */
	void setLowerLeftBounds(Point value);

	/**
	 * Returns the value of the '<em><b>Upper Right Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Right Bounds</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Right Bounds</em>' containment reference.
	 * @see #setUpperRightBounds(Point)
	 * @see net.winklerweb.cdoxtext.example.graphix.GraphixPackage#getGraphixCanvas_UpperRightBounds()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getUpperRightBounds();

	/**
	 * Sets the value of the '{@link net.winklerweb.cdoxtext.example.graphix.GraphixCanvas#getUpperRightBounds <em>Upper Right Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Right Bounds</em>' containment reference.
	 * @see #getUpperRightBounds()
	 * @generated
	 */
	void setUpperRightBounds(Point value);

} // GraphixCanvas
