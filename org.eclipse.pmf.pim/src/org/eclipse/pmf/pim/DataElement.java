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

import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.databinding.DataBinding;
import org.eclipse.pmf.pim.ui.UIElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Element</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UI Element is used to manage the data presentation.   
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.DataElement#getDataContextType <em>Data Context Type</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.DataElement#getDataBinding <em>Data Binding</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.DataElement#getResolvedTargetContextType <em>Resolved Target Context Type</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.DataElement#getResolvedDataContextType <em>Resolved Data Context Type</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.DataElement#isChangeable <em>Changeable</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.DataElement#getPropertyChanged <em>Property Changed</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.DataElement#getControl <em>Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.PMFPackage#getDataElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TypeMismatch'"
 * @generated
 */
public interface DataElement extends UIObject {
	/**
	 * Returns the value of the '<em><b>Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Context Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Context Type</em>' reference.
	 * @see #setDataContextType(DataType)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataElement_DataContextType()
	 * @model
	 * @generated
	 */
	DataType getDataContextType();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataElement#getDataContextType <em>Data Context Type</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Data Context Type</em>' reference.
	 * @see #getDataContextType()
	 * @generated
	 */
	void setDataContextType(DataType value);

	/**
	 * Returns the value of the '<em><b>Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Binding</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Binding</em>' containment reference.
	 * @see #setDataBinding(DataBinding)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataElement_DataBinding()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataBinding getDataBinding();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataElement#getDataBinding <em>Data Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Binding</em>' containment reference.
	 * @see #getDataBinding()
	 * @generated
	 */
	void setDataBinding(DataBinding value);

	/**
	 * Returns the value of the '<em><b>Resolved Target Context Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Target Context Type</em>' reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Target Context Type</em>' reference.
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataElement_ResolvedTargetContextType()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	DataType getResolvedTargetContextType();

	/**
	 * Returns the value of the '<em><b>Resolved Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Data Context Type</em>' reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Data Context Type</em>' reference.
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataElement_ResolvedDataContextType()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	DataType getResolvedDataContextType();

	/**
	 * Returns the value of the '<em><b>Changeable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changeable</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable</em>' attribute.
	 * @see #setChangeable(boolean)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataElement_Changeable()
	 * @model default="true"
	 * @generated
	 */
	boolean isChangeable();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataElement#isChangeable <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changeable</em>' attribute.
	 * @see #isChangeable()
	 * @generated
	 */
	void setChangeable(boolean value);

	/**
	 * Returns the value of the '<em><b>Property Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Changed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Changed</em>' attribute.
	 * @see #setPropertyChanged(String)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataElement_PropertyChanged()
	 * @model annotation="pmf event='true'"
	 * @generated
	 */
	String getPropertyChanged();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataElement#getPropertyChanged <em>Property Changed</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Property Changed</em>' attribute.
	 * @see #getPropertyChanged()
	 * @generated
	 */
	void setPropertyChanged(String value);

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference.
	 * @see #setControl(UIElement)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataElement_Control()
	 * @model containment="true"
	 * @generated
	 */
	UIElement getControl();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataElement#getControl <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' containment reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(UIElement value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DataType findBindingContextType();

} // DataElement
