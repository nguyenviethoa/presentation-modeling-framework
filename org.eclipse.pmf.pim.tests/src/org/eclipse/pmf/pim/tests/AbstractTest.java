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

import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.pde.internal.core.ClasspathComputer;
import org.eclipse.pde.internal.core.natures.PDE;
import org.eclipse.pde.internal.core.util.CoreUtility;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.junit.Before;

public class AbstractTest extends XWTTestCase{
	protected ProjectData projectData = new ProjectData();
	IWorkbenchWindow window;
	IWorkbenchPage page;
	IWorkspace workspace;

	static class ProjectData {
		protected String[] srcs = { "src" };
		protected String bin = "bin";
		protected String projectId = "testproject";
		protected String model = "model";

		public ProjectData() {
		}

		public String[] getSrcs() {
			return srcs;
		}

		public void setSrcs(String[] srcs) {
			this.srcs = srcs;
		}

		public String getBin() {
			return bin;
		}

		public void setBin(String bin) {
			this.bin = bin;
		}

		public String getProjectId() {
			return projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}
	}

	public AbstractTest() {
	}

	protected IProject createProject(ProjectData projectData)
			throws CoreException {
		String ee = "J2SE-1.5";
		String projectId = projectData.getProjectId();
		String[] srcs = projectData.getSrcs();
		String bin = projectData.getBin();
		String model = projectData.getModel();

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(projectId);

		if (!project.exists()) {
			CoreUtility.createProject(project, root.getRawLocation(), null);
		}
		project.open(null);
		CoreUtility.addNatureToProject(project, PDE.PLUGIN_NATURE, null);
		CoreUtility.addNatureToProject(project, JavaCore.NATURE_ID, null);

		for (String src : srcs) {
			IFolder srcFolder = project.getFolder(src);
			if (!srcFolder.exists()) {
				CoreUtility.createFolder(srcFolder);
			}
		}
		IFolder modelFolder = project.getFolder(model);
		if (!modelFolder.exists()) {
			CoreUtility.createFolder(modelFolder);
		}

		// create default packages
		// IPath path = new Path("");
		// String[] paths = projectId.split("\\.");
		// for (String segment : paths) {
		// path = path.append(segment);
		// IFolder folder = srcFolder.getFolder(path);
		// if (!folder.exists()) {
		// CoreUtility.createFolder(folder);
		// }
		// }

		IFolder binFolder = project.getFolder(bin);
		if (!binFolder.exists()) {
			CoreUtility.createFolder(binFolder);
		}

		// set up classpath
		IJavaProject javaProject = JavaCore.create(project);
		// Set output folder
		IPath path = project.getFullPath().append(bin);
		javaProject.setOutputLocation(path, null);

		IClasspathEntry[] entries = new IClasspathEntry[srcs.length + 2];
		int i = 0;
		for (String src : srcs) {
			entries[i++] = JavaCore.newSourceEntry(project.getProject()
					.getFullPath().append(src));
		}
		ClasspathComputer.setComplianceOptions(javaProject, ee);
		entries[i++] = ClasspathComputer.createJREEntry(ee);
		entries[i++] = ClasspathComputer.createContainerEntry();
		javaProject.setRawClasspath(entries, null);

		return project;
	}

	protected void copyFile(IProject project, InputStream input,
			IPath targetPath) {
		try {
			for (int i = 1, l = targetPath.segmentCount(); i < l; i++) {
				IPath elementPath = targetPath.uptoSegment(i);
				IFolder folder = project.getFolder(elementPath);
				if (!folder.exists()) {
					folder.create(true, true, null);
				}
			}
			IFile file = project.getFile(targetPath);
			if (!file.exists()) {
				file.create(input, true, null);
			} else {
				file.setContents(input, true, false, null);
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Perform pre-test initialization.
	 */
	@Before
	public void setUp() throws Exception {

		// Initialize the test fixture for each test
		// that is run.
		waitForJobs();

		try {
			this.window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			if (this.window != null) {
				this.page = window.getActivePage();
			}
			this.workspace = ResourcesPlugin.getWorkspace();

			// editor = (HTMLEditor)page.openEditor(inputA1,
			// "org.eclipse.epf.richtext.extension.tests.editor1");

			waitForJobs();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void testAbtractTest(){
		
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
