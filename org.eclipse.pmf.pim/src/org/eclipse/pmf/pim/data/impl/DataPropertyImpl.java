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
package org.eclipse.pmf.pim.data.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.pmf.pim.data.DataPackage;
import org.eclipse.pmf.pim.data.DataProperty;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.data.GenericType;
import org.eclipse.pmf.pim.impl.PMFObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Property</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.data.impl.DataPropertyImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.impl.DataPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.impl.DataPropertyImpl#isMany <em>Many</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.impl.DataPropertyImpl#getGenericType <em>Generic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPropertyImpl extends PMFObjectImpl implements DataProperty {
	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataType type;

	/**
	 * The default value of the '{@link #isMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMany()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getGenericType() <em>Generic Type</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGenericType()
	 * @generated
	 * @ordered
	 */
	protected GenericType genericType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (DataType) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DataPackage.DATA_PROPERTY__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataType newType) {
		DataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DataPackage.DATA_PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMany() {
		// TODO: implement this method to return the 'Many' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GenericType getGenericType() {
		return genericType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericType(GenericType newGenericType,
			NotificationChain msgs) {
		GenericType oldGenericType = genericType;
		genericType = newGenericType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, DataPackage.DATA_PROPERTY__GENERIC_TYPE,
					oldGenericType, newGenericType);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericType(GenericType newGenericType) {
		if (newGenericType != genericType) {
			NotificationChain msgs = null;
			if (genericType != null)
				msgs = ((InternalEObject) genericType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- DataPackage.DATA_PROPERTY__GENERIC_TYPE,
						null, msgs);
			if (newGenericType != null)
				msgs = ((InternalEObject) newGenericType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- DataPackage.DATA_PROPERTY__GENERIC_TYPE,
						null, msgs);
			msgs = basicSetGenericType(newGenericType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DataPackage.DATA_PROPERTY__GENERIC_TYPE, newGenericType,
					newGenericType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMandatory() {
		// TODO: implement this method to return the 'Mandatory' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DataPackage.DATA_PROPERTY__GENERIC_TYPE:
			return basicSetGenericType(null, msgs);
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
		case DataPackage.DATA_PROPERTY__MANDATORY:
			return isMandatory();
		case DataPackage.DATA_PROPERTY__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case DataPackage.DATA_PROPERTY__MANY:
			return isMany();
		case DataPackage.DATA_PROPERTY__GENERIC_TYPE:
			return getGenericType();
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
		case DataPackage.DATA_PROPERTY__TYPE:
			setType((DataType) newValue);
			return;
		case DataPackage.DATA_PROPERTY__GENERIC_TYPE:
			setGenericType((GenericType) newValue);
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
		case DataPackage.DATA_PROPERTY__TYPE:
			setType((DataType) null);
			return;
		case DataPackage.DATA_PROPERTY__GENERIC_TYPE:
			setGenericType((GenericType) null);
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
		case DataPackage.DATA_PROPERTY__MANDATORY:
			return isMandatory() != MANDATORY_EDEFAULT;
		case DataPackage.DATA_PROPERTY__TYPE:
			return type != null;
		case DataPackage.DATA_PROPERTY__MANY:
			return isMany() != MANY_EDEFAULT;
		case DataPackage.DATA_PROPERTY__GENERIC_TYPE:
			return genericType != null;
		}
		return super.eIsSet(featureID);
	}

} // DataPropertyImpl
