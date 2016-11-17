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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.pmf.pim.Command;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.SystemAction;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>System Action</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.impl.SystemActionImpl#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemActionImpl extends ActionImpl implements SystemAction {
	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected Command commands;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMFPackage.Literals.SYSTEM_ACTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Command getCommands() {
		if (commands != null && commands.eIsProxy()) {
			InternalEObject oldCommands = (InternalEObject) commands;
			commands = (Command) eResolveProxy(oldCommands);
			if (commands != oldCommands) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PMFPackage.SYSTEM_ACTION__COMMANDS, oldCommands,
							commands));
			}
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Command basicGetCommands() {
		return commands;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommands(Command newCommands) {
		Command oldCommands = commands;
		commands = newCommands;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.SYSTEM_ACTION__COMMANDS, oldCommands, commands));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PMFPackage.SYSTEM_ACTION__COMMANDS:
			if (resolve)
				return getCommands();
			return basicGetCommands();
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
		case PMFPackage.SYSTEM_ACTION__COMMANDS:
			setCommands((Command) newValue);
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
		case PMFPackage.SYSTEM_ACTION__COMMANDS:
			setCommands((Command) null);
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
		case PMFPackage.SYSTEM_ACTION__COMMANDS:
			return commands != null;
		}
		return super.eIsSet(featureID);
	}

} // SystemActionImpl
