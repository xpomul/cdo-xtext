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

import net.winklerweb.cdoxtext.example.graphix.Color;
import net.winklerweb.cdoxtext.example.graphix.GraphixPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.impl.ColorImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.impl.ColorImpl#getRed <em>Red</em>}</li>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.impl.ColorImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.impl.ColorImpl#getBlue <em>Blue</em>}</li>
 *   <li>{@link net.winklerweb.cdoxtext.example.graphix.impl.ColorImpl#getAlpha <em>Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColorImpl extends CDOObjectImpl implements Color {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphixPackage.Literals.COLOR;
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
	public String getName() {
		return (String)eGet(GraphixPackage.Literals.COLOR__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(GraphixPackage.Literals.COLOR__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRed() {
		return (Double)eGet(GraphixPackage.Literals.COLOR__RED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRed(double newRed) {
		eSet(GraphixPackage.Literals.COLOR__RED, newRed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGreen() {
		return (Double)eGet(GraphixPackage.Literals.COLOR__GREEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreen(double newGreen) {
		eSet(GraphixPackage.Literals.COLOR__GREEN, newGreen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBlue() {
		return (Double)eGet(GraphixPackage.Literals.COLOR__BLUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlue(double newBlue) {
		eSet(GraphixPackage.Literals.COLOR__BLUE, newBlue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAlpha() {
		return (Double)eGet(GraphixPackage.Literals.COLOR__ALPHA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha(double newAlpha) {
		eSet(GraphixPackage.Literals.COLOR__ALPHA, newAlpha);
	}

} //ColorImpl
