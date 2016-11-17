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
package org.eclipse.pmf.pim;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>System Action</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.SystemAction#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.PMFPackage#getSystemAction()
 * @model
 * @generated
 */
public interface SystemAction extends Action {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Commands</em>' reference.
	 * @see #setCommands(Command)
	 * @see org.eclipse.pmf.pim.PMFPackage#getSystemAction_Commands()
	 * @model
	 * @generated
	 */
	Command getCommands();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.SystemAction#getCommands <em>Commands</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commands</em>' reference.
	 * @see #getCommands()
	 * @generated
	 */
	void setCommands(Command value);

} // SystemAction
