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
package org.eclipse.pmf.pim.databinding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Binding Mode</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.pmf.pim.databinding.DatabindingPackage#getBindingMode()
 * @model
 * @generated
 */
public enum BindingMode implements Enumerator {
	/**
	 * The '<em><b>Two Way</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_WAY_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_WAY(0, "TwoWay", "TwoWay"),

	/**
	 * The '<em><b>One Way</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_WAY_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_WAY(1, "OneWay", "OneWay"),

	/**
	 * The '<em><b>One Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_TIME(2, "OneTime", "OneTime");

	/**
	 * The '<em><b>Two Way</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Two Way</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWO_WAY
	 * @model name="TwoWay"
	 * @generated
	 * @ordered
	 */
	public static final int TWO_WAY_VALUE = 0;

	/**
	 * The '<em><b>One Way</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One Way</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_WAY
	 * @model name="OneWay"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_WAY_VALUE = 1;

	/**
	 * The '<em><b>One Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_TIME
	 * @model name="OneTime"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_TIME_VALUE = 2;

	/**
	 * An array of all the '<em><b>Binding Mode</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final BindingMode[] VALUES_ARRAY = new BindingMode[] {
			TWO_WAY, ONE_WAY, ONE_TIME, };

	/**
	 * A public read-only list of all the '<em><b>Binding Mode</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BindingMode> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Binding Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BindingMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BindingMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binding Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BindingMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BindingMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binding Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BindingMode get(int value) {
		switch (value) {
		case TWO_WAY_VALUE:
			return TWO_WAY;
		case ONE_WAY_VALUE:
			return ONE_WAY;
		case ONE_TIME_VALUE:
			return ONE_TIME;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private BindingMode(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // BindingMode
