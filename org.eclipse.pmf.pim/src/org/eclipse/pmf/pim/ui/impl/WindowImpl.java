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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.pmf.pim.ui.UiPackage;
import org.eclipse.pmf.pim.ui.Window;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Window</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.WindowImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.WindowImpl#getOpen <em>Open</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.WindowImpl#getClose <em>Close</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WindowImpl extends PageImpl implements Window {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOpen()
	 * @generated
	 * @ordered
	 */
	protected static final String OPEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOpen()
	 * @generated
	 * @ordered
	 */
	protected String open = OPEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getClose() <em>Close</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getClose()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClose() <em>Close</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getClose()
	 * @generated
	 * @ordered
	 */
	protected String close = CLOSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected WindowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.WINDOW;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.WINDOW__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpen() {
		return open;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpen(String newOpen) {
		String oldOpen = open;
		open = newOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.WINDOW__OPEN, oldOpen, open));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getClose() {
		return close;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setClose(String newClose) {
		String oldClose = close;
		close = newClose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.WINDOW__CLOSE, oldClose, close));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UiPackage.WINDOW__TITLE:
			return getTitle();
		case UiPackage.WINDOW__OPEN:
			return getOpen();
		case UiPackage.WINDOW__CLOSE:
			return getClose();
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
		case UiPackage.WINDOW__TITLE:
			setTitle((String) newValue);
			return;
		case UiPackage.WINDOW__OPEN:
			setOpen((String) newValue);
			return;
		case UiPackage.WINDOW__CLOSE:
			setClose((String) newValue);
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
		case UiPackage.WINDOW__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case UiPackage.WINDOW__OPEN:
			setOpen(OPEN_EDEFAULT);
			return;
		case UiPackage.WINDOW__CLOSE:
			setClose(CLOSE_EDEFAULT);
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
		case UiPackage.WINDOW__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT
					.equals(title);
		case UiPackage.WINDOW__OPEN:
			return OPEN_EDEFAULT == null ? open != null : !OPEN_EDEFAULT
					.equals(open);
		case UiPackage.WINDOW__CLOSE:
			return CLOSE_EDEFAULT == null ? close != null : !CLOSE_EDEFAULT
					.equals(close);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", open: ");
		result.append(open);
		result.append(", close: ");
		result.append(close);
		result.append(')');
		return result.toString();
	}

} // WindowImpl
