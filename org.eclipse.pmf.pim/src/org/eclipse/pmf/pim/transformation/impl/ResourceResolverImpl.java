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
package org.eclipse.pmf.pim.transformation.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.pmf.pim.impl.PMFObjectImpl;
import org.eclipse.pmf.pim.transformation.ResourceResolver;
import org.eclipse.pmf.pim.transformation.TransformationPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Code Gen Context</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.transformation.impl.ResourceResolverImpl#getValidatorMap <em>Validator Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.impl.ResourceResolverImpl#getDataConverterMap <em>Data Converter Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.impl.ResourceResolverImpl#getCommandMap <em>Command Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.impl.ResourceResolverImpl#getViewProfileMap <em>View Profile Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.impl.ResourceResolverImpl#getImageMap <em>Image Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.impl.ResourceResolverImpl#getSystemActionMap <em>System Action Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceResolverImpl extends PMFObjectImpl implements
		ResourceResolver {
	/**
	 * The cached value of the '{@link #getValidatorMap() <em>Validator Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatorMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> validatorMap;

	/**
	 * The cached value of the '{@link #getDataConverterMap() <em>Data Converter Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataConverterMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> dataConverterMap;

	/**
	 * The cached value of the '{@link #getCommandMap() <em>Command Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> commandMap;

	/**
	 * The cached value of the '{@link #getViewProfileMap() <em>View Profile Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewProfileMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> viewProfileMap;

	/**
	 * The cached value of the '{@link #getImageMap() <em>Image Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> imageMap;

	/**
	 * The cached value of the '{@link #getSystemActionMap() <em>System Action Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemActionMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> systemActionMap;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceResolverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransformationPackage.Literals.RESOURCE_RESOLVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getValidatorMap() {
		if (validatorMap == null) {
			validatorMap = new EcoreEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this,
					TransformationPackage.RESOURCE_RESOLVER__VALIDATOR_MAP);
		}
		return validatorMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getDataConverterMap() {
		if (dataConverterMap == null) {
			dataConverterMap = new EcoreEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this,
					TransformationPackage.RESOURCE_RESOLVER__DATA_CONVERTER_MAP);
		}
		return dataConverterMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getCommandMap() {
		if (commandMap == null) {
			commandMap = new EcoreEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this,
					TransformationPackage.RESOURCE_RESOLVER__COMMAND_MAP);
		}
		return commandMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getViewProfileMap() {
		if (viewProfileMap == null) {
			viewProfileMap = new EcoreEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this,
					TransformationPackage.RESOURCE_RESOLVER__VIEW_PROFILE_MAP);
		}
		return viewProfileMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getSystemActionMap() {
		if (systemActionMap == null) {
			systemActionMap = new EcoreEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this,
					TransformationPackage.RESOURCE_RESOLVER__SYSTEM_ACTION_MAP);
		}
		return systemActionMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getImageMap() {
		if (imageMap == null) {
			imageMap = new EcoreEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this,
					TransformationPackage.RESOURCE_RESOLVER__IMAGE_MAP);
		}
		return imageMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TransformationPackage.RESOURCE_RESOLVER__VALIDATOR_MAP:
			return ((InternalEList<?>) getValidatorMap()).basicRemove(otherEnd,
					msgs);
		case TransformationPackage.RESOURCE_RESOLVER__DATA_CONVERTER_MAP:
			return ((InternalEList<?>) getDataConverterMap()).basicRemove(
					otherEnd, msgs);
		case TransformationPackage.RESOURCE_RESOLVER__COMMAND_MAP:
			return ((InternalEList<?>) getCommandMap()).basicRemove(otherEnd,
					msgs);
		case TransformationPackage.RESOURCE_RESOLVER__VIEW_PROFILE_MAP:
			return ((InternalEList<?>) getViewProfileMap()).basicRemove(
					otherEnd, msgs);
		case TransformationPackage.RESOURCE_RESOLVER__IMAGE_MAP:
			return ((InternalEList<?>) getImageMap()).basicRemove(otherEnd,
					msgs);
		case TransformationPackage.RESOURCE_RESOLVER__SYSTEM_ACTION_MAP:
			return ((InternalEList<?>) getSystemActionMap()).basicRemove(
					otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TransformationPackage.RESOURCE_RESOLVER__VALIDATOR_MAP:
			if (coreType)
				return getValidatorMap();
			else
				return getValidatorMap().map();
		case TransformationPackage.RESOURCE_RESOLVER__DATA_CONVERTER_MAP:
			if (coreType)
				return getDataConverterMap();
			else
				return getDataConverterMap().map();
		case TransformationPackage.RESOURCE_RESOLVER__COMMAND_MAP:
			if (coreType)
				return getCommandMap();
			else
				return getCommandMap().map();
		case TransformationPackage.RESOURCE_RESOLVER__VIEW_PROFILE_MAP:
			if (coreType)
				return getViewProfileMap();
			else
				return getViewProfileMap().map();
		case TransformationPackage.RESOURCE_RESOLVER__IMAGE_MAP:
			if (coreType)
				return getImageMap();
			else
				return getImageMap().map();
		case TransformationPackage.RESOURCE_RESOLVER__SYSTEM_ACTION_MAP:
			if (coreType)
				return getSystemActionMap();
			else
				return getSystemActionMap().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TransformationPackage.RESOURCE_RESOLVER__VALIDATOR_MAP:
			((EStructuralFeature.Setting) getValidatorMap()).set(newValue);
			return;
		case TransformationPackage.RESOURCE_RESOLVER__DATA_CONVERTER_MAP:
			((EStructuralFeature.Setting) getDataConverterMap()).set(newValue);
			return;
		case TransformationPackage.RESOURCE_RESOLVER__COMMAND_MAP:
			((EStructuralFeature.Setting) getCommandMap()).set(newValue);
			return;
		case TransformationPackage.RESOURCE_RESOLVER__VIEW_PROFILE_MAP:
			((EStructuralFeature.Setting) getViewProfileMap()).set(newValue);
			return;
		case TransformationPackage.RESOURCE_RESOLVER__IMAGE_MAP:
			((EStructuralFeature.Setting) getImageMap()).set(newValue);
			return;
		case TransformationPackage.RESOURCE_RESOLVER__SYSTEM_ACTION_MAP:
			((EStructuralFeature.Setting) getSystemActionMap()).set(newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TransformationPackage.RESOURCE_RESOLVER__VALIDATOR_MAP:
			getValidatorMap().clear();
			return;
		case TransformationPackage.RESOURCE_RESOLVER__DATA_CONVERTER_MAP:
			getDataConverterMap().clear();
			return;
		case TransformationPackage.RESOURCE_RESOLVER__COMMAND_MAP:
			getCommandMap().clear();
			return;
		case TransformationPackage.RESOURCE_RESOLVER__VIEW_PROFILE_MAP:
			getViewProfileMap().clear();
			return;
		case TransformationPackage.RESOURCE_RESOLVER__IMAGE_MAP:
			getImageMap().clear();
			return;
		case TransformationPackage.RESOURCE_RESOLVER__SYSTEM_ACTION_MAP:
			getSystemActionMap().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TransformationPackage.RESOURCE_RESOLVER__VALIDATOR_MAP:
			return validatorMap != null && !validatorMap.isEmpty();
		case TransformationPackage.RESOURCE_RESOLVER__DATA_CONVERTER_MAP:
			return dataConverterMap != null && !dataConverterMap.isEmpty();
		case TransformationPackage.RESOURCE_RESOLVER__COMMAND_MAP:
			return commandMap != null && !commandMap.isEmpty();
		case TransformationPackage.RESOURCE_RESOLVER__VIEW_PROFILE_MAP:
			return viewProfileMap != null && !viewProfileMap.isEmpty();
		case TransformationPackage.RESOURCE_RESOLVER__IMAGE_MAP:
			return imageMap != null && !imageMap.isEmpty();
		case TransformationPackage.RESOURCE_RESOLVER__SYSTEM_ACTION_MAP:
			return systemActionMap != null && !systemActionMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ResourceResolverImpl
