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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.eclipse.pmf.pim.interactive.InteractivePackage
 * @generated
 */
public interface InteractiveFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	InteractiveFactory eINSTANCE = org.eclipse.pmf.pim.interactive.impl.InteractiveFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Trigger Action</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Trigger Action</em>'.
	 * @generated
	 */
	TriggerAction createTriggerAction();

	/**
	 * Returns a new object of class '<em>Data Predicate</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Data Predicate</em>'.
	 * @generated
	 */
	DataPredicate createDataPredicate();

	/**
	 * Returns a new object of class '<em>UI Predicate</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>UI Predicate</em>'.
	 * @generated
	 */
	UIPredicate createUIPredicate();

	/**
	 * Returns a new object of class '<em>Expression Condition</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Expression Condition</em>'.
	 * @generated
	 */
	ExpressionCondition createExpressionCondition();

	/**
	 * Returns a new object of class '<em>Set Action</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Action</em>'.
	 * @generated
	 */
	SetAction createSetAction();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>Predicate Term</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Predicate Term</em>'.
	 * @generated
	 */
	PredicateTerm createPredicateTerm();

	/**
	 * Returns a new object of class '<em>Condition Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Trigger</em>'.
	 * @generated
	 */
	ConditionTrigger createConditionTrigger();

	/**
	 * Returns a new object of class '<em>Event Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Trigger</em>'.
	 * @generated
	 */
	EventTrigger createEventTrigger();

	/**
	 * Returns a new object of class '<em>Class Handler Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Handler Action</em>'.
	 * @generated
	 */
	ClassHandlerAction createClassHandlerAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InteractivePackage getInteractivePackage();

} // InteractiveFactory
