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
package org.eclipse.pmf.pim.util;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.pmf.pim.Action;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.ApplicationAction;
import org.eclipse.pmf.pim.Authentication;
import org.eclipse.pmf.pim.Command;
import org.eclipse.pmf.pim.CompositeDataForm;
import org.eclipse.pmf.pim.DataAssocication;
import org.eclipse.pmf.pim.DataCollection;
import org.eclipse.pmf.pim.DataComposite;
import org.eclipse.pmf.pim.DataConverter;
import org.eclipse.pmf.pim.DataElement;
import org.eclipse.pmf.pim.DataField;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.DataFormFolder;
import org.eclipse.pmf.pim.DataFormSelector;
import org.eclipse.pmf.pim.DataGroup;
import org.eclipse.pmf.pim.DataInheritance;
import org.eclipse.pmf.pim.DataItem;
import org.eclipse.pmf.pim.DataModelManagerFactory;
import org.eclipse.pmf.pim.DataReference;
import org.eclipse.pmf.pim.ElementalDataForm;
import org.eclipse.pmf.pim.Library;
import org.eclipse.pmf.pim.PMF;
import org.eclipse.pmf.pim.PMFObject;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.RegexValidator;
import org.eclipse.pmf.pim.Sorter;
import org.eclipse.pmf.pim.SystemAction;
import org.eclipse.pmf.pim.UIObject;
import org.eclipse.pmf.pim.Validator;
import org.eclipse.pmf.pim.ViewProfile;
import org.eclipse.pmf.pim.Wizard;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.ui.UIEvent;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see org.eclipse.pmf.pim.PMFPackage
 * @generated
 */
public class PMFSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static PMFPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public PMFSwitch() {
		if (modelPackage == null) {
			modelPackage = PMFPackage.eINSTANCE;
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
		case PMFPackage.DATA_FORM: {
			DataForm dataForm = (DataForm) theEObject;
			T result = caseDataForm(dataForm);
			if (result == null)
				result = caseDataElement(dataForm);
			if (result == null)
				result = caseUIObject(dataForm);
			if (result == null)
				result = casePMFObject(dataForm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.ELEMENTAL_DATA_FORM: {
			ElementalDataForm elementalDataForm = (ElementalDataForm) theEObject;
			T result = caseElementalDataForm(elementalDataForm);
			if (result == null)
				result = caseDataForm(elementalDataForm);
			if (result == null)
				result = caseDataElement(elementalDataForm);
			if (result == null)
				result = caseUIObject(elementalDataForm);
			if (result == null)
				result = casePMFObject(elementalDataForm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.COMPOSITE_DATA_FORM: {
			CompositeDataForm compositeDataForm = (CompositeDataForm) theEObject;
			T result = caseCompositeDataForm(compositeDataForm);
			if (result == null)
				result = caseDataForm(compositeDataForm);
			if (result == null)
				result = caseDataElement(compositeDataForm);
			if (result == null)
				result = caseUIObject(compositeDataForm);
			if (result == null)
				result = casePMFObject(compositeDataForm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.DATA_FORM_SELECTOR: {
			DataFormSelector dataFormSelector = (DataFormSelector) theEObject;
			T result = caseDataFormSelector(dataFormSelector);
			if (result == null)
				result = caseCompositeDataForm(dataFormSelector);
			if (result == null)
				result = caseDataForm(dataFormSelector);
			if (result == null)
				result = caseDataElement(dataFormSelector);
			if (result == null)
				result = caseUIObject(dataFormSelector);
			if (result == null)
				result = casePMFObject(dataFormSelector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.DATA_FIELD: {
			DataField dataField = (DataField) theEObject;
			T result = caseDataField(dataField);
			if (result == null)
				result = caseDataItem(dataField);
			if (result == null)
				result = caseDataElement(dataField);
			if (result == null)
				result = caseUIObject(dataField);
			if (result == null)
				result = casePMFObject(dataField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.DATA_ELEMENT: {
			DataElement dataElement = (DataElement) theEObject;
			T result = caseDataElement(dataElement);
			if (result == null)
				result = caseUIObject(dataElement);
			if (result == null)
				result = casePMFObject(dataElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.DATA_COLLECTION: {
			DataCollection dataCollection = (DataCollection) theEObject;
			T result = caseDataCollection(dataCollection);
			if (result == null)
				result = caseDataComposite(dataCollection);
			if (result == null)
				result = caseDataItem(dataCollection);
			if (result == null)
				result = caseDataElement(dataCollection);
			if (result == null)
				result = caseUIObject(dataCollection);
			if (result == null)
				result = casePMFObject(dataCollection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.APPLICATION: {
			Application application = (Application) theEObject;
			T result = caseApplication(application);
			if (result == null)
				result = caseLibrary(application);
			if (result == null)
				result = casePMFObject(application);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.DATA_COMPOSITE: {
			DataComposite dataComposite = (DataComposite) theEObject;
			T result = caseDataComposite(dataComposite);
			if (result == null)
				result = caseDataItem(dataComposite);
			if (result == null)
				result = caseDataElement(dataComposite);
			if (result == null)
				result = caseUIObject(dataComposite);
			if (result == null)
				result = casePMFObject(dataComposite);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.DATA_GROUP: {
			DataGroup dataGroup = (DataGroup) theEObject;
			T result = caseDataGroup(dataGroup);
			if (result == null)
				result = caseDataComposite(dataGroup);
			if (result == null)
				result = caseDataItem(dataGroup);
			if (result == null)
				result = caseDataElement(dataGroup);
			if (result == null)
				result = caseUIObject(dataGroup);
			if (result == null)
				result = casePMFObject(dataGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.DATA_ITEM: {
			DataItem dataItem = (DataItem) theEObject;
			T result = caseDataItem(dataItem);
			if (result == null)
				result = caseDataElement(dataItem);
			if (result == null)
				result = caseUIObject(dataItem);
			if (result == null)
				result = casePMFObject(dataItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.DATA_REFERENCE: {
			DataReference dataReference = (DataReference) theEObject;
			T result = caseDataReference(dataReference);
			if (result == null)
				result = caseDataComposite(dataReference);
			if (result == null)
				result = caseDataItem(dataReference);
			if (result == null)
				result = caseDataElement(dataReference);
			if (result == null)
				result = caseUIObject(dataReference);
			if (result == null)
				result = casePMFObject(dataReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.UI_OBJECT: {
			UIObject uiObject = (UIObject) theEObject;
			T result = caseUIObject(uiObject);
			if (result == null)
				result = casePMFObject(uiObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.COMMAND: {
			Command command = (Command) theEObject;
			T result = caseCommand(command);
			if (result == null)
				result = casePMFObject(command);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.ACTION: {
			Action action = (Action) theEObject;
			T result = caseAction(action);
			if (result == null)
				result = casePMFObject(action);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.SYSTEM_ACTION: {
			SystemAction systemAction = (SystemAction) theEObject;
			T result = caseSystemAction(systemAction);
			if (result == null)
				result = caseAction(systemAction);
			if (result == null)
				result = casePMFObject(systemAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.APPLICATION_ACTION: {
			ApplicationAction applicationAction = (ApplicationAction) theEObject;
			T result = caseApplicationAction(applicationAction);
			if (result == null)
				result = caseAction(applicationAction);
			if (result == null)
				result = casePMFObject(applicationAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.DATA_FORM_FOLDER: {
			DataFormFolder dataFormFolder = (DataFormFolder) theEObject;
			T result = caseDataFormFolder(dataFormFolder);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.TYPE_TO_DATA_FORM_FOLDER_ENTRY_MAP: {
			@SuppressWarnings("unchecked")
			Map.Entry<DataType, DataFormFolder> typeToDataFormFolderEntryMap = (Map.Entry<DataType, DataFormFolder>) theEObject;
			T result = caseTypeToDataFormFolderEntryMap(typeToDataFormFolderEntryMap);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.PMF: {
			PMF pmf = (PMF) theEObject;
			T result = casePMF(pmf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.DATA_MODEL_MANAGER_FACTORY: {
			DataModelManagerFactory dataModelManagerFactory = (DataModelManagerFactory) theEObject;
			T result = caseDataModelManagerFactory(dataModelManagerFactory);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.DATA_CONVERTER: {
			DataConverter dataConverter = (DataConverter) theEObject;
			T result = caseDataConverter(dataConverter);
			if (result == null)
				result = casePMFObject(dataConverter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.VALIDATOR: {
			Validator validator = (Validator) theEObject;
			T result = caseValidator(validator);
			if (result == null)
				result = casePMFObject(validator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.VIEW_PROFILE: {
			ViewProfile viewProfile = (ViewProfile) theEObject;
			T result = caseViewProfile(viewProfile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.PMF_OBJECT: {
			PMFObject pmfObject = (PMFObject) theEObject;
			T result = casePMFObject(pmfObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.SORTER: {
			Sorter sorter = (Sorter) theEObject;
			T result = caseSorter(sorter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.DATA_INHERITANCE: {
			DataInheritance dataInheritance = (DataInheritance) theEObject;
			T result = caseDataInheritance(dataInheritance);
			if (result == null)
				result = caseDataReference(dataInheritance);
			if (result == null)
				result = caseDataComposite(dataInheritance);
			if (result == null)
				result = caseDataItem(dataInheritance);
			if (result == null)
				result = caseDataElement(dataInheritance);
			if (result == null)
				result = caseUIObject(dataInheritance);
			if (result == null)
				result = casePMFObject(dataInheritance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.DATA_ASSOCICATION: {
			DataAssocication dataAssocication = (DataAssocication) theEObject;
			T result = caseDataAssocication(dataAssocication);
			if (result == null)
				result = caseDataReference(dataAssocication);
			if (result == null)
				result = caseDataComposite(dataAssocication);
			if (result == null)
				result = caseDataItem(dataAssocication);
			if (result == null)
				result = caseDataElement(dataAssocication);
			if (result == null)
				result = caseUIObject(dataAssocication);
			if (result == null)
				result = casePMFObject(dataAssocication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.LIBRARY: {
			Library library = (Library) theEObject;
			T result = caseLibrary(library);
			if (result == null)
				result = casePMFObject(library);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.REGEX_VALIDATOR: {
			RegexValidator regexValidator = (RegexValidator) theEObject;
			T result = caseRegexValidator(regexValidator);
			if (result == null)
				result = caseValidator(regexValidator);
			if (result == null)
				result = casePMFObject(regexValidator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.ECLASS_TO_EVENT_ENTRY_MAP: {
			@SuppressWarnings("unchecked")
			Map.Entry<EClass, EList<UIEvent>> eClassToEventEntryMap = (Map.Entry<EClass, EList<UIEvent>>) theEObject;
			T result = caseEClassToEventEntryMap(eClassToEventEntryMap);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.AUTHENTICATION: {
			Authentication authentication = (Authentication) theEObject;
			T result = caseAuthentication(authentication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PMFPackage.WIZARD: {
			Wizard wizard = (Wizard) theEObject;
			T result = caseWizard(wizard);
			if (result == null)
				result = casePMFObject(wizard);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Form</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataForm(DataForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemental Data Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemental Data Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementalDataForm(ElementalDataForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Data Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Data Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeDataForm(CompositeDataForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Form Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Form Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFormSelector(DataFormSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Field</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataField(DataField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataElement(DataElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Collection</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataCollection(DataCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Composite</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataComposite(DataComposite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataGroup(DataGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Item</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataItem(DataItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Reference</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataReference(DataReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Object</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIObject(UIObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Action</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemAction(SystemAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Action</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationAction(ApplicationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Form Folder</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Form Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFormFolder(DataFormFolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type To Data Form Folder Entry Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type To Data Form Folder Entry Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeToDataFormFolderEntryMap(
			Map.Entry<DataType, DataFormFolder> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>PMF</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>PMF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePMF(PMF object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Data Converter</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Converter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataConverter(DataConverter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validator</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidator(Validator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Profile</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewProfile(ViewProfile object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Sorter</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sorter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSorter(Sorter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Inheritance</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Inheritance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataInheritance(DataInheritance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Assocication</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Assocication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAssocication(DataAssocication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regex Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regex Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegexValidator(RegexValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClass To Event Entry Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClass To Event Entry Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClassToEventEntryMap(Map.Entry<EClass, EList<UIEvent>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthentication(Authentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wizard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wizard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWizard(Wizard object) {
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

} // PMFSwitch
