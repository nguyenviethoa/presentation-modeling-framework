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
package org.eclipse.pmf.pim.interactive;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Trigger</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.interactive.Trigger#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.interactive.InteractivePackage#getTrigger()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='triggerValidate'"
 * @generated
 */
public interface Trigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.eclipse.pmf.pim.interactive.TriggerAction}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.interactive.InteractivePackage#getTrigger_Actions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TriggerAction> getActions();

} // Trigger
