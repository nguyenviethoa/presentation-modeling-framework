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
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.pmf.pim.provider.PmfEditPlugin;
import org.eclipse.pmf.pim.provider.UIObjectItemProvider;
import org.eclipse.pmf.pim.ui.UIElement;
import org.eclipse.pmf.pim.ui.UiFactory;
import org.eclipse.pmf.pim.ui.UiPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.pmf.pim.ui.UIElement} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class UIElementItemProvider extends UIObjectItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UIElementItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(UiPackage.Literals.UI_ELEMENT__FOREGROUND);
			childrenFeatures.add(UiPackage.Literals.UI_ELEMENT__BACKGROUND);
			childrenFeatures.add(UiPackage.Literals.UI_ELEMENT__FONT);
			childrenFeatures.add(UiPackage.Literals.UI_ELEMENT__TOOL_TIP);
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
		String label = ((UIElement) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_UIElement_type")
				: getString("_UI_UIElement_type") + " " + label;
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

		switch (notification.getFeatureID(UIElement.class)) {
		case UiPackage.UI_ELEMENT__FOREGROUND:
		case UiPackage.UI_ELEMENT__BACKGROUND:
		case UiPackage.UI_ELEMENT__FONT:
		case UiPackage.UI_ELEMENT__TOOL_TIP:
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
				UiPackage.Literals.UI_ELEMENT__FOREGROUND,
				UiFactory.eINSTANCE.createColor()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__BACKGROUND,
				UiFactory.eINSTANCE.createColor()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__FONT,
				UiFactory.eINSTANCE.createFont()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createText()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createStackPanel()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createSeparator()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createPart()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createPage()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createWindow()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createButton()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createCombo()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createGroupBox()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createBooleanButton()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createSelector()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createListView()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createFinder()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createMenuItem()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createViewPart()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createSashFrom()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createPropertiesPart()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createTabSet()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createTable()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createRichText()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createDateTimePicker()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createHyperlink()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createWizardPage()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createMessageDialog()));

		newChildDescriptors.add(createChildParameter(
				UiPackage.Literals.UI_ELEMENT__TOOL_TIP,
				UiFactory.eINSTANCE.createRadioButton()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature,
			Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == UiPackage.Literals.UI_ELEMENT__BACKGROUND
				|| childFeature == UiPackage.Literals.UI_ELEMENT__FOREGROUND
				|| childFeature == UiPackage.Literals.UI_ELEMENT__TOOL_TIP;

		if (qualify) {
			return getString("_UI_CreateChild_text2", new Object[] {
					getTypeText(childObject), getFeatureText(childFeature),
					getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
