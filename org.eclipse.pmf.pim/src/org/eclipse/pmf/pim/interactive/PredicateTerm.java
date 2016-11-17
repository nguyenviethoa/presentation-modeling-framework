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

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Predicate Term</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.interactive.PredicateTerm#getTerms <em>Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.interactive.InteractivePackage#getPredicateTerm()
 * @model
 * @generated
 */
public interface PredicateTerm extends Predicate {
	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.interactive.Predicate}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.interactive.InteractivePackage#getPredicateTerm_Terms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Predicate> getTerms();

} // PredicateTerm
