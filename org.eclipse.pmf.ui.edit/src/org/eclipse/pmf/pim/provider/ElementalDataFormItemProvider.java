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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.pmf.pim.ElementalDataForm;
import org.eclipse.pmf.pim.PMFFactory;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.ui.UiFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.pmf.pim.ElementalDataForm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementalDataFormItemProvider extends DataFormItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementalDataFormItemProvider(AdapterFactory adapterFactory) {
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

			addValidatorsPropertyDescriptor(object);
			addViewProfilesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Validators feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidatorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ElementalDataForm_validators_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ElementalDataForm_validators_feature",
						"_UI_ElementalDataForm_type"),
				PMFPackage.Literals.ELEMENTAL_DATA_FORM__VALIDATORS, true,
				false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the View Profiles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addViewProfilesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ElementalDataForm_viewProfiles_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ElementalDataForm_viewProfiles_feature",
						"_UI_ElementalDataForm_type"),
				PMFPackage.Literals.ELEMENTAL_DATA_FORM__VIEW_PROFILES, true,
				false, true, null, null, null));
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(PMFPackage.Literals.ELEMENTAL_DATA_FORM__LOCAL_VALIDATORS);
			childrenFeatures
					.add(PMFPackage.Literals.ELEMENTAL_DATA_FORM__CHILDREN);
			childrenFeatures
					.add(PMFPackage.Literals.ELEMENTAL_DATA_FORM__LAYOUT);
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
	 * This returns ElementalDataForm.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/ElementalDataForm"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ElementalDataForm) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ElementalDataForm_type")
				: getString("_UI_ElementalDataForm_type") + " " + label;
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

		switch (notification.getFeatureID(ElementalDataForm.class)) {
		case PMFPackage.ELEMENTAL_DATA_FORM__LOCAL_VALIDATORS:
		case PMFPackage.ELEMENTAL_DATA_FORM__CHILDREN:
		case PMFPackage.ELEMENTAL_DATA_FORM__LAYOUT:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.ELEMENTAL_DATA_FORM__LOCAL_VALIDATORS,
				PMFFactory.eINSTANCE.createValidator()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.ELEMENTAL_DATA_FORM__LOCAL_VALIDATORS,
				PMFFactory.eINSTANCE.createRegexValidator()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.ELEMENTAL_DATA_FORM__CHILDREN,
				PMFFactory.eINSTANCE.createDataField()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.ELEMENTAL_DATA_FORM__CHILDREN,
				PMFFactory.eINSTANCE.createDataCollection()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.ELEMENTAL_DATA_FORM__CHILDREN,
				PMFFactory.eINSTANCE.createDataGroup()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.ELEMENTAL_DATA_FORM__CHILDREN,
				PMFFactory.eINSTANCE.createDataInheritance()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.ELEMENTAL_DATA_FORM__CHILDREN,
				PMFFactory.eINSTANCE.createDataAssocication()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.ELEMENTAL_DATA_FORM__LAYOUT,
				UiFactory.eINSTANCE.createGridLayout()));
	}

}
