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

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.pmf.pim.DataFormSelector;
import org.eclipse.pmf.pim.PMFPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Form Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataFormSelectorImpl#getUIMode <em>UI Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataFormSelectorImpl extends CompositeDataFormImpl implements
		DataFormSelector {
	/**
	 * The default value of the '{@link #getUIMode() <em>UI Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUIMode()
	 * @generated
	 * @ordered
	 */
	protected static final String UI_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUIMode() <em>UI Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUIMode()
	 * @generated
	 * @ordered
	 */
	protected String uiMode = UI_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFormSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMFPackage.Literals.DATA_FORM_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUIMode() {
		return uiMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUIMode(String newUIMode) {
		String oldUIMode = uiMode;
		uiMode = newUIMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_FORM_SELECTOR__UI_MODE, oldUIMode, uiMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PMFPackage.DATA_FORM_SELECTOR__UI_MODE:
			return getUIMode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PMFPackage.DATA_FORM_SELECTOR__UI_MODE:
			setUIMode((String) newValue);
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
		case PMFPackage.DATA_FORM_SELECTOR__UI_MODE:
			setUIMode(UI_MODE_EDEFAULT);
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
		case PMFPackage.DATA_FORM_SELECTOR__UI_MODE:
			return UI_MODE_EDEFAULT == null ? uiMode != null
					: !UI_MODE_EDEFAULT.equals(uiMode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (UIMode: ");
		result.append(uiMode);
		result.append(')');
		return result.toString();
	}

	public boolean validate_nameConflict(DiagnosticChain diagnostic,
			Map<Object, Object> context) {
		// TODO Auto-generated method stub
		return false;
	}

} //DataFormSelectorImpl
