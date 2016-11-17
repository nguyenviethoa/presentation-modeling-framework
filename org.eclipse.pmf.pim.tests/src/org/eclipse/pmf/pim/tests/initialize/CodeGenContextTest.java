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
import java.util.List;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.pmf.pim.Library;
import org.eclipse.pmf.pim.transformation.CodeGenContext;
import org.eclipse.pmf.pim.transformation.ResourceResolver;
import org.eclipse.pmf.pim.transformation.TransformationFactory;
import org.eclipse.pmf.pim.transformation.TransformationPackage;
import org.junit.Before;
import org.junit.Test;

public class CodeGenContextTest {

	private CodeGenContext codegenContext;
	private ResourceResolver resolver1;
	private ResourceResolver resolver2;
	private ResourceResolver resolver3;

	@Before
	public void setUp() throws Exception {
		// Create Application.
		codegenContext = TransformationFactory.eINSTANCE.createCodeGenContext();
		codegenContext.getCommandMap().put("cg.cmd", "cg.cmd.type");
		codegenContext.getDataConverterMap().put("cg.dataconvert", "cg.dataconvert.type");
		codegenContext.getSystemActionMap().put("cg.action", "cg.action.type");
		codegenContext.getValidatorMap().put("cg.validator", "cg.validator.type");
		codegenContext.getViewProfileMap().put("cg.profile", "cg.profile.type");

		// Create Library1
		resolver1 = TransformationFactory.eINSTANCE.createResourceResolver();
		resolver1.getCommandMap().put("r1.cmd", "r1.cmd.type");
		resolver1.getDataConverterMap().put("r1.dataconvert", "r1.dataconvert.type");
		resolver1.getSystemActionMap().put("r1.action", "r1.action.type");
		resolver1.getValidatorMap().put("r1.validator", "r1.validator.type");
		resolver1.getViewProfileMap().put("r1.profile", "r1.profile.type");

		// Create Library2
		resolver2 = TransformationFactory.eINSTANCE.createResourceResolver();
		resolver2.getCommandMap().put("r2.cmd", "r2.cmd.type");
		resolver2.getDataConverterMap().put("r2.dataconvert", "r2.dataconvert.type");
		resolver2.getSystemActionMap().put("r2.action", "r2.action.type");
		resolver2.getValidatorMap().put("r2.validator", "r2.validator.type");
		resolver2.getViewProfileMap().put("r2.profile", "r2.profile.type");

		// Create Library3
		resolver3 = TransformationFactory.eINSTANCE.createResourceResolver();
		resolver3.getCommandMap().put("r3.cmd", "r3.cmd.type");
		resolver3.getDataConverterMap().put("r3.dataconvert", "r3.dataconvert.type");
		resolver3.getSystemActionMap().put("r3.action", "r3.action.type");
		resolver3.getValidatorMap().put("r3.validator", "r3.validator.type");
		resolver3.getViewProfileMap().put("r3.profile", "r3.profile.type");
	}

	@Test
	public void testResolverSelfDynamicAdd() {
		codegenContext.getResourceResolvers().add(resolver1);
		doValidateApplication(resolver1, true);

		// Add new Command
		codegenContext.getCommandMap().put("cmd1", "cmd.type");
		doValidateApplication(codegenContext, true);

		// Add new Converter
		codegenContext.getDataConverterMap().put("datacvt1", "datacvt.type");
		doValidateApplication(codegenContext, true);

		// Add new SystemAction
		codegenContext.getSystemActionMap().put("sysaction", "sysaction.type");
		doValidateApplication(codegenContext, true);

		// Add new Validator.
		codegenContext.getValidatorMap().put("validator", "validator.type");
		doValidateApplication(codegenContext, true);

		// Add new ViewProfile.
		codegenContext.getViewProfileMap().put("viewprofile", "viewprofile.type");
		doValidateApplication(codegenContext, true);
	}

	@Test
	public void testResolverSelfDynamicRemove() {
		String prefix = "selfDynamicRemove";
		codegenContext.getResourceResolvers().add(resolver1);
		doValidateApplication(resolver1, true);
		
		// Add new Command
		codegenContext.getCommandMap().put(prefix + "cmd", prefix + "cmd.type");
		doValidateApplication(codegenContext, true);
		// Remove the Command from Library.
		codegenContext.getCommandMap().removeKey(prefix + "cmd");
		assertTrue("Converter removed from codegenContext", !codegenContext
				.getAllCommandMap().containsKey(prefix + "cmd"));

		// Add new Converter
		codegenContext.getDataConverterMap().put(prefix + "dataconverter", prefix + "dataconverter.type");
		doValidateApplication(codegenContext, true);
		// Remove the Converter from Library.
		codegenContext.getDataConverterMap().removeKey(prefix + "dataconverter");
		assertTrue("Converter removed from codegenContext", !codegenContext
				.getAllDataConverterMap().containsKey(prefix + "dataconverter"));

		// Add new SystemAction
		codegenContext.getSystemActionMap().put(prefix + "sysaction", prefix + "sysaction.type");
		doValidateApplication(codegenContext, true);
		// Remove the SystemAction from Library.
		codegenContext.getSystemActionMap().removeKey(prefix + "sysaction");
		assertTrue("SystemAction removed from codegenContext", !codegenContext
				.getAllSystemActionMap().containsKey(prefix + "sysaction"));

		// Add new Validator.
		codegenContext.getValidatorMap().put(prefix + "validator", prefix + "validator.type");
		doValidateApplication(codegenContext, true);
		// Remove the Validator from Library.
		codegenContext.getValidatorMap().removeKey(prefix + "validator");
		assertTrue("Validator removed from codegenContext", !codegenContext
				.getAllValidatorMap().containsKey(prefix + "validator"));

		// Add new ViewProfile.
		codegenContext.getViewProfileMap().put(prefix + "profile", prefix + "profile.type");
		doValidateApplication(codegenContext, true);
		// Remove the ViewProfile from Library.
		codegenContext.getViewProfileMap().removeKey(prefix + "profile");
		assertTrue("ViewProfile removed from codegenContext", !codegenContext
				.getAllViewProfileMap().containsKey(prefix + "profile"));
	}
	
	@Test
	public void testAddResolver() {
		doValidateApplication(resolver1, false);
		codegenContext.getResourceResolvers().add(resolver1);
		doValidateApplication(resolver1, true);

		doValidateApplication(resolver2, false);
		codegenContext.getResourceResolvers().add(resolver2);
		doValidateApplication(resolver1, true);
		doValidateApplication(resolver2, true);

		doValidateApplication(resolver3, false);
		codegenContext.getResourceResolvers().add(resolver3);
		doValidateApplication(resolver1, true);
		doValidateApplication(resolver2, true);
		doValidateApplication(resolver3, true);
	}

	/**
	 * Try to validate Commands, DataConverters, SystemActions, DataTypes,
	 * Validators and ViewProfiles which belong to the given
	 * <parameter>library</parameter>.
	 * 
	 * <parameter>contains</parameter> means whether the library is added to the
	 * Application.
	 */
	private void doValidateApplication(ResourceResolver resolver, boolean contains) {
		assertNotNull("codegenContext", codegenContext);
		assertNotNull("resolver", resolver);
		EMap<String, String> commands = resolver.getCommandMap();
		EMap<String, String> converters = resolver.getDataConverterMap();
		EMap<String, String> systemActions = resolver.getSystemActionMap();
		EMap<String, String> validators = resolver.getValidatorMap();
		EMap<String, String> viewProfiles = resolver.getViewProfileMap();
		if (contains) {
			for (String cmd : commands.keySet()) {
				if (!codegenContext.getAllCommandMap().containsKey(cmd)) {
					fail("Command of ResourceResover should be added from CodeGenContext");
				}
			}
			for (String cvt : converters.keySet()) {
				if (!codegenContext.getAllDataConverterMap().containsKey(cvt)) {
					fail("DataConverter of ResourceResover should be added from CodeGenContext");
				}
			}
			for (String obj : systemActions.keySet()) {
				if (!codegenContext.getAllSystemActionMap().containsKey(obj)) {
					fail("SystemAction of ResourceResover should be added from CodeGenContext");
				}
			}
			for (String obj : validators.keySet()) {
				if (!codegenContext.getAllValidatorMap().containsKey(obj)) {
					fail("Validator of ResourceResover should be added from CodeGenContext");
				}
			}
			for (String obj : viewProfiles.keySet()) {
				if (!codegenContext.getAllViewProfileMap().containsKey(obj)) {
					fail("ViewProfile of ResourceResover should be added from CodeGenContext");
				}
			}
		} else {
			for (String cmd : commands.keySet()) {
				if (codegenContext.getAllCommandMap().containsKey(cmd)) {
					fail("Command of ResourceResover should be removed from CodeGenContext");
				}
			}
			for (String cvt : converters.keySet()) {
				if (codegenContext.getAllDataConverterMap().containsKey(cvt)) {
					fail("DataConverter of ResourceResover should be removed from CodeGenContext");
				}
			}
			for (String obj : systemActions.keySet()) {
				if (codegenContext.getAllSystemActionMap().containsKey(obj)) {
					fail("SystemAction of ResourceResover should be removed from CodeGenContext");
				}
			}
			for (String obj : validators.keySet()) {
				if (codegenContext.getAllValidatorMap().containsKey(obj)) {
					fail("Validator of ResourceResover should be removed from CodeGenContext");
				}
			}
			for (String obj : viewProfiles.keySet()) {
				if (codegenContext.getAllViewProfileMap().containsKey(obj)) {
					fail("ViewProfile of ResourceResover should be removed from CodeGenContext");
				}
			}
		}
	}

	@Test
	public void test_eSetLibraries() {
		List<ResourceResolver> resolvers = new ArrayList<ResourceResolver>();
		resolvers.add(resolver1);
		resolvers.add(resolver2);
		resolvers.add(resolver3);

		// Set Libraries to a list.
		codegenContext.eSet(TransformationPackage.eINSTANCE.getCodeGenContext_ResourceResolvers(), resolvers);
		doValidateApplication(resolver1, true);
		doValidateApplication(resolver2, true);
		doValidateApplication(resolver3, true);

		// Set Libraries to empty list.
		codegenContext.eSet(TransformationPackage.eINSTANCE.getCodeGenContext_ResourceResolvers(),
				new ArrayList<Library>());
		doValidateApplication(resolver1, false);
		doValidateApplication(resolver2, false);
		doValidateApplication(resolver3, false);
	}

	@Test
	public void testRemoveResolver() {
		codegenContext.getResourceResolvers().add(resolver1);
		doValidateApplication(resolver1, true);
		codegenContext.getResourceResolvers().remove(resolver1);
		doValidateApplication(resolver1, false);

		codegenContext.getResourceResolvers().add(resolver2);
		doValidateApplication(resolver2, true);
		codegenContext.getResourceResolvers().remove(resolver2);
		doValidateApplication(resolver2, false);

		codegenContext.getResourceResolvers().add(resolver3);
		doValidateApplication(resolver3, true);
		codegenContext.getResourceResolvers().remove(resolver3);
		doValidateApplication(resolver3, false);
	}

	@Test
	public void testResolverDynamicAdd() {
		codegenContext.getResourceResolvers().add(resolver1);
		doValidateApplication(resolver1, true);

		// Add new Command
		resolver1.getCommandMap().put("cmd1", "cmd.type");
		doValidateApplication(resolver1, true);

		// Add new Converter
		resolver1.getDataConverterMap().put("datacvt1", "datacvt.type");
		doValidateApplication(resolver1, true);

		// Add new SystemAction
		resolver1.getSystemActionMap().put("sysaction", "sysaction.type");
		doValidateApplication(resolver1, true);

		// Add new Validator.
		resolver1.getValidatorMap().put("validator", "validator.type");
		doValidateApplication(resolver1, true);

		// Add new ViewProfile.
		resolver1.getViewProfileMap().put("viewprofile", "viewprofile.type");
		doValidateApplication(resolver1, true);
	}

	@Test
	public void testResolverDynamicRemove() {
		String prefix = "dynamicRemove";
		codegenContext.getResourceResolvers().add(resolver1);
		doValidateApplication(resolver1, true);

		// Add new Command
		resolver1.getCommandMap().put(prefix + "cmd", prefix + "cmd.type");
		doValidateApplication(resolver1, true);
		// Remove the Command from Library.
		resolver1.getCommandMap().removeKey(prefix + "cmd");
		assertTrue("Converter removed from codegenContext", !codegenContext
				.getAllCommandMap().containsKey(prefix + "cmd"));

		// Add new Converter
		resolver1.getDataConverterMap().put(prefix + "dataconverter", prefix + "dataconverter.type");
		doValidateApplication(resolver1, true);
		// Remove the Converter from Library.
		resolver1.getDataConverterMap().removeKey(prefix + "dataconverter");
		assertTrue("Converter removed from codegenContext", !codegenContext
				.getAllDataConverterMap().containsKey(prefix + "dataconverter"));

		// Add new SystemAction
		resolver1.getSystemActionMap().put(prefix + "sysaction", prefix + "sysaction.type");
		doValidateApplication(resolver1, true);
		// Remove the SystemAction from Library.
		resolver1.getSystemActionMap().removeKey(prefix + "sysaction");
		assertTrue("SystemAction removed from codegenContext", !codegenContext
				.getAllSystemActionMap().containsKey(prefix + "sysaction"));

		// Add new Validator.
		resolver1.getValidatorMap().put(prefix + "validator", prefix + "validator.type");
		doValidateApplication(resolver1, true);
		// Remove the Validator from Library.
		resolver1.getValidatorMap().removeKey(prefix + "validator");
		assertTrue("Validator removed from codegenContext", !codegenContext
				.getAllValidatorMap().containsKey(prefix + "validator"));

		// Add new ViewProfile.
		resolver1.getViewProfileMap().put(prefix + "profile", prefix + "profile.type");
		doValidateApplication(resolver1, true);
		// Remove the ViewProfile from Library.
		resolver1.getViewProfileMap().removeKey(prefix + "profile");
		assertTrue("ViewProfile removed from codegenContext", !codegenContext
				.getAllViewProfileMap().containsKey(prefix + "profile"));
	}
	
	@Test
	public void testResolverForbiddenAdd() {
		String prefix = "forbiddenAdd";
		try {
			codegenContext.getAllCommandMap().put(prefix + "cmd", prefix + "cmd.type");
			fail("Possible to add in AllCommands");
		} catch (UnsupportedOperationException e) {
		}
		
		try {
			codegenContext.getAllDataConverterMap().put(prefix + "data.converter", prefix + "data.converter.type");
			fail("Possible to add in AllDataConverters");
		} catch (UnsupportedOperationException e) {
		}

		try {
			codegenContext.getAllSystemActionMap().put(prefix + "action", prefix + "action.type");
			fail("Possible to add in AllSystemActions");
		} catch (UnsupportedOperationException e) {
		}
		
		try {
			codegenContext.getAllValidatorMap().put(prefix + "validator", prefix + "validator.type");
			fail("Possible to add in AllValidators");
		} catch (UnsupportedOperationException e) {
		}

		try {
			codegenContext.getAllViewProfileMap().put(prefix + "profile", prefix + "profile.type");
			fail("Possible to add in AllViewProfiles");
		} catch (UnsupportedOperationException e) {
		}
	}
	
	@Test
	public void testResolverForbiddenRemove() {
		String prefix = "forbiddenAdd";
		try {
			codegenContext.getCommandMap().put(prefix + "cmd", prefix + "cmd.type");
			codegenContext.getAllCommandMap().removeKey(prefix + "cmd");
			fail("Possible to remove in AllCommands");
		} catch (UnsupportedOperationException e) {
		}
		
		try {
			codegenContext.getDataConverterMap().put(prefix + "data.converter", prefix + "data.converter.type");
			codegenContext.getAllDataConverterMap().removeKey(prefix + "data.converter");
			fail("Possible to remove in AllDataConverters");
		} catch (UnsupportedOperationException e) {
		}

		try {
			codegenContext.getSystemActionMap().put(prefix + "action", prefix + "action.type");
			codegenContext.getAllSystemActionMap().removeKey(prefix + "action");
			fail("Possible to remove in AllSystemActions");
		} catch (UnsupportedOperationException e) {
		}
		
		try {
			codegenContext.getValidatorMap().put(prefix + "validator", prefix + "validator.type");
			codegenContext.getAllValidatorMap().removeKey(prefix + "validator");
			fail("Possible to remove in AllValidators");
		} catch (UnsupportedOperationException e) {
		}

		try {
			codegenContext.getViewProfileMap().put(prefix + "profile", prefix + "profile.type");
			codegenContext.getAllViewProfileMap().removeKey(prefix + "profile");
			fail("Possible to remove in AllViewProfiles");
		} catch (UnsupportedOperationException e) {
		}
	}
	
	@Test
	public void testResolverForbiddenClear() {
		String prefix = "forbiddenAdd";
		try {
			codegenContext.getCommandMap().put(prefix + "cmd", prefix + "cmd.type");
			codegenContext.getAllCommandMap().clear();
			fail("Possible to remove in AllCommands");
		} catch (UnsupportedOperationException e) {
		}
		
		try {
			codegenContext.getDataConverterMap().put(prefix + "data.converter", prefix + "data.converter.type");
			codegenContext.getAllDataConverterMap().clear();
			fail("Possible to remove in AllDataConverters");
		} catch (UnsupportedOperationException e) {
		}

		try {
			codegenContext.getSystemActionMap().put(prefix + "action", prefix + "action.type");
			codegenContext.getAllSystemActionMap().clear();
			fail("Possible to remove in AllSystemActions");
		} catch (UnsupportedOperationException e) {
		}
		
		try {
			codegenContext.getValidatorMap().put(prefix + "validator", prefix + "validator.type");
			codegenContext.getAllValidatorMap().clear();
			fail("Possible to remove in AllValidators");
		} catch (UnsupportedOperationException e) {
		}

		try {
			codegenContext.getViewProfileMap().put(prefix + "profile", prefix + "profile.type");
			codegenContext.getAllViewProfileMap().clear();
			fail("Possible to remove in AllViewProfiles");
		} catch (UnsupportedOperationException e) {
		}
	}
}
