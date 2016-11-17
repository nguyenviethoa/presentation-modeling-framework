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
import org.eclipse.pmf.pim.UIObject;
import org.eclipse.pmf.pim.ui.GroupBox;
import org.eclipse.pmf.pim.ui.UiPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Group Box</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.GroupBoxImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.GroupBoxImpl#isCollapsible <em>Collapsible</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.GroupBoxImpl#getCollapse <em>Collapse</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.GroupBoxImpl#getExpand <em>Expand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupBoxImpl extends ContainerImpl implements GroupBox {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected UIObject title;

	/**
	 * The default value of the '{@link #isCollapsible() <em>Collapsible</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isCollapsible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLAPSIBLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isCollapsible() <em>Collapsible</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isCollapsible()
	 * @generated
	 * @ordered
	 */
	protected boolean collapsible = COLLAPSIBLE_EDEFAULT;
	/**
	 * The default value of the '{@link #getCollapse() <em>Collapse</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCollapse()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLAPSE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCollapse() <em>Collapse</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCollapse()
	 * @generated
	 * @ordered
	 */
	protected String collapse = COLLAPSE_EDEFAULT;
	/**
	 * The default value of the '{@link #getExpand() <em>Expand</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getExpand()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPAND_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getExpand() <em>Expand</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getExpand()
	 * @generated
	 * @ordered
	 */
	protected String expand = EXPAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.GROUP_BOX;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UIObject getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(UIObject newTitle,
			NotificationChain msgs) {
		UIObject oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, UiPackage.GROUP_BOX__TITLE, oldTitle,
					newTitle);
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
	public void setTitle(UIObject newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject) title).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UiPackage.GROUP_BOX__TITLE,
						null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject) newTitle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UiPackage.GROUP_BOX__TITLE,
						null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.GROUP_BOX__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollapsible() {
		return collapsible;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollapsible(boolean newCollapsible) {
		boolean oldCollapsible = collapsible;
		collapsible = newCollapsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.GROUP_BOX__COLLAPSIBLE, oldCollapsible,
					collapsible));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollapse() {
		return collapse;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollapse(String newCollapse) {
		String oldCollapse = collapse;
		collapse = newCollapse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.GROUP_BOX__COLLAPSE, oldCollapse, collapse));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpand() {
		return expand;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpand(String newExpand) {
		String oldExpand = expand;
		expand = newExpand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.GROUP_BOX__EXPAND, oldExpand, expand));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UiPackage.GROUP_BOX__TITLE:
			return basicSetTitle(null, msgs);
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
		case UiPackage.GROUP_BOX__TITLE:
			return getTitle();
		case UiPackage.GROUP_BOX__COLLAPSIBLE:
			return isCollapsible();
		case UiPackage.GROUP_BOX__COLLAPSE:
			return getCollapse();
		case UiPackage.GROUP_BOX__EXPAND:
			return getExpand();
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
		case UiPackage.GROUP_BOX__TITLE:
			setTitle((UIObject) newValue);
			return;
		case UiPackage.GROUP_BOX__COLLAPSIBLE:
			setCollapsible((Boolean) newValue);
			return;
		case UiPackage.GROUP_BOX__COLLAPSE:
			setCollapse((String) newValue);
			return;
		case UiPackage.GROUP_BOX__EXPAND:
			setExpand((String) newValue);
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
		case UiPackage.GROUP_BOX__TITLE:
			setTitle((UIObject) null);
			return;
		case UiPackage.GROUP_BOX__COLLAPSIBLE:
			setCollapsible(COLLAPSIBLE_EDEFAULT);
			return;
		case UiPackage.GROUP_BOX__COLLAPSE:
			setCollapse(COLLAPSE_EDEFAULT);
			return;
		case UiPackage.GROUP_BOX__EXPAND:
			setExpand(EXPAND_EDEFAULT);
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
		case UiPackage.GROUP_BOX__TITLE:
			return title != null;
		case UiPackage.GROUP_BOX__COLLAPSIBLE:
			return collapsible != COLLAPSIBLE_EDEFAULT;
		case UiPackage.GROUP_BOX__COLLAPSE:
			return COLLAPSE_EDEFAULT == null ? collapse != null
					: !COLLAPSE_EDEFAULT.equals(collapse);
		case UiPackage.GROUP_BOX__EXPAND:
			return EXPAND_EDEFAULT == null ? expand != null : !EXPAND_EDEFAULT
					.equals(expand);
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
		result.append(" (collapsible: ");
		result.append(collapsible);
		result.append(", collapse: ");
		result.append(collapse);
		result.append(", expand: ");
		result.append(expand);
		result.append(')');
		return result.toString();
	}

} // GroupBoxImpl
