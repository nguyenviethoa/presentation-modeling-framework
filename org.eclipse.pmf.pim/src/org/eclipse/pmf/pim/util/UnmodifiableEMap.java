package org.eclipse.pmf.pim.util;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreEMap;

public class UnmodifiableEMap<K, V> extends EcoreEMap<K, V> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6902409549089331183L;

	public UnmodifiableEMap(EClass entryEClass, Class<?> entryClass,
			EMap<K, V> delegateEMap, InternalEObject owner, EStructuralFeature eStructuralFeature) {
		super(entryEClass, entryClass, new EcoreEList.UnmodifiableEList<Entry<K, V>>(owner,
				eStructuralFeature,
				delegateEMap.size(), delegateEMap.entrySet().toArray()));
		this.size = delegateEList.size();
	}
	
	/*
	 * To workaround a bug of EMF. teh attribute size is not initialized with 
	 * the constructor of DelegatedEList
	 * 
	 * @see org.eclipse.emf.common.util.BasicEMap#ensureEntryDataExists()
	 */
	@Override
	protected void ensureEntryDataExists() {
		super.ensureEntryDataExists();
		this.size = delegateEList.size();
	}
}
