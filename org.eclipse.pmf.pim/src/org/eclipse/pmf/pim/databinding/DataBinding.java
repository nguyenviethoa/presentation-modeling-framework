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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.pmf.pim.DataConverter;
import org.eclipse.pmf.pim.Validator;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.ui.UIElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Binding</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.databinding.DataBinding#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.databinding.DataBinding#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.databinding.DataBinding#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.databinding.DataBinding#getLocalConverter <em>Local Converter</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.databinding.DataBinding#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.databinding.DataBinding#getLocalValidators <em>Local Validators</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.databinding.DataBinding#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.databinding.DataBinding#getUpdateSourceTrigger <em>Update Source Trigger</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.databinding.DataBinding#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.databinding.DatabindingPackage#getDataBinding()
 * @model
 * @generated
 */
public interface DataBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see org.eclipse.pmf.pim.databinding.DatabindingPackage#getDataBinding_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.databinding.DataBinding#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(DataBindingPath)
	 * @see org.eclipse.pmf.pim.databinding.DatabindingPackage#getDataBinding_Path()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataBindingPath getPath();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.databinding.DataBinding#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(DataBindingPath value);

	/**
	 * Returns the value of the '<em><b>Converter</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Converter</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Converter</em>' reference.
	 * @see #setConverter(DataConverter)
	 * @see org.eclipse.pmf.pim.databinding.DatabindingPackage#getDataBinding_Converter()
	 * @model
	 * @generated
	 */
	DataConverter getConverter();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.pmf.pim.databinding.DataBinding#getConverter
	 * <em>Converter</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Converter</em>' reference.
	 * @see #getConverter()
	 * @generated
	 */
	void setConverter(DataConverter value);

	/**
	 * Returns the value of the '<em><b>Local Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Converter</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Converter</em>' containment reference.
	 * @see #setLocalConverter(DataConverter)
	 * @see org.eclipse.pmf.pim.databinding.DatabindingPackage#getDataBinding_LocalConverter()
	 * @model containment="true"
	 * @generated
	 */
	DataConverter getLocalConverter();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.databinding.DataBinding#getLocalConverter <em>Local Converter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Converter</em>' containment reference.
	 * @see #getLocalConverter()
	 * @generated
	 */
	void setLocalConverter(DataConverter value);

	/**
	 * Returns the value of the '<em><b>Validators</b></em>' reference list. The
	 * list contents are of type {@link org.eclipse.pmf.pim.Validator}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Validators</em>' reference list.
	 * @see org.eclipse.pmf.pim.databinding.DatabindingPackage#getDataBinding_Validators()
	 * @model
	 * @generated
	 */
	EList<Validator> getValidators();

	/**
	 * Returns the value of the '<em><b>Local Validators</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.Validator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Validators</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Validators</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.databinding.DatabindingPackage#getDataBinding_LocalValidators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Validator> getLocalValidators();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.pmf.pim.databinding.BindingMode}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.eclipse.pmf.pim.databinding.BindingMode
	 * @see #setMode(BindingMode)
	 * @see org.eclipse.pmf.pim.databinding.DatabindingPackage#getDataBinding_Mode()
	 * @model
	 * @generated
	 */
	BindingMode getMode();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.databinding.DataBinding#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.eclipse.pmf.pim.databinding.BindingMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(BindingMode value);

	/**
	 * Returns the value of the '<em><b>Update Source Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Source Trigger</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Source Trigger</em>' attribute.
	 * @see #setUpdateSourceTrigger(String)
	 * @see org.eclipse.pmf.pim.databinding.DatabindingPackage#getDataBinding_UpdateSourceTrigger()
	 * @model
	 * @generated
	 */
	String getUpdateSourceTrigger();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.databinding.DataBinding#getUpdateSourceTrigger <em>Update Source Trigger</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Update Source Trigger</em>' attribute.
	 * @see #getUpdateSourceTrigger()
	 * @generated
	 */
	void setUpdateSourceTrigger(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(UIElement)
	 * @see org.eclipse.pmf.pim.databinding.DatabindingPackage#getDataBinding_Status()
	 * @model
	 * @generated
	 */
	UIElement getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.databinding.DataBinding#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(UIElement value);

} // DataBinding
