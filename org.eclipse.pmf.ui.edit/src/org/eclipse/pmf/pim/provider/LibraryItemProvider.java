/*******************************************************************************
 * Copyright (c) 2006, 2016 Soyatec (http://www.soyatec.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Soyatec - initial API and implementation
 *******************************************************************************/
package org.eclipse.pmf.pim.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.pmf.pim.Library;
import org.eclipse.pmf.pim.PMFFactory;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.ui.UiFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.pmf.pim.Library} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class LibraryItemProvider extends PMFObjectItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LibraryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PMFPackage.Literals.LIBRARY__VIEW_PROFILES);
			childrenFeatures.add(PMFPackage.Literals.LIBRARY__SYSTEM_ACTIONS);
			childrenFeatures.add(PMFPackage.Literals.LIBRARY__COMMANDS);
			childrenFeatures.add(PMFPackage.Literals.LIBRARY__CONVERTERS);
			childrenFeatures.add(PMFPackage.Literals.LIBRARY__VALIDATORS);
			childrenFeatures.add(PMFPackage.Literals.LIBRARY__TYPES);
			childrenFeatures
					.add(PMFPackage.Literals.LIBRARY__DATA_FORM_FOLDERS);
			childrenFeatures.add(PMFPackage.Literals.LIBRARY__IMAGES);
			childrenFeatures.add(PMFPackage.Literals.LIBRARY__EVENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Library.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Library"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Library) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Library_type")
				: getString("_UI_Library_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Library.class)) {
		case PMFPackage.LIBRARY__VIEW_PROFILES:
		case PMFPackage.LIBRARY__SYSTEM_ACTIONS:
		case PMFPackage.LIBRARY__COMMANDS:
		case PMFPackage.LIBRARY__CONVERTERS:
		case PMFPackage.LIBRARY__VALIDATORS:
		case PMFPackage.LIBRARY__TYPES:
		case PMFPackage.LIBRARY__DATA_FORM_FOLDERS:
		case PMFPackage.LIBRARY__IMAGES:
		case PMFPackage.LIBRARY__EVENTS:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.LIBRARY__VIEW_PROFILES,
				PMFFactory.eINSTANCE.createViewProfile()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.LIBRARY__SYSTEM_ACTIONS,
				PMFFactory.eINSTANCE.createSystemAction()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.LIBRARY__COMMANDS,
				PMFFactory.eINSTANCE.createCommand()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.LIBRARY__CONVERTERS,
				PMFFactory.eINSTANCE.createDataConverter()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.LIBRARY__VALIDATORS,
				PMFFactory.eINSTANCE.createValidator()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.LIBRARY__VALIDATORS,
				PMFFactory.eINSTANCE.createRegexValidator()));

		newChildDescriptors
				.add(createChildParameter(
						PMFPackage.Literals.LIBRARY__DATA_FORM_FOLDERS,
						PMFFactory.eINSTANCE
								.create(PMFPackage.Literals.TYPE_TO_DATA_FORM_FOLDER_ENTRY_MAP)));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.LIBRARY__IMAGES,
				UiFactory.eINSTANCE.createImage()));

		newChildDescriptors
				.add(createChildParameter(
						PMFPackage.Literals.LIBRARY__EVENTS,
						PMFFactory.eINSTANCE
								.create(PMFPackage.Literals.ECLASS_TO_EVENT_ENTRY_MAP)));
	}

}
