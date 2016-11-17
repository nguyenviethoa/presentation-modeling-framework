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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.UIObject;
import org.eclipse.pmf.pim.interactive.Trigger;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>UI Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.impl.UIObjectImpl#getViewID <em>View ID</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.UIObjectImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.UIObjectImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.UIObjectImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UIObjectImpl extends PMFObjectImpl implements UIObject {
	/**
	 * The default value of the '{@link #getViewID() <em>View ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getViewID()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewID() <em>View ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getViewID()
	 * @generated
	 * @ordered
	 */
	protected String viewID = VIEW_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> triggers;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected UIObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMFPackage.Literals.UI_OBJECT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewID() {
		return viewID;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewID(String newViewID) {
		String oldViewID = viewID;
		viewID = newViewID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.UI_OBJECT__VIEW_ID, oldViewID, viewID));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.UI_OBJECT__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.UI_OBJECT__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<Trigger>(Trigger.class,
					this, PMFPackage.UI_OBJECT__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PMFPackage.UI_OBJECT__TRIGGERS:
			return ((InternalEList<?>) getTriggers()).basicRemove(otherEnd,
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
		case PMFPackage.UI_OBJECT__VIEW_ID:
			return getViewID();
		case PMFPackage.UI_OBJECT__VISIBLE:
			return isVisible();
		case PMFPackage.UI_OBJECT__ENABLED:
			return isEnabled();
		case PMFPackage.UI_OBJECT__TRIGGERS:
			return getTriggers();
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
		case PMFPackage.UI_OBJECT__VIEW_ID:
			setViewID((String) newValue);
			return;
		case PMFPackage.UI_OBJECT__VISIBLE:
			setVisible((Boolean) newValue);
			return;
		case PMFPackage.UI_OBJECT__ENABLED:
			setEnabled((Boolean) newValue);
			return;
		case PMFPackage.UI_OBJECT__TRIGGERS:
			getTriggers().clear();
			getTriggers().addAll((Collection<? extends Trigger>) newValue);
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
		case PMFPackage.UI_OBJECT__VIEW_ID:
			setViewID(VIEW_ID_EDEFAULT);
			return;
		case PMFPackage.UI_OBJECT__VISIBLE:
			setVisible(VISIBLE_EDEFAULT);
			return;
		case PMFPackage.UI_OBJECT__ENABLED:
			setEnabled(ENABLED_EDEFAULT);
			return;
		case PMFPackage.UI_OBJECT__TRIGGERS:
			getTriggers().clear();
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
		case PMFPackage.UI_OBJECT__VIEW_ID:
			return VIEW_ID_EDEFAULT == null ? viewID != null
					: !VIEW_ID_EDEFAULT.equals(viewID);
		case PMFPackage.UI_OBJECT__VISIBLE:
			return visible != VISIBLE_EDEFAULT;
		case PMFPackage.UI_OBJECT__ENABLED:
			return enabled != ENABLED_EDEFAULT;
		case PMFPackage.UI_OBJECT__TRIGGERS:
			return triggers != null && !triggers.isEmpty();
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
		result.append(" (viewID: ");
		result.append(viewID);
		result.append(", visible: ");
		result.append(visible);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(')');
		return result.toString();
	}

} // UIObjectImpl
