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

package org.eclipse.pmf.generator.egf.xwt.tools;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Preferences;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.corext.fix.CleanUpConstants;
import org.eclipse.jdt.internal.corext.refactoring.RefactoringExecutionStarter;
import org.eclipse.jdt.internal.corext.util.JavaModelUtil;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.internal.ui.browsing.LogicalPackage;
import org.eclipse.jdt.internal.ui.fix.CodeFormatCleanUp;
import org.eclipse.jdt.internal.ui.fix.ImportsCleanUp;
import org.eclipse.jdt.ui.cleanup.CleanUpOptions;
import org.eclipse.jdt.ui.cleanup.ICleanUp;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.wst.xml.core.internal.XMLCorePlugin;
import org.eclipse.wst.xml.core.internal.formatter.XMLFormatterFormatProcessor;
import org.eclipse.wst.xml.core.internal.preferences.XMLCorePreferenceNames;

@SuppressWarnings({ "restriction", "deprecation" })
public class CleanUpUtils {

	private CleanUpUtils() {
	}

	public static void cleanUp(final Shell shell, IProject project) {
		if (shell == null || project == null) {
			return;
		}
		cleanUpJava(shell, project);
		cleanUpXWT(shell, project);
	}

	private static void cleanUpXWT(Shell shell, IProject project) {
		if (shell == null || project == null) {
			return;
		}
		final HashSet<IFile> xwtFiles = new HashSet<IFile>();
		collectXWTFiles(project, xwtFiles);
		shell.getDisplay().asyncExec(new Runnable() {

			public void run() {
				Preferences preferences = XMLCorePlugin.getDefault()
						.getPluginPreferences();
				preferences.setValue(
						XMLCorePreferenceNames.CLEAR_ALL_BLANK_LINES, true);
				final XMLFormatterFormatProcessor processor = new XMLFormatterFormatProcessor();
				for (IFile file : xwtFiles) {
					try {
						processor.formatFile(file);
					} catch (IOException e) {
						e.printStackTrace();
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
			}
		});

	}

	private static void collectXWTFiles(Object element, HashSet<IFile> xwtFiles) {
		if (element instanceof IFile) {
			if ("xwt".equals(((IFile) element).getFileExtension())) {
				xwtFiles.add((IFile) element);
			}
		} else if (element instanceof IContainer) {
			try {
				IResource[] members = ((IContainer) element).members();
				for (IResource iResource : members) {
					collectXWTFiles(iResource, xwtFiles);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	public static void cleanUpJava(final Shell shell, IProject project) {
		IJavaProject javaProject = JavaCore.create(project);
		HashSet<IJavaElement> result = new HashSet<IJavaElement>();
		collectCompilationUnits(javaProject, result);
		final ICompilationUnit[] units = result
				.toArray(new ICompilationUnit[result.size()]);

		Map<String, String> settings = new Hashtable<String, String>();
		settings.put(CleanUpConstants.FORMAT_SOURCE_CODE, CleanUpOptions.TRUE);
		CodeFormatCleanUp codeFormatCleanUp = new CodeFormatCleanUp(settings);
		settings = new Hashtable<String, String>();
		settings.put(CleanUpConstants.ORGANIZE_IMPORTS, CleanUpOptions.TRUE);
		ImportsCleanUp importsCleanUp = new ImportsCleanUp(settings);
		final ICleanUp[] cleanUps = new ICleanUp[] { codeFormatCleanUp,
				importsCleanUp };

		shell.getDisplay().asyncExec(new Runnable() {

			public void run() {
				try {
					RefactoringExecutionStarter.startCleanupRefactoring(units,
							cleanUps, false, shell, false, "Format Java Codes");
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		});
	}

	private static void collectCompilationUnits(Object element,
			Collection<IJavaElement> result) {
		try {
			if (element instanceof IJavaElement) {
				IJavaElement elem = (IJavaElement) element;
				if (elem.exists()) {
					switch (elem.getElementType()) {
					case IJavaElement.TYPE:
						if (elem.getParent().getElementType() == IJavaElement.COMPILATION_UNIT) {
							result.add(elem.getParent());
						}
						break;
					case IJavaElement.COMPILATION_UNIT:
						result.add(elem);
						break;
					case IJavaElement.IMPORT_CONTAINER:
						result.add(elem.getParent());
						break;
					case IJavaElement.PACKAGE_FRAGMENT:
						collectCompilationUnits((IPackageFragment) elem, result);
						break;
					case IJavaElement.PACKAGE_FRAGMENT_ROOT:
						collectCompilationUnits((IPackageFragmentRoot) elem,
								result);
						break;
					case IJavaElement.JAVA_PROJECT:
						IPackageFragmentRoot[] roots = ((IJavaProject) elem)
								.getPackageFragmentRoots();
						for (int k = 0; k < roots.length; k++) {
							collectCompilationUnits(roots[k], result);
						}
						break;
					}
				}
			} else if (element instanceof LogicalPackage) {
				IPackageFragment[] packageFragments = ((LogicalPackage) element)
						.getFragments();
				for (int k = 0; k < packageFragments.length; k++) {
					IPackageFragment pack = packageFragments[k];
					if (pack.exists()) {
						collectCompilationUnits(pack, result);
					}
				}
			} else if (element instanceof IWorkingSet) {
				IWorkingSet workingSet = (IWorkingSet) element;
				IAdaptable[] elements = workingSet.getElements();
				for (int j = 0; j < elements.length; j++) {
					collectCompilationUnits(elements[j], result);
				}
			}
		} catch (JavaModelException e) {
			if (JavaModelUtil.isExceptionToBeLogged(e))
				JavaPlugin.log(e);
		}
	}

	private static void collectCompilationUnits(IPackageFragment pack,
			Collection<IJavaElement> result) throws JavaModelException {
		result.addAll(Arrays.asList(pack.getCompilationUnits()));
	}

	private static void collectCompilationUnits(IPackageFragmentRoot root,
			Collection<IJavaElement> result) throws JavaModelException {
		if (root.getKind() == IPackageFragmentRoot.K_SOURCE) {
			IJavaElement[] children = root.getChildren();
			for (int i = 0; i < children.length; i++) {
				collectCompilationUnits((IPackageFragment) children[i], result);
			}
		}
	}
}
