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
package org.eclipse.pmf.pim.ui.provider;

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
import org.eclipse.pmf.pim.PMFFactory;
import org.eclipse.pmf.pim.ui.GroupBox;
import org.eclipse.pmf.pim.ui.UiFactory;
import org.eclipse.pmf.pim.ui.UiPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.pmf.pim.ui.GroupBox} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class GroupBoxItemProvider extends ContainerItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GroupBoxItemProvider(AdapterFactory adapterFactory) {
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

			addCollapsiblePropertyDescriptor(object);
			addCollapsePropertyDescriptor(object);
			addExpandPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Collapsible feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCollapsiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_GroupBox_collapsible_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_GroupBox_collapsible_feature",
								"_UI_GroupBox_type"),
						UiPackage.Literals.GROUP_BOX__COLLAPSIBLE, true, false,
						false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Collapse feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCollapsePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_GroupBox_collapse_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GroupBox_collapse_feature", "_UI_GroupBox_type"),
				UiPackage.Literals.GROUP_BOX__COLLAPSE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Expand feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addExpandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_GroupBox_expand_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GroupBox_expand_feature", "_UI_GroupBox_type"),
				UiPackage.Literals.GROUP_BOX__EXPAND, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(UiPackage.Literals.GROUP_BOX__TITLE);
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
	 * This returns GroupBox.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/GroupBox"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GroupBox) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_GroupBox_type")
				: getString("_UI_GroupBox_type") + " " + label;
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

		switch (notification.getFeatureID(GroupBox.class)) {
		case UiPackage.GROUP_BOX__COLLAPSIBLE:
		case UiPackage.GROUP_BOX__COLLAPSE:
		case UiPackage.GROUP_BOX__EXPAND:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case UiPackage.GROUP_BOX__TITLE:
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
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createText()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createStackPanel()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createSeparator()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createPart()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createPage()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createWindow()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createButton()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createCombo()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createGroupBox()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createBooleanButton()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createSelector()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createListView()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createFinder()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createMenuItem()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createViewPart()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createSashFrom()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createPropertiesPart()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createTabSet()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createTable()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createRichText()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createDateTimePicker()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createHyperlink()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createWizardPage()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createMessageDialog()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createRadioButton()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createGridLayout()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				UiFactory.eINSTANCE.createGridData()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				PMFFactory.eINSTANCE.createElementalDataForm()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				PMFFactory.eINSTANCE.createDataFormSelector()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				PMFFactory.eINSTANCE.createDataField()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				PMFFactory.eINSTANCE.createDataCollection()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				PMFFactory.eINSTANCE.createDataGroup()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				PMFFactory.eINSTANCE.createDataInheritance()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.GROUP_BOX__TITLE,
				PMFFactory.eINSTANCE.createDataAssocication()));
	}

	/**
	 * This returns the label text for
	 * {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature,
			Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == UiPackage.Literals.UI_ELEMENT__FOREGROUND
				|| childFeature == UiPackage.Literals.UI_ELEMENT__BACKGROUND
				|| childFeature == UiPackage.Literals.UI_ELEMENT__TOOL_TIP
				|| childFeature == UiPackage.Literals.CONTAINER__CHILDREN
				|| childFeature == UiPackage.Literals.GROUP_BOX__TITLE;

		if (qualify) {
			return getString("_UI_CreateChild_text2", new Object[] {
					getTypeText(childObject), getFeatureText(childFeature),
					getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
