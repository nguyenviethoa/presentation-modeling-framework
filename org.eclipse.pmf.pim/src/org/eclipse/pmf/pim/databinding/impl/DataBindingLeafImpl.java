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
package org.eclipse.pmf.pim.databinding.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.pmf.pim.databinding.DataBindingLeaf;
import org.eclipse.pmf.pim.databinding.DatabindingPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Binding Leaf</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.databinding.impl.DataBindingLeafImpl#getAggregationNext <em>Aggregation Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataBindingLeafImpl extends DataBindingPathImpl implements
		DataBindingLeaf {
	/**
	 * The cached value of the '{@link #getAggregationNext() <em>Aggregation Next</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getAggregationNext()
	 * @generated
	 * @ordered
	 */
	protected DataBindingLeaf aggregationNext;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBindingLeafImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabindingPackage.Literals.DATA_BINDING_LEAF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataBindingLeaf getAggregationNext() {
		return aggregationNext;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregationNext(
			DataBindingLeaf newAggregationNext, NotificationChain msgs) {
		DataBindingLeaf oldAggregationNext = aggregationNext;
		aggregationNext = newAggregationNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					DatabindingPackage.DATA_BINDING_LEAF__AGGREGATION_NEXT,
					oldAggregationNext, newAggregationNext);
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
	public void setAggregationNext(DataBindingLeaf newAggregationNext) {
		if (newAggregationNext != aggregationNext) {
			NotificationChain msgs = null;
			if (aggregationNext != null)
				msgs = ((InternalEObject) aggregationNext)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- DatabindingPackage.DATA_BINDING_LEAF__AGGREGATION_NEXT,
								null, msgs);
			if (newAggregationNext != null)
				msgs = ((InternalEObject) newAggregationNext)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- DatabindingPackage.DATA_BINDING_LEAF__AGGREGATION_NEXT,
								null, msgs);
			msgs = basicSetAggregationNext(newAggregationNext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DatabindingPackage.DATA_BINDING_LEAF__AGGREGATION_NEXT,
					newAggregationNext, newAggregationNext));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DatabindingPackage.DATA_BINDING_LEAF__AGGREGATION_NEXT:
			return basicSetAggregationNext(null, msgs);
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
		case DatabindingPackage.DATA_BINDING_LEAF__AGGREGATION_NEXT:
			return getAggregationNext();
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
		case DatabindingPackage.DATA_BINDING_LEAF__AGGREGATION_NEXT:
			setAggregationNext((DataBindingLeaf) newValue);
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
		case DatabindingPackage.DATA_BINDING_LEAF__AGGREGATION_NEXT:
			setAggregationNext((DataBindingLeaf) null);
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
		case DatabindingPackage.DATA_BINDING_LEAF__AGGREGATION_NEXT:
			return aggregationNext != null;
		}
		return super.eIsSet(featureID);
	}

} // DataBindingLeafImpl
