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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.winklerweb.cdoxtext.example.graphix.GraphixFactory
 * @model kind="package"
 * @generated
 */
public interface GraphixPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graphix";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://winklerweb.net/graphix/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "g";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphixPackage eINSTANCE = net.winklerweb.cdoxtext.example.graphix.impl.GraphixPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.winklerweb.cdoxtext.example.graphix.GraphixElement <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.winklerweb.cdoxtext.example.graphix.GraphixElement
	 * @see net.winklerweb.cdoxtext.example.graphix.impl.GraphixPackageImpl#getGraphixElement()
	 * @generated
	 */
	int GRAPHIX_ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIX_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIX_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.winklerweb.cdoxtext.example.graphix.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.winklerweb.cdoxtext.example.graphix.impl.ShapeImpl
	 * @see net.winklerweb.cdoxtext.example.graphix.impl.GraphixPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 0;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LINE_COLOR = GRAPHIX_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FILL_COLOR = GRAPHIX_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = GRAPHIX_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = GRAPHIX_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.winklerweb.cdoxtext.example.graphix.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.winklerweb.cdoxtext.example.graphix.impl.CircleImpl
	 * @see net.winklerweb.cdoxtext.example.graphix.impl.GraphixPackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 1;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__LINE_COLOR = SHAPE__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__FILL_COLOR = SHAPE__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__RADIUS = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__CENTER = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.winklerweb.cdoxtext.example.graphix.impl.ColorImpl <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.winklerweb.cdoxtext.example.graphix.impl.ColorImpl
	 * @see net.winklerweb.cdoxtext.example.graphix.impl.GraphixPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__NAME = GRAPHIX_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__RED = GRAPHIX_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__GREEN = GRAPHIX_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__BLUE = GRAPHIX_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__ALPHA = GRAPHIX_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = GRAPHIX_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_OPERATION_COUNT = GRAPHIX_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.winklerweb.cdoxtext.example.graphix.impl.GraphixCanvasImpl <em>Canvas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.winklerweb.cdoxtext.example.graphix.impl.GraphixCanvasImpl
	 * @see net.winklerweb.cdoxtext.example.graphix.impl.GraphixPackageImpl#getGraphixCanvas()
	 * @generated
	 */
	int GRAPHIX_CANVAS = 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIX_CANVAS__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Lower Left Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIX_CANVAS__LOWER_LEFT_BOUNDS = 1;

	/**
	 * The feature id for the '<em><b>Upper Right Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIX_CANVAS__UPPER_RIGHT_BOUNDS = 2;

	/**
	 * The number of structural features of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIX_CANVAS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIX_CANVAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.winklerweb.cdoxtext.example.graphix.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.winklerweb.cdoxtext.example.graphix.impl.PointImpl
	 * @see net.winklerweb.cdoxtext.example.graphix.impl.GraphixPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 5;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link net.winklerweb.cdoxtext.example.graphix.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the reference '{@link net.winklerweb.cdoxtext.example.graphix.Shape#getLineColor <em>Line Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line Color</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.Shape#getLineColor()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_LineColor();

	/**
	 * Returns the meta object for the reference '{@link net.winklerweb.cdoxtext.example.graphix.Shape#getFillColor <em>Fill Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fill Color</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.Shape#getFillColor()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_FillColor();

	/**
	 * Returns the meta object for class '{@link net.winklerweb.cdoxtext.example.graphix.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for the attribute '{@link net.winklerweb.cdoxtext.example.graphix.Circle#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.Circle#getRadius()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Radius();

	/**
	 * Returns the meta object for the containment reference '{@link net.winklerweb.cdoxtext.example.graphix.Circle#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Center</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.Circle#getCenter()
	 * @see #getCircle()
	 * @generated
	 */
	EReference getCircle_Center();

	/**
	 * Returns the meta object for class '{@link net.winklerweb.cdoxtext.example.graphix.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the meta object for the attribute '{@link net.winklerweb.cdoxtext.example.graphix.Color#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.Color#getName()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.winklerweb.cdoxtext.example.graphix.Color#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.Color#getRed()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Red();

	/**
	 * Returns the meta object for the attribute '{@link net.winklerweb.cdoxtext.example.graphix.Color#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.Color#getGreen()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Green();

	/**
	 * Returns the meta object for the attribute '{@link net.winklerweb.cdoxtext.example.graphix.Color#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.Color#getBlue()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Blue();

	/**
	 * Returns the meta object for the attribute '{@link net.winklerweb.cdoxtext.example.graphix.Color#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.Color#getAlpha()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Alpha();

	/**
	 * Returns the meta object for class '{@link net.winklerweb.cdoxtext.example.graphix.GraphixCanvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canvas</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.GraphixCanvas
	 * @generated
	 */
	EClass getGraphixCanvas();

	/**
	 * Returns the meta object for the containment reference list '{@link net.winklerweb.cdoxtext.example.graphix.GraphixCanvas#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.GraphixCanvas#getContent()
	 * @see #getGraphixCanvas()
	 * @generated
	 */
	EReference getGraphixCanvas_Content();

	/**
	 * Returns the meta object for the containment reference '{@link net.winklerweb.cdoxtext.example.graphix.GraphixCanvas#getLowerLeftBounds <em>Lower Left Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Left Bounds</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.GraphixCanvas#getLowerLeftBounds()
	 * @see #getGraphixCanvas()
	 * @generated
	 */
	EReference getGraphixCanvas_LowerLeftBounds();

	/**
	 * Returns the meta object for the containment reference '{@link net.winklerweb.cdoxtext.example.graphix.GraphixCanvas#getUpperRightBounds <em>Upper Right Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Right Bounds</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.GraphixCanvas#getUpperRightBounds()
	 * @see #getGraphixCanvas()
	 * @generated
	 */
	EReference getGraphixCanvas_UpperRightBounds();

	/**
	 * Returns the meta object for class '{@link net.winklerweb.cdoxtext.example.graphix.GraphixElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.GraphixElement
	 * @generated
	 */
	EClass getGraphixElement();

	/**
	 * Returns the meta object for class '{@link net.winklerweb.cdoxtext.example.graphix.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link net.winklerweb.cdoxtext.example.graphix.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for the attribute '{@link net.winklerweb.cdoxtext.example.graphix.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.winklerweb.cdoxtext.example.graphix.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphixFactory getGraphixFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.winklerweb.cdoxtext.example.graphix.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.winklerweb.cdoxtext.example.graphix.impl.ShapeImpl
		 * @see net.winklerweb.cdoxtext.example.graphix.impl.GraphixPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Line Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__LINE_COLOR = eINSTANCE.getShape_LineColor();

		/**
		 * The meta object literal for the '<em><b>Fill Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__FILL_COLOR = eINSTANCE.getShape_FillColor();

		/**
		 * The meta object literal for the '{@link net.winklerweb.cdoxtext.example.graphix.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.winklerweb.cdoxtext.example.graphix.impl.CircleImpl
		 * @see net.winklerweb.cdoxtext.example.graphix.impl.GraphixPackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__RADIUS = eINSTANCE.getCircle_Radius();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCLE__CENTER = eINSTANCE.getCircle_Center();

		/**
		 * The meta object literal for the '{@link net.winklerweb.cdoxtext.example.graphix.impl.ColorImpl <em>Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.winklerweb.cdoxtext.example.graphix.impl.ColorImpl
		 * @see net.winklerweb.cdoxtext.example.graphix.impl.GraphixPackageImpl#getColor()
		 * @generated
		 */
		EClass COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__NAME = eINSTANCE.getColor_Name();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__RED = eINSTANCE.getColor_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__GREEN = eINSTANCE.getColor_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__BLUE = eINSTANCE.getColor_Blue();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__ALPHA = eINSTANCE.getColor_Alpha();

		/**
		 * The meta object literal for the '{@link net.winklerweb.cdoxtext.example.graphix.impl.GraphixCanvasImpl <em>Canvas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.winklerweb.cdoxtext.example.graphix.impl.GraphixCanvasImpl
		 * @see net.winklerweb.cdoxtext.example.graphix.impl.GraphixPackageImpl#getGraphixCanvas()
		 * @generated
		 */
		EClass GRAPHIX_CANVAS = eINSTANCE.getGraphixCanvas();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIX_CANVAS__CONTENT = eINSTANCE.getGraphixCanvas_Content();

		/**
		 * The meta object literal for the '<em><b>Lower Left Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIX_CANVAS__LOWER_LEFT_BOUNDS = eINSTANCE.getGraphixCanvas_LowerLeftBounds();

		/**
		 * The meta object literal for the '<em><b>Upper Right Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIX_CANVAS__UPPER_RIGHT_BOUNDS = eINSTANCE.getGraphixCanvas_UpperRightBounds();

		/**
		 * The meta object literal for the '{@link net.winklerweb.cdoxtext.example.graphix.GraphixElement <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.winklerweb.cdoxtext.example.graphix.GraphixElement
		 * @see net.winklerweb.cdoxtext.example.graphix.impl.GraphixPackageImpl#getGraphixElement()
		 * @generated
		 */
		EClass GRAPHIX_ELEMENT = eINSTANCE.getGraphixElement();

		/**
		 * The meta object literal for the '{@link net.winklerweb.cdoxtext.example.graphix.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.winklerweb.cdoxtext.example.graphix.impl.PointImpl
		 * @see net.winklerweb.cdoxtext.example.graphix.impl.GraphixPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

	}

} //GraphixPackage
