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

package org.eclipse.pmf.pim.tests;

import org.eclipse.core.resources.IProject;
import org.junit.Test;

public class AbstractProjectTest extends AbstractTest {
	protected IProject project;

	public AbstractProjectTest() {
	}

	@Override
	public void setUp() throws Exception {
		super.setUp();
		project = createProject(projectData);
		waitForJobs();
	}
	
	@Test
	public void testAbstractProjectTest(){
		
	}
}
