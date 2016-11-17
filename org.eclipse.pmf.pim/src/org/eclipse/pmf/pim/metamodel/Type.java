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
package org.eclipse.pmf.pim.metamodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.pmf.pim.PMFObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.pmf.pim.metamodel.Type#getProperties <em>Properties
 * </em>}</li>
 * <li>{@link org.eclipse.pmf.pim.metamodel.Type#isAbstract <em>Abstract</em>}</li>
 * <li>{@link org.eclipse.pmf.pim.metamodel.Type#isPrimitive <em>Primitive</em>}
 * </li>
 * <li>{@link org.eclipse.pmf.pim.metamodel.Type#getSuperTypes <em>Super Types
 * </em>}</li>
 * <li>{@link org.eclipse.pmf.pim.metamodel.Type#getTypeParameters <em>Type
 * Parameters</em>}</li>
 * <li>{@link org.eclipse.pmf.pim.metamodel.Type#getGenericSuperTypes <em>
 * Generic Super Types</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.pmf.pim.metamodel.MetamodelPackage#getType()
 * @model
 * @generated
 */
public interface Type extends PMFObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.eclipse.pmf.pim.metamodel.Property}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Properties</em>' containment reference
	 *         list.
	 * @see org.eclipse.pmf.pim.metamodel.MetamodelPackage#getType_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see org.eclipse.pmf.pim.metamodel.MetamodelPackage#getType_Abstract()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Returns the value of the '<em><b>Primitive</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Primitive</em>' attribute.
	 * @see org.eclipse.pmf.pim.metamodel.MetamodelPackage#getType_Primitive()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	boolean isPrimitive();

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.metamodel.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see org.eclipse.pmf.pim.metamodel.MetamodelPackage#getType_SuperTypes()
	 * @model
	 * @generated
	 */
	EList<Type> getSuperTypes();

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.eclipse.pmf.pim.metamodel.TypeParameter}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Type Parameters</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type Parameters</em>' containment reference
	 *         list.
	 * @see org.eclipse.pmf.pim.metamodel.MetamodelPackage#getType_TypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeParameter> getTypeParameters();

	/**
	 * Returns the value of the '<em><b>Generic Super Types</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link org.eclipse.pmf.pim.metamodel.GenericType}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Generic Super Types</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Generic Super Types</em>' containment
	 *         reference list.
	 * @see org.eclipse.pmf.pim.metamodel.MetamodelPackage#getType_GenericSuperTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericType> getGenericSuperTypes();

} // Type
