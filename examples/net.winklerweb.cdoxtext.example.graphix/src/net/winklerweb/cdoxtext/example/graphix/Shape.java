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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.Shape#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.Shape#getFillColor <em>Fill Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.winklerweb.cdoxtext.example.graphix.GraphixPackage#getShape()
 * @model abstract="true"
 * @generated
 */
public interface Shape extends GraphixElement {
	/**
	 * Returns the value of the '<em><b>Line Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Color</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Color</em>' reference.
	 * @see #setLineColor(Color)
	 * @see net.winklerweb.cdoxtext.example.graphix.GraphixPackage#getShape_LineColor()
	 * @model
	 * @generated
	 */
	Color getLineColor();

	/**
	 * Sets the value of the '{@link net.winklerweb.cdoxtext.example.graphix.Shape#getLineColor <em>Line Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Color</em>' reference.
	 * @see #getLineColor()
	 * @generated
	 */
	void setLineColor(Color value);

	/**
	 * Returns the value of the '<em><b>Fill Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Color</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Color</em>' reference.
	 * @see #setFillColor(Color)
	 * @see net.winklerweb.cdoxtext.example.graphix.GraphixPackage#getShape_FillColor()
	 * @model
	 * @generated
	 */
	Color getFillColor();

	/**
	 * Sets the value of the '{@link net.winklerweb.cdoxtext.example.graphix.Shape#getFillColor <em>Fill Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Color</em>' reference.
	 * @see #getFillColor()
	 * @generated
	 */
	void setFillColor(Color value);

} // Shape
