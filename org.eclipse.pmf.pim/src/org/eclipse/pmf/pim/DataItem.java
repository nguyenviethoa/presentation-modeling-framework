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

import org.eclipse.pmf.pim.ui.Control;
import org.eclipse.pmf.pim.ui.LayoutData;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Item</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.DataItem#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.DataItem#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.DataItem#getHelp <em>Help</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.DataItem#getLayoutData <em>Layout Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.PMFPackage#getDataItem()
 * @model abstract="true"
 * @generated
 */
public interface DataItem extends DataElement {

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc --> <!-- begin-model-doc --> This property indicates
	 * whether this field is mandatory for edition. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataItem_Mandatory()
	 * @model
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataItem#isMandatory
	 * <em>Mandatory</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(Control)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataItem_Label()
	 * @model containment="true"
	 * @generated
	 */
	Control getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataItem#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Control value);

	/**
	 * Returns the value of the '<em><b>Help</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Help</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' containment reference.
	 * @see #setHelp(Control)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataItem_Help()
	 * @model containment="true"
	 * @generated
	 */
	Control getHelp();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataItem#getHelp <em>Help</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Help</em>' containment reference.
	 * @see #getHelp()
	 * @generated
	 */
	void setHelp(Control value);

	/**
	 * Returns the value of the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Data</em>' containment reference.
	 * @see #setLayoutData(LayoutData)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataItem_LayoutData()
	 * @model containment="true"
	 * @generated
	 */
	LayoutData getLayoutData();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataItem#getLayoutData <em>Layout Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Data</em>' containment reference.
	 * @see #getLayoutData()
	 * @generated
	 */
	void setLayoutData(LayoutData value);
} // DataItem
