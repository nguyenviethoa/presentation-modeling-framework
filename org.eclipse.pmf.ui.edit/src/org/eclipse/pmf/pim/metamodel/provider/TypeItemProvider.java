/******************************************************************************* 
 * Copyright (c) 2006, 2016 Soyatec (http://www.soyatec.com) and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Soyatec - initial API and implementation 
 *******************************************************************************/ 
package org.eclipse.pmf.pim.metamodel.provider;

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
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.pmf.pim.data.DataFactory;
import org.eclipse.pmf.pim.metamodel.MetamodelFactory;
import org.eclipse.pmf.pim.metamodel.MetamodelPackage;
import org.eclipse.pmf.pim.metamodel.Type;
import org.eclipse.pmf.pim.provider.PMFObjectItemProvider;
import org.eclipse.pmf.pim.provider.PmfEditPlugin;

/**
 * This is the item provider adapter for a
 * {@link org.eclipse.pmf.pim.metamodel.Type} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class TypeItemProvider extends PMFObjectItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TypeItemProvider(AdapterFactory adapterFactory) {
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

			addAbstractPropertyDescriptor(object);
			addPrimitivePropertyDescriptor(object);
			addSuperTypesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Abstract feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Type_abstract_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Type_abstract_feature", "_UI_Type_type"),
				MetamodelPackage.Literals.TYPE__ABSTRACT, false, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Primitive feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addPrimitivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Type_primitive_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Type_primitive_feature", "_UI_Type_type"),
				MetamodelPackage.Literals.TYPE__PRIMITIVE, false, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Super Types feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSuperTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Type_superTypes_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Type_superTypes_feature", "_UI_Type_type"),
				MetamodelPackage.Literals.TYPE__SUPER_TYPES, true, false, true,
				null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to
	 * deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in
	 * {@link #createCommand}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MetamodelPackage.Literals.TYPE__PROPERTIES);
			childrenFeatures
					.add(MetamodelPackage.Literals.TYPE__TYPE_PARAMETERS);
			childrenFeatures
					.add(MetamodelPackage.Literals.TYPE__GENERIC_SUPER_TYPES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper
		// feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Type.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Type"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Type) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Type_type")
				: getString("_UI_Type_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Type.class)) {
		case MetamodelPackage.TYPE__ABSTRACT:
		case MetamodelPackage.TYPE__PRIMITIVE:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case MetamodelPackage.TYPE__PROPERTIES:
		case MetamodelPackage.TYPE__TYPE_PARAMETERS:
		case MetamodelPackage.TYPE__GENERIC_SUPER_TYPES:
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
				MetamodelPackage.Literals.TYPE__PROPERTIES,
				DataFactory.eINSTANCE.createDataProperty()));

		newChildDescriptors.add(createChildParameter(
				MetamodelPackage.Literals.TYPE__TYPE_PARAMETERS,
				MetamodelFactory.eINSTANCE.createTypeParameter()));

		newChildDescriptors.add(createChildParameter(
				MetamodelPackage.Literals.TYPE__GENERIC_SUPER_TYPES,
				MetamodelFactory.eINSTANCE.createGenericType()));
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