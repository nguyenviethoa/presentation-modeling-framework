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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.pmf.emf.EMFType;
import org.eclipse.pmf.emf.PEMFFactory;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.Command;
import org.eclipse.pmf.pim.DataConverter;
import org.eclipse.pmf.pim.Library;
import org.eclipse.pmf.pim.PMFFactory;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.SystemAction;
import org.eclipse.pmf.pim.Validator;
import org.eclipse.pmf.pim.ViewProfile;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.exception.PMFException;
import org.eclipse.pmf.pim.ui.Image;
import org.eclipse.pmf.pim.ui.UiFactory;
import org.junit.Before;
import org.junit.Test;

public class ApplicationLibrariesTest {

	private Application application;
	private Library library1;
	private Library library2;
	private Library library3;

	@Before
	public void setUp() throws Exception {
		// Create Application.
		application = PMFFactory.eINSTANCE.createApplication();
		application.getCommands().add(PMFFactory.eINSTANCE.createCommand());
		application.getConverters().add(
				PMFFactory.eINSTANCE.createDataConverter());
		application.getSystemActions().add(
				PMFFactory.eINSTANCE.createSystemAction());
		application.getTypes().add(PEMFFactory.eINSTANCE.createEMFType());
		application.getValidators().add(PMFFactory.eINSTANCE.createValidator());
		application.getViewProfiles().add(
				PMFFactory.eINSTANCE.createViewProfile());
		application.getImages().add(UiFactory.eINSTANCE.createImage());
		// Create Library1
		library1 = PMFFactory.eINSTANCE.createLibrary();
		library1.getCommands().add(PMFFactory.eINSTANCE.createCommand());
		library1.getConverters()
				.add(PMFFactory.eINSTANCE.createDataConverter());
		library1.getSystemActions().add(
				PMFFactory.eINSTANCE.createSystemAction());
		library1.getTypes().add(PEMFFactory.eINSTANCE.createEMFType());
		library1.getValidators().add(PMFFactory.eINSTANCE.createValidator());
		library1.getViewProfiles()
				.add(PMFFactory.eINSTANCE.createViewProfile());

		// Create Library2
		library2 = PMFFactory.eINSTANCE.createLibrary();
		library2.getCommands().add(PMFFactory.eINSTANCE.createCommand());
		library2.getConverters()
				.add(PMFFactory.eINSTANCE.createDataConverter());
		library2.getSystemActions().add(
				PMFFactory.eINSTANCE.createSystemAction());
		library2.getTypes().add(PEMFFactory.eINSTANCE.createEMFType());
		library2.getValidators().add(PMFFactory.eINSTANCE.createValidator());
		library2.getViewProfiles()
				.add(PMFFactory.eINSTANCE.createViewProfile());
		library2.getImages()
		.add(UiFactory.eINSTANCE.createImage());

		// Create Library3
		library3 = PMFFactory.eINSTANCE.createLibrary();
		library3.getCommands().add(PMFFactory.eINSTANCE.createCommand());
		library3.getConverters()
				.add(PMFFactory.eINSTANCE.createDataConverter());
		library3.getSystemActions().add(
				PMFFactory.eINSTANCE.createSystemAction());
		library3.getTypes().add(PEMFFactory.eINSTANCE.createEMFType());
		library3.getValidators().add(PMFFactory.eINSTANCE.createValidator());
		library3.getViewProfiles()
				.add(PMFFactory.eINSTANCE.createViewProfile());
		library3.getImages()
		.add(UiFactory.eINSTANCE.createImage());

	}

	@Test
	public void testAddLibrary() {
		doValidateApplication(library1, false);
		application.getLibraries().add(library1);
		doValidateApplication(library1, true);

		doValidateApplication(library2, false);
		application.getLibraries().add(library2);
		doValidateApplication(library1, true);
		doValidateApplication(library2, true);

		doValidateApplication(library3, false);
		application.getLibraries().add(library3);
		doValidateApplication(library1, true);
		doValidateApplication(library2, true);
		doValidateApplication(library3, true);
	}

	/**
	 * Try to validate Commands, DataConverters, SystemActions, DataTypes,
	 * Validators and ViewProfiles which belong to the given
	 * <parameter>library</parameter>.
	 * 
	 * <parameter>contains</parameter> means whether the library is added to the
	 * Application.
	 */
	private void doValidateApplication(Library library, boolean contains) {
		assertNotNull("application", application);
		assertNotNull("library", library);
		EList<Command> commands = library.getCommands();
		EList<DataConverter> converters = library.getConverters();
		EList<SystemAction> systemActions = library.getSystemActions();
		EList<DataType> types = library.getTypes();
		EList<Validator> validators = library.getValidators();
		EList<ViewProfile> viewProfiles = library.getViewProfiles();
		EList<Image> images = library.getImages();
		
		if (contains) {
			assertTrue(
					"All commands of Library should be synchronized to application",
					application.getAllCommands().containsAll(commands));
			assertTrue(
					"All converters of Library should be synchronized to application ",
					application.getAllConverters().containsAll(converters));
			assertTrue(
					"All systemActions of Library should be synchronized to application",
					application.getAllSystemActions()
							.containsAll(systemActions));
			assertTrue(
					"All dataTypes of Library should be synchronized to application",
					application.getAllTypes().containsAll(types));
			assertTrue(
					"All validators of Library should be synchronized to application",
					application.getAllValidators().containsAll(validators));
			assertTrue(
					"All viewProfiles of Library should be synchronized to application",
					application.getAllViewProfiles().containsAll(viewProfiles));
			assertTrue(
					"All images of Library should be synchronized to application",
					application.getAllImages().containsAll(images));

		} else {
			for (Command cmd : commands) {
				if (application.getAllCommands().contains(cmd)) {
					fail("Command of Library should be removed from application");
				}
			}
			for (DataConverter cvt : converters) {
				if (application.getAllConverters().contains(cvt)) {
					fail("DataConverter of Library should be removed from application");
				}
			}
			for (SystemAction obj : systemActions) {
				if (application.getAllSystemActions().contains(obj)) {
					fail("SystemAction of Library should be removed from application");
				}
			}
			for (DataType obj : types) {
				if (application.getAllTypes().contains(obj)) {
					fail("DataType of Library should be removed from application");
				}
			}
			for (Validator obj : validators) {
				if (application.getAllValidators().contains(obj)) {
					fail("Validator of Library should be removed from application");
				}
			}
			for (ViewProfile obj : viewProfiles) {
				if (application.getAllViewProfiles().contains(obj)) {
					fail("ViewProfile of Library should be removed from application");
				}
			}
			for (Image obj : images) {
				if (application.getAllImages().contains(obj)) {
					fail("Image of Library should be removed from application");
				}
			}
		}
	}

	@Test
	public void test_eSetLibraries() {
		List<Library> libraries = new ArrayList<Library>();
		libraries.add(library1);
		libraries.add(library2);
		libraries.add(library3);

		// Set Libraries to a list.
		application.eSet(PMFPackage.eINSTANCE.getApplication_Libraries(),
				libraries);
		doValidateApplication(library1, true);
		doValidateApplication(library2, true);
		doValidateApplication(library3, true);

		// Set Libraries to empty list.
		application.eSet(PMFPackage.eINSTANCE.getApplication_Libraries(),
				new ArrayList<Library>());
		doValidateApplication(library1, false);
		doValidateApplication(library2, false);
		doValidateApplication(library3, false);
	}

	@Test
	public void testRemoveLibrary() {
		application.getLibraries().add(library1);
		doValidateApplication(library1, true);
		application.getLibraries().remove(library1);
		doValidateApplication(library1, false);

		application.getLibraries().add(library2);
		doValidateApplication(library2, true);
		application.getLibraries().remove(library2);
		doValidateApplication(library2, false);

		application.getLibraries().add(library3);
		doValidateApplication(library3, true);
		application.getLibraries().remove(library3);
		doValidateApplication(library3, false);
	}

	@Test
	public void testLibraryDynamicAdd() {
		application.getLibraries().add(library1);
		doValidateApplication(library1, true);

		// Add new Command
		library1.getCommands().add(PMFFactory.eINSTANCE.createCommand());
		doValidateApplication(library1, true);

		// Add new Converter
		library1.getConverters()
				.add(PMFFactory.eINSTANCE.createDataConverter());
		doValidateApplication(library1, true);

		// Add new SystemAction
		library1.getSystemActions().add(
				PMFFactory.eINSTANCE.createSystemAction());
		doValidateApplication(library1, true);

		// Add new DataType
		library1.getTypes().add(PEMFFactory.eINSTANCE.createEMFType());
		doValidateApplication(library1, true);

		// Add new Validator.
		library1.getValidators().add(PMFFactory.eINSTANCE.createValidator());
		doValidateApplication(library1, true);

		// Add new ViewProfile.
		library1.getViewProfiles()
				.add(PMFFactory.eINSTANCE.createViewProfile());
		doValidateApplication(library1, true);
		// Add new ViewProfile.
		library1.getImages()
				.add(UiFactory.eINSTANCE.createImage());
		doValidateApplication(library1, true);

	}

	@Test
	public void testLibraryDynamicRemove() {
		application.getLibraries().add(library1);
		doValidateApplication(library1, true);
		// Add new Command
		Command command = PMFFactory.eINSTANCE.createCommand();
		library1.getCommands().add(command);
		doValidateApplication(library1, true);
		// Remove the Command from Library.
		library1.getCommands().remove(command);
		assertTrue("Command removed from application", !application
				.getAllCommands().contains(command));

		// Add new Converter
		DataConverter converter = PMFFactory.eINSTANCE.createDataConverter();
		library1.getConverters().add(converter);
		doValidateApplication(library1, true);
		// Remove the Converter from Library.
		library1.getConverters().remove(converter);
		assertTrue("Converter removed from application", !application
				.getAllConverters().contains(converter));

		// Add new SystemAction
		SystemAction systemAction = PMFFactory.eINSTANCE.createSystemAction();
		library1.getSystemActions().add(systemAction);
		doValidateApplication(library1, true);
		// Remove the SystemAction from Library.
		library1.getSystemActions().remove(systemAction);
		assertTrue("SystemAction removed from application", !application
				.getAllSystemActions().contains(systemAction));

		// Add new DataType
		EMFType dataType = PEMFFactory.eINSTANCE.createEMFType();
		library1.getTypes().add(dataType);
		doValidateApplication(library1, true);
		// Remove the DataType from Library.
		library1.getTypes().remove(dataType);
		assertTrue("DataType removed from application", !application
				.getAllTypes().contains(dataType));

		// Add new Validator.
		Validator validator = PMFFactory.eINSTANCE.createValidator();
		library1.getValidators().add(validator);
		doValidateApplication(library1, true);
		// Remove the Validator from Library.
		library1.getValidators().remove(validator);
		assertTrue("Validator removed from application", !application
				.getAllValidators().contains(validator));

		// Add new ViewProfile.
		ViewProfile createViewProfile = PMFFactory.eINSTANCE
				.createViewProfile();
		ViewProfile viewProfile = createViewProfile;
		library1.getViewProfiles().add(viewProfile);
		doValidateApplication(library1, true);
		// Remove the ViewProfile from Library.
		library1.getViewProfiles().remove(viewProfile);
		assertTrue("ViewProfile removed from application", !application
				.getAllViewProfiles().contains(viewProfile));
		// Add new Image.
		Image image = UiFactory.eINSTANCE.createImage();
		library1.getImages().add(image);
		doValidateApplication(library1, true);
		// Remove the Image from Library.
		library1.getImages().remove(image);
		assertTrue("Image removed from application", !application
				.getAllImages().contains(image));
	}
	
	
	@Test
	public void testLibrarySelfDynamicAdd() {
		// Add new Command
		application.getCommands().add(PMFFactory.eINSTANCE.createCommand());
		doValidateApplication(application, true);

		// Add new Converter
		application.getConverters()
				.add(PMFFactory.eINSTANCE.createDataConverter());
		doValidateApplication(application, true);

		// Add new SystemAction
		application.getSystemActions().add(
				PMFFactory.eINSTANCE.createSystemAction());
		doValidateApplication(application, true);

		// Add new DataType
		application.getTypes().add(PEMFFactory.eINSTANCE.createEMFType());
		doValidateApplication(application, true);

		// Add new Validator.
		application.getValidators().add(PMFFactory.eINSTANCE.createValidator());
		doValidateApplication(application, true);

		// Add new ViewProfile.
		application.getViewProfiles()
				.add(PMFFactory.eINSTANCE.createViewProfile());
		doValidateApplication(application, true);
		// Add new Validator.
		application.getImages().add(UiFactory.eINSTANCE.createImage());
		doValidateApplication(application, true);
	}

	@Test
	public void testLibrarySelfDynamicRemove() {
		// Add new Command
		Command command = PMFFactory.eINSTANCE.createCommand();
		application.getCommands().add(command);
		doValidateApplication(application, true);
		// Remove the Command from Library.
		application.getCommands().remove(command);
		assertTrue("Command removed from application", !application
				.getAllCommands().contains(command));

		// Add new Converter
		DataConverter converter = PMFFactory.eINSTANCE.createDataConverter();
		application.getConverters().add(converter);
		doValidateApplication(application, true);
		// Remove the Converter from Library.
		application.getConverters().remove(converter);
		assertTrue("Converter removed from application", !application
				.getAllConverters().contains(converter));

		// Add new SystemAction
		SystemAction systemAction = PMFFactory.eINSTANCE.createSystemAction();
		application.getSystemActions().add(systemAction);
		doValidateApplication(application, true);
		// Remove the SystemAction from Library.
		application.getSystemActions().remove(systemAction);
		assertTrue("SystemAction removed from application", !application
				.getAllSystemActions().contains(systemAction));

		// Add new DataType
		EMFType dataType = PEMFFactory.eINSTANCE.createEMFType();
		application.getTypes().add(dataType);
		doValidateApplication(application, true);
		// Remove the DataType from Library.
		application.getTypes().remove(dataType);
		assertTrue("DataType removed from application", !application
				.getAllTypes().contains(dataType));

		// Add new Validator.
		Validator validator = PMFFactory.eINSTANCE.createValidator();
		application.getValidators().add(validator);
		doValidateApplication(application, true);
		// Remove the Validator from Library.
		application.getValidators().remove(validator);
		assertTrue("Validator removed from application", !application
				.getAllValidators().contains(validator));

		// Add new ViewProfile.
		ViewProfile createViewProfile = PMFFactory.eINSTANCE
				.createViewProfile();
		ViewProfile viewProfile = createViewProfile;
		application.getViewProfiles().add(viewProfile);
		doValidateApplication(application, true);
		// Remove the ViewProfile from Library.
		application.getViewProfiles().remove(viewProfile);
		assertTrue("ViewProfile removed from application", !application
				.getAllViewProfiles().contains(viewProfile));

		// Add new Image
		Image image = UiFactory.eINSTANCE.createImage();
		application.getImages().add(image);
		doValidateApplication(application, true);
		// Remove the Image from Library.
		application.getImages().remove(image);
		assertTrue("Image removed from application", !application
				.getAllImages().contains(image));

	}

	@Test
	public void testRemoveLibraryWithReferences() {
		application.getLibraries().add(library1);
		doValidateApplication(library1, true);
		// Add new Command
		Command command = PMFFactory.eINSTANCE.createCommand();
		library1.getCommands().add(command);

		SystemAction action = PMFFactory.eINSTANCE.createSystemAction();
		action.setCommands(command);
		application.getSystemActions().add(action);

		// Try to remove library1.
		try {
			application.getLibraries().remove(library1);
		} catch (Exception e) {
			if (!(e instanceof PMFException && "The library can not be removed because there's one or more object(s) had been used by current application."
					.equals(((PMFException) e).getMessage()))) {
				fail(e.getMessage());
			}
		}
		doValidateApplication(library1, true);

		try {
			application.getLibraries().removeAll(
					Collections.singleton(library1));
		} catch (Exception e) {
			if (!(e instanceof PMFException && "The library can not be removed because there's one or more object(s) had been used by current application."
					.equals(((PMFException) e).getMessage()))) {
				fail(e.getMessage());
			}
		}
		doValidateApplication(library1, true);
	}
}
