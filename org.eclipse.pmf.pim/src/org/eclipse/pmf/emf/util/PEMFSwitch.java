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
package org.eclipse.pmf.emf.util;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.pmf.emf.EMFDataModelManager;
import org.eclipse.pmf.emf.EMFDataModelManagerFactory;
import org.eclipse.pmf.emf.EMFFileInput;
import org.eclipse.pmf.emf.EMFProperty;
import org.eclipse.pmf.emf.EMFType;
import org.eclipse.pmf.emf.PEMFPackage;
import org.eclipse.pmf.pim.DataModelManagerFactory;
import org.eclipse.pmf.pim.PMFObject;
import org.eclipse.pmf.pim.data.DataModelManager;
import org.eclipse.pmf.pim.data.DataProperty;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.datainput.DataInput;
import org.eclipse.pmf.pim.datainput.FileInput;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see org.eclipse.pmf.emf.PEMFPackage
 * @generated
 */
public class PEMFSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static PEMFPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public PEMFSwitch() {
		if (modelPackage == null) {
			modelPackage = PEMFPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case PEMFPackage.EMF_DATA_MODEL_MANAGER_FACTORY: {
			EMFDataModelManagerFactory emfDataModelManagerFactory = (EMFDataModelManagerFactory) theEObject;
			T result = caseEMFDataModelManagerFactory(emfDataModelManagerFactory);
			if (result == null)
				result = caseDataModelManagerFactory(emfDataModelManagerFactory);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PEMFPackage.EMF_DATA_MODEL_MANAGER: {
			EMFDataModelManager emfDataModelManager = (EMFDataModelManager) theEObject;
			T result = caseEMFDataModelManager(emfDataModelManager);
			if (result == null)
				result = caseDataModelManager(emfDataModelManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PEMFPackage.EMF_TYPE: {
			EMFType emfType = (EMFType) theEObject;
			T result = caseEMFType(emfType);
			if (result == null)
				result = caseDataType(emfType);
			if (result == null)
				result = casePMFObject(emfType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PEMFPackage.EMF_PROPERTY: {
			EMFProperty emfProperty = (EMFProperty) theEObject;
			T result = caseEMFProperty(emfProperty);
			if (result == null)
				result = caseDataProperty(emfProperty);
			if (result == null)
				result = casePMFObject(emfProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PEMFPackage.ECLASS_TO_DATA_TYPE_MAP_ENTRY: {
			@SuppressWarnings("unchecked")
			Map.Entry<EClassifier, EMFType> eClassToDataTypeMapEntry = (Map.Entry<EClassifier, EMFType>) theEObject;
			T result = caseEClassToDataTypeMapEntry(eClassToDataTypeMapEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PEMFPackage.EMF_FILE_INPUT: {
			EMFFileInput emfFileInput = (EMFFileInput) theEObject;
			T result = caseEMFFileInput(emfFileInput);
			if (result == null)
				result = caseFileInput(emfFileInput);
			if (result == null)
				result = caseDataInput(emfFileInput);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Data Model Manager Factory</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Data Model Manager Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFDataModelManagerFactory(EMFDataModelManagerFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Data Model Manager</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Data Model Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFDataModelManager(EMFDataModelManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Type</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFType(EMFType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Property</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFProperty(EMFProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClass To Data Type Map Entry</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClass To Data Type Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClassToDataTypeMapEntry(Map.Entry<EClassifier, EMFType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF File Input</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF File Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFFileInput(EMFFileInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Model Manager Factory</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Model Manager Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataModelManagerFactory(DataModelManagerFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Manager</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataModelManager(DataModelManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePMFObject(PMFObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Type</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataProperty(DataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Input</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataInput(DataInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Input</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileInput(FileInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // PEMFSwitch
