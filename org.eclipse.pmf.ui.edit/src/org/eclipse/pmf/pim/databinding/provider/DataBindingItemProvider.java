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
package org.eclipse.pmf.pim.databinding.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.pmf.pim.PMFFactory;
import org.eclipse.pmf.pim.databinding.BindingMode;
import org.eclipse.pmf.pim.databinding.DataBinding;
import org.eclipse.pmf.pim.databinding.DatabindingFactory;
import org.eclipse.pmf.pim.databinding.DatabindingPackage;
import org.eclipse.pmf.pim.provider.PmfEditPlugin;

/**
 * This is the item provider adapter for a
 * {@link org.eclipse.pmf.pim.databinding.DataBinding} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DataBindingItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataBindingItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addConverterPropertyDescriptor(object);
			addValidatorsPropertyDescriptor(object);
			addModePropertyDescriptor(object);
			addUpdateSourceTriggerPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_DataBinding_type_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DataBinding_type_feature",
								"_UI_DataBinding_type"),
						DatabindingPackage.Literals.DATA_BINDING__TYPE, true,
						false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Converter feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addConverterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DataBinding_converter_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DataBinding_converter_feature",
						"_UI_DataBinding_type"),
				DatabindingPackage.Literals.DATA_BINDING__CONVERTER, true,
				false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Validators feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addValidatorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DataBinding_validators_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DataBinding_validators_feature",
						"_UI_DataBinding_type"),
				DatabindingPackage.Literals.DATA_BINDING__VALIDATORS, true,
				false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Mode feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_DataBinding_mode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DataBinding_mode_feature",
								"_UI_DataBinding_type"),
						DatabindingPackage.Literals.DATA_BINDING__MODE, true,
						false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Update Source Trigger feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdateSourceTriggerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_DataBinding_updateSourceTrigger_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DataBinding_updateSourceTrigger_feature",
								"_UI_DataBinding_type"),
						DatabindingPackage.Literals.DATA_BINDING__UPDATE_SOURCE_TRIGGER,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DataBinding_status_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DataBinding_status_feature",
						"_UI_DataBinding_type"),
				DatabindingPackage.Literals.DATA_BINDING__STATUS, true, false,
				true, null, null, null));
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
			childrenFeatures
					.add(DatabindingPackage.Literals.DATA_BINDING__PATH);
			childrenFeatures
					.add(DatabindingPackage.Literals.DATA_BINDING__LOCAL_CONVERTER);
			childrenFeatures
					.add(DatabindingPackage.Literals.DATA_BINDING__LOCAL_VALIDATORS);
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
	 * This returns DataBinding.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/DataBinding"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BindingMode labelValue = ((DataBinding) object).getMode();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_DataBinding_type")
				: getString("_UI_DataBinding_type") + " " + label;
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

		switch (notification.getFeatureID(DataBinding.class)) {
		case DatabindingPackage.DATA_BINDING__MODE:
		case DatabindingPackage.DATA_BINDING__UPDATE_SOURCE_TRIGGER:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case DatabindingPackage.DATA_BINDING__PATH:
		case DatabindingPackage.DATA_BINDING__LOCAL_CONVERTER:
		case DatabindingPackage.DATA_BINDING__LOCAL_VALIDATORS:
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
				DatabindingPackage.Literals.DATA_BINDING__PATH,
				DatabindingFactory.eINSTANCE.createDataBindingPath()));

		newChildDescriptors.add(createChildParameter(
				DatabindingPackage.Literals.DATA_BINDING__PATH,
				DatabindingFactory.eINSTANCE.createDataBindingNode()));

		newChildDescriptors.add(createChildParameter(
				DatabindingPackage.Literals.DATA_BINDING__PATH,
				DatabindingFactory.eINSTANCE.createDataBindingLeaf()));

		newChildDescriptors.add(createChildParameter(
				DatabindingPackage.Literals.DATA_BINDING__LOCAL_CONVERTER,
				PMFFactory.eINSTANCE.createDataConverter()));

		newChildDescriptors.add(createChildParameter(
				DatabindingPackage.Literals.DATA_BINDING__LOCAL_VALIDATORS,
				PMFFactory.eINSTANCE.createValidator()));

		newChildDescriptors.add(createChildParameter(
				DatabindingPackage.Literals.DATA_BINDING__LOCAL_VALIDATORS,
				PMFFactory.eINSTANCE.createRegexValidator()));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PmfEditPlugin.INSTANCE;
	}

}
