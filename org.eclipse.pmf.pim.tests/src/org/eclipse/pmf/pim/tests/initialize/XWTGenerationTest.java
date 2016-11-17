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
package org.eclipse.pmf.pim.tests.initialize;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import model.ModelFactory;
import model.Nationality;
import model.Person;

import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.egf.core.domain.RuntimePlatformResourceSet;
import org.eclipse.egf.model.domain.DomainViewpoint;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.egf.model.fcore.ViewpointContainer;
import org.eclipse.egf.producer.manager.FactoryComponentManagerFactory;
import org.eclipse.egf.producer.manager.IActivityManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.osgi.util.NLS;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.DataElement;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.DataItem;
import org.eclipse.pmf.pim.ElementalDataForm;
import org.eclipse.pmf.pim.PMFFactory;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.tests.AbstractProjectTest;
import org.eclipse.pmf.pim.tests.Activator;
import org.eclipse.pmf.pim.ui.Control;
import org.eclipse.pmf.pim.ui.Label;
import org.eclipse.pmf.pim.ui.UiFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.services.IServiceLocator;
import org.eclipse.xwt.XWT;
import org.osgi.framework.Bundle;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XWTGenerationTest extends AbstractProjectTest {
	// public static Test suite() {
	// return new TestSuite(XWTGenerationTest.class);
	// }
	private Bundle _bundle;

	public void testStyleWithUIControl() throws Exception {
		assertNotNull(Activator.getDefault());
		_bundle = Activator.getDefault().getBundle();
		assertNotNull(_bundle);
		ResourceSet resourceSet = new RuntimePlatformResourceSet();
		modelImport("tests.fcore");
		modelImport("tests.ctx");
		modelImport("styleUI.pmf");
		URI uri = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/tests.fcore");

		IFile modelFile1 = project.getFile("model/tests.fcore");
		assertTrue(modelFile1.exists());
		IFile modelFile2 = project.getFile("model/styleUI.pmf");
		assertTrue(modelFile2.exists());
		IFile modelFile = project.getFile("model/tests.ctx");
		assertTrue(modelFile.exists());
		// Load Resource
		Resource resource = resourceSet.getResource(uri, true);

		// Fetch Activity
		EObject eObject = resource.getContents().get(0);
		assertTrue(
				NLS.bind(
						"We Expected to find a ''FactoryComponent'' however we found ''{0}''", eObject.eClass().getName()), eObject instanceof Activity); //$NON-NLS-1$

		FactoryComponent PMFtoXWT_FC = (FactoryComponent) eObject;

		ViewpointContainer vc1 = PMFtoXWT_FC.getViewpointContainer();

		DomainViewpoint dv1 = (DomainViewpoint) vc1.getViewpoints().get(0);

		EMFDomain emfDomainModel = (EMFDomain) dv1.getDomains().get(0);
		URI uriPMF = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/tests.ctx");
		emfDomainModel.setUri(uriPMF);
		emfDomainModel
				.setHelperImplementation("org.eclipse.egf.domain.emf.EMFDomainHelper");

		EMFDomain emfDomainCodegen = (EMFDomain) dv1.getDomains().get(1);
		URI uriCodeGen = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/styleUI.pmf");
		emfDomainCodegen.setUri(uriCodeGen);
		emfDomainCodegen
				.setHelperImplementation("org.eclipse.egf.domain.emf.EMFDomainHelper");

		// Invoke FactoryComponent
		IActivityManager<FactoryComponent> manager = FactoryComponentManagerFactory
				.createProductionManager(_bundle, PMFtoXWT_FC);
		try {
			manager.initializeContext();
			manager.invoke(new NullProgressMonitor());
		} catch (Exception e) {
			return;
		} finally {
			try {
				manager.dispose();
			} catch (Exception e) {
				return;
			}
		}

		IWorkspaceRoot rootP = ResourcesPlugin.getWorkspace().getRoot();
		IProject projectP = rootP.getProject("testpersonproject");

		URL url1 = projectP
				.getFile("src/testpersonproject/model/PersonPersonView.xwt")
				.getLocationURI().toURL();
		IFile modelFile3 = projectP
				.getFile("src/testpersonproject/model/PersonPersonView.xwt");

		IFile modelFile4 = projectP.getFile("src/META-INF/MANIFEST.MF");

		Person person = ModelFactory.eINSTANCE.createPerson();
		person.setEmail("nvhoa@gmail.com");
		person.setNationality(Nationality.FR);
		person.setBirthday(new Date());
		person.setMarried(true);

		runTest(url1, person, new Runnable() {
			public void run() {
				checkDatabinding();
			}

			public void checkDatabinding() {
				Object element = XWT.findElementByName(root, "text email");
				assertTrue(element instanceof Text);
				Text text = (Text) element;
				assertEquals(text.getText(), "nvhoa@gmail.com");
			}
		});

		runTest(url1, new Runnable() {
			public void run() {
				checkStyleTextField();
				checkComboGeneration();
				checkHelpGeneration();
				

			}

			/**
			 * check the generation of the text field
			 * 
			 */
			public void checkStyleTextField() {
				Object element = XWT.findElementByName(root, "text email");
				assertTrue(element instanceof Text);
				Text text = (Text) element;
				assertEquals(text.getForeground().getRGB(), new RGB(53, 153,
						255));
				assertEquals(text.getBackground().getRGB(), new RGB(255, 153,
						53));
				assertEquals(text.getFont().getFontData()[0].getName(), "Arial");
				assertEquals(text.getFont().getFontData()[0].getHeight(), 12);
			}
			
			/**
			 * check the generation of the Help element
			 * 
			 */
			public void checkHelpGeneration() {
				Object element = XWT.findElementByName(root, "helpLink");
				assertTrue(element instanceof Link);
				
				// if the name of the Help element is empty, the name will be derived automatically, which contains the suffix _help
				Object autoNamedHelp = XWT.findElementByName(root, "nationality_help");
				assertTrue(autoNamedHelp instanceof org.eclipse.swt.widgets.Label);
			}

			/**
			 * check the generation of comboviewer in case the control UI is
			 * available attention: font not work with xwt comboviewer
			 */
			public void checkComboGeneration() {
				Object element = XWT.findElementByName(root,
						"nationality selector");
				assertTrue(element instanceof org.eclipse.jface.viewers.ComboViewer);
				org.eclipse.jface.viewers.ComboViewer comboViewer = (org.eclipse.jface.viewers.ComboViewer) element;
				assertEquals(comboViewer.getCombo().getBackground().getRGB(),
						new RGB(255, 255, 255));
				assertEquals(comboViewer.getCombo().getForeground().getRGB(),
						new RGB(0, 0, 0));
				assertEquals(comboViewer.getCombo().getFont().getFontData()[0]
						.getName(), "Lucida Grande");
				assertEquals(comboViewer.getCombo().getFont().getFontData()[0]
						.getHeight(), 11);
				String[] items = comboViewer.getCombo().getItems();
				assertTrue(items.length == 2);
				Object input = comboViewer.getInput();
				assertTrue(input instanceof WritableList);
				WritableList list = (WritableList) input;
				assertTrue(list.contains(Nationality.US));
				assertTrue(list.contains(Nationality.FR));
			}
		});
	}
	
	public void testimportModel() throws Exception {
		assertNotNull(Activator.getDefault());
		_bundle = Activator.getDefault().getBundle();
		assertNotNull(_bundle);
		ResourceSet resourceSet = new RuntimePlatformResourceSet();
		modelImport("tests.fcore");
		modelImport("tests.ctx");
		modelImport("styleUI.pmf");
		URI uri = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/tests.fcore");

		
		URI uriCodeGen = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/styleUI.pmf");
		
		
		ResourceSet resourceSet2 = new ResourceSetImpl();
		// Create a resource for this file.
		//
		Resource resource2 = resourceSet.getResource(uriCodeGen, true);
		
		Application application = (Application)resource2.getContents().get(0);
				
		IWorkbench wb = PlatformUI.getWorkbench();
 		    
		   IServiceLocator serviceLocator = PlatformUI.getWorkbench();
		  
		   
//		   ICommandService commandService = (ICommandService)serviceLocator.getService(ICommandService.class);
//		   try {
//			   org.eclipse.core.commands.Command command = commandService.getCommand("org.eclipse.pmf.emf.ui.importModel");
//			IHandler handler = commandService.getCommand("org.eclipse.pmf.emf.ui.importModel").getHandler();
//			((ImportModel)handler).setApplication(application);
//		   commandService.getCommand("org.eclipse.pmf.emf.ui.importModel").executeWithChecks(new ExecutionEvent());
//		   }
//		   catch (Exception exception) {
//		   }
	}

	public void testDateDataType() throws Exception {
		assertNotNull(Activator.getDefault());
		_bundle = Activator.getDefault().getBundle();
		assertNotNull(_bundle);
		ResourceSet resourceSet = new RuntimePlatformResourceSet();
		URI uri = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/tests.fcore");

		// Load Resource
		Resource resource = resourceSet.getResource(uri, true);

		// Fetch Activity
		EObject eObject = resource.getContents().get(0);
		assertTrue(
				NLS.bind(
						"We Expected to find a ''FactoryComponent'' however we found ''{0}''", eObject.eClass().getName()), eObject instanceof Activity); //$NON-NLS-1$

		FactoryComponent PMFtoXWT_FC = (FactoryComponent) eObject;

		ViewpointContainer vc1 = PMFtoXWT_FC.getViewpointContainer();

		DomainViewpoint dv1 = (DomainViewpoint) vc1.getViewpoints().get(0);

		EMFDomain emfDomainModel = (EMFDomain) dv1.getDomains().get(0);
		URI uriPMF = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/tests.ctx");
		emfDomainModel.setUri(uriPMF);
		emfDomainModel
				.setHelperImplementation("org.eclipse.egf.domain.emf.EMFDomainHelper");

		EMFDomain emfDomainCodegen = (EMFDomain) dv1.getDomains().get(1);
		URI uriCodeGen = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/DateTest.pmf");
		emfDomainCodegen.setUri(uriCodeGen);
		emfDomainCodegen
				.setHelperImplementation("org.eclipse.egf.domain.emf.EMFDomainHelper");

		// Invoke FactoryComponent
		IActivityManager<FactoryComponent> manager = FactoryComponentManagerFactory
				.createProductionManager(_bundle, PMFtoXWT_FC);
		try {
			manager.initializeContext();
			manager.invoke(new NullProgressMonitor());
		} catch (Exception e) {
			return;
		} finally {
			try {
				manager.dispose();
			} catch (Exception e) {
				return;
			}
		}

		IWorkspaceRoot rootP = ResourcesPlugin.getWorkspace().getRoot();
		IProject projectP = rootP.getProject("testpersonproject");

		URL url1 = projectP
				.getFile("src/testpersonproject/model/PersonPersonView.xwt")
				.getLocationURI().toURL();
		IFile modelFile3 = projectP
				.getFile("src/testpersonproject/model/PersonPersonView.xwt");

		IFile modelFile4 = projectP.getFile("src/META-INF/MANIFEST.MF");

		Person person = ModelFactory.eINSTANCE.createPerson();
		Date date = new Date("6/3/1984");
		person.setBirthday(date);
		runTest(url1, person, new Runnable() {
			public void run() {
				checkDateChooserDatabinding();
			}

			public void checkDateChooserDatabinding() {
				Object element = XWT.findElementByName(root, "birthday");
				assertTrue(element instanceof DateTime);
				DateTime text = (DateTime) element;
				assertEquals(text.getDay(), "6");
				assertEquals(text.getMonth(), "3");
				assertEquals(text.getYear(), "1984");
			}
		});

	}

	public void testDocumentationPropertiesView() throws Exception {
		assertNotNull(Activator.getDefault());
		_bundle = Activator.getDefault().getBundle();
		assertNotNull(_bundle);
		ResourceSet resourceSet = new RuntimePlatformResourceSet();
		URI uri = URI
				.createURI("platform:/plugin/org.eclipse.pmf.ui.tools.properties/egf/Properties.fcore");

		// Load Resource
		Resource resource = resourceSet.getResource(uri, true);

		// Fetch Activity
		EObject eObject = resource.getContents().get(0);
		assertTrue(
				NLS.bind(
						"We Expected to find a ''FactoryComponent'' however we found ''{0}''", eObject.eClass().getName()), eObject instanceof Activity); //$NON-NLS-1$

		FactoryComponent PMFtoXWT_FC = (FactoryComponent) eObject;

		ViewpointContainer vc1 = PMFtoXWT_FC.getViewpointContainer();

		DomainViewpoint dv1 = (DomainViewpoint) vc1.getViewpoints().get(1);

		EMFDomain emfDomainModel = (EMFDomain) dv1.getDomains().get(1);
		URI uriPMF = URI
				.createURI("platform:/plugin/org.eclipse.pmf.ui.tools.properties/model/CodeGen.ctx");
		emfDomainModel.setUri(uriPMF);
		emfDomainModel
				.setHelperImplementation("org.eclipse.egf.domain.emf.EMFDomainHelper");

		EMFDomain emfDomainCodegen = (EMFDomain) dv1.getDomains().get(0);
		URI uriCodeGen = URI
				.createURI("platform:/plugin/org.eclipse.pmf.ui.tools.properties/model/PMFPropertiesApplication.pmf");
		emfDomainCodegen.setUri(uriCodeGen);
		emfDomainCodegen
				.setHelperImplementation("org.eclipse.egf.domain.emf.EMFDomainHelper");

		// Invoke FactoryComponent
		IActivityManager<FactoryComponent> manager = FactoryComponentManagerFactory
				.createProductionManager(_bundle, PMFtoXWT_FC);
		try {
			manager.initializeContext();
			manager.invoke(new NullProgressMonitor());
		} catch (Exception e) {
			return;
		} finally {
			try {
				manager.dispose();
			} catch (Exception e) {
				return;
			}
		}

		IWorkspaceRoot rootP = ResourcesPlugin.getWorkspace().getRoot();
		IProject projectP = rootP.getProject("org.eclipse.pmf.ui.properties");

		IFile DocumentationFile = projectP
				.getFile("src/org/eclipse/pmf/ui/properties/views/DocumentationTabContentView.xwt");

		assertTrue(DocumentationFile.exists());

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document docPersonView = dBuilder.parse(DocumentationFile.getLocation()
				.toFile());
		docPersonView.getDocumentElement().normalize();
		{
			Node composite = docPersonView.getElementsByTagName(
					"r:RichTextEditor").item(0);
			if (composite.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) composite;
				assertEquals(element.getAttribute("x:name"), "description");

			}

		}

	}

	public void testStyleWithoutUIControl() throws Exception {
		assertNotNull(Activator.getDefault());
		_bundle = Activator.getDefault().getBundle();
		assertNotNull(_bundle);
		ResourceSet resourceSet = new RuntimePlatformResourceSet();
		modelImport("tests.fcore");
		modelImport("tests.ctx");
		modelImport("styleNonUI.pmf");
		URI uri = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/tests.fcore");

		IFile modelFile1 = project.getFile("model/tests.fcore");
		assertTrue(modelFile1.exists());
		IFile modelFile2 = project.getFile("model/styleNonUI.pmf");
		assertTrue(modelFile2.exists());
		IFile modelFile = project.getFile("model/tests.ctx");
		assertTrue(modelFile.exists());
		// Load Resource
		Resource resource = resourceSet.getResource(uri, true);

		// Fetch Activity
		EObject eObject = resource.getContents().get(0);
		assertTrue(
				NLS.bind(
						"We Expected to find a ''FactoryComponent'' however we found ''{0}''", eObject.eClass().getName()), eObject instanceof Activity); //$NON-NLS-1$

		FactoryComponent PMFtoXWT_FC = (FactoryComponent) eObject;

		ViewpointContainer vc1 = PMFtoXWT_FC.getViewpointContainer();

		DomainViewpoint dv1 = (DomainViewpoint) vc1.getViewpoints().get(0);

		EMFDomain emfDomainModel = (EMFDomain) dv1.getDomains().get(0);
		URI uriPMF = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/tests.ctx");
		emfDomainModel.setUri(uriPMF);
		emfDomainModel
				.setHelperImplementation("org.eclipse.egf.domain.emf.EMFDomainHelper");

		EMFDomain emfDomainCodegen = (EMFDomain) dv1.getDomains().get(1);
		URI uriCodeGen = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/styleNonUI.pmf");
		emfDomainCodegen.setUri(uriCodeGen);
		emfDomainCodegen
				.setHelperImplementation("org.eclipse.egf.domain.emf.EMFDomainHelper");

		// Invoke FactoryComponent
		IActivityManager<FactoryComponent> manager = FactoryComponentManagerFactory
				.createProductionManager(_bundle, PMFtoXWT_FC);
		try {
			manager.initializeContext();
			manager.invoke(new NullProgressMonitor());
		} catch (Exception e) {
			return;
		} finally {
			try {
				manager.dispose();
			} catch (Exception e) {
				return;
			}
		}

		IWorkspaceRoot rootP = ResourcesPlugin.getWorkspace().getRoot();
		IProject projectP = rootP.getProject("testpersonproject");

		URL url1 = projectP
				.getFile("src/testpersonproject/model/PersonPersonView.xwt")
				.getLocationURI().toURL();
		IFile modelFile3 = projectP
				.getFile("src/testpersonproject/model/PersonPersonView.xwt");

		IFile modelFile4 = projectP.getFile("src/META-INF/MANIFEST.MF");

		runTest(url1, new Runnable() {
			public void run() {
				checkStringtoDefaultTextField();
				checkEnumerationtoComboViewer();
				// checkBooleantoBooleanButton();
			}

			/**
			 * check the generation of the default text field in case of absence
			 * of the control UI
			 */
			public void checkStringtoDefaultTextField() {
				Object element = XWT.findElementByName(root, "email");

				assertTrue(element instanceof Text);
				Text text = (Text) element;
				assertEquals(text.getBackground().getRGB(), new RGB(255, 255,
						255));
				assertEquals(text.getForeground().getRGB(), new RGB(0, 0, 0));
				assertEquals(text.getFont().getFontData()[0].getName(),
						"Lucida Grande");
				assertEquals(text.getFont().getFontData()[0].getHeight(), 11);
			}

			/**
			 * check the generation of comboviewer in case the control UI is
			 * available
			 * 
			 */
			public void checkEnumerationtoComboViewer() {
				Object element = XWT.findElementByName(root, "nationality");
				assertTrue(element instanceof org.eclipse.jface.viewers.ComboViewer);
				org.eclipse.jface.viewers.ComboViewer comboViewer = (org.eclipse.jface.viewers.ComboViewer) element;
				assertEquals(comboViewer.getCombo().getBackground().getRGB(),
						new RGB(255, 255, 255));
				assertEquals(comboViewer.getCombo().getForeground().getRGB(),
						new RGB(0, 0, 0));
				assertEquals(comboViewer.getCombo().getFont().getFontData()[0]
						.getName(), "Lucida Grande");
				assertEquals(comboViewer.getCombo().getFont().getFontData()[0]
						.getHeight(), 11);
				String[] items = comboViewer.getCombo().getItems();
				assertTrue(items.length == 2);
				Object input = comboViewer.getInput();
				assertTrue(input instanceof WritableList);
				WritableList list = (WritableList) input;
				assertTrue(list.contains(Nationality.US));
				assertTrue(list.contains(Nationality.FR));
			}

			public void checkBooleantoBooleanButton() {
				Object element = XWT.findElementByName(root, "married");
				assertTrue(element instanceof Button);
				Button button = (Button) element;
				assertEquals(button.getBackground().getRGB(), new RGB(255, 255,
						255));
				assertEquals(button.getStyle(), SWT.CHECK);
				assertEquals(button.getForeground().getRGB(), new RGB(0, 0, 0));
				assertEquals(button.getFont().getFontData()[0].getName(),
						"Lucida Grande");
				assertEquals(button.getFont().getFontData()[0].getHeight(), 11);

			}
		});
	}

	public void testNamespace() throws Exception {
		assertNotNull(Activator.getDefault());
		_bundle = Activator.getDefault().getBundle();
		assertNotNull(_bundle);

		ResourceSet resourceSet = new RuntimePlatformResourceSet();
		URI uri = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/tests.fcore");

		// Load Resource
		Resource resource = resourceSet.getResource(uri, true);

		// Fetch Activity
		EObject eObject = resource.getContents().get(0);
		assertTrue(
				NLS.bind(
						"We Expected to find a ''FactoryComponent'' however we found ''{0}''", eObject.eClass().getName()), eObject instanceof Activity); //$NON-NLS-1$

		FactoryComponent PMFtoXWT_FC = (FactoryComponent) eObject;

		ViewpointContainer vc1 = PMFtoXWT_FC.getViewpointContainer();

		DomainViewpoint dv1 = (DomainViewpoint) vc1.getViewpoints().get(0);

		EMFDomain emfDomainModel = (EMFDomain) dv1.getDomains().get(0);
		URI uriPMF = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/tests.ctx");
		emfDomainModel.setUri(uriPMF);
		emfDomainModel
				.setHelperImplementation("org.eclipse.egf.domain.emf.EMFDomainHelper");

		EMFDomain emfDomainCodegen = (EMFDomain) dv1.getDomains().get(1);
		URI uriCodeGen = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/styleUI.pmf");
		emfDomainCodegen.setUri(uriCodeGen);
		emfDomainCodegen
				.setHelperImplementation("org.eclipse.egf.domain.emf.EMFDomainHelper");

		// Invoke FactoryComponent
		IActivityManager<FactoryComponent> manager = FactoryComponentManagerFactory
				.createProductionManager(_bundle, PMFtoXWT_FC);
		try {
			manager.initializeContext();
			manager.invoke(new NullProgressMonitor());
		} catch (Exception e) {
			return;
		} finally {
			try {
				manager.dispose();
			} catch (Exception e) {
				return;
			}
		}

		IWorkspaceRoot rootP = ResourcesPlugin.getWorkspace().getRoot();
		IProject projectP = rootP.getProject("testpersonproject");

		URL urlPersonView = projectP
				.getFile("src/testpersonproject/model/PersonPersonView.xwt")
				.getLocationURI().toURL();
		IFile PersonVewFile = projectP
				.getFile("src/testpersonproject/model/PersonPersonView.xwt");
		assertTrue(PersonVewFile.exists());

		IFile CompanyViewFile = projectP
				.getFile("src/testpersonproject/model/CompanyCompanyView.xwt");
		assertTrue(CompanyViewFile.exists());

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document docPersonView = dBuilder.parse(PersonVewFile.getLocation()
				.toFile());
		docPersonView.getDocumentElement().normalize();
		{
			Node composite = docPersonView.getElementsByTagName("Composite")
					.item(0);
			if (composite.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) composite;
				assertEquals(element.getAttribute("xmlns"),
						"http://www.eclipse.org/xwt/presentation");
				assertEquals(element.getAttribute("xmlns:x"),
						"http://www.eclipse.org/xwt");
				assertEquals(element.getAttribute("xmlns:m"),
						"clr-namespace:testpersonproject.model");
				assertEquals(element.getAttribute("xmlns:e"),
						"clr-namespace:org.eclipse.pmf.pim.tests.initialize");
				assertEquals(element.getAttribute("xmlns:n"),
						"clr-namespace:model");
				assertEquals(element.getAttribute("x:Class"),
						"testpersonproject.model.PersonPersonView");
				assertEquals(element.getAttributes().getLength(), 8);
			}

		}

		// test CompanyView
		Document docCompanyView = dBuilder.parse(CompanyViewFile.getLocation()
				.toFile());
		docCompanyView.getDocumentElement().normalize();
		{
			Node composite = docCompanyView.getElementsByTagName("Composite")
					.item(0);
			if (composite.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) composite;
				assertEquals(element.getAttribute("xmlns"),
						"http://www.eclipse.org/xwt/presentation");
				assertEquals(element.getAttribute("xmlns:x"),
						"http://www.eclipse.org/xwt");
				assertEquals(element.getAttribute("xmlns:m"),
						"clr-namespace:testpersonproject.model");
				assertEquals(element.getAttributes().getLength(), 5);
			}

		}
	}

	public void testDataInheritance_Hyperlink() throws Exception {
		assertNotNull(Activator.getDefault());
		_bundle = Activator.getDefault().getBundle();
		assertNotNull(_bundle);

		ResourceSet resourceSet = new RuntimePlatformResourceSet();
		URI uri = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/tests.fcore");

		// Load Resource
		Resource resource = resourceSet.getResource(uri, true);

		// Fetch Activity
		EObject eObject = resource.getContents().get(0);
		assertTrue(
				NLS.bind(
						"We Expected to find a ''FactoryComponent'' however we found ''{0}''", eObject.eClass().getName()), eObject instanceof Activity); //$NON-NLS-1$

		FactoryComponent PMFtoXWT_FC = (FactoryComponent) eObject;

		ViewpointContainer vc1 = PMFtoXWT_FC.getViewpointContainer();

		DomainViewpoint dv1 = (DomainViewpoint) vc1.getViewpoints().get(0);

		EMFDomain emfDomainModel = (EMFDomain) dv1.getDomains().get(0);
		URI uriPMF = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/tests.ctx");
		emfDomainModel.setUri(uriPMF);
		emfDomainModel
				.setHelperImplementation("org.eclipse.egf.domain.emf.EMFDomainHelper");

		EMFDomain emfDomainCodegen = (EMFDomain) dv1.getDomains().get(1);
		URI uriCodeGen = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/styleUI.pmf");
		emfDomainCodegen.setUri(uriCodeGen);
		emfDomainCodegen
				.setHelperImplementation("org.eclipse.egf.domain.emf.EMFDomainHelper");

		// Invoke FactoryComponent
		IActivityManager<FactoryComponent> manager = FactoryComponentManagerFactory
				.createProductionManager(_bundle, PMFtoXWT_FC);
		try {
			manager.initializeContext();
			manager.invoke(new NullProgressMonitor());
		} catch (Exception e) {
			return;
		} finally {
			try {
				manager.dispose();
			} catch (Exception e) {
				return;
			}
		}

		IWorkspaceRoot rootP = ResourcesPlugin.getWorkspace().getRoot();
		IProject projectP = rootP.getProject("testpersonproject");

		URL urlPersonView = projectP
				.getFile("src/testpersonproject/model/PersonPersonView.xwt")
				.getLocationURI().toURL();
		IFile PersonVewFile = projectP
				.getFile("src/testpersonproject/model/PersonPersonView.xwt");
		assertTrue(PersonVewFile.exists());

		IFile CompanyViewFile = projectP
				.getFile("src/testpersonproject/model/CompanyCompanyView.xwt");
		assertTrue(CompanyViewFile.exists());

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document docPersonView = dBuilder.parse(PersonVewFile.getLocation()
				.toFile());
		docPersonView.getDocumentElement().normalize();

		// test HyperLink pattern
		{
			Node composite = docPersonView.getElementsByTagName("Link").item(0);
			if (composite.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) composite;
				assertEquals(element.getAttribute("text"), "www.soyatec.org");
			}
		}

		// test DataInheritance
		{
			Node composite = docPersonView.getElementsByTagName("Composite")
					.item(0);
			if (composite.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) composite;
				assertEquals(element.getAttribute("xmlns"),
						"http://www.eclipse.org/xwt/presentation");
				assertEquals(element.getAttribute("xmlns:x"),
						"http://www.eclipse.org/xwt");
				assertEquals(element.getAttribute("xmlns:m"),
						"clr-namespace:testpersonproject.model");
				assertEquals(element.getAttribute("xmlns:e"),
						"clr-namespace:org.eclipse.pmf.pim.tests.initialize");
				assertEquals(element.getAttribute("xmlns:n"),
						"clr-namespace:model");
				assertEquals(element.getAttribute("x:Class"),
						"testpersonproject.model.PersonPersonView");
				assertEquals(element.getAttributes().getLength(), 8);
			}

		}

		// test CompanyView
		Document docCompanyView = dBuilder.parse(CompanyViewFile.getLocation()
				.toFile());
		docCompanyView.getDocumentElement().normalize();
		{
			Node composite = docCompanyView.getElementsByTagName("Composite")
					.item(0);
			if (composite.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) composite;
				assertEquals(element.getAttribute("xmlns"),
						"http://www.eclipse.org/xwt/presentation");
				assertEquals(element.getAttribute("xmlns:x"),
						"http://www.eclipse.org/xwt");
				assertEquals(element.getAttribute("xmlns:m"),
						"clr-namespace:testpersonproject.model");
				assertEquals(element.getAttributes().getLength(), 5);
			}

		}
	}

	public void testLabelInitialization() throws Exception {
		assertNotNull(Activator.getDefault());
		_bundle = Activator.getDefault().getBundle();
		assertNotNull(_bundle);
		// uri to get the pmf genmodel
		URI uriGen = URI
				.createURI(
						"platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/examples-validators.genmodel",
						true);
		try {

			Application rootObject = (Application) PMFFactory.eINSTANCE
					.createApplication();
			// Create a resource set
			//
			ResourceSet resourceSet = new ResourceSetImpl();
			// Create a resource for this file.
			//
			Resource resource = resourceSet.getResource(uriGen, true);

			// Import in Application
			rootObject.importModel(resource);
			rootObject.setName("testpersonproject");

			for (DataType dataType : rootObject.getTypes()) {
				DataForm dataForm = rootObject.getDataFormFolder(dataType)
						.getDefaultDataForm();
				for (DataElement dataElement : ((ElementalDataForm) dataForm).getChildren()) {
					if (dataElement instanceof DataItem) {
						Control label = ((DataItem) dataElement).getLabel();
						if (label instanceof Label) {
							assertTrue(((Label) label).getText() != null);
							assertTrue(((Label) label).getName().contains(
									"_label"));
						}
					}
				}
			}
			// Get the URI of the model file.
			modelImport("TestLabelInitialisation.pmf");

			IFile modelFile1 = project
					.getFile("model/TestLabelInitialisation.pmf");
			//

			// Create a resource for this file.
			//
			ResourceSet resourceSet1 = new ResourceSetImpl();

			Resource resource1 = resourceSet1.getResource(
					org.eclipse.emf.common.util.URI.createURI(modelFile1
							.getLocationURI().toString()), true);

			// Add the initial model object to the contents.
			//
			// resource1.getContents().remove(0);
			resource1.getContents().add(rootObject);
			// save the imported data in file
			resource1.save(Collections.EMPTY_MAP);
		} catch (IOException ex) {
			EcorePlugin.INSTANCE.log(ex);
		}

		// ResourceSet resourceSet = new RuntimePlatformResourceSet();
		// URI uri = URI
		// .createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/tests.fcore");
		//
		// // Load Resource
		// Resource resource = resourceSet.getResource(uri, true);
		//
		// // Fetch Activity
		// EObject eObject = resource.getContents().get(0);
		// assertTrue(
		// NLS.bind(
		//						"We Expected to find a ''FactoryComponent'' however we found ''{0}''", eObject.eClass().getName()), eObject instanceof Activity); //$NON-NLS-1$
		//
		// FactoryComponent PMFtoXWT_FC = (FactoryComponent) eObject;
		//
		// ViewpointContainer vc1 = PMFtoXWT_FC.getViewpointContainer();
		//
		// DomainViewpoint dv1 = (DomainViewpoint) vc1.getViewpoints().get(0);
		//
		// EMFDomain emfDomainModel = (EMFDomain) dv1.getDomains().get(0);
		// URI uriPMF = URI
		// .createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/tests.ctx");
		// emfDomainModel.setUri(uriPMF);
		// emfDomainModel
		// .setHelperImplementation("org.eclipse.egf.domain.emf.EMFDomainHelper");
		//
		// EMFDomain emfDomainCodegen = (EMFDomain) dv1.getDomains().get(1);
		// URI fileURI = org.eclipse.emf.common.util.URI.createURI(project
		// .getFile("model/TestLabelInitialisation.pmf").getLocationURI()
		// .toString(), true);
		// emfDomainCodegen.setUri(fileURI);
		// emfDomainCodegen
		// .setHelperImplementation("org.eclipse.egf.domain.emf.EMFDomainHelper");
		//
		// // Invoke FactoryComponent
		// IActivityManager<FactoryComponent> manager =
		// FactoryComponentManagerFactory
		// .createProductionManager(_bundle, PMFtoXWT_FC);
		// try {
		// manager.initializeContext();
		// manager.invoke(new NullProgressMonitor());
		// } catch (Exception e) {
		// return;
		// } finally {
		// try {
		// manager.dispose();
		// } catch (Exception e) {
		// return;
		// }
		// }
		//
		// IWorkspaceRoot rootP = ResourcesPlugin.getWorkspace().getRoot();
		// IProject projectP = rootP.getProject("testpersonproject");
		//
		// URL url1 = projectP
		// .getFile("src/testpersonproject/model/PersonView.xwt")
		// .getLocationURI().toURL();
		// IFile modelFile3 = projectP
		// .getFile("src/testpersonproject/model/PersonView.xwt");
		//
		// IFile modelFile4 = projectP.getFile("src/META-INF/MANIFEST.MF");
		//
		// runTest(url1, new Runnable() {
		// public void run() {
		// checkLabel();
		// }
		//
		// public void checkLabel() {
		// // TODO Auto-generated method stub
		// Object element = XWT.findElementByName(root, "emailLabel");
		//
		// assertTrue(element instanceof Label);
		// Label text = (Label) element;
		// assertEquals(text.getText(), "emailsdd");
		// }
		// });

	}

	public void testEventManagement() throws Exception {
		assertNotNull(Activator.getDefault());
		_bundle = Activator.getDefault().getBundle();
		assertNotNull(_bundle);
		ResourceSet resourceSet = new RuntimePlatformResourceSet();
		modelImport("tests.fcore");
		modelImport("tests.ctx");
		modelImport("testHelpElement.pmf");
		URI uri = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/tests.fcore");

		
		URI uriCodeGen = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/testHelpElement.pmf");
		
		ResourceSet resourceSet2 = new ResourceSetImpl();
		// Create a resource for this file.
		//
		Resource resource = resourceSet.getResource(uriCodeGen, true);
		
		Application application = (Application)resource.getContents().get(0);
		
		assertEquals(application.getLibraries().size(), 1);
		org.eclipse.pmf.pim.ui.Button button = UiFactory.eINSTANCE.createButton();
		
		assertEquals(application.getUIEvents(button.eClass()).size(), 4);
				
	}
	
	
	private static String getValue(String tag, Element element) {
		NodeList nodes = element.getElementsByTagName(tag).item(0)
				.getChildNodes();
		Node node = (Node) nodes.item(0);
		return node.getNodeValue();
	}

	public void modelImport(String fileName) {
		try {
			InputStream ecore = ResourceFileCreationTest.class
					.getResourceAsStream(fileName);
			if (ecore == null) {
				throw new RuntimeException(
						"Need to remove the ecore from Windows->Preferences->Java->Compiler->Building->Filtered Resources");
			}
			int size = ecore.available();

			copyFile(project, ecore, new Path("model").append(fileName));
			IFile modelFile = project.getFile("model/" + fileName);
			assertTrue(modelFile.exists());
			assertFalse(modelFile.isLinked());
			assertTrue(modelFile.isAccessible());
			assertEquals(size, modelFile.getContents().available());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}