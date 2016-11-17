/******************************************************************************* 
 * Copyright (c) 2006, 2016 Soyatec (http://www.soyatec.com) and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Soyatec - initial API and implementation 
 *******************************************************************************/ 

package org.eclipse.pmf.updatepmfmodel.handlers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.Library;
import org.eclipse.pmf.pim.PMFFactory;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.Validator;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.impl.EClassToEventEntryMapImpl;
import org.eclipse.pmf.pim.transformation.CodeGenContext;
import org.eclipse.pmf.pim.transformation.TransformationFactory;
import org.eclipse.pmf.pim.ui.Button;
import org.eclipse.pmf.pim.ui.Container;
import org.eclipse.pmf.pim.ui.PropertiesPart;
import org.eclipse.pmf.pim.ui.PropertyTab;
import org.eclipse.pmf.pim.ui.UIEvent;
import org.eclipse.pmf.pim.ui.UiFactory;
import org.eclipse.pmf.pim.ui.UiPackage;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class updateHandler extends AbstractHandler {

	/**
	 * The constructor.
	 */
	public updateHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// the place where the .ctx and .plb will be stocked
		String targetURI = "";

		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				HandlerUtil.getActiveShell(event), ResourcesPlugin
						.getWorkspace().getRoot(), false,
				"Select new file container");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				targetURI = result[0].toString();
			}
		}

		// uri to get the pmf genmodel
		URI uri = URI
				.createURI(
						"platform:/plugin/org.eclipse.pmf.pim/model/pmf.genmodel",
						true);
		try {

			Application rootObject = (Application) PMFFactory.eINSTANCE
					.createApplication();
			// Create a resource set
			//
			ResourceSet resourceSet = new ResourceSetImpl();
			// Create a resource for this file.
			//
			Resource resource = resourceSet.getResource(uri, true);

			// Import in Application
			rootObject.importModel(resource);

			// update the pmf model
			updatePMFModel(rootObject);

			// create the codegencontext for XWT
			createCodeGenContextForXWT(targetURI, "CodeGen.ctx",
					rootObject.getId());
			// create a library for XWT
			Library libObject = addLibraryXWT(targetURI, "Application.plb",
					rootObject.getId());
			Library libObjectEvents = addLibraryEvent(targetURI, "System.plb",
					rootObject.getId());

			rootObject.getLibraries().add(libObject);
			rootObject.getLibraries().add(libObjectEvents);
			// Get the URI of the model file.
			//
			URI fileURI = URI.createPlatformResourceURI(targetURI
					+ "/Application.pmf", true);

			// Create a resource for this file.
			//
			ResourceSet resourceSet1 = new ResourceSetImpl();

			Resource resource1 = resourceSet1.createResource(fileURI);

			// Add the initial model object to the contents.
			//
			resource1.getContents().add(rootObject);
			// save the imported data in file
			resource1.save(Collections.EMPTY_MAP);
		} catch (IOException ex) {
			EcorePlugin.INSTANCE.log(ex);
		}
		return null;
	}

	/**
	 * create the library for XWT
	 * 
	 * @param path
	 *            : where the library will be stocked
	 * @param fileName
	 *            : name of the library file
	 * @param rootId
	 *            : to determine the id of the resource
	 * @return
	 * @throws IOException
	 */
	protected Library addLibraryXWT(String path, String fileName, String rootId)
			throws IOException {

		Library libObject = (Library) PMFFactory.eINSTANCE.createLibrary();
		libObject.setName("XWT Library");
		List<Validator> validators = new ArrayList<Validator>();

		Validator integerValidator = PMFFactory.eINSTANCE.createValidator();
		integerValidator.setId(rootId + ".validators" + ".IntegerValidator");
		integerValidator.setName("IntegerValidator");
		validators.add(integerValidator);

		Validator floatValidator = PMFFactory.eINSTANCE.createValidator();
		floatValidator.setId(rootId + ".validators" + ".FloatValidator");
		floatValidator.setName("FloatValidator");
		validators.add(floatValidator);

		Validator emailValidator = PMFFactory.eINSTANCE.createValidator();
		emailValidator.setId(rootId + ".validators" + ".EmailValidator");
		emailValidator.setName("EmailValidator");
		validators.add(emailValidator);

		Validator regexValidator = PMFFactory.eINSTANCE.createValidator();
		regexValidator.setId(rootId + ".validators" + ".RegexValidator");
		regexValidator.setName("RegexValidator");
		validators.add(regexValidator);

		libObject
				.eSet(PMFPackage.eINSTANCE.getLibrary_Validators(), validators);

		URI fileURI = URI
				.createPlatformResourceURI(path + "/" + fileName, true);

		// Create a resource for this file.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		Resource resource = resourceSet.createResource(fileURI);

		resource.getContents().add(libObject);

		resource.save(Collections.EMPTY_MAP);

		return libObject;

	}

	/**
	 * create a library, which contains the basic events
	 * 
	 * @param path
	 * @param fileName
	 * @param rootId
	 * @return
	 * @throws IOException
	 */
	protected Library addLibraryEvent(String path, String fileName,
			String rootId) throws IOException {

		/* create a library for bringing initial events */
		Library libObject = (Library) PMFFactory.eINSTANCE.createLibrary();
		libObject.setName("System");

		EMap<EClass, EList<UIEvent>> uiEventsMap = new EcoreEMap<EClass, EList<UIEvent>>(
				PMFPackage.Literals.ECLASS_TO_EVENT_ENTRY_MAP,
				EClassToEventEntryMapImpl.class, (InternalEObject) libObject,
				PMFPackage.LIBRARY__EVENTS);

		/* add the initial events for the Button type */
		EList<UIEvent> uiButtonEvents = new BasicEList<UIEvent>();

		Button button = UiFactory.eINSTANCE.createButton();
		EClass eButton = button.eClass();
		UIEvent clickEvent = UiFactory.eINSTANCE.createUIEvent();
		clickEvent.setName("Click");
		clickEvent.setId("click");

		uiButtonEvents.add(clickEvent);

		uiEventsMap.put(eButton, uiButtonEvents);

	
		/* add the initial events for the UIElement type */
		EList<UIEvent> uiUIElementEvents = new BasicEList<UIEvent>();

		EClass eUIElement = (EClass)UiPackage.eINSTANCE.getEClassifier("UIElement");
		
		UIEvent exposeEvent = UiFactory.eINSTANCE.createUIEvent();
		exposeEvent.setName("Expose");
		exposeEvent.setId("Expose");
		UIEvent mouseInEvent = UiFactory.eINSTANCE.createUIEvent();
		mouseInEvent.setName("MouseIn");
		mouseInEvent.setId("MouseIn");
		UIEvent mouseOutEvent = UiFactory.eINSTANCE.createUIEvent();
		mouseOutEvent.setName("MouseOut");
		mouseOutEvent.setId("MouseOut");
		
		uiUIElementEvents.add(exposeEvent);
		uiUIElementEvents.add(mouseInEvent);
		uiUIElementEvents.add(mouseOutEvent);

		uiEventsMap.put(eUIElement, uiUIElementEvents);

		/* add the initial events for the List type */
		EList<UIEvent> uiListEvents = new BasicEList<UIEvent>();

		EClass eList = (EClass)UiPackage.eINSTANCE.getEClassifier("ListView");
		UIEvent selectionEvent = UiFactory.eINSTANCE.createUIEvent();
		selectionEvent.setName("selection");
		selectionEvent.setId("selection");
		uiListEvents.add(selectionEvent);
		
		uiEventsMap.put(eList, uiListEvents);
		
		/* add the initial events for the Text type */
		EList<UIEvent> uiTextEvents = new BasicEList<UIEvent>();

		EClass eText = (EClass)UiPackage.eINSTANCE.getEClassifier("Text");
		UIEvent focusInEvent = UiFactory.eINSTANCE.createUIEvent();
		focusInEvent.setName("focusIn");
		focusInEvent.setId("focusIn");
		UIEvent focusOutEvent = UiFactory.eINSTANCE.createUIEvent();
		focusOutEvent.setName("focusOut");
		focusOutEvent.setId("focusOut");
		
		uiTextEvents.add(focusInEvent);
		uiTextEvents.add(focusOutEvent);
		
		uiEventsMap.put(eText, uiTextEvents);
		
		/* update the events of the library */
		libObject.eSet(PMFPackage.Literals.LIBRARY__EVENTS, uiEventsMap.map());
		
		/* save the library */
		URI fileURI = URI
				.createPlatformResourceURI(path + "/" + fileName, true);

		// Create a resource for this file.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		Resource resource = resourceSet.createResource(fileURI);

		resource.getContents().add(libObject);

		resource.save(Collections.EMPTY_MAP);

		return libObject;
	}

	/**
	 * create codegencontext for XWT
	 * 
	 * @param path
	 * @param fileName
	 * @param rootId
	 *            : to determine the path and the id of the physical resource
	 * @throws IOException
	 */
	protected void createCodeGenContextForXWT(String path, String fileName,
			String rootId) throws IOException {

		CodeGenContext codegenContext = TransformationFactory.eINSTANCE
				.createCodeGenContext();

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(rootId);
		stringBuffer.append(".validators");
		stringBuffer.append(".IntegerValidator");
		// Add new Validator.
		codegenContext.getValidatorMap().put(stringBuffer.toString(),
				stringBuffer.toString());

		stringBuffer.replace(0, stringBuffer.length(), "");
		stringBuffer.append(rootId);
		stringBuffer.append(".validators");
		stringBuffer.append(".FloatValidator");
		// Add new Validator.
		codegenContext.getValidatorMap().put(stringBuffer.toString(),
				stringBuffer.toString());

		stringBuffer.replace(0, stringBuffer.length(), "");
		stringBuffer.append(rootId);
		stringBuffer.append(".validators");
		stringBuffer.append(".EmailValidator");
		// Add new Validator.
		codegenContext.getValidatorMap().put(stringBuffer.toString(),
				stringBuffer.toString());

		stringBuffer.replace(0, stringBuffer.length(), "");
		stringBuffer.append(rootId);
		stringBuffer.append(".validators");
		stringBuffer.append(".RegexValidator");
		// Add new Validator.
		codegenContext.getValidatorMap().put(stringBuffer.toString(),
				stringBuffer.toString());

		URI fileURI = URI
				.createPlatformResourceURI(path + "/" + fileName, true);

		// Create a resource for this file.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		Resource resource = resourceSet.createResource(fileURI);

		resource.getContents().add(codegenContext);

		resource.save(Collections.EMPTY_MAP);

	}

	protected void updatePMFModel(Application app) {

		// set the basic properties
		app.setName("org.eclipse.pmf.ui.properties");
		app.setId("org.eclipse.pmf.ui.properties");
		app.setDescription("PMF Properties View");

		// the graphical container of the prperties view
		Container container = UiFactory.eINSTANCE.createContainer();
		container.setEnabled(true);
		container.setVisible(true);

		// set the properties part for the properties view
		List<PropertiesPart> propertiesParts = new ArrayList<PropertiesPart>();
		PropertiesPart propertiesPart = UiFactory.eINSTANCE
				.createPropertiesPart();
		propertiesPart.setEnabled(true);
		propertiesPart.setVisible(true);
		propertiesPart.setName("PMF Properties");
		// set the tabs for the properties tabs
		PropertyTab dataBindingTab = UiFactory.eINSTANCE.createPropertyTab();
		PropertyTab documentTab = UiFactory.eINSTANCE.createPropertyTab();
		dataBindingTab.setId("dataBinding");
		dataBindingTab.setName("Databinding");
		documentTab.setId("documentation");
		documentTab.setName("Documentation");
		// search the PMFObject datatype
		DataType typePMFObject = null;
		for (DataType type : app.getAllTypes()) {
			if ("PMFObject".equals(type.getName())) {
				typePMFObject = type;
				break;
			}
		}
		// search the dataform of the PMFObject datatype
		DataForm dataFormPMFObject = app.getDataFormFolder(typePMFObject)
				.getDefaultDataForm();
		documentTab.setContent(dataFormPMFObject);

		// set the tabs for the propertiesPart
		propertiesPart.getTabs().add(dataBindingTab);
		propertiesPart.getTabs().add(documentTab);
		propertiesParts.add(propertiesPart);
		// set the propertiesPart to the container
		container.eSet(UiPackage.eINSTANCE.getPropertiesPart_Tabs(),
				propertiesParts);
		// set the graphical container for the properties view
		app.setMain(container);

	}
}
