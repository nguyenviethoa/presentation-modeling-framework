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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.pmf.pim.DataModelManagerFactory;
import org.eclipse.pmf.pim.PMF;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.data.DataModelManager;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>PMF</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.impl.PMFImpl#getModelManagerFactories <em>Model Manager Factories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PMFImpl extends EObjectImpl implements PMF {
	/**
	 * The cached value of the '{@link #getModelManagerFactories()
	 * <em>Model Manager Factories</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModelManagerFactories()
	 * @generated
	 * @ordered
	 */
	protected EList<DataModelManagerFactory> modelManagerFactories;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PMFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMFPackage.Literals.PMF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataModelManagerFactory> getModelManagerFactories() {
		if (modelManagerFactories == null) {
			modelManagerFactories = new EObjectContainmentEList<DataModelManagerFactory>(
					DataModelManagerFactory.class, this,
					PMFPackage.PMF__MODEL_MANAGER_FACTORIES);
		}
		return modelManagerFactories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModelManager getDataModelManager(EObject dataType) {
		// TODO: implement this method
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
		case PMFPackage.PMF__MODEL_MANAGER_FACTORIES:
			return ((InternalEList<?>) getModelManagerFactories()).basicRemove(
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
		case PMFPackage.PMF__MODEL_MANAGER_FACTORIES:
			return getModelManagerFactories();
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
		case PMFPackage.PMF__MODEL_MANAGER_FACTORIES:
			getModelManagerFactories().clear();
			getModelManagerFactories().addAll(
					(Collection<? extends DataModelManagerFactory>) newValue);
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
		case PMFPackage.PMF__MODEL_MANAGER_FACTORIES:
			getModelManagerFactories().clear();
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
		case PMFPackage.PMF__MODEL_MANAGER_FACTORIES:
			return modelManagerFactories != null
					&& !modelManagerFactories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // PMFImpl
