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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.pmf.emf.EMFType;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.DataFormFolder;
import org.eclipse.pmf.pim.Library;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.presentation.PMFLibraryWizard;
import org.eclipse.pmf.pim.presentation.PMFModelWizard;
import org.eclipse.pmf.pim.tests.AbstractProjectTest;
import org.eclipse.pmf.pim.util.PMFUtil;
import org.junit.Test;

public class ResourceFileCreationTest extends AbstractProjectTest {

	/**
	 * Test the resoruce creation used by the New Wizard
	 * 
	 * @see PMFModelWizard
	 * 
	 */
	@Test
	public void applicationCreation() {
		String name = "TestApplication";
		IFile file = project.getFile("model/Application.pmf");
		try {
			Resource resource = PMFUtil.createApplicationResource(file, name,
					"UTF-8", null);

			assertTrue(resource.getContents().size() == 1);
			EObject object = resource.getContents().get(0);
			assertTrue(object instanceof Application);
			Application application = (Application) object;
			assertEquals(name, application.getName());

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Test the resoruce creation used by the New Wizard
	 * 
	 * @see PMFLibraryWizard
	 * 
	 */
	@Test
	public void libraryCreation() {
		String name = "TestLibrary";
		IFile file = project.getFile("model/Library.pmf");
		try {
			Resource resource = PMFUtil.createLibraryResource(file, name,
					"UTF-8", null);
			assertTrue(resource.getContents().size() == 1);
			EObject object = resource.getContents().get(0);
			assertTrue(object instanceof Library);
			Library library = (Library) object;
			assertEquals(name, library.getName());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Test
	public void modelImportEcore() {
		modelImport("PrimitiveType.ecore");
	}

	@Test
	public void modelImportGenModel() {
		modelImport("PrimitiveType.genmodel");
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

			// Create an application
			String name = "TestApplicationImport";
			IFile file = project.getFile("model/ApplicationImport.pmf");
			Resource resource = PMFUtil.createApplicationResource(file, name,
					"UTF-8", null);
			Application application = PMFUtil.getApplication(resource);

			// Load the model
			ResourceSet resourceSet = resource.getResourceSet();
			Resource modelResource = resourceSet.getResource(
					URI.createFileURI(modelFile.getFullPath().toOSString()),
					true);

			// Import in Application
			application.importModel(modelResource);

			// save the imported data in file
			resource.save(Collections.EMPTY_MAP);

			// reload
			resourceSet = new ResourceSetImpl();
			Resource appResource = resourceSet.getResource(
					URI.createFileURI(file.getFullPath().toOSString()), true);
			application = PMFUtil.getApplication(appResource);

			EList<DataType> datatypes = application.getTypes();
			EMap<DataType, DataFormFolder> dataMap = application
					.getDataFormFolders();

			// now the model ResourceSet is not the same as the one ins the
			// Application's
			assertEquals(modelResource.getContents().size(), datatypes.size());
			assertEquals(modelResource.getContents().size(), dataMap.size());

			Map<String, DataFormFolder> map = new HashMap<String, DataFormFolder>();
			for (DataType dataType : datatypes) {
				assertTrue(dataType instanceof EMFType);
				EMFType emfType = (EMFType) dataType;
				EClassifier classifier = emfType.getContent();
				map.put(classifier.getInstanceClassName(),
						dataMap.get(dataType));
			}

			for (TreeIterator<EObject> iterator = modelResource
					.getAllContents(); iterator.hasNext();) {
				EObject element = iterator.next();
				if (element instanceof EClassifier) {
					EClassifier classifier = (EClassifier) element;
					assertTrue(map.containsKey(classifier
							.getInstanceClassName()));
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected void checkDataType() {

	}
}
