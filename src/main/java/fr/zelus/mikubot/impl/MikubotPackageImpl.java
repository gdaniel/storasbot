/**
 */
package fr.zelus.mikubot.impl;

import fr.zelus.mikubot.Country;
import fr.zelus.mikubot.CountryTracker;
import fr.zelus.mikubot.CountryTrackerEntry;
import fr.zelus.mikubot.Miku;
import fr.zelus.mikubot.MikubotFactory;
import fr.zelus.mikubot.MikubotPackage;
import fr.zelus.mikubot.Play;
import fr.zelus.mikubot.Player;
import fr.zelus.mikubot.PlayerTracker;
import fr.zelus.mikubot.PlayerTrackerEntry;

import fr.zelus.mikubot.osu.OsuPackage;

import fr.zelus.mikubot.osu.impl.OsuPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MikubotPackageImpl extends EPackageImpl implements MikubotPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mikuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryTrackerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryTrackerEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerTrackerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerTrackerEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.zelus.mikubot.MikubotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MikubotPackageImpl() {
		super(eNS_URI, MikubotFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MikubotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MikubotPackage init() {
		if (isInited) return (MikubotPackage)EPackage.Registry.INSTANCE.getEPackage(MikubotPackage.eNS_URI);

		// Obtain or create and register package
		MikubotPackageImpl theMikubotPackage = (MikubotPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MikubotPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MikubotPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OsuPackageImpl theOsuPackage = (OsuPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OsuPackage.eNS_URI) instanceof OsuPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OsuPackage.eNS_URI) : OsuPackage.eINSTANCE);

		// Create package meta-data objects
		theMikubotPackage.createPackageContents();
		theOsuPackage.createPackageContents();

		// Initialize created meta-data
		theMikubotPackage.initializePackageContents();
		theOsuPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMikubotPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MikubotPackage.eNS_URI, theMikubotPackage);
		return theMikubotPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiku() {
		return mikuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiku_CountryTracker() {
		return (EReference)mikuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiku_PlayerTracker() {
		return (EReference)mikuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiku_OsuModel() {
		return (EReference)mikuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiku_LastDatabaseCheckTimestamp() {
		return (EAttribute)mikuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountryTracker() {
		return countryTrackerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountryTracker_Entries() {
		return (EReference)countryTrackerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountryTrackerEntry() {
		return countryTrackerEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountryTrackerEntry_TrackedCountry() {
		return (EReference)countryTrackerEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountry() {
		return countryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayerTracker() {
		return playerTrackerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayerTrackerEntry() {
		return playerTrackerEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayer() {
		return playerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlay() {
		return playEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MikubotFactory getMikubotFactory() {
		return (MikubotFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mikuEClass = createEClass(MIKU);
		createEReference(mikuEClass, MIKU__COUNTRY_TRACKER);
		createEReference(mikuEClass, MIKU__PLAYER_TRACKER);
		createEReference(mikuEClass, MIKU__OSU_MODEL);
		createEAttribute(mikuEClass, MIKU__LAST_DATABASE_CHECK_TIMESTAMP);

		countryTrackerEClass = createEClass(COUNTRY_TRACKER);
		createEReference(countryTrackerEClass, COUNTRY_TRACKER__ENTRIES);

		countryTrackerEntryEClass = createEClass(COUNTRY_TRACKER_ENTRY);
		createEReference(countryTrackerEntryEClass, COUNTRY_TRACKER_ENTRY__TRACKED_COUNTRY);

		countryEClass = createEClass(COUNTRY);

		playerTrackerEClass = createEClass(PLAYER_TRACKER);

		playerTrackerEntryEClass = createEClass(PLAYER_TRACKER_ENTRY);

		playerEClass = createEClass(PLAYER);

		playEClass = createEClass(PLAY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OsuPackage theOsuPackage = (OsuPackage)EPackage.Registry.INSTANCE.getEPackage(OsuPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theOsuPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(mikuEClass, Miku.class, "Miku", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMiku_CountryTracker(), this.getCountryTracker(), null, "countryTracker", null, 0, 1, Miku.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiku_PlayerTracker(), this.getPlayerTracker(), null, "playerTracker", null, 0, 1, Miku.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiku_OsuModel(), theOsuPackage.getOsuModel(), null, "osuModel", null, 0, 1, Miku.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiku_LastDatabaseCheckTimestamp(), ecorePackage.getEDate(), "lastDatabaseCheckTimestamp", null, 0, 1, Miku.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countryTrackerEClass, CountryTracker.class, "CountryTracker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCountryTracker_Entries(), this.getCountryTrackerEntry(), null, "entries", null, 0, -1, CountryTracker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countryTrackerEntryEClass, CountryTrackerEntry.class, "CountryTrackerEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCountryTrackerEntry_TrackedCountry(), this.getCountry(), null, "trackedCountry", null, 0, 1, CountryTrackerEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countryEClass, Country.class, "Country", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(playerTrackerEClass, PlayerTracker.class, "PlayerTracker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(playerTrackerEntryEClass, PlayerTrackerEntry.class, "PlayerTrackerEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(playerEClass, Player.class, "Player", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(playEClass, Play.class, "Play", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MikubotPackageImpl
