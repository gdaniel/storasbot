/**
 */
package fr.zelus.mikubot;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country Tracker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.zelus.mikubot.CountryTracker#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see fr.zelus.mikubot.MikubotPackage#getCountryTracker()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface CountryTracker extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link fr.zelus.mikubot.CountryTrackerEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see fr.zelus.mikubot.MikubotPackage#getCountryTracker_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<CountryTrackerEntry> getEntries();

} // CountryTracker
