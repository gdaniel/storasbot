/**
 */
package fr.zelus.mikubot;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;
import fr.zelus.mikubot.osu.OsuModel;
import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Miku</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.zelus.mikubot.Miku#getCountryTracker <em>Country Tracker</em>}</li>
 *   <li>{@link fr.zelus.mikubot.Miku#getPlayerTracker <em>Player Tracker</em>}</li>
 *   <li>{@link fr.zelus.mikubot.Miku#getOsuModel <em>Osu Model</em>}</li>
 *   <li>{@link fr.zelus.mikubot.Miku#getLastDatabaseCheckTimestamp <em>Last Database Check Timestamp</em>}</li>
 * </ul>
 *
 * @see fr.zelus.mikubot.MikubotPackage#getMiku()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface Miku extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>Country Tracker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Tracker</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Tracker</em>' containment reference.
	 * @see #setCountryTracker(CountryTracker)
	 * @see fr.zelus.mikubot.MikubotPackage#getMiku_CountryTracker()
	 * @model containment="true"
	 * @generated
	 */
	CountryTracker getCountryTracker();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.Miku#getCountryTracker <em>Country Tracker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Tracker</em>' containment reference.
	 * @see #getCountryTracker()
	 * @generated
	 */
	void setCountryTracker(CountryTracker value);

	/**
	 * Returns the value of the '<em><b>Player Tracker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player Tracker</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Tracker</em>' containment reference.
	 * @see #setPlayerTracker(PlayerTracker)
	 * @see fr.zelus.mikubot.MikubotPackage#getMiku_PlayerTracker()
	 * @model containment="true"
	 * @generated
	 */
	PlayerTracker getPlayerTracker();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.Miku#getPlayerTracker <em>Player Tracker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player Tracker</em>' containment reference.
	 * @see #getPlayerTracker()
	 * @generated
	 */
	void setPlayerTracker(PlayerTracker value);

	/**
	 * Returns the value of the '<em><b>Osu Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osu Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osu Model</em>' containment reference.
	 * @see #setOsuModel(OsuModel)
	 * @see fr.zelus.mikubot.MikubotPackage#getMiku_OsuModel()
	 * @model containment="true"
	 * @generated
	 */
	OsuModel getOsuModel();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.Miku#getOsuModel <em>Osu Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Osu Model</em>' containment reference.
	 * @see #getOsuModel()
	 * @generated
	 */
	void setOsuModel(OsuModel value);

	/**
	 * Returns the value of the '<em><b>Last Database Check Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Database Check Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Database Check Timestamp</em>' attribute.
	 * @see #setLastDatabaseCheckTimestamp(Date)
	 * @see fr.zelus.mikubot.MikubotPackage#getMiku_LastDatabaseCheckTimestamp()
	 * @model
	 * @generated
	 */
	Date getLastDatabaseCheckTimestamp();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.Miku#getLastDatabaseCheckTimestamp <em>Last Database Check Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Database Check Timestamp</em>' attribute.
	 * @see #getLastDatabaseCheckTimestamp()
	 * @generated
	 */
	void setLastDatabaseCheckTimestamp(Date value);

} // Miku
