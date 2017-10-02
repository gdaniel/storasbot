/**
 */
package fr.zelus.mikubot.impl;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import fr.zelus.mikubot.Country;
import fr.zelus.mikubot.CountryTrackerEntry;
import fr.zelus.mikubot.MikubotPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Country Tracker Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.zelus.mikubot.impl.CountryTrackerEntryImpl#getTrackedCountry <em>Tracked Country</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountryTrackerEntryImpl extends DefaultPersistentEObject implements CountryTrackerEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryTrackerEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MikubotPackage.Literals.COUNTRY_TRACKER_ENTRY;
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
	public Country getTrackedCountry() {
		return (Country)eGet(MikubotPackage.Literals.COUNTRY_TRACKER_ENTRY__TRACKED_COUNTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackedCountry(Country newTrackedCountry) {
		eSet(MikubotPackage.Literals.COUNTRY_TRACKER_ENTRY__TRACKED_COUNTRY, newTrackedCountry);
	}

} //CountryTrackerEntryImpl
