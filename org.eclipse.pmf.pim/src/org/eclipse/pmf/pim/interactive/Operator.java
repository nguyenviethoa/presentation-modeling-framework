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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Operator</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 * @see org.eclipse.pmf.pim.interactive.InteractivePackage#getOperator()
 * @model
 * @generated
 */
public enum Operator implements Enumerator {
	/**
	 * The '<em><b>EQ</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #EQ_VALUE
	 * @generated
	 * @ordered
	 */
	EQ(0, "EQ", "EQ"),

	/**
	 * The '<em><b>NE</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #NE_VALUE
	 * @generated
	 * @ordered
	 */
	NE(1, "NE", "NE"),

	/**
	 * The '<em><b>GT</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #GT_VALUE
	 * @generated
	 * @ordered
	 */
	GT(2, "GT", "GT"),

	/**
	 * The '<em><b>LT</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #LT_VALUE
	 * @generated
	 * @ordered
	 */
	LT(3, "LT", "LT"),

	/**
	 * The '<em><b>GE</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #GE_VALUE
	 * @generated
	 * @ordered
	 */
	GE(4, "GE", "GE"),

	/**
	 * The '<em><b>LE</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #LE_VALUE
	 * @generated
	 * @ordered
	 */
	LE(5, "LE", "LE"),

	/**
	 * The '<em><b>LIKE</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #LIKE_VALUE
	 * @generated
	 * @ordered
	 */
	LIKE(6, "LIKE", "LIKE"),

	/**
	 * The '<em><b>IS A</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #IS_A_VALUE
	 * @generated
	 * @ordered
	 */
	IS_A(7, "IS_A", "IS_A"),

	/**
	 * The '<em><b>IS KIND OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_KIND_OF_VALUE
	 * @generated
	 * @ordered
	 */
	IS_KIND_OF(8, "IS_KIND_OF", "IS_KIND_OF");

	/**
	 * The '<em><b>EQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EQ</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQ_VALUE = 0;

	/**
	 * The '<em><b>NE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NE</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NE_VALUE = 1;

	/**
	 * The '<em><b>GT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GT</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GT_VALUE = 2;

	/**
	 * The '<em><b>LT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LT</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LT_VALUE = 3;

	/**
	 * The '<em><b>GE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GE</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GE_VALUE = 4;

	/**
	 * The '<em><b>LE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LE</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LE_VALUE = 5;

	/**
	 * The '<em><b>LIKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIKE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIKE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIKE_VALUE = 6;

	/**
	 * The '<em><b>IS A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IS A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IS_A_VALUE = 7;

	/**
	 * The '<em><b>IS KIND OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IS KIND OF</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_KIND_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IS_KIND_OF_VALUE = 8;

	/**
	 * An array of all the '<em><b>Operator</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final Operator[] VALUES_ARRAY = new Operator[] { EQ, NE, GT,
			LT, GE, LE, LIKE, IS_A, IS_KIND_OF, };

	/**
	 * A public read-only list of all the '<em><b>Operator</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Operator> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static Operator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Operator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static Operator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Operator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static Operator get(int value) {
		switch (value) {
		case EQ_VALUE:
			return EQ;
		case NE_VALUE:
			return NE;
		case GT_VALUE:
			return GT;
		case LT_VALUE:
			return LT;
		case GE_VALUE:
			return GE;
		case LE_VALUE:
			return LE;
		case LIKE_VALUE:
			return LIKE;
		case IS_A_VALUE:
			return IS_A;
		case IS_KIND_OF_VALUE:
			return IS_KIND_OF;
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
	private Operator(int value, String name, String literal) {
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

} // Operator
