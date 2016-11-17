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
package org.eclipse.pmf.pim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.pmf.pim.DataConverter;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.data.DataType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>IData Converter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataConverterImpl#getFromType <em>From Type</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataConverterImpl#getToType <em>To Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataConverterImpl extends PMFObjectImpl implements DataConverter {
	/**
	 * The cached value of the '{@link #getFromType() <em>From Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFromType()
	 * @generated
	 * @ordered
	 */
	protected DataType fromType;
	/**
	 * The cached value of the '{@link #getToType() <em>To Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getToType()
	 * @generated
	 * @ordered
	 */
	protected DataType toType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataConverterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMFPackage.Literals.DATA_CONVERTER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getFromType() {
		if (fromType != null && fromType.eIsProxy()) {
			InternalEObject oldFromType = (InternalEObject) fromType;
			fromType = (DataType) eResolveProxy(oldFromType);
			if (fromType != oldFromType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PMFPackage.DATA_CONVERTER__FROM_TYPE, oldFromType,
							fromType));
			}
		}
		return fromType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetFromType() {
		return fromType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromType(DataType newFromType) {
		DataType oldFromType = fromType;
		fromType = newFromType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_CONVERTER__FROM_TYPE, oldFromType, fromType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getToType() {
		if (toType != null && toType.eIsProxy()) {
			InternalEObject oldToType = (InternalEObject) toType;
			toType = (DataType) eResolveProxy(oldToType);
			if (toType != oldToType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PMFPackage.DATA_CONVERTER__TO_TYPE, oldToType,
							toType));
			}
		}
		return toType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetToType() {
		return toType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setToType(DataType newToType) {
		DataType oldToType = toType;
		toType = newToType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_CONVERTER__TO_TYPE, oldToType, toType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PMFPackage.DATA_CONVERTER__FROM_TYPE:
			if (resolve)
				return getFromType();
			return basicGetFromType();
		case PMFPackage.DATA_CONVERTER__TO_TYPE:
			if (resolve)
				return getToType();
			return basicGetToType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PMFPackage.DATA_CONVERTER__FROM_TYPE:
			setFromType((DataType) newValue);
			return;
		case PMFPackage.DATA_CONVERTER__TO_TYPE:
			setToType((DataType) newValue);
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
		case PMFPackage.DATA_CONVERTER__FROM_TYPE:
			setFromType((DataType) null);
			return;
		case PMFPackage.DATA_CONVERTER__TO_TYPE:
			setToType((DataType) null);
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
		case PMFPackage.DATA_CONVERTER__FROM_TYPE:
			return fromType != null;
		case PMFPackage.DATA_CONVERTER__TO_TYPE:
			return toType != null;
		}
		return super.eIsSet(featureID);
	}

} // IDataConverterImpl
