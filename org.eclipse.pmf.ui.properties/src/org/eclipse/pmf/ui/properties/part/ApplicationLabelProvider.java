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

package org.eclipse.pmf.ui.properties.part;

import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.pmf.pim.data.provider.DataItemProviderAdapterFactory;
import org.eclipse.pmf.pim.databinding.provider.DatabindingItemProviderAdapterFactory;
import org.eclipse.pmf.pim.datainput.provider.DatainputItemProviderAdapterFactory;
import org.eclipse.pmf.pim.interactive.provider.InteractiveItemProviderAdapterFactory;
import org.eclipse.pmf.pim.provider.PMFItemProviderAdapterFactory;
import org.eclipse.pmf.pim.transformation.provider.TransformationItemProviderAdapterFactory;
import org.eclipse.pmf.pim.ui.provider.UiItemProviderAdapterFactory;
import org.eclipse.swt.graphics.Image;

public class ApplicationLabelProvider extends LabelProvider {

	private ComposedAdapterFactory adapterFactory;
	private AdapterFactoryLabelProvider delegate;

	public ApplicationLabelProvider() {
		adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new PMFItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new DataItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new UiItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new InteractiveItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new DatainputItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new DatabindingItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new TransformationItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		delegate = new AdapterFactoryLabelProvider(adapterFactory);
	}

	@Override
	public String getText(Object element) {
		return delegate.getText(element);
	}

	@Override
	public Image getImage(Object element) {
		return delegate.getImage(element);
	}

	public void dispose() {
		super.dispose();
		delegate.dispose();
		delegate = null;
		adapterFactory = null;
	};
}
