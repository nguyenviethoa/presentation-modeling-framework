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
package org.eclipse.pmf.pim.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.datainput.DataInput;
import org.eclipse.pmf.pim.ui.UiPackage;
import org.eclipse.pmf.pim.ui.ViewPart;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>View Part</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.ViewPartImpl#getDataInput <em>Data Input</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.ViewPartImpl#getDataForm <em>Data Form</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewPartImpl extends UIElementImpl implements ViewPart {
	/**
	 * The cached value of the '{@link #getDataInput() <em>Data Input</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataInput()
	 * @generated
	 * @ordered
	 */
	protected DataInput dataInput;

	/**
	 * The cached value of the '{@link #getDataForm() <em>Data Form</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataForm()
	 * @generated
	 * @ordered
	 */
	protected DataForm dataForm;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.VIEW_PART;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataInput getDataInput() {
		return dataInput;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataInput(DataInput newDataInput,
			NotificationChain msgs) {
		DataInput oldDataInput = dataInput;
		dataInput = newDataInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, UiPackage.VIEW_PART__DATA_INPUT,
					oldDataInput, newDataInput);
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
	public void setDataInput(DataInput newDataInput) {
		if (newDataInput != dataInput) {
			NotificationChain msgs = null;
			if (dataInput != null)
				msgs = ((InternalEObject) dataInput).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- UiPackage.VIEW_PART__DATA_INPUT, null, msgs);
			if (newDataInput != null)
				msgs = ((InternalEObject) newDataInput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- UiPackage.VIEW_PART__DATA_INPUT, null, msgs);
			msgs = basicSetDataInput(newDataInput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.VIEW_PART__DATA_INPUT, newDataInput, newDataInput));
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
							UiPackage.VIEW_PART__DATA_FORM, oldDataForm,
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
					UiPackage.VIEW_PART__DATA_FORM, oldDataForm, dataForm));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UiPackage.VIEW_PART__DATA_INPUT:
			return basicSetDataInput(null, msgs);
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
		case UiPackage.VIEW_PART__DATA_INPUT:
			return getDataInput();
		case UiPackage.VIEW_PART__DATA_FORM:
			if (resolve)
				return getDataForm();
			return basicGetDataForm();
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
		case UiPackage.VIEW_PART__DATA_INPUT:
			setDataInput((DataInput) newValue);
			return;
		case UiPackage.VIEW_PART__DATA_FORM:
			setDataForm((DataForm) newValue);
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
		case UiPackage.VIEW_PART__DATA_INPUT:
			setDataInput((DataInput) null);
			return;
		case UiPackage.VIEW_PART__DATA_FORM:
			setDataForm((DataForm) null);
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
		case UiPackage.VIEW_PART__DATA_INPUT:
			return dataInput != null;
		case UiPackage.VIEW_PART__DATA_FORM:
			return dataForm != null;
		}
		return super.eIsSet(featureID);
	}

} // ViewPartImpl
