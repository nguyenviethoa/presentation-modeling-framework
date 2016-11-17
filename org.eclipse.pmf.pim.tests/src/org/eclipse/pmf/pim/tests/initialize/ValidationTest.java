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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.validation.service.IValidationListener;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.emf.validation.service.ValidationEvent;
import org.eclipse.pmf.model.checkrules.manager.CheckRuleManager;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.util.PMFValidator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.junit.Before;
import org.junit.Test;

public class ValidationTest {

	private Application application;
	private final EValidator pmfValidator = EValidator.Registry.INSTANCE.getEValidator(PMFPackage.eINSTANCE);
	private PMFValidator validator = (PMFValidator) pmfValidator;
	
	public ValidationTest(){
		super();
	}
	
	@Before
	public void setUp(){
		
		ModelValidationService.getInstance().addValidationListener(new UniversalValidationListener());
	}

	@Test
	public void test_CircularReference_CheckRuleManager(){
		waitForJobs();
		// set the environment for this test case
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/PMFModelTest.pmf");
		Resource resource = resourceSet.getResource(uri, true);
		
		CheckRuleManager manager = new CheckRuleManager(resource);
		
		IStatus status = manager.invokeModelChecking();
		
		assertEquals("A Cycle referenced dataforms:  has been found to have circular references.",
				status.getChildren()[0].getMessage());
		
	}
	
	@Test
	public void test_Enable_Disable_Constraint(){
		waitForJobs();
		// set the environment for this test case
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/PMFModelTest.pmf");
		Resource resource = resourceSet.getResource(uri, true);
		
		CheckRuleManager manager = new CheckRuleManager(resource);
		
		// before disabling
		IStatus status = manager.invokeModelChecking();
		assertEquals(382, status.getChildren().length);
		// after disabling
		manager.disableConstraint("org.eclipse.pmf.model.checkrules.org.eclipse.pmf.validation.ui.NoCircular");
		IStatus status2 = manager.invokeModelChecking();
		assertEquals(382, status2.getChildren().length);
		// enable again
		manager.enableConstraint("org.eclipse.pmf.model.checkrules.org.eclipse.pmf.validation.ui.NoCircular");
		IStatus status3 = manager.invokeModelChecking();
		assertEquals(382, status3.getChildren().length);
		
	}
	
	@Test
	public void test_Enable_Disable_Live_Mode(){
		waitForJobs();
		// set the environment for this test case
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/PMFModelTest.pmf");
		Resource resource = resourceSet.getResource(uri, true);
		application = (Application) resource.getContents().get(0);
		
		CheckRuleManager manager = new CheckRuleManager(resource);
		manager.enableAutoChecking();
		
		assert PlatformUI.isWorkbenchRunning() : "The workbench must be up in order for this test to make any sense."; //$NON-NLS-1$
		
		// make the live validation condition occurred
		application.setName("e");
		application.setName(null);
		
		assertTrue(UniversalValidationListener.LAST_EVENT != null);
		assertEquals(UniversalValidationListener.LAST_EVENT, "[org.eclipse.pmf.validation.ui.libraryContext]");
	}
	
	@Test
	public void testCircularReference() {
		
		waitForJobs();
		// set the environment for this test case
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/PMFModelTest.pmf");
		Resource resource = resourceSet.getResource(uri, true);
		application = (Application) resource.getContents().get(0);
		BasicDiagnostic diagnostic = new BasicDiagnostic();
		
		// checking of circular reference in application
		Boolean result1 = validator.validateApplication(application, diagnostic, new HashMap<Object, Object>());
		int errors1 = 0;
		for (Diagnostic d: diagnostic.getChildren())
			if (d.getCode() == PMFValidator.DATAFORM__NO_CIRCULAR_CONTAINMENT){
				errors1 += 1;
			}
		assertTrue(errors1 >= 1);
		
	
		
		}
	
	@Test
	public void testNamingConflict() {
		
		waitForJobs();
		// set the environment for this test case
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI
				.createURI("platform:/plugin/org.eclipse.pmf.pim.tests/src/org/eclipse/pmf/pim/tests/initialize/PMFModelTest.pmf");
		Resource resource = resourceSet.getResource(uri, true);
		
		CheckRuleManager manager = new CheckRuleManager(resource);
		
		// before disabling
		IStatus status = manager.invokeModelChecking();
		assertEquals(382, status.getChildren().length);
		// after disabling nameconflict constraint
		manager.disableConstraint("org.eclipse.pmf.model.checkrules.org.eclipse.pmf.validation.ui.NoNameConflictConstraint");
		IStatus status2 = manager.invokeModelChecking();
		assertEquals(378, status2.getChildren().length);
		// enable again
		manager.enableConstraint("org.eclipse.pmf.model.checkrules.org.eclipse.pmf.validation.ui.NoNameConflictConstraint");
		IStatus status3 = manager.invokeModelChecking();
		assertEquals(382, status3.getChildren().length);
	
		
		
		}
	/**
	 * Process UI input but do not return for the specified time interval.
	 * 
	 * @param waitTimeMillis
	 *            the number of milliseconds
	 */
	protected void delay(long waitTimeMillis) {
		Display display = Display.getCurrent();

		// If this is the UI thread,
		// then process input.

		if (display != null) {
			long endTimeMillis = System.currentTimeMillis() + waitTimeMillis;
			while (System.currentTimeMillis() < endTimeMillis) {
				if (!display.readAndDispatch())
					display.sleep();
			}
			display.update();
		}
		// Otherwise, perform a simple sleep.

		else {
			try {
				Thread.sleep(waitTimeMillis);
			} catch (InterruptedException e) {
				// Ignored.
			}
		}
	}

	/**
	 * Wait until all background tasks are complete.
	 */
	public void waitForJobs() {
		while (Job.getJobManager().currentJob() != null)
			delay(1000);
	}
	
	
}

class UniversalValidationListener implements IValidationListener {
	public static String LAST_EVENT = null;
	public void validationOccurred(ValidationEvent event) {
			LAST_EVENT = event.getClientContextIds().toString();
	}
}
