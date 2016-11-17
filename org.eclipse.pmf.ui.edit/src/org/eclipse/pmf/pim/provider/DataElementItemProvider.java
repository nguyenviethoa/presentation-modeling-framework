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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.pmf.pim.DataElement;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.databinding.DatabindingFactory;
import org.eclipse.pmf.pim.ui.UiFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.pmf.pim.DataElement} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class DataElementItemProvider extends UIObjectItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataElementItemProvider(AdapterFactory adapterFactory) {
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

			addDataContextTypePropertyDescriptor(object);
			addResolvedTargetContextTypePropertyDescriptor(object);
			addResolvedDataContextTypePropertyDescriptor(object);
			addChangeablePropertyDescriptor(object);
			addPropertyChangedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Data Context Type feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDataContextTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DataElement_dataContextType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DataElement_dataContextType_feature",
						"_UI_DataElement_type"),
				PMFPackage.Literals.DATA_ELEMENT__DATA_CONTEXT_TYPE, true,
				false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Resolved Target Context Type feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolvedTargetContextTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DataElement_resolvedTargetContextType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DataElement_resolvedTargetContextType_feature",
						"_UI_DataElement_type"),
				PMFPackage.Literals.DATA_ELEMENT__RESOLVED_TARGET_CONTEXT_TYPE,
				false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Resolved Data Context Type feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolvedDataContextTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DataElement_resolvedDataContextType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DataElement_resolvedDataContextType_feature",
						"_UI_DataElement_type"),
				PMFPackage.Literals.DATA_ELEMENT__RESOLVED_DATA_CONTEXT_TYPE,
				false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Changeable feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addChangeablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DataElement_changeable_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DataElement_changeable_feature",
						"_UI_DataElement_type"),
				PMFPackage.Literals.DATA_ELEMENT__CHANGEABLE, true, false,
				false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Property Changed feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addPropertyChangedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DataElement_propertyChanged_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DataElement_propertyChanged_feature",
						"_UI_DataElement_type"),
				PMFPackage.Literals.DATA_ELEMENT__PROPERTY_CHANGED, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
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
					.add(PMFPackage.Literals.DATA_ELEMENT__DATA_BINDING);
			childrenFeatures.add(PMFPackage.Literals.DATA_ELEMENT__CONTROL);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataElement) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_DataElement_type")
				: getString("_UI_DataElement_type") + " " + label;
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

		switch (notification.getFeatureID(DataElement.class)) {
		case PMFPackage.DATA_ELEMENT__CHANGEABLE:
		case PMFPackage.DATA_ELEMENT__PROPERTY_CHANGED:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case PMFPackage.DATA_ELEMENT__DATA_BINDING:
		case PMFPackage.DATA_ELEMENT__CONTROL:
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
				PMFPackage.Literals.DATA_ELEMENT__DATA_BINDING,
				DatabindingFactory.eINSTANCE.createDataBinding()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createText()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createStackPanel()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createSeparator()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createPart()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createPage()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createWindow()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createButton()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createCombo()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createGroupBox()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createBooleanButton()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createSelector()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createListView()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createFinder()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createMenuItem()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createViewPart()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createSashFrom()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createPropertiesPart()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createTabSet()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createTable()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createRichText()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createDateTimePicker()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createHyperlink()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createWizardPage()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createMessageDialog()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.DATA_ELEMENT__CONTROL,
				UiFactory.eINSTANCE.createRadioButton()));
	}

}
