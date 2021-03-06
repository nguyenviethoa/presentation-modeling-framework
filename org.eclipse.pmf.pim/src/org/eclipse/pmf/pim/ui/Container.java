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
package org.eclipse.pmf.pim.ui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.pmf.pim.UIObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Container</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.Container#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.ui.UiPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends UIElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.UIObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getContainer_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIObject> getChildren();

} // Container
