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
import org.eclipse.pmf.pim.impl.UIObjectImpl;
import org.eclipse.pmf.pim.ui.Color;
import org.eclipse.pmf.pim.ui.Font;
import org.eclipse.pmf.pim.ui.UIElement;
import org.eclipse.pmf.pim.ui.UiPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>UI Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.UIElementImpl#getForeground <em>Foreground</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.UIElementImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.UIElementImpl#getFont <em>Font</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.UIElementImpl#getToolTip <em>Tool Tip</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UIElementImpl extends UIObjectImpl implements UIElement {
	/**
	 * The cached value of the '{@link #getForeground() <em>Foreground</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getForeground()
	 * @generated
	 * @ordered
	 */
	protected Color foreground;
	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected Color background;
	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected Font font;

	/**
	 * The cached value of the '{@link #getToolTip() <em>Tool Tip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolTip()
	 * @generated
	 * @ordered
	 */
	protected UIElement toolTip;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected UIElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Color getForeground() {
		return foreground;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForeground(Color newForeground,
			NotificationChain msgs) {
		Color oldForeground = foreground;
		foreground = newForeground;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, UiPackage.UI_ELEMENT__FOREGROUND,
					oldForeground, newForeground);
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
	public void setForeground(Color newForeground) {
		if (newForeground != foreground) {
			NotificationChain msgs = null;
			if (foreground != null)
				msgs = ((InternalEObject) foreground).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- UiPackage.UI_ELEMENT__FOREGROUND, null, msgs);
			if (newForeground != null)
				msgs = ((InternalEObject) newForeground).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- UiPackage.UI_ELEMENT__FOREGROUND, null, msgs);
			msgs = basicSetForeground(newForeground, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.UI_ELEMENT__FOREGROUND, newForeground,
					newForeground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackground(Color newBackground,
			NotificationChain msgs) {
		Color oldBackground = background;
		background = newBackground;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, UiPackage.UI_ELEMENT__BACKGROUND,
					oldBackground, newBackground);
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
	public void setBackground(Color newBackground) {
		if (newBackground != background) {
			NotificationChain msgs = null;
			if (background != null)
				msgs = ((InternalEObject) background).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- UiPackage.UI_ELEMENT__BACKGROUND, null, msgs);
			if (newBackground != null)
				msgs = ((InternalEObject) newBackground).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- UiPackage.UI_ELEMENT__BACKGROUND, null, msgs);
			msgs = basicSetBackground(newBackground, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.UI_ELEMENT__BACKGROUND, newBackground,
					newBackground));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Font getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFont(Font newFont, NotificationChain msgs) {
		Font oldFont = font;
		font = newFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, UiPackage.UI_ELEMENT__FONT, oldFont,
					newFont);
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
	public void setFont(Font newFont) {
		if (newFont != font) {
			NotificationChain msgs = null;
			if (font != null)
				msgs = ((InternalEObject) font).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UiPackage.UI_ELEMENT__FONT,
						null, msgs);
			if (newFont != null)
				msgs = ((InternalEObject) newFont).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UiPackage.UI_ELEMENT__FONT,
						null, msgs);
			msgs = basicSetFont(newFont, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.UI_ELEMENT__FONT, newFont, newFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIElement getToolTip() {
		return toolTip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToolTip(UIElement newToolTip,
			NotificationChain msgs) {
		UIElement oldToolTip = toolTip;
		toolTip = newToolTip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, UiPackage.UI_ELEMENT__TOOL_TIP,
					oldToolTip, newToolTip);
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
	public void setToolTip(UIElement newToolTip) {
		if (newToolTip != toolTip) {
			NotificationChain msgs = null;
			if (toolTip != null)
				msgs = ((InternalEObject) toolTip)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- UiPackage.UI_ELEMENT__TOOL_TIP, null, msgs);
			if (newToolTip != null)
				msgs = ((InternalEObject) newToolTip)
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
								- UiPackage.UI_ELEMENT__TOOL_TIP, null, msgs);
			msgs = basicSetToolTip(newToolTip, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.UI_ELEMENT__TOOL_TIP, newToolTip, newToolTip));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UiPackage.UI_ELEMENT__FOREGROUND:
			return basicSetForeground(null, msgs);
		case UiPackage.UI_ELEMENT__BACKGROUND:
			return basicSetBackground(null, msgs);
		case UiPackage.UI_ELEMENT__FONT:
			return basicSetFont(null, msgs);
		case UiPackage.UI_ELEMENT__TOOL_TIP:
			return basicSetToolTip(null, msgs);
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
		case UiPackage.UI_ELEMENT__FOREGROUND:
			return getForeground();
		case UiPackage.UI_ELEMENT__BACKGROUND:
			return getBackground();
		case UiPackage.UI_ELEMENT__FONT:
			return getFont();
		case UiPackage.UI_ELEMENT__TOOL_TIP:
			return getToolTip();
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
		case UiPackage.UI_ELEMENT__FOREGROUND:
			setForeground((Color) newValue);
			return;
		case UiPackage.UI_ELEMENT__BACKGROUND:
			setBackground((Color) newValue);
			return;
		case UiPackage.UI_ELEMENT__FONT:
			setFont((Font) newValue);
			return;
		case UiPackage.UI_ELEMENT__TOOL_TIP:
			setToolTip((UIElement) newValue);
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
		case UiPackage.UI_ELEMENT__FOREGROUND:
			setForeground((Color) null);
			return;
		case UiPackage.UI_ELEMENT__BACKGROUND:
			setBackground((Color) null);
			return;
		case UiPackage.UI_ELEMENT__FONT:
			setFont((Font) null);
			return;
		case UiPackage.UI_ELEMENT__TOOL_TIP:
			setToolTip((UIElement) null);
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
		case UiPackage.UI_ELEMENT__FOREGROUND:
			return foreground != null;
		case UiPackage.UI_ELEMENT__BACKGROUND:
			return background != null;
		case UiPackage.UI_ELEMENT__FONT:
			return font != null;
		case UiPackage.UI_ELEMENT__TOOL_TIP:
			return toolTip != null;
		}
		return super.eIsSet(featureID);
	}

} // UIElementImpl
