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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.pmf.pim.data.DataPackage;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.data.GenericType;
import org.eclipse.pmf.pim.data.TypeParameter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Generic Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.data.impl.GenericTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.impl.GenericTypeImpl#getTypeParameter <em>Type Parameter</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.impl.GenericTypeImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.impl.GenericTypeImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.impl.GenericTypeImpl#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericTypeImpl extends EObjectImpl implements GenericType {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataType type;

	/**
	 * The cached value of the '{@link #getTypeParameter() <em>Type Parameter</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTypeParameter()
	 * @generated
	 * @ordered
	 */
	protected TypeParameter typeParameter;

	/**
	 * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getTypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericType> typeArguments;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected GenericType upperBound;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected GenericType lowerBound;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.GENERIC_TYPE;
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
							DataPackage.GENERIC_TYPE__TYPE, oldType, type));
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
					DataPackage.GENERIC_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParameter getTypeParameter() {
		if (typeParameter != null && typeParameter.eIsProxy()) {
			InternalEObject oldTypeParameter = (InternalEObject) typeParameter;
			typeParameter = (TypeParameter) eResolveProxy(oldTypeParameter);
			if (typeParameter != oldTypeParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DataPackage.GENERIC_TYPE__TYPE_PARAMETER,
							oldTypeParameter, typeParameter));
			}
		}
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParameter basicGetTypeParameter() {
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeParameter(TypeParameter newTypeParameter) {
		TypeParameter oldTypeParameter = typeParameter;
		typeParameter = newTypeParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DataPackage.GENERIC_TYPE__TYPE_PARAMETER, oldTypeParameter,
					typeParameter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericType> getTypeArguments() {
		if (typeArguments == null) {
			typeArguments = new EObjectContainmentEList<GenericType>(
					GenericType.class, this,
					DataPackage.GENERIC_TYPE__TYPE_ARGUMENTS);
		}
		return typeArguments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GenericType getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperBound(GenericType newUpperBound,
			NotificationChain msgs) {
		GenericType oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, DataPackage.GENERIC_TYPE__UPPER_BOUND,
					oldUpperBound, newUpperBound);
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
	public void setUpperBound(GenericType newUpperBound) {
		if (newUpperBound != upperBound) {
			NotificationChain msgs = null;
			if (upperBound != null)
				msgs = ((InternalEObject) upperBound).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- DataPackage.GENERIC_TYPE__UPPER_BOUND, null,
						msgs);
			if (newUpperBound != null)
				msgs = ((InternalEObject) newUpperBound).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- DataPackage.GENERIC_TYPE__UPPER_BOUND, null,
						msgs);
			msgs = basicSetUpperBound(newUpperBound, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DataPackage.GENERIC_TYPE__UPPER_BOUND, newUpperBound,
					newUpperBound));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GenericType getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerBound(GenericType newLowerBound,
			NotificationChain msgs) {
		GenericType oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, DataPackage.GENERIC_TYPE__LOWER_BOUND,
					oldLowerBound, newLowerBound);
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
	public void setLowerBound(GenericType newLowerBound) {
		if (newLowerBound != lowerBound) {
			NotificationChain msgs = null;
			if (lowerBound != null)
				msgs = ((InternalEObject) lowerBound).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- DataPackage.GENERIC_TYPE__LOWER_BOUND, null,
						msgs);
			if (newLowerBound != null)
				msgs = ((InternalEObject) newLowerBound).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- DataPackage.GENERIC_TYPE__LOWER_BOUND, null,
						msgs);
			msgs = basicSetLowerBound(newLowerBound, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DataPackage.GENERIC_TYPE__LOWER_BOUND, newLowerBound,
					newLowerBound));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DataPackage.GENERIC_TYPE__TYPE_ARGUMENTS:
			return ((InternalEList<?>) getTypeArguments()).basicRemove(
					otherEnd, msgs);
		case DataPackage.GENERIC_TYPE__UPPER_BOUND:
			return basicSetUpperBound(null, msgs);
		case DataPackage.GENERIC_TYPE__LOWER_BOUND:
			return basicSetLowerBound(null, msgs);
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
		case DataPackage.GENERIC_TYPE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case DataPackage.GENERIC_TYPE__TYPE_PARAMETER:
			if (resolve)
				return getTypeParameter();
			return basicGetTypeParameter();
		case DataPackage.GENERIC_TYPE__TYPE_ARGUMENTS:
			return getTypeArguments();
		case DataPackage.GENERIC_TYPE__UPPER_BOUND:
			return getUpperBound();
		case DataPackage.GENERIC_TYPE__LOWER_BOUND:
			return getLowerBound();
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
		case DataPackage.GENERIC_TYPE__TYPE:
			setType((DataType) newValue);
			return;
		case DataPackage.GENERIC_TYPE__TYPE_PARAMETER:
			setTypeParameter((TypeParameter) newValue);
			return;
		case DataPackage.GENERIC_TYPE__TYPE_ARGUMENTS:
			getTypeArguments().clear();
			getTypeArguments().addAll(
					(Collection<? extends GenericType>) newValue);
			return;
		case DataPackage.GENERIC_TYPE__UPPER_BOUND:
			setUpperBound((GenericType) newValue);
			return;
		case DataPackage.GENERIC_TYPE__LOWER_BOUND:
			setLowerBound((GenericType) newValue);
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
		case DataPackage.GENERIC_TYPE__TYPE:
			setType((DataType) null);
			return;
		case DataPackage.GENERIC_TYPE__TYPE_PARAMETER:
			setTypeParameter((TypeParameter) null);
			return;
		case DataPackage.GENERIC_TYPE__TYPE_ARGUMENTS:
			getTypeArguments().clear();
			return;
		case DataPackage.GENERIC_TYPE__UPPER_BOUND:
			setUpperBound((GenericType) null);
			return;
		case DataPackage.GENERIC_TYPE__LOWER_BOUND:
			setLowerBound((GenericType) null);
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
		case DataPackage.GENERIC_TYPE__TYPE:
			return type != null;
		case DataPackage.GENERIC_TYPE__TYPE_PARAMETER:
			return typeParameter != null;
		case DataPackage.GENERIC_TYPE__TYPE_ARGUMENTS:
			return typeArguments != null && !typeArguments.isEmpty();
		case DataPackage.GENERIC_TYPE__UPPER_BOUND:
			return upperBound != null;
		case DataPackage.GENERIC_TYPE__LOWER_BOUND:
			return lowerBound != null;
		}
		return super.eIsSet(featureID);
	}

} // GenericTypeImpl
