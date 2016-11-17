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
import java.util.Map.Entry;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
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
import org.eclipse.pmf.pim.SortingDirection;
import org.eclipse.pmf.pim.SystemAction;
import org.eclipse.pmf.pim.UIObject;
import org.eclipse.pmf.pim.Validator;
import org.eclipse.pmf.pim.ViewProfile;
import org.eclipse.pmf.pim.Wizard;
import org.eclipse.pmf.pim.data.DataType;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see org.eclipse.pmf.pim.PMFPackage
 * @generated
 */
public class PMFValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final PMFValidator INSTANCE = new PMFValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.pmf.pim";

	public static final int DATAFORM__NO_CIRCULAR_CONTAINMENT = 20;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public PMFValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return PMFPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
		case PMFPackage.DATA_FORM:
			return validateDataForm((DataForm) value, diagnostics, context);
		case PMFPackage.ELEMENTAL_DATA_FORM:
			return validateElementalDataForm((ElementalDataForm) value,
					diagnostics, context);
		case PMFPackage.COMPOSITE_DATA_FORM:
			return validateCompositeDataForm((CompositeDataForm) value,
					diagnostics, context);
		case PMFPackage.DATA_FORM_SELECTOR:
			return validateDataFormSelector((DataFormSelector) value,
					diagnostics, context);
		case PMFPackage.DATA_FIELD:
			return validateDataField((DataField) value, diagnostics, context);
		case PMFPackage.DATA_ELEMENT:
			return validateDataElement((DataElement) value, diagnostics,
					context);
		case PMFPackage.DATA_COLLECTION:
			return validateDataCollection((DataCollection) value, diagnostics,
					context);
		case PMFPackage.APPLICATION:
			return validateApplication((Application) value, diagnostics,
					context);
		case PMFPackage.DATA_COMPOSITE:
			return validateDataComposite((DataComposite) value, diagnostics,
					context);
		case PMFPackage.DATA_GROUP:
			return validateDataGroup((DataGroup) value, diagnostics, context);
		case PMFPackage.DATA_ITEM:
			return validateDataItem((DataItem) value, diagnostics, context);
		case PMFPackage.DATA_REFERENCE:
			return validateDataReference((DataReference) value, diagnostics,
					context);
		case PMFPackage.UI_OBJECT:
			return validateUIObject((UIObject) value, diagnostics, context);
		case PMFPackage.COMMAND:
			return validateCommand((Command) value, diagnostics, context);
		case PMFPackage.ACTION:
			return validateAction((Action) value, diagnostics, context);
		case PMFPackage.SYSTEM_ACTION:
			return validateSystemAction((SystemAction) value, diagnostics,
					context);
		case PMFPackage.APPLICATION_ACTION:
			return validateApplicationAction((ApplicationAction) value,
					diagnostics, context);
		case PMFPackage.DATA_FORM_FOLDER:
			return validateDataFormFolder((DataFormFolder) value, diagnostics,
					context);
		case PMFPackage.TYPE_TO_DATA_FORM_FOLDER_ENTRY_MAP:
			return validateTypeToDataFormFolderEntryMap(
					(Map.Entry<?, ?>) value, diagnostics, context);
		case PMFPackage.PMF:
			return validatePMF((PMF) value, diagnostics, context);
		case PMFPackage.DATA_MODEL_MANAGER_FACTORY:
			return validateDataModelManagerFactory(
					(DataModelManagerFactory) value, diagnostics, context);
		case PMFPackage.DATA_CONVERTER:
			return validateDataConverter((DataConverter) value, diagnostics,
					context);
		case PMFPackage.VALIDATOR:
			return validateValidator((Validator) value, diagnostics, context);
		case PMFPackage.VIEW_PROFILE:
			return validateViewProfile((ViewProfile) value, diagnostics,
					context);
		case PMFPackage.PMF_OBJECT:
			return validatePMFObject((PMFObject) value, diagnostics, context);
		case PMFPackage.SORTER:
			return validateSorter((Sorter) value, diagnostics, context);
		case PMFPackage.DATA_INHERITANCE:
			return validateDataInheritance((DataInheritance) value,
					diagnostics, context);
		case PMFPackage.DATA_ASSOCICATION:
			return validateDataAssocication((DataAssocication) value,
					diagnostics, context);
		case PMFPackage.LIBRARY:
			return validateLibrary((Library) value, diagnostics, context);
		case PMFPackage.REGEX_VALIDATOR:
			return validateRegexValidator((RegexValidator) value, diagnostics,
					context);
		case PMFPackage.ECLASS_TO_EVENT_ENTRY_MAP:
			return validateEClassToEventEntryMap((Map.Entry<?, ?>) value,
					diagnostics, context);
		case PMFPackage.AUTHENTICATION:
			return validateAuthentication((Authentication) value, diagnostics,
					context);
		case PMFPackage.WIZARD:
			return validateWizard((Wizard) value, diagnostics, context);
		case PMFPackage.SORTING_DIRECTION:
			return validateSortingDirection((SortingDirection) value,
					diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateDataForm(DataForm dataForm,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataForm, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dataForm,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dataForm, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dataForm, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(dataForm,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dataForm, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dataForm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dataForm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dataForm, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateDataElement_TypeMismatch(dataForm, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateDataForm_nameConflict(dataForm, diagnostics,
					context);

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementalDataForm(
			ElementalDataForm elementalDataForm, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(elementalDataForm, diagnostics,
				context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(elementalDataForm,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(elementalDataForm,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(elementalDataForm,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(
					elementalDataForm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(elementalDataForm,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(elementalDataForm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(elementalDataForm, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(elementalDataForm,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDataElement_TypeMismatch(elementalDataForm,
					diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeDataForm(
			CompositeDataForm compositeDataForm, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compositeDataForm, diagnostics,
				context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(compositeDataForm,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(compositeDataForm,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(compositeDataForm,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(
					compositeDataForm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(compositeDataForm,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(compositeDataForm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(compositeDataForm, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(compositeDataForm,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDataElement_TypeMismatch(compositeDataForm,
					diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataFormSelector(DataFormSelector dataFormSelector,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataFormSelector, diagnostics,
				context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dataFormSelector,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dataFormSelector,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dataFormSelector,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(
					dataFormSelector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dataFormSelector,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dataFormSelector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dataFormSelector, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dataFormSelector,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDataElement_TypeMismatch(dataFormSelector,
					diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataField(DataField dataField,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataField, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dataField,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dataField, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dataField,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(dataField,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dataField, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dataField, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dataField, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dataField, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateDataElement_TypeMismatch(dataField, diagnostics,
					context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataElement(DataElement dataElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataElement, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dataElement,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dataElement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dataElement,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(dataElement,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dataElement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dataElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dataElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dataElement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateDataElement_TypeMismatch(dataElement,
					diagnostics, context);
		return result;
	}

	/**
	 * Validates the TypeMismatch constraint of '<em>Data Element</em>'. <!--
	 * begin-user-doc --> This validation checks the Type compatibility between
	 * the Date type and the UI property type. For example, if data type is Date
	 * which will be displayed in the property text of Text, the converters from
	 * Date to String is needed. <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateDataElement_TypeMismatch(DataElement dataElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and
		// message
		// Ensure that you remove @generated or mark it @generated NOT
		if (diagnostics != null) {
			diagnostics.add(createDiagnostic(
					Diagnostic.ERROR,
					DIAGNOSTIC_SOURCE,
					0,
					"_UI_GenericConstraint_diagnostic",
					new Object[] { "TypeMismatch",
							getObjectLabel(dataElement, context) },
					new Object[] { dataElement }, context));
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCollection(DataCollection dataCollection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataCollection, diagnostics,
				context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dataCollection,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dataCollection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dataCollection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(
					dataCollection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dataCollection, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dataCollection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dataCollection, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dataCollection, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateDataElement_TypeMismatch(dataCollection,
					diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateApplication(Application application,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryDefaultConstraint(application,
				diagnostics, context);

		if (result || diagnostics != null)
			result &= validateApplication_validate(application, diagnostics,
					context);

		return result;
	}

	public boolean validateApplication_validate(Application application,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return application.validate(diagnostics, context);
	}

	public boolean validateDataForm_nameConflict(DataForm dataForm,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryDefaultConstraint(dataForm, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= dataForm.validate_nameConflict(diagnostics, context);

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataComposite(DataComposite dataComposite,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataComposite, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dataComposite,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dataComposite,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dataComposite,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(
					dataComposite, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dataComposite, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dataComposite, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dataComposite, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dataComposite, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateDataElement_TypeMismatch(dataComposite,
					diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataGroup(DataGroup dataGroup,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataGroup, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dataGroup,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dataGroup, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dataGroup,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(dataGroup,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dataGroup, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dataGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dataGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dataGroup, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateDataElement_TypeMismatch(dataGroup, diagnostics,
					context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataItem(DataItem dataItem,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataItem, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dataItem,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dataItem, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dataItem, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(dataItem,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dataItem, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dataItem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dataItem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dataItem, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateDataElement_TypeMismatch(dataItem, diagnostics,
					context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataReference(DataReference dataReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataReference, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dataReference,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dataReference,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dataReference,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(
					dataReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dataReference, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dataReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dataReference, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dataReference, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateDataElement_TypeMismatch(dataReference,
					diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUIObject(UIObject uiObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uiObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommand(Command command,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(command, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemAction(SystemAction systemAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemAction, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationAction(
			ApplicationAction applicationAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicationAction, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataFormFolder(DataFormFolder dataFormFolder,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataFormFolder, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeToDataFormFolderEntryMap(
			Map.Entry<?, ?> typeToDataFormFolderEntryMap,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(
				(EObject) typeToDataFormFolderEntryMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePMF(PMF pmf, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pmf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataModelManagerFactory(
			DataModelManagerFactory dataModelManagerFactory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataModelManagerFactory,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataConverter(DataConverter dataConverter,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataConverter, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidator(Validator validator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(validator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewProfile(ViewProfile viewProfile,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewProfile, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePMFObject(PMFObject pmfObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pmfObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSorter(Sorter sorter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sorter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataInheritance(DataInheritance dataInheritance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataInheritance, diagnostics,
				context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dataInheritance,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dataInheritance,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dataInheritance,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(
					dataInheritance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dataInheritance, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dataInheritance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dataInheritance, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dataInheritance,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDataElement_TypeMismatch(dataInheritance,
					diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAssocication(DataAssocication dataAssocication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataAssocication, diagnostics,
				context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dataAssocication,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dataAssocication,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dataAssocication,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(
					dataAssocication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dataAssocication,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dataAssocication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dataAssocication, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dataAssocication,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDataElement_TypeMismatch(dataAssocication,
					diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateLibrary(Library library,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryDefaultConstraint(library, diagnostics,
				context);

		if (result || diagnostics != null) {
			for (Entry<DataType, DataFormFolder> dataFormFolder : library
					.getDataFormFolders()) {
				for (DataForm dataForm : dataFormFolder.getValue()
						.getDataForms()) {
					result &= validateDataForm(dataForm, diagnostics, context);
				}
			}
		}
		return result;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegexValidator(RegexValidator regexValidator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regexValidator, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClassToEventEntryMap(
			Map.Entry<?, ?> eClassToEventEntryMap, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject) eClassToEventEntryMap,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthentication(Authentication authentication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authentication, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWizard(Wizard wizard, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wizard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortingDirection(SortingDirection sortingDirection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} // PMFValidator
