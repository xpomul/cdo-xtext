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
 * A representation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.Color#getName <em>Name</em>}</li>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.Color#getRed <em>Red</em>}</li>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.Color#getGreen <em>Green</em>}</li>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.Color#getBlue <em>Blue</em>}</li>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.Color#getAlpha <em>Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.winklerweb.cdoxtext.example.graphix.GraphixPackage#getColor()
 * @model
 * @generated
 */
public interface Color extends GraphixElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.winklerweb.cdoxtext.example.graphix.GraphixPackage#getColor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.winklerweb.cdoxtext.example.graphix.Color#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #setRed(double)
	 * @see net.winklerweb.cdoxtext.example.graphix.GraphixPackage#getColor_Red()
	 * @model
	 * @generated
	 */
	double getRed();

	/**
	 * Sets the value of the '{@link net.winklerweb.cdoxtext.example.graphix.Color#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #getRed()
	 * @generated
	 */
	void setRed(double value);

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Green</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #setGreen(double)
	 * @see net.winklerweb.cdoxtext.example.graphix.GraphixPackage#getColor_Green()
	 * @model
	 * @generated
	 */
	double getGreen();

	/**
	 * Sets the value of the '{@link net.winklerweb.cdoxtext.example.graphix.Color#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(double value);

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #setBlue(double)
	 * @see net.winklerweb.cdoxtext.example.graphix.GraphixPackage#getColor_Blue()
	 * @model
	 * @generated
	 */
	double getBlue();

	/**
	 * Sets the value of the '{@link net.winklerweb.cdoxtext.example.graphix.Color#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(double value);

	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(double)
	 * @see net.winklerweb.cdoxtext.example.graphix.GraphixPackage#getColor_Alpha()
	 * @model default="1.0"
	 * @generated
	 */
	double getAlpha();

	/**
	 * Sets the value of the '{@link net.winklerweb.cdoxtext.example.graphix.Color#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(double value);

} // Color
