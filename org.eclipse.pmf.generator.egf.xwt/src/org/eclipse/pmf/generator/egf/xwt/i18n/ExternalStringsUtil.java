package org.eclipse.pmf.generator.egf.xwt.i18n;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.pattern.execution.DefaultPatternContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.pmf.generator.egf.xwt.Constants;
import org.eclipse.pmf.generator.egf.xwt.tools.XWTHelper;

public class ExternalStringsUtil {
	private static final String formatValue(String value) {
		StringBuilder stringBuilder = new StringBuilder();

		int upperLength = 0;
		for (int i = 0, l = value.length(); i < l; i++) {
			char c = value.charAt(i);
			if (stringBuilder.length() == 0) {
				stringBuilder.append(Character.toUpperCase(c));
			} else {
				if (Character.isUpperCase(c)) {
					if (upperLength == 0) {
						stringBuilder.append(" ");
					}
					upperLength++;
				} else {
					upperLength = 0;
				}
				stringBuilder.append(Character.toLowerCase(c));
			}
		}
		return stringBuilder.toString();
	}

	public static final String externalize(PatternContext ctx, EObject context,
			String text) {
		return externalize(ctx, context, text, context != null);
	}

	public static final String externalize(PatternContext ctx, EObject context,
			String text, boolean formatValue) {
		if (ctx == null || text == null) {
			return text;
		}
		if (formatValue) {
			text = formatValue(text);
		}
		String className = (String) ctx.getValue(Constants.STRINGS_EXTERNAL);
		if (className == null) {
			return text;
		}
		String packageName = null;
		if (className.indexOf(".") == -1) {
			packageName = (String) ctx.getValue(Constants.MODEL_PACKAGE);
		} else {
			packageName = className.substring(0, className.lastIndexOf("."));
			className = className.substring(className.lastIndexOf(".") + 1);
		}
		String fieldName = context != null ? getFieldName(context) : "COMMON_"
				+ text.toUpperCase();
		PatternContext patternContext = ctx;
		while (patternContext instanceof DefaultPatternContext) {
			try {
				Field f = DefaultPatternContext.class
						.getDeclaredField("parent");
				f.setAccessible(true);
				PatternContext parent = (PatternContext) f.get(patternContext);
				if (parent != null) {
					patternContext = parent;
				} else {
					break;
				}
			} catch (Exception e) {
				break;
			}
		}
		@SuppressWarnings("unchecked")
		Map<String, String> values = (Map<String, String>) patternContext
				.getValue(Constants.STRINGS_EXTERNAL_MAP);
		if (values == null) {
			values = new HashMap<String, String>();
			//load existing values.
			String bundleName = packageName + "." + className.toLowerCase();
			String project = (String) ctx.getValue(Constants.GENERATED_PROJECT);
			IPath path = new Path(project).append(Constants.DEFAULT_SOURCE_FOLDER);
			String[] paths = bundleName.split("\\.");
			for (String segment : paths){
				path = path.append(segment);
			}
			path = path.addFileExtension("properties");
			IFile f = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			if (f.exists()){
				Properties properties = new Properties();
				InputStream in = null;
				try {
					in = f.getContents();
					properties.load(in);
					Enumeration<?> propertyNames = properties.propertyNames();
					while(propertyNames.hasMoreElements()){
						String p = (String) propertyNames.nextElement();
						values.put(p, properties.getProperty(p));
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (CoreException e) {
					e.printStackTrace();
				}finally{
					if (in != null){
						try {
							in.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
			patternContext.setValue(Constants.STRINGS_EXTERNAL_MAP, values);
		}
		String myFieldName = fieldName;
		String existingValue = values.get(myFieldName);
		int count = 0;
		while (existingValue != null && !existingValue.equals(text)) {
			myFieldName = fieldName + "_" + count++;
			existingValue = values.get(myFieldName);
		}
		values.put(myFieldName, text);
		@SuppressWarnings("unchecked")
		Map<String, String> namespaces = (Map<String, String>) ctx
				.getValue(Constants.NAMESPACES);
		if (namespaces == null) {
			namespaces = new HashMap<String, String>();
			ctx.setValue(Constants.NAMESPACES, namespaces);
		}
		String prefix = namespaces.get(packageName);
		if (prefix == null) {
			String[] nsPair = XWTHelper.addNamespace(ctx, packageName + "."
					+ className);
			if (nsPair != null) {
				prefix = nsPair[1];
			}
		}
		return "{x:Static " + prefix + ":" + className + "." + myFieldName
				+ "}";
	}

	private static final String getFieldName(EObject context) {
		if (context == null) {
			return null;
		}
		EObject container = context.eContainer();
		String root = container == null ? "" : getFieldName(container);

		String name = null;
		EStructuralFeature feature = context.eClass().getEStructuralFeature(
				"name");
		if (feature != null && "EString".equals(feature.getEType().getName())) {
			name = (String) context.eGet(feature);
			if (name != null && name.indexOf(".") != -1) {
				name = name.substring(name.lastIndexOf(".") + 1);
			}
		}
		if (name == null) {
			name = "";
		}
		return root.equals("") ? name.toUpperCase().replace(".", "_") : root
				+ "_" + name.toUpperCase().replace(".", "_");
	}
}
