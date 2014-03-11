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
 * A representation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.Circle#getRadius <em>Radius</em>}</li>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.Circle#getCenter <em>Center</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.winklerweb.cdoxtext.example.graphix.GraphixPackage#getCircle()
 * @model
 * @generated
 */
public interface Circle extends Shape {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * The default value is <code>"0.0d"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see net.winklerweb.cdoxtext.example.graphix.GraphixPackage#getCircle_Radius()
	 * @model default="0.0d"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link net.winklerweb.cdoxtext.example.graphix.Circle#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * Returns the value of the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Center</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center</em>' containment reference.
	 * @see #setCenter(Point)
	 * @see net.winklerweb.cdoxtext.example.graphix.GraphixPackage#getCircle_Center()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getCenter();

	/**
	 * Sets the value of the '{@link net.winklerweb.cdoxtext.example.graphix.Circle#getCenter <em>Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center</em>' containment reference.
	 * @see #getCenter()
	 * @generated
	 */
	void setCenter(Point value);

} // Circle
