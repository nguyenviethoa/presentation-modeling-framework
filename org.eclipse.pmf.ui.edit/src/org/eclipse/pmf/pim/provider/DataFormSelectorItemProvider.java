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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.pde.core.plugin.IExtensions;
import org.eclipse.pde.core.plugin.IPluginAttribute;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginObject;
import org.eclipse.pde.internal.core.plugin.PluginElement;
import org.eclipse.pmf.pim.DataFormSelector;
import org.eclipse.pmf.pim.PMFPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.pmf.pim.DataFormSelector} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataFormSelectorItemProvider extends CompositeDataFormItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFormSelectorItemProvider(AdapterFactory adapterFactory) {
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

			addUIModePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the UI Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	/*
	protected void addUIModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DataFormSelector_UIMode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DataFormSelector_UIMode_feature",
						"_UI_DataFormSelector_type"),
				PMFPackage.Literals.DATA_FORM_SELECTOR__UI_MODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}
	 */
	protected void addUIModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DataFormSelector_UIMode_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_DataFormSelector_UIMode_feature",
						"_UI_DataFormSelector_type"),
				PMFPackage.Literals.DATA_FORM_SELECTOR__UI_MODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
			/*
			 * Return a collection of attribute values, according to Extension Point ID, Element name and Attribute name.
			 */
			private Collection<String> getAttributeValuesofExtensions(
					String ExtensionPoint_ID, String Element_ID,
					String Attribute_ID) {
				List<String> values = new ArrayList<String>();
				// from Platform
				IExtensionPoint extensionPoint = org.eclipse.core.runtime.Platform
						.getExtensionRegistry().getExtensionPoint(
								ExtensionPoint_ID);
				IExtension[] extensions = extensionPoint.getExtensions();
				for (IExtension extension : extensions) {
					IConfigurationElement[] configs = extension
							.getConfigurationElements();
					for (IConfigurationElement config : configs) {
						if (config.getName().equals(Element_ID))
							values.add(config.getAttribute(Attribute_ID));
					}
				}

				// from Workspace
				IPluginModelBase[] workspacePlugins = org.eclipse.pde.core.plugin.PluginRegistry
						.getWorkspaceModels();
				for (IPluginModelBase workspacePlugin : workspacePlugins) {
					IExtensions iExtensions = workspacePlugin.getExtensions();
					for (IPluginExtension pluginExtension : iExtensions
							.getExtensions()) {
						if (pluginExtension.getPoint()
								.equals(ExtensionPoint_ID)) {
							for (IPluginObject pluginObject : pluginExtension
									.getChildren()) {
								if (pluginObject instanceof PluginElement) {
									PluginElement pluginElement = (PluginElement) pluginObject;
									if (pluginElement.getName().equals(
											Element_ID)) {
										for (IPluginAttribute pluginAttribute : pluginElement
												.getAttributes()) {
											if (pluginAttribute.getName()
													.equals(Attribute_ID))
												values.add(pluginAttribute
														.getValue());
										}
									}
								}
							}
						}
					}
				}
				return values;
			}

			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				final String UIMODE_ID = "org.eclipse.pmf.pim.extensionpoint.uimode";
				final String UIMODE = "UIMode";
				final String UIMODEOPTION = "UIModeOption";
				return getAttributeValuesofExtensions(UIMODE_ID, UIMODE,
						UIMODEOPTION);
			}
		});
	}

	/**
	 * This returns DataFormSelector.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/DataFormSelector"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataFormSelector) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_DataFormSelector_type")
				: getString("_UI_DataFormSelector_type") + " " + label;
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

		switch (notification.getFeatureID(DataFormSelector.class)) {
		case PMFPackage.DATA_FORM_SELECTOR__UI_MODE:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
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
	}

}
