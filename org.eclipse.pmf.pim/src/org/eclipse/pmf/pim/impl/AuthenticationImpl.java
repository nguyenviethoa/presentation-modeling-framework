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
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.pmf.pim.Authentication;
import org.eclipse.pmf.pim.PMFPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.impl.AuthenticationImpl#isShowLostPassword <em>Show Lost Password</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.AuthenticationImpl#isRegistration <em>Registration</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.AuthenticationImpl#isAnonymous <em>Anonymous</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthenticationImpl extends EObjectImpl implements Authentication {
	/**
	 * The default value of the '{@link #isShowLostPassword() <em>Show Lost Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowLostPassword()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_LOST_PASSWORD_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowLostPassword() <em>Show Lost Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowLostPassword()
	 * @generated
	 * @ordered
	 */
	protected boolean showLostPassword = SHOW_LOST_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #isRegistration() <em>Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegistration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REGISTRATION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRegistration() <em>Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegistration()
	 * @generated
	 * @ordered
	 */
	protected boolean registration = REGISTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANONYMOUS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected boolean anonymous = ANONYMOUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMFPackage.Literals.AUTHENTICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowLostPassword() {
		return showLostPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowLostPassword(boolean newShowLostPassword) {
		boolean oldShowLostPassword = showLostPassword;
		showLostPassword = newShowLostPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.AUTHENTICATION__SHOW_LOST_PASSWORD,
					oldShowLostPassword, showLostPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRegistration() {
		return registration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistration(boolean newRegistration) {
		boolean oldRegistration = registration;
		registration = newRegistration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.AUTHENTICATION__REGISTRATION, oldRegistration,
					registration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnonymous() {
		return anonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymous(boolean newAnonymous) {
		boolean oldAnonymous = anonymous;
		anonymous = newAnonymous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.AUTHENTICATION__ANONYMOUS, oldAnonymous,
					anonymous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PMFPackage.AUTHENTICATION__SHOW_LOST_PASSWORD:
			return isShowLostPassword();
		case PMFPackage.AUTHENTICATION__REGISTRATION:
			return isRegistration();
		case PMFPackage.AUTHENTICATION__ANONYMOUS:
			return isAnonymous();
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
		case PMFPackage.AUTHENTICATION__SHOW_LOST_PASSWORD:
			setShowLostPassword((Boolean) newValue);
			return;
		case PMFPackage.AUTHENTICATION__REGISTRATION:
			setRegistration((Boolean) newValue);
			return;
		case PMFPackage.AUTHENTICATION__ANONYMOUS:
			setAnonymous((Boolean) newValue);
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
		case PMFPackage.AUTHENTICATION__SHOW_LOST_PASSWORD:
			setShowLostPassword(SHOW_LOST_PASSWORD_EDEFAULT);
			return;
		case PMFPackage.AUTHENTICATION__REGISTRATION:
			setRegistration(REGISTRATION_EDEFAULT);
			return;
		case PMFPackage.AUTHENTICATION__ANONYMOUS:
			setAnonymous(ANONYMOUS_EDEFAULT);
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
		case PMFPackage.AUTHENTICATION__SHOW_LOST_PASSWORD:
			return showLostPassword != SHOW_LOST_PASSWORD_EDEFAULT;
		case PMFPackage.AUTHENTICATION__REGISTRATION:
			return registration != REGISTRATION_EDEFAULT;
		case PMFPackage.AUTHENTICATION__ANONYMOUS:
			return anonymous != ANONYMOUS_EDEFAULT;
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
		result.append(" (showLostPassword: ");
		result.append(showLostPassword);
		result.append(", registration: ");
		result.append(registration);
		result.append(", anonymous: ");
		result.append(anonymous);
		result.append(')');
		return result.toString();
	}

} //AuthenticationImpl
