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
package org.eclipse.pmf.pim.impl;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.pmf.pim.Action;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.ApplicationAction;
import org.eclipse.pmf.pim.Authentication;
import org.eclipse.pmf.pim.Command;
import org.eclipse.pmf.pim.DataAssocication;
import org.eclipse.pmf.pim.DataCollection;
import org.eclipse.pmf.pim.DataConverter;
import org.eclipse.pmf.pim.DataField;
import org.eclipse.pmf.pim.DataFormFolder;
import org.eclipse.pmf.pim.DataFormSelector;
import org.eclipse.pmf.pim.DataGroup;
import org.eclipse.pmf.pim.DataInheritance;
import org.eclipse.pmf.pim.ElementalDataForm;
import org.eclipse.pmf.pim.Library;
import org.eclipse.pmf.pim.PMF;
import org.eclipse.pmf.pim.PMFFactory;
import org.eclipse.pmf.pim.PMFObject;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.RegexValidator;
import org.eclipse.pmf.pim.Sorter;
import org.eclipse.pmf.pim.SortingDirection;
import org.eclipse.pmf.pim.SystemAction;
import org.eclipse.pmf.pim.Validator;
import org.eclipse.pmf.pim.ViewProfile;
import org.eclipse.pmf.pim.Wizard;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.ui.UIEvent;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class PMFFactoryImpl extends EFactoryImpl implements PMFFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static PMFFactory init() {
		try {
			PMFFactory thePMFFactory = (PMFFactory) EPackage.Registry.INSTANCE
					.getEFactory(PMFPackage.eNS_URI);
			if (thePMFFactory != null) {
				return thePMFFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PMFFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public PMFFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PMFPackage.ELEMENTAL_DATA_FORM:
			return createElementalDataForm();
		case PMFPackage.DATA_FORM_SELECTOR:
			return createDataFormSelector();
		case PMFPackage.DATA_FIELD:
			return createDataField();
		case PMFPackage.DATA_COLLECTION:
			return createDataCollection();
		case PMFPackage.APPLICATION:
			return createApplication();
		case PMFPackage.DATA_GROUP:
			return createDataGroup();
		case PMFPackage.COMMAND:
			return createCommand();
		case PMFPackage.ACTION:
			return createAction();
		case PMFPackage.SYSTEM_ACTION:
			return createSystemAction();
		case PMFPackage.APPLICATION_ACTION:
			return createApplicationAction();
		case PMFPackage.DATA_FORM_FOLDER:
			return createDataFormFolder();
		case PMFPackage.TYPE_TO_DATA_FORM_FOLDER_ENTRY_MAP:
			return (EObject) createTypeToDataFormFolderEntryMap();
		case PMFPackage.PMF:
			return createPMF();
		case PMFPackage.DATA_CONVERTER:
			return createDataConverter();
		case PMFPackage.VALIDATOR:
			return createValidator();
		case PMFPackage.VIEW_PROFILE:
			return createViewProfile();
		case PMFPackage.PMF_OBJECT:
			return createPMFObject();
		case PMFPackage.SORTER:
			return createSorter();
		case PMFPackage.DATA_INHERITANCE:
			return createDataInheritance();
		case PMFPackage.DATA_ASSOCICATION:
			return createDataAssocication();
		case PMFPackage.LIBRARY:
			return createLibrary();
		case PMFPackage.REGEX_VALIDATOR:
			return createRegexValidator();
		case PMFPackage.ECLASS_TO_EVENT_ENTRY_MAP:
			return (EObject) createEClassToEventEntryMap();
		case PMFPackage.AUTHENTICATION:
			return createAuthentication();
		case PMFPackage.WIZARD:
			return createWizard();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case PMFPackage.SORTING_DIRECTION:
			return createSortingDirectionFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case PMFPackage.SORTING_DIRECTION:
			return convertSortingDirectionToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementalDataForm createElementalDataForm() {
		ElementalDataFormImpl elementalDataForm = new ElementalDataFormImpl();
		return elementalDataForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFormSelector createDataFormSelector() {
		DataFormSelectorImpl dataFormSelector = new DataFormSelectorImpl();
		return dataFormSelector;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataField createDataField() {
		DataFieldImpl dataField = new DataFieldImpl();
		return dataField;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataCollection createDataCollection() {
		DataCollectionImpl dataCollection = new DataCollectionImpl();
		return dataCollection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataGroup createDataGroup() {
		DataGroupImpl dataGroup = new DataGroupImpl();
		return dataGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAction createSystemAction() {
		SystemActionImpl systemAction = new SystemActionImpl();
		return systemAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationAction createApplicationAction() {
		ApplicationActionImpl applicationAction = new ApplicationActionImpl();
		return applicationAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataFormFolder createDataFormFolder() {
		DataFormFolderImpl dataFormFolder = new DataFormFolderImpl();
		return dataFormFolder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<DataType, DataFormFolder> createTypeToDataFormFolderEntryMap() {
		TypeToDataFormFolderEntryMapImpl typeToDataFormFolderEntryMap = new TypeToDataFormFolderEntryMapImpl();
		return typeToDataFormFolderEntryMap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PMF createPMF() {
		PMFImpl pmf = new PMFImpl();
		return pmf;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataConverter createDataConverter() {
		DataConverterImpl dataConverter = new DataConverterImpl();
		return dataConverter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Validator createValidator() {
		ValidatorImpl validator = new ValidatorImpl();
		return validator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ViewProfile createViewProfile() {
		ViewProfileImpl viewProfile = new ViewProfileImpl();
		return viewProfile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PMFObject createPMFObject() {
		PMFObjectImpl pmfObject = new PMFObjectImpl();
		return pmfObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Sorter createSorter() {
		SorterImpl sorter = new SorterImpl();
		return sorter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataInheritance createDataInheritance() {
		DataInheritanceImpl dataInheritance = new DataInheritanceImpl();
		return dataInheritance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataAssocication createDataAssocication() {
		DataAssocicationImpl dataAssocication = new DataAssocicationImpl();
		return dataAssocication;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegexValidator createRegexValidator() {
		RegexValidatorImpl regexValidator = new RegexValidatorImpl();
		return regexValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<EClass, EList<UIEvent>> createEClassToEventEntryMap() {
		EClassToEventEntryMapImpl eClassToEventEntryMap = new EClassToEventEntryMapImpl();
		return eClassToEventEntryMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authentication createAuthentication() {
		AuthenticationImpl authentication = new AuthenticationImpl();
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wizard createWizard() {
		WizardImpl wizard = new WizardImpl();
		return wizard;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SortingDirection createSortingDirectionFromString(
			EDataType eDataType, String initialValue) {
		SortingDirection result = SortingDirection.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortingDirectionToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PMFPackage getPMFPackage() {
		return (PMFPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PMFPackage getPackage() {
		return PMFPackage.eINSTANCE;
	}

} // PMFFactoryImpl
