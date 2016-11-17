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
import org.eclipse.pmf.pim.data.DataProperty;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.databinding.DataBindingPath;
import org.eclipse.pmf.pim.ui.UiPackage;
import org.eclipse.pmf.pim.ui.WizardPage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wizard Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.WizardPageImpl#getBindingPath <em>Binding Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WizardPageImpl extends PageImpl implements WizardPage {
	/**
	 * The cached value of the '{@link #getBindingPath() <em>Binding Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingPath()
	 * @generated
	 * @ordered
	 */
	protected DataBindingPath bindingPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WizardPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.WIZARD_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBindingPath getBindingPath() {
		return bindingPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindingPath(
			DataBindingPath newBindingPath, NotificationChain msgs) {
		DataBindingPath oldBindingPath = bindingPath;
		bindingPath = newBindingPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, UiPackage.WIZARD_PAGE__BINDING_PATH,
					oldBindingPath, newBindingPath);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingPath(DataBindingPath newBindingPath) {
		if (newBindingPath != bindingPath) {
			NotificationChain msgs = null;
			if (bindingPath != null)
				msgs = ((InternalEObject) bindingPath).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- UiPackage.WIZARD_PAGE__BINDING_PATH, null,
						msgs);
			if (newBindingPath != null)
				msgs = ((InternalEObject) newBindingPath).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- UiPackage.WIZARD_PAGE__BINDING_PATH, null,
						msgs);
			msgs = basicSetBindingPath(newBindingPath, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.WIZARD_PAGE__BINDING_PATH, newBindingPath,
					newBindingPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DataType getDataContextType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataProperty dataProperty = this.getBindingPath() != null ? this
				.getBindingPath().getFeature() : null;
		DataType dataType = null;

		if (dataProperty != null
				&& dataProperty.eContainer() instanceof DataType) {
			DataType container = (DataType) dataProperty.eContainer();
			if (container.eContainer() instanceof org.eclipse.pmf.pim.Application) {
				org.eclipse.pmf.pim.Application application = (org.eclipse.pmf.pim.Application) container
						.eContainer();
				// The Data Type is a nonEnum EMF type or not
				if (application.getAllTypes().contains(dataProperty.getType())
						&& !dataProperty.getType().isEnum()) {
					dataType = dataProperty.getType();
				} else {
					dataType = container;
				}
			}
		} else if (dataProperty == null
				&& this.eContainer() instanceof org.eclipse.pmf.pim.Wizard) {
			dataType = ((org.eclipse.pmf.pim.Wizard) this.eContainer())
					.getDataType();
		}
		return dataType;
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
		case UiPackage.WIZARD_PAGE__BINDING_PATH:
			return basicSetBindingPath(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UiPackage.WIZARD_PAGE__BINDING_PATH:
			return getBindingPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UiPackage.WIZARD_PAGE__BINDING_PATH:
			setBindingPath((DataBindingPath) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case UiPackage.WIZARD_PAGE__BINDING_PATH:
			setBindingPath((DataBindingPath) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case UiPackage.WIZARD_PAGE__BINDING_PATH:
			return bindingPath != null;
		}
		return super.eIsSet(featureID);
	}

} //WizardPageImpl
