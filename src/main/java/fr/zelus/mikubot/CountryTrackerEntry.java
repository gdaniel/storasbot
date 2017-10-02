/**
 */
package fr.zelus.mikubot;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country Tracker Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.zelus.mikubot.CountryTrackerEntry#getTrackedCountry <em>Tracked Country</em>}</li>
 * </ul>
 *
 * @see fr.zelus.mikubot.MikubotPackage#getCountryTrackerEntry()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface CountryTrackerEntry extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>Tracked Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracked Country</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracked Country</em>' reference.
	 * @see #setTrackedCountry(Country)
	 * @see fr.zelus.mikubot.MikubotPackage#getCountryTrackerEntry_TrackedCountry()
	 * @model
	 * @generated
	 */
	Country getTrackedCountry();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.CountryTrackerEntry#getTrackedCountry <em>Tracked Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracked Country</em>' reference.
	 * @see #getTrackedCountry()
	 * @generated
	 */
	void setTrackedCountry(Country value);

} // CountryTrackerEntry
