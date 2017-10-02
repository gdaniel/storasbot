/**
 */
package fr.zelus.mikubot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.zelus.mikubot.MikubotFactory
 * @model kind="package"
 * @generated
 */
public interface MikubotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mikubot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fr.zelus.mikubot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fr.zelus.mikubot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MikubotPackage eINSTANCE = fr.zelus.mikubot.impl.MikubotPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.zelus.mikubot.impl.MikuImpl <em>Miku</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.zelus.mikubot.impl.MikuImpl
	 * @see fr.zelus.mikubot.impl.MikubotPackageImpl#getMiku()
	 * @generated
	 */
	int MIKU = 0;

	/**
	 * The feature id for the '<em><b>Country Tracker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIKU__COUNTRY_TRACKER = 0;

	/**
	 * The feature id for the '<em><b>Player Tracker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIKU__PLAYER_TRACKER = 1;

	/**
	 * The feature id for the '<em><b>Osu Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIKU__OSU_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Last Database Check Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIKU__LAST_DATABASE_CHECK_TIMESTAMP = 3;

	/**
	 * The number of structural features of the '<em>Miku</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIKU_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Miku</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIKU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.zelus.mikubot.impl.CountryTrackerImpl <em>Country Tracker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.zelus.mikubot.impl.CountryTrackerImpl
	 * @see fr.zelus.mikubot.impl.MikubotPackageImpl#getCountryTracker()
	 * @generated
	 */
	int COUNTRY_TRACKER = 1;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TRACKER__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Country Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TRACKER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Country Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TRACKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.zelus.mikubot.impl.CountryTrackerEntryImpl <em>Country Tracker Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.zelus.mikubot.impl.CountryTrackerEntryImpl
	 * @see fr.zelus.mikubot.impl.MikubotPackageImpl#getCountryTrackerEntry()
	 * @generated
	 */
	int COUNTRY_TRACKER_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Tracked Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TRACKER_ENTRY__TRACKED_COUNTRY = 0;

	/**
	 * The number of structural features of the '<em>Country Tracker Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TRACKER_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Country Tracker Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TRACKER_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.zelus.mikubot.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.zelus.mikubot.impl.CountryImpl
	 * @see fr.zelus.mikubot.impl.MikubotPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 3;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.zelus.mikubot.impl.PlayerTrackerImpl <em>Player Tracker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.zelus.mikubot.impl.PlayerTrackerImpl
	 * @see fr.zelus.mikubot.impl.MikubotPackageImpl#getPlayerTracker()
	 * @generated
	 */
	int PLAYER_TRACKER = 4;

	/**
	 * The number of structural features of the '<em>Player Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TRACKER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Player Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TRACKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.zelus.mikubot.impl.PlayerTrackerEntryImpl <em>Player Tracker Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.zelus.mikubot.impl.PlayerTrackerEntryImpl
	 * @see fr.zelus.mikubot.impl.MikubotPackageImpl#getPlayerTrackerEntry()
	 * @generated
	 */
	int PLAYER_TRACKER_ENTRY = 5;

	/**
	 * The number of structural features of the '<em>Player Tracker Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TRACKER_ENTRY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Player Tracker Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TRACKER_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.zelus.mikubot.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.zelus.mikubot.impl.PlayerImpl
	 * @see fr.zelus.mikubot.impl.MikubotPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 6;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.zelus.mikubot.impl.PlayImpl <em>Play</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.zelus.mikubot.impl.PlayImpl
	 * @see fr.zelus.mikubot.impl.MikubotPackageImpl#getPlay()
	 * @generated
	 */
	int PLAY = 7;

	/**
	 * The number of structural features of the '<em>Play</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Play</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fr.zelus.mikubot.Miku <em>Miku</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Miku</em>'.
	 * @see fr.zelus.mikubot.Miku
	 * @generated
	 */
	EClass getMiku();

	/**
	 * Returns the meta object for the containment reference '{@link fr.zelus.mikubot.Miku#getCountryTracker <em>Country Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Country Tracker</em>'.
	 * @see fr.zelus.mikubot.Miku#getCountryTracker()
	 * @see #getMiku()
	 * @generated
	 */
	EReference getMiku_CountryTracker();

	/**
	 * Returns the meta object for the containment reference '{@link fr.zelus.mikubot.Miku#getPlayerTracker <em>Player Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Player Tracker</em>'.
	 * @see fr.zelus.mikubot.Miku#getPlayerTracker()
	 * @see #getMiku()
	 * @generated
	 */
	EReference getMiku_PlayerTracker();

	/**
	 * Returns the meta object for the containment reference '{@link fr.zelus.mikubot.Miku#getOsuModel <em>Osu Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Osu Model</em>'.
	 * @see fr.zelus.mikubot.Miku#getOsuModel()
	 * @see #getMiku()
	 * @generated
	 */
	EReference getMiku_OsuModel();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.Miku#getLastDatabaseCheckTimestamp <em>Last Database Check Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Database Check Timestamp</em>'.
	 * @see fr.zelus.mikubot.Miku#getLastDatabaseCheckTimestamp()
	 * @see #getMiku()
	 * @generated
	 */
	EAttribute getMiku_LastDatabaseCheckTimestamp();

	/**
	 * Returns the meta object for class '{@link fr.zelus.mikubot.CountryTracker <em>Country Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Tracker</em>'.
	 * @see fr.zelus.mikubot.CountryTracker
	 * @generated
	 */
	EClass getCountryTracker();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.zelus.mikubot.CountryTracker#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see fr.zelus.mikubot.CountryTracker#getEntries()
	 * @see #getCountryTracker()
	 * @generated
	 */
	EReference getCountryTracker_Entries();

	/**
	 * Returns the meta object for class '{@link fr.zelus.mikubot.CountryTrackerEntry <em>Country Tracker Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Tracker Entry</em>'.
	 * @see fr.zelus.mikubot.CountryTrackerEntry
	 * @generated
	 */
	EClass getCountryTrackerEntry();

	/**
	 * Returns the meta object for the reference '{@link fr.zelus.mikubot.CountryTrackerEntry#getTrackedCountry <em>Tracked Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tracked Country</em>'.
	 * @see fr.zelus.mikubot.CountryTrackerEntry#getTrackedCountry()
	 * @see #getCountryTrackerEntry()
	 * @generated
	 */
	EReference getCountryTrackerEntry_TrackedCountry();

	/**
	 * Returns the meta object for class '{@link fr.zelus.mikubot.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see fr.zelus.mikubot.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for class '{@link fr.zelus.mikubot.PlayerTracker <em>Player Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Tracker</em>'.
	 * @see fr.zelus.mikubot.PlayerTracker
	 * @generated
	 */
	EClass getPlayerTracker();

	/**
	 * Returns the meta object for class '{@link fr.zelus.mikubot.PlayerTrackerEntry <em>Player Tracker Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Tracker Entry</em>'.
	 * @see fr.zelus.mikubot.PlayerTrackerEntry
	 * @generated
	 */
	EClass getPlayerTrackerEntry();

	/**
	 * Returns the meta object for class '{@link fr.zelus.mikubot.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see fr.zelus.mikubot.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for class '{@link fr.zelus.mikubot.Play <em>Play</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Play</em>'.
	 * @see fr.zelus.mikubot.Play
	 * @generated
	 */
	EClass getPlay();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MikubotFactory getMikubotFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.zelus.mikubot.impl.MikuImpl <em>Miku</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.zelus.mikubot.impl.MikuImpl
		 * @see fr.zelus.mikubot.impl.MikubotPackageImpl#getMiku()
		 * @generated
		 */
		EClass MIKU = eINSTANCE.getMiku();

		/**
		 * The meta object literal for the '<em><b>Country Tracker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIKU__COUNTRY_TRACKER = eINSTANCE.getMiku_CountryTracker();

		/**
		 * The meta object literal for the '<em><b>Player Tracker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIKU__PLAYER_TRACKER = eINSTANCE.getMiku_PlayerTracker();

		/**
		 * The meta object literal for the '<em><b>Osu Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIKU__OSU_MODEL = eINSTANCE.getMiku_OsuModel();

		/**
		 * The meta object literal for the '<em><b>Last Database Check Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIKU__LAST_DATABASE_CHECK_TIMESTAMP = eINSTANCE.getMiku_LastDatabaseCheckTimestamp();

		/**
		 * The meta object literal for the '{@link fr.zelus.mikubot.impl.CountryTrackerImpl <em>Country Tracker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.zelus.mikubot.impl.CountryTrackerImpl
		 * @see fr.zelus.mikubot.impl.MikubotPackageImpl#getCountryTracker()
		 * @generated
		 */
		EClass COUNTRY_TRACKER = eINSTANCE.getCountryTracker();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY_TRACKER__ENTRIES = eINSTANCE.getCountryTracker_Entries();

		/**
		 * The meta object literal for the '{@link fr.zelus.mikubot.impl.CountryTrackerEntryImpl <em>Country Tracker Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.zelus.mikubot.impl.CountryTrackerEntryImpl
		 * @see fr.zelus.mikubot.impl.MikubotPackageImpl#getCountryTrackerEntry()
		 * @generated
		 */
		EClass COUNTRY_TRACKER_ENTRY = eINSTANCE.getCountryTrackerEntry();

		/**
		 * The meta object literal for the '<em><b>Tracked Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY_TRACKER_ENTRY__TRACKED_COUNTRY = eINSTANCE.getCountryTrackerEntry_TrackedCountry();

		/**
		 * The meta object literal for the '{@link fr.zelus.mikubot.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.zelus.mikubot.impl.CountryImpl
		 * @see fr.zelus.mikubot.impl.MikubotPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '{@link fr.zelus.mikubot.impl.PlayerTrackerImpl <em>Player Tracker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.zelus.mikubot.impl.PlayerTrackerImpl
		 * @see fr.zelus.mikubot.impl.MikubotPackageImpl#getPlayerTracker()
		 * @generated
		 */
		EClass PLAYER_TRACKER = eINSTANCE.getPlayerTracker();

		/**
		 * The meta object literal for the '{@link fr.zelus.mikubot.impl.PlayerTrackerEntryImpl <em>Player Tracker Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.zelus.mikubot.impl.PlayerTrackerEntryImpl
		 * @see fr.zelus.mikubot.impl.MikubotPackageImpl#getPlayerTrackerEntry()
		 * @generated
		 */
		EClass PLAYER_TRACKER_ENTRY = eINSTANCE.getPlayerTrackerEntry();

		/**
		 * The meta object literal for the '{@link fr.zelus.mikubot.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.zelus.mikubot.impl.PlayerImpl
		 * @see fr.zelus.mikubot.impl.MikubotPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '{@link fr.zelus.mikubot.impl.PlayImpl <em>Play</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.zelus.mikubot.impl.PlayImpl
		 * @see fr.zelus.mikubot.impl.MikubotPackageImpl#getPlay()
		 * @generated
		 */
		EClass PLAY = eINSTANCE.getPlay();

	}

} //MikubotPackage
