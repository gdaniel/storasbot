/**
 */
package fr.zelus.mikubot.impl;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import fr.zelus.mikubot.CountryTracker;
import fr.zelus.mikubot.CountryTrackerEntry;
import fr.zelus.mikubot.MikubotPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Country Tracker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.zelus.mikubot.impl.CountryTrackerImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountryTrackerImpl extends DefaultPersistentEObject implements CountryTracker {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryTrackerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MikubotPackage.Literals.COUNTRY_TRACKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CountryTrackerEntry> getEntries() {
		return (EList<CountryTrackerEntry>)eGet(MikubotPackage.Literals.COUNTRY_TRACKER__ENTRIES, true);
	}

} //CountryTrackerImpl
