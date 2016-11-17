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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.DataFormFolder;
import org.eclipse.pmf.pim.PMFPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Form Folder</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataFormFolderImpl#getDataForms <em>Data Forms</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataFormFolderImpl#getDefaultDataForm <em>Default Data Form</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataFormFolderImpl extends EObjectImpl implements DataFormFolder {
	/**
	 * The cached value of the '{@link #getDataForms() <em>Data Forms</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataForms()
	 * @generated
	 * @ordered
	 */
	protected EList<DataForm> dataForms;

	/**
	 * The cached value of the '{@link #getDefaultDataForm() <em>Default Data Form</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDefaultDataForm()
	 * @generated
	 * @ordered
	 */
	protected DataForm defaultDataForm;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFormFolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMFPackage.Literals.DATA_FORM_FOLDER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataForm> getDataForms() {
		if (dataForms == null) {
			dataForms = new EObjectContainmentEList<DataForm>(DataForm.class,
					this, PMFPackage.DATA_FORM_FOLDER__DATA_FORMS);
		}
		return dataForms;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataForm getDefaultDataForm() {
		if (defaultDataForm != null && defaultDataForm.eIsProxy()) {
			InternalEObject oldDefaultDataForm = (InternalEObject) defaultDataForm;
			defaultDataForm = (DataForm) eResolveProxy(oldDefaultDataForm);
			if (defaultDataForm != oldDefaultDataForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PMFPackage.DATA_FORM_FOLDER__DEFAULT_DATA_FORM,
							oldDefaultDataForm, defaultDataForm));
			}
		}
		return defaultDataForm;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataForm basicGetDefaultDataForm() {
		return defaultDataForm;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultDataForm(DataForm newDefaultDataForm) {
		DataForm oldDefaultDataForm = defaultDataForm;
		defaultDataForm = newDefaultDataForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_FORM_FOLDER__DEFAULT_DATA_FORM,
					oldDefaultDataForm, defaultDataForm));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PMFPackage.DATA_FORM_FOLDER__DATA_FORMS:
			return ((InternalEList<?>) getDataForms()).basicRemove(otherEnd,
					msgs);
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
		case PMFPackage.DATA_FORM_FOLDER__DATA_FORMS:
			return getDataForms();
		case PMFPackage.DATA_FORM_FOLDER__DEFAULT_DATA_FORM:
			if (resolve)
				return getDefaultDataForm();
			return basicGetDefaultDataForm();
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
		case PMFPackage.DATA_FORM_FOLDER__DATA_FORMS:
			getDataForms().clear();
			getDataForms().addAll((Collection<? extends DataForm>) newValue);
			return;
		case PMFPackage.DATA_FORM_FOLDER__DEFAULT_DATA_FORM:
			setDefaultDataForm((DataForm) newValue);
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
		case PMFPackage.DATA_FORM_FOLDER__DATA_FORMS:
			getDataForms().clear();
			return;
		case PMFPackage.DATA_FORM_FOLDER__DEFAULT_DATA_FORM:
			setDefaultDataForm((DataForm) null);
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
		case PMFPackage.DATA_FORM_FOLDER__DATA_FORMS:
			return dataForms != null && !dataForms.isEmpty();
		case PMFPackage.DATA_FORM_FOLDER__DEFAULT_DATA_FORM:
			return defaultDataForm != null;
		}
		return super.eIsSet(featureID);
	}

} // DataFormFolderImpl
