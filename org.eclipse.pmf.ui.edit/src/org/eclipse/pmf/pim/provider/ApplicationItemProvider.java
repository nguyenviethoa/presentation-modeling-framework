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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.pmf.emf.ui.popup.actions.custom.CreateWizardCommand;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.PMFFactory;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.ui.UiFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.pmf.pim.Application} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class ApplicationItemProvider extends LibraryItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ApplicationItemProvider(AdapterFactory adapterFactory) {
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

			addMainPropertyDescriptor(object);
			addAllViewProfilesPropertyDescriptor(object);
			addAllSystemActionsPropertyDescriptor(object);
			addAllCommandsPropertyDescriptor(object);
			addAllConvertersPropertyDescriptor(object);
			addAllValidatorsPropertyDescriptor(object);
			addAllTypesPropertyDescriptor(object);
			addAllImagesPropertyDescriptor(object);
			addMandatoryFieldPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Main feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMainPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Application_main_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_Application_main_feature",
								"_UI_Application_type"),
						PMFPackage.Literals.APPLICATION__MAIN, true, false,
						true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the All View Profiles feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAllViewProfilesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Application_allViewProfiles_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Application_allViewProfiles_feature",
						"_UI_Application_type"),
				PMFPackage.Literals.APPLICATION__ALL_VIEW_PROFILES, false,
				false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the All System Actions feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAllSystemActionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Application_allSystemActions_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Application_allSystemActions_feature",
						"_UI_Application_type"),
				PMFPackage.Literals.APPLICATION__ALL_SYSTEM_ACTIONS, false,
				false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the All Commands feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAllCommandsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Application_allCommands_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Application_allCommands_feature",
						"_UI_Application_type"),
				PMFPackage.Literals.APPLICATION__ALL_COMMANDS, false, false,
				false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the All Converters feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAllConvertersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Application_allConverters_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Application_allConverters_feature",
						"_UI_Application_type"),
				PMFPackage.Literals.APPLICATION__ALL_CONVERTERS, false, false,
				false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the All Validators feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAllValidatorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Application_allValidators_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Application_allValidators_feature",
						"_UI_Application_type"),
				PMFPackage.Literals.APPLICATION__ALL_VALIDATORS, false, false,
				false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the All Types feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAllTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Application_allTypes_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Application_allTypes_feature",
						"_UI_Application_type"),
				PMFPackage.Literals.APPLICATION__ALL_TYPES, false, false,
				false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the All Images feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllImagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Application_allImages_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Application_allImages_feature",
						"_UI_Application_type"),
				PMFPackage.Literals.APPLICATION__ALL_IMAGES, false, false,
				false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Mandatory Field feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMandatoryFieldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Application_mandatoryField_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Application_mandatoryField_feature",
						"_UI_Application_type"),
				PMFPackage.Literals.APPLICATION__MANDATORY_FIELD, true, false,
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
			childrenFeatures.add(PMFPackage.Literals.APPLICATION__MAIN);
			childrenFeatures
					.add(PMFPackage.Literals.APPLICATION__DATA_MODEL_MANAGERS);
			childrenFeatures.add(PMFPackage.Literals.APPLICATION__LIBRARIES);
			childrenFeatures
					.add(PMFPackage.Literals.APPLICATION__AUTHENTICATION);
			childrenFeatures.add(PMFPackage.Literals.APPLICATION__WIZARDS);
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
	 * This returns Application.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Application"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Application) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Application_type")
				: getString("_UI_Application_type") + " " + label;
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

		switch (notification.getFeatureID(Application.class)) {
		case PMFPackage.APPLICATION__MAIN:
		case PMFPackage.APPLICATION__DATA_MODEL_MANAGERS:
		case PMFPackage.APPLICATION__LIBRARIES:
		case PMFPackage.APPLICATION__AUTHENTICATION:
		case PMFPackage.APPLICATION__WIZARDS:
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
				PMFPackage.Literals.APPLICATION__MAIN,
				UiFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.APPLICATION__MAIN,
				UiFactory.eINSTANCE.createStackPanel()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.APPLICATION__MAIN,
				UiFactory.eINSTANCE.createGroupBox()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.APPLICATION__MAIN,
				UiFactory.eINSTANCE.createSashFrom()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.APPLICATION__MAIN,
				UiFactory.eINSTANCE.createTabSet()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.APPLICATION__LIBRARIES,
				PMFFactory.eINSTANCE.createLibrary()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.APPLICATION__LIBRARIES,
				PMFFactory.eINSTANCE.createApplication()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.APPLICATION__AUTHENTICATION,
				PMFFactory.eINSTANCE.createAuthentication()));

		newChildDescriptors.add(createChildParameter(
				PMFPackage.Literals.APPLICATION__WIZARDS,
				PMFFactory.eINSTANCE.createWizard()));
	}

	// owner: org.eclipse.pmf.pim.Application
	// value: created org.eclipse.pmf.pim.Wizard (or other widget)
	@Override
	protected Command createCreateChildCommand(EditingDomain domain,
			EObject owner, EStructuralFeature feature, java.lang.Object value,
			int index, java.util.Collection<?> collection) {
		Command command = null;
		if (value instanceof org.eclipse.pmf.pim.Wizard) {
			command = new CreateWizardCommand(super.createCreateChildCommand(
					domain, owner, feature, value, index, collection), owner,
					value);
		} else {
			command = super.createCreateChildCommand(domain, owner, feature,
					value, index, collection);
		}
		return command;
	}
}
