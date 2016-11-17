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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.pmf.emf.EMFType;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.Authentication;
import org.eclipse.pmf.pim.Command;
import org.eclipse.pmf.pim.DataAssocication;
import org.eclipse.pmf.pim.DataCollection;
import org.eclipse.pmf.pim.DataConverter;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.DataFormFolder;
import org.eclipse.pmf.pim.DataFormSelector;
import org.eclipse.pmf.pim.DataInheritance;
import org.eclipse.pmf.pim.DataItem;
import org.eclipse.pmf.pim.ElementalDataForm;
import org.eclipse.pmf.pim.Library;
import org.eclipse.pmf.pim.PMFFactory;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.SystemAction;
import org.eclipse.pmf.pim.Validator;
import org.eclipse.pmf.pim.ViewProfile;
import org.eclipse.pmf.pim.Wizard;
import org.eclipse.pmf.pim.data.DataModelManager;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.exception.PMFException;
import org.eclipse.pmf.pim.ui.Container;
import org.eclipse.pmf.pim.ui.Image;
import org.eclipse.pmf.pim.util.PMFUtil;
import org.eclipse.pmf.pim.util.PMFValidator;
import org.eclipse.pmf.pim.util.UnmodifiableEMap;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Application</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.impl.ApplicationImpl#getMain <em>Main</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.ApplicationImpl#getDataModelManagers <em>Data Model Managers</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.ApplicationImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.ApplicationImpl#getAllViewProfiles <em>All View Profiles</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.ApplicationImpl#getAllSystemActions <em>All System Actions</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.ApplicationImpl#getAllCommands <em>All Commands</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.ApplicationImpl#getAllConverters <em>All Converters</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.ApplicationImpl#getAllValidators <em>All Validators</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.ApplicationImpl#getAllTypes <em>All Types</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.ApplicationImpl#getAllImages <em>All Images</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/**
 * @author Nguyen
 * 
 */
public class ApplicationImpl extends LibraryImpl implements Application {

	/**
	 * number of verticals
	 * 
	 * @generated NOT
	 */
	private int V;

	/**
	 * preorder number counter
	 * 
	 * @generated NOT
	 */

	private int preCount;

	/**
	 * low number of v
	 * 
	 * @generated NOT
	 */
	private int[] low;

	/**
	 * to check if v is visited
	 * 
	 * @generated NOT
	 */
	private boolean[] visited;

	/**
	 * to store the graph like a adjacent list, associated with the information
	 * about reference type between two nodes (Inheritance, Association,
	 * Collection)
	 * 
	 * @generated NOT
	 */
	private Set<Integer>[] graph;

	/**
	 * a mapping between index and name of dataforms
	 * 
	 * @generated NOT
	 */
	private Map<Integer, String> dataForms = new HashMap<Integer, String>();

	/**
	 * list of strongly connected components
	 * 
	 * @generated NOT
	 */
	private List<List<Integer>> sccComp;

	private Stack<Integer> stack;

	/**
	 * The cached value of the '{@link #getMain() <em>Main</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMain()
	 * @generated
	 * @ordered
	 */
	protected Container main;

	/**
	 * The cached value of the '{@link #getDataModelManagers()
	 * <em>Data Model Managers</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDataModelManagers()
	 * @generated
	 * @ordered
	 */
	protected EList<DataModelManager> dataModelManagers;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> libraries;

	/**
	 * The cached value of the '{@link #getAllViewProfiles() <em>All View Profiles</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAllViewProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewProfile> allViewProfiles;

	/**
	 * The cached value of the '{@link #getAllSystemActions() <em>All System Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllSystemActions()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemAction> allSystemActions;

	/**
	 * The cached value of the '{@link #getAllCommands() <em>All Commands</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAllCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> allCommands;

	/**
	 * The cached value of the '{@link #getAllConverters() <em>All Converters</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAllConverters()
	 * @generated
	 * @ordered
	 */
	protected EList<DataConverter> allConverters;

	/**
	 * The cached value of the '{@link #getAllValidators() <em>All Validators</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAllValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<Validator> allValidators;

	/**
	 * The cached value of the '{@link #getAllTypes() <em>All Types</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAllTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> allTypes;

	/**
	 * The cached value of the '{@link #getAllImages() <em>All Images</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAllImages()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> allImages;

	/**
	 * The cached value of the '{@link #getAuthentication() <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthentication()
	 * @generated
	 * @ordered
	 */
	protected Authentication authentication;

	/**
	 * The cached value of the '{@link #getMandatoryField() <em>Mandatory Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryField()
	 * @generated
	 * @ordered
	 */
	protected Validator mandatoryField;

	/**
	 * The cached value of the '{@link #getWizards() <em>Wizards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWizards()
	 * @generated
	 * @ordered
	 */
	protected EList<Wizard> wizards;

	/**
	 * The cached value of the '{@link #getAllDataFormFolders()
	 * <em>All Data Form Folders</em>}' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAllDataFormFolders()
	 */
	protected EMap<DataType, DataFormFolder> allDataFormFolders;

	private EContentAdapter adapter = new EContentAdapter() {
		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			if (notification.isTouch()) {
				return;
			}
			Object feature = notification.getFeature();
			if (PMFPackage.eINSTANCE.getLibrary_Commands() == feature) {
				allCommands = null;
			} else if (PMFPackage.eINSTANCE.getLibrary_Converters() == feature) {
				allConverters = null;
			} else if (PMFPackage.eINSTANCE.getLibrary_SystemActions() == feature) {
				allSystemActions = null;
			} else if (PMFPackage.eINSTANCE.getLibrary_Types() == feature) {
				allTypes = null;
			} else if (PMFPackage.eINSTANCE.getLibrary_Validators() == feature) {
				allValidators = null;
			} else if (PMFPackage.eINSTANCE.getLibrary_ViewProfiles() == feature) {
				allViewProfiles = null;
			} else if (PMFPackage.eINSTANCE.getLibrary_DataFormFolders() == feature) {
				allDataFormFolders = null;
			} else if (PMFPackage.eINSTANCE.getLibrary_Images() == feature) {
				allImages = null;
			}
		}
	};

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected ApplicationImpl() {
		super();
		eAdapters().add(adapter);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMFPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Container getMain() {
		return main;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMain(Container newMain,
			NotificationChain msgs) {
		Container oldMain = main;
		main = newMain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, PMFPackage.APPLICATION__MAIN, oldMain,
					newMain);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMain(Container newMain) {
		if (newMain != main) {
			NotificationChain msgs = null;
			if (main != null)
				msgs = ((InternalEObject) main).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PMFPackage.APPLICATION__MAIN,
						null, msgs);
			if (newMain != null)
				msgs = ((InternalEObject) newMain).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PMFPackage.APPLICATION__MAIN,
						null, msgs);
			msgs = basicSetMain(newMain, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.APPLICATION__MAIN, newMain, newMain));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataModelManager> getDataModelManagers() {
		if (dataModelManagers == null) {
			dataModelManagers = new EObjectContainmentEList<DataModelManager>(
					DataModelManager.class, this,
					PMFPackage.APPLICATION__DATA_MODEL_MANAGERS);
		}
		return dataModelManagers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Library> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectResolvingEList<Library>(Library.class, this,
					PMFPackage.APPLICATION__LIBRARIES) {

				private static final long serialVersionUID = 8927590077852388681L;

				protected void didChange() {
					super.didChange();
					resetGlobalLists();
				}

				protected void didAdd(int index, Library newObject) {
					super.didAdd(index, newObject);
					newObject.eAdapters().add(adapter);
				}

				protected Library doRemove(int index) {
					Library library = basicGet(index);
					if (hasReferenceUsage(library)) {
						throw new PMFException(
								"The library can not be removed because there's one or more object(s) had been used by current application.");
					}
					return super.doRemove(index);
				}

				protected void didRemove(int index, Library oldObject) {
					super.didRemove(index, oldObject);
					oldObject.eAdapters().remove(adapter);
				}
			};
		}
		return libraries;
	}

	protected boolean hasReferenceUsage(Library library) {
		if (library == null) {
			return false;
		}
		EList<Command> commands = library.getCommands();
		for (Command command : commands) {
			Collection<Setting> usageSettings = EcoreUtil.UsageCrossReferencer
					.find(command, this);
			for (Setting setting : usageSettings) {
				EObject eObject = setting.getEObject();
				if (!isChildOfCurrentApplication(eObject)) {
					continue;
				}
				EStructuralFeature feature = setting.getEStructuralFeature();
				if (PMFPackage.eINSTANCE.getApplication_AllCommands() != feature) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isChildOfCurrentApplication(EObject eObject) {
		if (eObject == null) {
			return false;
		}
		if (eObject == this) {
			return true;
		}
		return isChildOfCurrentApplication(eObject.eContainer());
	}

	private void resetGlobalLists() {
		allViewProfiles = null;
		allCommands = null;
		allConverters = null;
		allSystemActions = null;
		allTypes = null;
		allValidators = null;
		allViewProfiles = null;
		allDataFormFolders = null;
		allImages = null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<ViewProfile> getAllViewProfiles() {
		if (allViewProfiles == null) {
			allViewProfiles = new EObjectResolvingEList<ViewProfile>(
					ViewProfile.class, this,
					PMFPackage.APPLICATION__ALL_VIEW_PROFILES);
			EList<Library> libraries = getLibraries();
			for (Library library : libraries) {
				allViewProfiles.addAll(library.getViewProfiles());
			}
			allViewProfiles.addAll(this.getViewProfiles());
		}
		return new EcoreEList.UnmodifiableEList<ViewProfile>(this,
				PMFPackage.eINSTANCE.getApplication_AllViewProfiles(),
				allViewProfiles.size(), allViewProfiles.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<SystemAction> getAllSystemActions() {
		if (allSystemActions == null) {
			allSystemActions = new EObjectResolvingEList<SystemAction>(
					SystemAction.class, this,
					PMFPackage.APPLICATION__ALL_SYSTEM_ACTIONS);
			EList<Library> libraries = getLibraries();
			for (Library library : libraries) {
				allSystemActions.addAll(library.getSystemActions());
			}
			allSystemActions.addAll(this.getSystemActions());
		}
		return new EcoreEList.UnmodifiableEList<SystemAction>(this,
				PMFPackage.eINSTANCE.getApplication_AllSystemActions(),
				allSystemActions.size(), allSystemActions.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Command> getAllCommands() {
		if (allCommands == null) {
			allCommands = new EObjectResolvingEList<Command>(Command.class,
					this, PMFPackage.APPLICATION__ALL_COMMANDS);
			EList<Library> libraries = getLibraries();
			for (Library library : libraries) {
				allCommands.addAll(library.getCommands());
			}
			allCommands.addAll(this.getCommands());
		}
		return new EcoreEList.UnmodifiableEList<Command>(this,
				PMFPackage.eINSTANCE.getApplication_AllCommands(),
				allCommands.size(), allCommands.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<DataConverter> getAllConverters() {
		if (allConverters == null) {
			allConverters = new EObjectResolvingEList<DataConverter>(
					DataConverter.class, this,
					PMFPackage.APPLICATION__ALL_CONVERTERS);
			EList<Library> libraries = getLibraries();
			for (Library library : libraries) {
				allConverters.addAll(library.getConverters());
			}
			allConverters.addAll(this.getConverters());
		}
		return new EcoreEList.UnmodifiableEList<DataConverter>(this,
				PMFPackage.eINSTANCE.getApplication_AllConverters(),
				allConverters.size(), allConverters.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Validator> getAllValidators() {
		if (allValidators == null) {
			allValidators = new EObjectResolvingEList<Validator>(
					Validator.class, this,
					PMFPackage.APPLICATION__ALL_VALIDATORS);
			EList<Library> libraries = getLibraries();
			for (Library library : libraries) {
				allValidators.addAll(library.getValidators());
			}
			allValidators.addAll(this.getValidators());
		}
		return new EcoreEList.UnmodifiableEList<Validator>(this,
				PMFPackage.eINSTANCE.getApplication_AllValidators(),
				allValidators.size(), allValidators.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<DataType> getAllTypes() {
		if (allTypes == null) {
			allTypes = new EObjectResolvingEList<DataType>(DataType.class,
					this, PMFPackage.APPLICATION__ALL_TYPES);
			EList<Library> libraries = getLibraries();
			for (Library library : libraries) {
				allTypes.addAll(library.getTypes());
			}
			allTypes.addAll(this.getTypes());
		}
		return new EcoreEList.UnmodifiableEList<DataType>(this,
				PMFPackage.eINSTANCE.getApplication_AllTypes(),
				allTypes.size(), allTypes.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Image> getAllImages() {
		if (allImages == null) {
			allImages = new EObjectResolvingEList<Image>(Image.class, this,
					PMFPackage.APPLICATION__ALL_IMAGES);
			EList<Library> libraries = getLibraries();
			for (Library library : libraries) {
				allImages.addAll(library.getImages());
			}
			allImages.addAll(this.getImages());
		}
		return new EcoreEList.UnmodifiableEList<Image>(this,
				PMFPackage.eINSTANCE.getApplication_AllImages(),
				allImages.size(), allImages.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authentication getAuthentication() {
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthentication(
			Authentication newAuthentication, NotificationChain msgs) {
		Authentication oldAuthentication = authentication;
		authentication = newAuthentication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, PMFPackage.APPLICATION__AUTHENTICATION,
					oldAuthentication, newAuthentication);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthentication(Authentication newAuthentication) {
		if (newAuthentication != authentication) {
			NotificationChain msgs = null;
			if (authentication != null)
				msgs = ((InternalEObject) authentication).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- PMFPackage.APPLICATION__AUTHENTICATION, null,
						msgs);
			if (newAuthentication != null)
				msgs = ((InternalEObject) newAuthentication).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- PMFPackage.APPLICATION__AUTHENTICATION, null,
						msgs);
			msgs = basicSetAuthentication(newAuthentication, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.APPLICATION__AUTHENTICATION, newAuthentication,
					newAuthentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validator getMandatoryField() {
		if (mandatoryField != null && mandatoryField.eIsProxy()) {
			InternalEObject oldMandatoryField = (InternalEObject) mandatoryField;
			mandatoryField = (Validator) eResolveProxy(oldMandatoryField);
			if (mandatoryField != oldMandatoryField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PMFPackage.APPLICATION__MANDATORY_FIELD,
							oldMandatoryField, mandatoryField));
			}
		}
		return mandatoryField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validator basicGetMandatoryField() {
		return mandatoryField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatoryField(Validator newMandatoryField) {
		Validator oldMandatoryField = mandatoryField;
		mandatoryField = newMandatoryField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.APPLICATION__MANDATORY_FIELD, oldMandatoryField,
					mandatoryField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wizard> getWizards() {
		if (wizards == null) {
			wizards = new EObjectContainmentEList<Wizard>(Wizard.class, this,
					PMFPackage.APPLICATION__WIZARDS);
		}
		return wizards;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public EMap<DataType, DataFormFolder> getAllDataFormFolders() {
		if (allDataFormFolders == null) {
			allDataFormFolders = new EcoreEMap<DataType, DataFormFolder>(
					PMFPackage.Literals.TYPE_TO_DATA_FORM_FOLDER_ENTRY_MAP,
					TypeToDataFormFolderEntryMapImpl.class, this,
					PMFPackage.APPLICATION__DATA_FORM_FOLDERS);
			for (Library library : getLibraries()) {
				allDataFormFolders.putAll(library.getDataFormFolders());
			}
			allDataFormFolders.putAll(this.getDataFormFolders());
			allDataFormFolders = new UnmodifiableEMap<DataType, DataFormFolder>(
					PMFPackage.Literals.TYPE_TO_DATA_FORM_FOLDER_ENTRY_MAP,
					TypeToDataFormFolderEntryMapImpl.class, allDataFormFolders,
					this, PMFPackage.eINSTANCE.getLibrary_DataFormFolders());
		}
		return allDataFormFolders;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void importModel(Resource resource) {
		DataModelManager dataModelManager = PMFUtil.dataModelManager(this);
		Map<DataType, DataFormFolder> mapCollector = new HashMap<DataType, DataFormFolder>();
		EMap<DataType, DataFormFolder> map = this.getDataFormFolders();
		//
		// Definition of dataModelManager types
		//
		for (TreeIterator<EObject> iterator = resource.getAllContents(); iterator
				.hasNext();) {
			EObject object = (EObject) iterator.next();
			if (object instanceof GenClassifier) {
				GenClassifier genClassifier = (GenClassifier) object;
				EMFType type = (EMFType) dataModelManager
						.getDataModelType(genClassifier.getEcoreClassifier());
				if (type == null) {
					continue;
				}
				type.updateGenmodel(genClassifier);
			} else if (object instanceof EClassifier) {
				DataType type = dataModelManager.getDataModelType(object);
				if (type == null) {
					continue;
				}
			}
		}
		//
        //Creation of DataForm Folders and Elemental DataForm
		//
		for (TreeIterator<EObject> iterator = dataModelManager.eAllContents(); iterator
				.hasNext();) {
			EObject type = (EObject) iterator.next();
			if ((type instanceof EMFType) && !((EMFType) type).isPrimitive()){
				DataFormFolder folder = map.get(type);
				boolean isNewFolder = false;
				if (folder == null) {
					folder = PMFFactory.eINSTANCE.createDataFormFolder();
					map.put((DataType) type, folder);
					mapCollector.put((DataType) type, folder);
					isNewFolder = true;
				}
				DataForm dataForm = PMFFactory.eINSTANCE
						.createElementalDataForm();
				dataForm.setDataContextType((DataType) type);
				folder.getDataForms().add(dataForm);
				if (isNewFolder) {
					folder.setDefaultDataForm(dataForm);
				}
				dataForm.setName(((EMFType) type).getName());
			}
		}
		//
		// Create a DataForm
		//
		for (DataType dataType : mapCollector.keySet()) {
			DataFormFolder folder = mapCollector.get(dataType);
			for (DataForm dataForm : folder.getDataForms()) {
				if (dataForm instanceof ElementalDataForm) {
					dataModelManager.loadFor((ElementalDataForm) dataForm,
							dataType);
					getTypes().add(dataType);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PMFPackage.APPLICATION__MAIN:
			return basicSetMain(null, msgs);
		case PMFPackage.APPLICATION__DATA_MODEL_MANAGERS:
			return ((InternalEList<?>) getDataModelManagers()).basicRemove(
					otherEnd, msgs);
		case PMFPackage.APPLICATION__AUTHENTICATION:
			return basicSetAuthentication(null, msgs);
		case PMFPackage.APPLICATION__WIZARDS:
			return ((InternalEList<?>) getWizards())
					.basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PMFPackage.APPLICATION__MAIN:
			return getMain();
		case PMFPackage.APPLICATION__DATA_MODEL_MANAGERS:
			return getDataModelManagers();
		case PMFPackage.APPLICATION__LIBRARIES:
			return getLibraries();
		case PMFPackage.APPLICATION__ALL_VIEW_PROFILES:
			return getAllViewProfiles();
		case PMFPackage.APPLICATION__ALL_SYSTEM_ACTIONS:
			return getAllSystemActions();
		case PMFPackage.APPLICATION__ALL_COMMANDS:
			return getAllCommands();
		case PMFPackage.APPLICATION__ALL_CONVERTERS:
			return getAllConverters();
		case PMFPackage.APPLICATION__ALL_VALIDATORS:
			return getAllValidators();
		case PMFPackage.APPLICATION__ALL_TYPES:
			return getAllTypes();
		case PMFPackage.APPLICATION__ALL_IMAGES:
			return getAllImages();
		case PMFPackage.APPLICATION__AUTHENTICATION:
			return getAuthentication();
		case PMFPackage.APPLICATION__MANDATORY_FIELD:
			if (resolve)
				return getMandatoryField();
			return basicGetMandatoryField();
		case PMFPackage.APPLICATION__WIZARDS:
			return getWizards();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PMFPackage.APPLICATION__MAIN:
			setMain((Container) newValue);
			return;
		case PMFPackage.APPLICATION__DATA_MODEL_MANAGERS:
			getDataModelManagers().clear();
			getDataModelManagers().addAll(
					(Collection<? extends DataModelManager>) newValue);
			return;
		case PMFPackage.APPLICATION__LIBRARIES:
			getLibraries().clear();
			getLibraries().addAll((Collection<? extends Library>) newValue);
			return;
		case PMFPackage.APPLICATION__AUTHENTICATION:
			setAuthentication((Authentication) newValue);
			return;
		case PMFPackage.APPLICATION__MANDATORY_FIELD:
			setMandatoryField((Validator) newValue);
			return;
		case PMFPackage.APPLICATION__WIZARDS:
			getWizards().clear();
			getWizards().addAll((Collection<? extends Wizard>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PMFPackage.APPLICATION__MAIN:
			setMain((Container) null);
			return;
		case PMFPackage.APPLICATION__DATA_MODEL_MANAGERS:
			getDataModelManagers().clear();
			return;
		case PMFPackage.APPLICATION__LIBRARIES:
			getLibraries().clear();
			return;
		case PMFPackage.APPLICATION__AUTHENTICATION:
			setAuthentication((Authentication) null);
			return;
		case PMFPackage.APPLICATION__MANDATORY_FIELD:
			setMandatoryField((Validator) null);
			return;
		case PMFPackage.APPLICATION__WIZARDS:
			getWizards().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PMFPackage.APPLICATION__MAIN:
			return main != null;
		case PMFPackage.APPLICATION__DATA_MODEL_MANAGERS:
			return dataModelManagers != null && !dataModelManagers.isEmpty();
		case PMFPackage.APPLICATION__LIBRARIES:
			return libraries != null && !libraries.isEmpty();
		case PMFPackage.APPLICATION__ALL_VIEW_PROFILES:
			return allViewProfiles != null && !allViewProfiles.isEmpty();
		case PMFPackage.APPLICATION__ALL_SYSTEM_ACTIONS:
			return allSystemActions != null && !allSystemActions.isEmpty();
		case PMFPackage.APPLICATION__ALL_COMMANDS:
			return allCommands != null && !allCommands.isEmpty();
		case PMFPackage.APPLICATION__ALL_CONVERTERS:
			return allConverters != null && !allConverters.isEmpty();
		case PMFPackage.APPLICATION__ALL_VALIDATORS:
			return allValidators != null && !allValidators.isEmpty();
		case PMFPackage.APPLICATION__ALL_TYPES:
			return allTypes != null && !allTypes.isEmpty();
		case PMFPackage.APPLICATION__ALL_IMAGES:
			return allImages != null && !allImages.isEmpty();
		case PMFPackage.APPLICATION__AUTHENTICATION:
			return authentication != null;
		case PMFPackage.APPLICATION__MANDATORY_FIELD:
			return mandatoryField != null;
		case PMFPackage.APPLICATION__WIZARDS:
			return wizards != null && !wizards.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validate(DiagnosticChain diagnostic,
			Map<Object, Object> context) {
		boolean valid = true;
		initGraph(this);
		List<List<Integer>> scComponents = getSCComponents(graph);
		StringBuffer stringBuffer = new StringBuffer();

		for (List<Integer> list : scComponents) {
			ArrayList<Integer> l = (ArrayList<Integer>) list;
			if (l.size() > 1) {
				stringBuffer.append("[");
				for (int i : l) {

					String dataForm = dataForms.get(i);
					stringBuffer.append(dataForm + " ");
					if (i < l.size())
						stringBuffer.append(",");
				}
				stringBuffer.append("] ");

			}

		}

		if (diagnostic != null) {
			if (sccComp.size() > 0) {
				valid = false;
				diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR,
						PMFValidator.DIAGNOSTIC_SOURCE,
						PMFValidator.DATAFORM__NO_CIRCULAR_CONTAINMENT,

						"Cycle referenced dataforms: "
								+ stringBuffer.toString(),
						new Object[] { this }));
			}
		}

		return valid;
	}

	/**
	 * MAIN function to get all strongly connected components
	 * 
	 * @param graph
	 * @return
	 * @generated NOT
	 */
	public List<List<Integer>> getSCComponents(Set<Integer>[] graph) {

		V = graph.length;
		this.graph = graph;
		low = new int[V];
		visited = new boolean[V];
		stack = new Stack<Integer>();
		sccComp = new ArrayList<List<Integer>>();

		for (int v = 0; v < V; v++) {
			if (!visited[v])
				dfs(v);
		}

		StringBuffer stringBuffer = new StringBuffer();
		for (Object list : sccComp.toArray()) {
			ArrayList<Integer> l = (ArrayList<Integer>) list;
			if (l.size() > 1) {
				for (Object i : l.toArray()) {
					int j = (Integer) i;
					String dataForm = dataForms.get(i);
					stringBuffer.append(dataForm + " ");
				}
				stringBuffer.append(";");
			}
		}

		return sccComp;
	}

	/**
	 * function dfs
	 * @generated NOT
	 * @param v
	 */
	public void dfs(int v) {
		low[v] = preCount++;
		visited[v] = true;
		stack.push(v);
		int min = low[v];
		for (int w : graph[v]) {
			if (!visited[w])
				dfs(w);
			if (low[w] < min)
				min = low[w];
		}
		if (min < low[v]) {
			low[v] = min;
			return;
		}
		List<Integer> component = new ArrayList<Integer>();
		int w;
		do {
			w = stack.pop();
			component.add(w);
			low[w] = V;
		} while (w != v);
		sccComp.add(component);
	}

	/**
	 * init the adjacent list of dataforms
	 * @param application
	 * @generated NOT
	 */
	public void initGraph(Application application) {
		int index = 0;
		for (Entry<DataType, DataFormFolder> dataFormFolder : application
				.getDataFormFolders()) {
			for (DataForm dataForm : dataFormFolder.getValue().getDataForms()) {
				dataForms.put(index, dataForm.getName());
				index++;
			}
		}
		graph = new Set[index];
		for (int i = 0; i < index; i++)
			graph[i] = new HashSet<Integer>();

		for (Entry<DataType, DataFormFolder> dataFormFolder : application
				.getDataFormFolders()) {
			/*************/
			// added by ksun
			List<ElementalDataForm> elementalDataForms = new ArrayList<ElementalDataForm>();
			EList<DataForm> dataForms = dataFormFolder.getValue()
					.getDataForms();
			for (DataForm dataForm : dataForms) {
				if (dataForm instanceof ElementalDataForm) {
					elementalDataForms.add((ElementalDataForm) dataForm);
				} else if (dataForm instanceof DataFormSelector) {
					elementalDataForms.addAll(((DataFormSelector) dataForm)
							.getElements());
				}
			}
			/*************/

			for (ElementalDataForm dataForm : elementalDataForms) {

				int dataFormIndex = getDataFormIndex(dataForm);

				List<DataItem> dataItems = dataForm.getChildren();
				if (dataItems != null && !dataItems.isEmpty())
					for (DataItem dataItem : dataItems) {
						// circularContext.clear();

						switch (dataItem.eClass().getClassifierID()) {
						case (PMFPackage.DATA_COLLECTION):

							DataCollection dataCollection = (DataCollection) dataItem;
							if (dataCollection.getDetail() != null) {
								int dataCollectionIndex = getDataFormIndex(dataCollection
										.getDetail());
								graph[dataFormIndex].add(dataCollectionIndex);
							}
							break;
						case (PMFPackage.DATA_ASSOCICATION):
							DataAssocication dataAssociation = (DataAssocication) dataItem;

							if (dataAssociation.getDataForm() != null) {
								int dataAssociationIndex = getDataFormIndex(dataAssociation
										.getDataForm());
								graph[dataFormIndex].add(dataAssociationIndex);
							}
							break;

						case (PMFPackage.DATA_INHERITANCE):
							DataInheritance dataInheritance = (DataInheritance) dataItem;
							if (dataInheritance.getDataForm() != null) {
								int dataInheritanceIndex = getDataFormIndex(dataInheritance
										.getDataForm());
								graph[dataFormIndex].add(dataInheritanceIndex);
							}
							break;
						}

					}

			}
		}
	}

	/**
	 * @param dataForm
	 * @return
	 * generated NOT
	 */
	public Integer getDataFormIndex(DataForm dataForm) {
		int index = 0;
		for (int formIndex : dataForms.keySet()) {
			if (dataForms.get(formIndex).equals(dataForm.getName())) {
				index = formIndex;
				break;
			}

		}
		return index;
	}

} // ApplicationImpl
