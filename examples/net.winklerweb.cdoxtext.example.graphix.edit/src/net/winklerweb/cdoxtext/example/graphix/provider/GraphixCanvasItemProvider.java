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
package net.winklerweb.cdoxtext.example.graphix.provider;


import java.util.Collection;
import java.util.List;

import net.winklerweb.cdoxtext.example.graphix.GraphixCanvas;
import net.winklerweb.cdoxtext.example.graphix.GraphixFactory;
import net.winklerweb.cdoxtext.example.graphix.GraphixPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import net.winklerweb.cdoxtext.example.graphix.Point;

/**
 * This is the item provider adapter for a {@link net.winklerweb.cdoxtext.example.graphix.GraphixCanvas} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphixCanvasItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphixCanvasItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GraphixPackage.Literals.GRAPHIX_CANVAS__CONTENT);
			childrenFeatures.add(GraphixPackage.Literals.GRAPHIX_CANVAS__LOWER_LEFT_BOUNDS);
			childrenFeatures.add(GraphixPackage.Literals.GRAPHIX_CANVAS__UPPER_RIGHT_BOUNDS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns GraphixCanvas.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GraphixCanvas"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		GraphixCanvas canvas = ((GraphixCanvas)object);
		Point lowerLeft = canvas.getLowerLeftBounds();
		Point upperRight = canvas.getUpperRightBounds();
		
		String lowerLeftText = "<unset>";
		String upperRightText = "<unset>";
		
		if(lowerLeft != null) {
			IItemLabelProvider pointLabelProvider = null;
			pointLabelProvider = (IItemLabelProvider) adapterFactory.adapt(canvas.getLowerLeftBounds(), IItemLabelProvider.class);
			lowerLeftText = pointLabelProvider.getText(canvas.getLowerLeftBounds());			
		}
		
		if(upperRight != null) {
			IItemLabelProvider pointLabelProvider = null;
			pointLabelProvider = (IItemLabelProvider) adapterFactory.adapt(canvas.getUpperRightBounds(), IItemLabelProvider.class);
			upperRightText = pointLabelProvider.getText(canvas.getUpperRightBounds());				
		}
		
		return getString("_UI_GraphixCanvas_type") + " [" + lowerLeftText + " .. " + upperRightText + "]";
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(GraphixCanvas.class)) {
			case GraphixPackage.GRAPHIX_CANVAS__CONTENT:
			case GraphixPackage.GRAPHIX_CANVAS__LOWER_LEFT_BOUNDS:
			case GraphixPackage.GRAPHIX_CANVAS__UPPER_RIGHT_BOUNDS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GraphixPackage.Literals.GRAPHIX_CANVAS__CONTENT,
				 GraphixFactory.eINSTANCE.createCircle()));

		newChildDescriptors.add
			(createChildParameter
				(GraphixPackage.Literals.GRAPHIX_CANVAS__CONTENT,
				 GraphixFactory.eINSTANCE.createColor()));

		newChildDescriptors.add
			(createChildParameter
				(GraphixPackage.Literals.GRAPHIX_CANVAS__LOWER_LEFT_BOUNDS,
				 GraphixFactory.eINSTANCE.createPoint()));

		newChildDescriptors.add
			(createChildParameter
				(GraphixPackage.Literals.GRAPHIX_CANVAS__UPPER_RIGHT_BOUNDS,
				 GraphixFactory.eINSTANCE.createPoint()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == GraphixPackage.Literals.GRAPHIX_CANVAS__LOWER_LEFT_BOUNDS ||
			childFeature == GraphixPackage.Literals.GRAPHIX_CANVAS__UPPER_RIGHT_BOUNDS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GraphixEditPlugin.INSTANCE;
	}

}
