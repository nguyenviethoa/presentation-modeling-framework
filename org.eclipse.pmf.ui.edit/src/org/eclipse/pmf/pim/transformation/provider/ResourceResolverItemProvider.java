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
package org.eclipse.pmf.pim.transformation.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.pmf.pim.provider.PMFObjectItemProvider;
import org.eclipse.pmf.pim.provider.PmfEditPlugin;
import org.eclipse.pmf.pim.transformation.ResourceResolver;
import org.eclipse.pmf.pim.transformation.TransformationPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.pmf.pim.transformation.ResourceResolver} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceResolverItemProvider extends PMFObjectItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceResolverItemProvider(AdapterFactory adapterFactory) {
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(TransformationPackage.Literals.RESOURCE_RESOLVER__VALIDATOR_MAP);
			childrenFeatures
					.add(TransformationPackage.Literals.RESOURCE_RESOLVER__DATA_CONVERTER_MAP);
			childrenFeatures
					.add(TransformationPackage.Literals.RESOURCE_RESOLVER__COMMAND_MAP);
			childrenFeatures
					.add(TransformationPackage.Literals.RESOURCE_RESOLVER__VIEW_PROFILE_MAP);
			childrenFeatures
					.add(TransformationPackage.Literals.RESOURCE_RESOLVER__IMAGE_MAP);
			childrenFeatures
					.add(TransformationPackage.Literals.RESOURCE_RESOLVER__SYSTEM_ACTION_MAP);
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
	 * This returns ResourceResolver.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/ResourceResolver"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ResourceResolver) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ResourceResolver_type")
				: getString("_UI_ResourceResolver_type") + " " + label;
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

		switch (notification.getFeatureID(ResourceResolver.class)) {
		case TransformationPackage.RESOURCE_RESOLVER__VALIDATOR_MAP:
		case TransformationPackage.RESOURCE_RESOLVER__DATA_CONVERTER_MAP:
		case TransformationPackage.RESOURCE_RESOLVER__COMMAND_MAP:
		case TransformationPackage.RESOURCE_RESOLVER__VIEW_PROFILE_MAP:
		case TransformationPackage.RESOURCE_RESOLVER__IMAGE_MAP:
		case TransformationPackage.RESOURCE_RESOLVER__SYSTEM_ACTION_MAP:
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

		newChildDescriptors
				.add(createChildParameter(
						TransformationPackage.Literals.RESOURCE_RESOLVER__VALIDATOR_MAP,
						EcoreFactory.eINSTANCE
								.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors
				.add(createChildParameter(
						TransformationPackage.Literals.RESOURCE_RESOLVER__DATA_CONVERTER_MAP,
						EcoreFactory.eINSTANCE
								.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors
				.add(createChildParameter(
						TransformationPackage.Literals.RESOURCE_RESOLVER__COMMAND_MAP,
						EcoreFactory.eINSTANCE
								.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors
				.add(createChildParameter(
						TransformationPackage.Literals.RESOURCE_RESOLVER__VIEW_PROFILE_MAP,
						EcoreFactory.eINSTANCE
								.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors
				.add(createChildParameter(
						TransformationPackage.Literals.RESOURCE_RESOLVER__IMAGE_MAP,
						EcoreFactory.eINSTANCE
								.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors
				.add(createChildParameter(
						TransformationPackage.Literals.RESOURCE_RESOLVER__SYSTEM_ACTION_MAP,
						EcoreFactory.eINSTANCE
								.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature,
			Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == TransformationPackage.Literals.RESOURCE_RESOLVER__VALIDATOR_MAP
				|| childFeature == TransformationPackage.Literals.RESOURCE_RESOLVER__DATA_CONVERTER_MAP
				|| childFeature == TransformationPackage.Literals.RESOURCE_RESOLVER__COMMAND_MAP
				|| childFeature == TransformationPackage.Literals.RESOURCE_RESOLVER__VIEW_PROFILE_MAP
				|| childFeature == TransformationPackage.Literals.RESOURCE_RESOLVER__IMAGE_MAP
				|| childFeature == TransformationPackage.Literals.RESOURCE_RESOLVER__SYSTEM_ACTION_MAP;

		if (qualify) {
			return getString("_UI_CreateChild_text2", new Object[] {
					getTypeText(childObject), getFeatureText(childFeature),
					getTypeText(owner) });
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
		return PmfEditPlugin.INSTANCE;
	}

}
