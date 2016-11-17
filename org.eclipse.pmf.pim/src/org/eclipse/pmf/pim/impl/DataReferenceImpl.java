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
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.DataReference;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.data.DataType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataReferenceImpl#getDataForm <em>Data Form</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataReferenceImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataReferenceImpl extends DataCompositeImpl implements
		DataReference {
	/**
	 * The cached value of the '{@link #getDataForm() <em>Data Form</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataForm()
	 * @generated
	 * @ordered
	 */
	protected DataForm dataForm;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMFPackage.Literals.DATA_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataForm getDataForm() {
		if (dataForm != null && dataForm.eIsProxy()) {
			InternalEObject oldDataForm = (InternalEObject) dataForm;
			dataForm = (DataForm) eResolveProxy(oldDataForm);
			if (dataForm != oldDataForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PMFPackage.DATA_REFERENCE__DATA_FORM, oldDataForm,
							dataForm));
			}
		}
		return dataForm;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataForm basicGetDataForm() {
		return dataForm;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataForm(DataForm newDataForm) {
		DataForm oldDataForm = dataForm;
		dataForm = newDataForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_REFERENCE__DATA_FORM, oldDataForm, dataForm));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject) dataType;
			dataType = (DataType) eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PMFPackage.DATA_REFERENCE__DATA_TYPE, oldDataType,
							dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_REFERENCE__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PMFPackage.DATA_REFERENCE__DATA_FORM:
			if (resolve)
				return getDataForm();
			return basicGetDataForm();
		case PMFPackage.DATA_REFERENCE__DATA_TYPE:
			if (resolve)
				return getDataType();
			return basicGetDataType();
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
		case PMFPackage.DATA_REFERENCE__DATA_FORM:
			setDataForm((DataForm) newValue);
			return;
		case PMFPackage.DATA_REFERENCE__DATA_TYPE:
			setDataType((DataType) newValue);
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
		case PMFPackage.DATA_REFERENCE__DATA_FORM:
			setDataForm((DataForm) null);
			return;
		case PMFPackage.DATA_REFERENCE__DATA_TYPE:
			setDataType((DataType) null);
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
		case PMFPackage.DATA_REFERENCE__DATA_FORM:
			return dataForm != null;
		case PMFPackage.DATA_REFERENCE__DATA_TYPE:
			return dataType != null;
		}
		return super.eIsSet(featureID);
	}

} // DataReferenceImpl
