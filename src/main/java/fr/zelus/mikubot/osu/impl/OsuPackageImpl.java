/**
 */
package fr.zelus.mikubot.osu.impl;

import fr.zelus.mikubot.MikubotPackage;

import fr.zelus.mikubot.impl.MikubotPackageImpl;

import fr.zelus.mikubot.osu.Artist;
import fr.zelus.mikubot.osu.Beatmap;
import fr.zelus.mikubot.osu.BeatmapSet;
import fr.zelus.mikubot.osu.Genre;
import fr.zelus.mikubot.osu.Language;
import fr.zelus.mikubot.osu.Mode;
import fr.zelus.mikubot.osu.OsuFactory;
import fr.zelus.mikubot.osu.OsuModel;
import fr.zelus.mikubot.osu.OsuPackage;
import fr.zelus.mikubot.osu.OsuUser;
import fr.zelus.mikubot.osu.Source;
import fr.zelus.mikubot.osu.Status;
import fr.zelus.mikubot.osu.Tag;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsuPackageImpl extends EPackageImpl implements OsuPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osuModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beatmapSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beatmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osuUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genreEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageEEnum = null;

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
	 * @see fr.zelus.mikubot.osu.OsuPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OsuPackageImpl() {
		super(eNS_URI, OsuFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OsuPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OsuPackage init() {
		if (isInited) return (OsuPackage)EPackage.Registry.INSTANCE.getEPackage(OsuPackage.eNS_URI);

		// Obtain or create and register package
		OsuPackageImpl theOsuPackage = (OsuPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OsuPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OsuPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MikubotPackageImpl theMikubotPackage = (MikubotPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MikubotPackage.eNS_URI) instanceof MikubotPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MikubotPackage.eNS_URI) : MikubotPackage.eINSTANCE);

		// Create package meta-data objects
		theOsuPackage.createPackageContents();
		theMikubotPackage.createPackageContents();

		// Initialize created meta-data
		theOsuPackage.initializePackageContents();
		theMikubotPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOsuPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OsuPackage.eNS_URI, theOsuPackage);
		return theOsuPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsuModel() {
		return osuModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsuModel_BeatmapSets() {
		return (EReference)osuModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsuModel_Beatmaps() {
		return (EReference)osuModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsuModel_Artists() {
		return (EReference)osuModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsuModel_Tags() {
		return (EReference)osuModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsuModel_Sources() {
		return (EReference)osuModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsuModel_Users() {
		return (EReference)osuModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeatmapSet() {
		return beatmapSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeatmapSet_BeatmapSetId() {
		return (EAttribute)beatmapSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeatmapSet_Beatmaps() {
		return (EReference)beatmapSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeatmap() {
		return beatmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeatmap_BeatmapId() {
		return (EAttribute)beatmapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeatmap_Title() {
		return (EAttribute)beatmapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeatmap_DifficultyRating() {
		return (EAttribute)beatmapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeatmap_Version() {
		return (EAttribute)beatmapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeatmap_Artist() {
		return (EReference)beatmapEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeatmap_ApproachRate() {
		return (EAttribute)beatmapEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeatmap_HealthDrain() {
		return (EAttribute)beatmapEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeatmap_OverallDifficulty() {
		return (EAttribute)beatmapEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeatmap_CircleSize() {
		return (EAttribute)beatmapEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeatmap_Mode() {
		return (EAttribute)beatmapEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeatmap_Status() {
		return (EAttribute)beatmapEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeatmap_ApprovedDate() {
		return (EAttribute)beatmapEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeatmap_LastUpdate() {
		return (EAttribute)beatmapEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeatmap_Bpm() {
		return (EAttribute)beatmapEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeatmap_HitLength() {
		return (EAttribute)beatmapEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeatmap_TotalLength() {
		return (EAttribute)beatmapEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeatmap_Tags() {
		return (EReference)beatmapEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeatmap_MaxCombo() {
		return (EAttribute)beatmapEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeatmap_Source() {
		return (EReference)beatmapEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeatmap_Genre() {
		return (EAttribute)beatmapEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeatmap_Language() {
		return (EAttribute)beatmapEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeatmap_Creator() {
		return (EReference)beatmapEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtist() {
		return artistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtist_Name() {
		return (EAttribute)artistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Name() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Name() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsuUser() {
		return osuUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsuUser_UserId() {
		return (EAttribute)osuUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsuUser_Username() {
		return (EAttribute)osuUserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMode() {
		return modeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatus() {
		return statusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenre() {
		return genreEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLanguage() {
		return languageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsuFactory getOsuFactory() {
		return (OsuFactory)getEFactoryInstance();
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
		osuModelEClass = createEClass(OSU_MODEL);
		createEReference(osuModelEClass, OSU_MODEL__BEATMAP_SETS);
		createEReference(osuModelEClass, OSU_MODEL__BEATMAPS);
		createEReference(osuModelEClass, OSU_MODEL__ARTISTS);
		createEReference(osuModelEClass, OSU_MODEL__TAGS);
		createEReference(osuModelEClass, OSU_MODEL__SOURCES);
		createEReference(osuModelEClass, OSU_MODEL__USERS);

		beatmapSetEClass = createEClass(BEATMAP_SET);
		createEAttribute(beatmapSetEClass, BEATMAP_SET__BEATMAP_SET_ID);
		createEReference(beatmapSetEClass, BEATMAP_SET__BEATMAPS);

		beatmapEClass = createEClass(BEATMAP);
		createEAttribute(beatmapEClass, BEATMAP__BEATMAP_ID);
		createEAttribute(beatmapEClass, BEATMAP__TITLE);
		createEAttribute(beatmapEClass, BEATMAP__DIFFICULTY_RATING);
		createEAttribute(beatmapEClass, BEATMAP__VERSION);
		createEReference(beatmapEClass, BEATMAP__ARTIST);
		createEAttribute(beatmapEClass, BEATMAP__APPROACH_RATE);
		createEAttribute(beatmapEClass, BEATMAP__HEALTH_DRAIN);
		createEAttribute(beatmapEClass, BEATMAP__OVERALL_DIFFICULTY);
		createEAttribute(beatmapEClass, BEATMAP__CIRCLE_SIZE);
		createEAttribute(beatmapEClass, BEATMAP__MODE);
		createEAttribute(beatmapEClass, BEATMAP__STATUS);
		createEAttribute(beatmapEClass, BEATMAP__APPROVED_DATE);
		createEAttribute(beatmapEClass, BEATMAP__LAST_UPDATE);
		createEAttribute(beatmapEClass, BEATMAP__BPM);
		createEAttribute(beatmapEClass, BEATMAP__HIT_LENGTH);
		createEAttribute(beatmapEClass, BEATMAP__TOTAL_LENGTH);
		createEReference(beatmapEClass, BEATMAP__TAGS);
		createEAttribute(beatmapEClass, BEATMAP__MAX_COMBO);
		createEReference(beatmapEClass, BEATMAP__SOURCE);
		createEAttribute(beatmapEClass, BEATMAP__GENRE);
		createEAttribute(beatmapEClass, BEATMAP__LANGUAGE);
		createEReference(beatmapEClass, BEATMAP__CREATOR);

		artistEClass = createEClass(ARTIST);
		createEAttribute(artistEClass, ARTIST__NAME);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__NAME);

		sourceEClass = createEClass(SOURCE);
		createEAttribute(sourceEClass, SOURCE__NAME);

		osuUserEClass = createEClass(OSU_USER);
		createEAttribute(osuUserEClass, OSU_USER__USER_ID);
		createEAttribute(osuUserEClass, OSU_USER__USERNAME);

		// Create enums
		modeEEnum = createEEnum(MODE);
		statusEEnum = createEEnum(STATUS);
		genreEEnum = createEEnum(GENRE);
		languageEEnum = createEEnum(LANGUAGE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(osuModelEClass, OsuModel.class, "OsuModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsuModel_BeatmapSets(), this.getBeatmapSet(), null, "beatmapSets", null, 0, -1, OsuModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsuModel_Beatmaps(), this.getBeatmap(), null, "beatmaps", null, 0, -1, OsuModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsuModel_Artists(), this.getArtist(), null, "artists", null, 0, -1, OsuModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsuModel_Tags(), this.getTag(), null, "tags", null, 0, -1, OsuModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsuModel_Sources(), this.getSource(), null, "sources", null, 0, -1, OsuModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsuModel_Users(), this.getOsuUser(), null, "users", null, 0, -1, OsuModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beatmapSetEClass, BeatmapSet.class, "BeatmapSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBeatmapSet_BeatmapSetId(), ecorePackage.getEInt(), "beatmapSetId", null, 0, 1, BeatmapSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeatmapSet_Beatmaps(), this.getBeatmap(), null, "beatmaps", null, 0, 1, BeatmapSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beatmapEClass, Beatmap.class, "Beatmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBeatmap_BeatmapId(), ecorePackage.getEInt(), "beatmapId", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeatmap_Title(), ecorePackage.getEString(), "title", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeatmap_DifficultyRating(), ecorePackage.getEDouble(), "difficultyRating", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeatmap_Version(), ecorePackage.getEString(), "version", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeatmap_Artist(), this.getArtist(), null, "artist", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeatmap_ApproachRate(), ecorePackage.getEDouble(), "approachRate", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeatmap_HealthDrain(), ecorePackage.getEDouble(), "healthDrain", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeatmap_OverallDifficulty(), ecorePackage.getEDouble(), "overallDifficulty", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeatmap_CircleSize(), ecorePackage.getEDouble(), "circleSize", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeatmap_Mode(), this.getMode(), "mode", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeatmap_Status(), this.getStatus(), "status", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeatmap_ApprovedDate(), ecorePackage.getEDate(), "approvedDate", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeatmap_LastUpdate(), ecorePackage.getEDate(), "lastUpdate", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeatmap_Bpm(), ecorePackage.getEDouble(), "bpm", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeatmap_HitLength(), ecorePackage.getEInt(), "hitLength", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeatmap_TotalLength(), ecorePackage.getEInt(), "totalLength", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeatmap_Tags(), this.getTag(), null, "tags", null, 0, -1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeatmap_MaxCombo(), ecorePackage.getEInt(), "maxCombo", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeatmap_Source(), this.getSource(), null, "source", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeatmap_Genre(), this.getGenre(), "genre", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeatmap_Language(), this.getLanguage(), "language", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeatmap_Creator(), this.getOsuUser(), null, "creator", null, 0, 1, Beatmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artistEClass, Artist.class, "Artist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtist_Name(), ecorePackage.getEString(), "name", null, 0, 1, Artist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osuUserEClass, OsuUser.class, "OsuUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsuUser_UserId(), ecorePackage.getEInt(), "userId", null, 0, 1, OsuUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsuUser_Username(), ecorePackage.getEString(), "username", null, 0, 1, OsuUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(modeEEnum, Mode.class, "Mode");
		addEEnumLiteral(modeEEnum, Mode.OSU);
		addEEnumLiteral(modeEEnum, Mode.TAIKO);
		addEEnumLiteral(modeEEnum, Mode.CTB);
		addEEnumLiteral(modeEEnum, Mode.MANIA);

		initEEnum(statusEEnum, Status.class, "Status");
		addEEnumLiteral(statusEEnum, Status.GRAVEYARD);
		addEEnumLiteral(statusEEnum, Status.WIP);
		addEEnumLiteral(statusEEnum, Status.PENDING);
		addEEnumLiteral(statusEEnum, Status.RANKED);
		addEEnumLiteral(statusEEnum, Status.APPROVED);
		addEEnumLiteral(statusEEnum, Status.QUALIFIED);
		addEEnumLiteral(statusEEnum, Status.LOVED);

		initEEnum(genreEEnum, Genre.class, "Genre");
		addEEnumLiteral(genreEEnum, Genre.ANY);
		addEEnumLiteral(genreEEnum, Genre.UNSPECIFIED);
		addEEnumLiteral(genreEEnum, Genre.VIDEO_GAME);
		addEEnumLiteral(genreEEnum, Genre.ANIME);
		addEEnumLiteral(genreEEnum, Genre.ROCK);
		addEEnumLiteral(genreEEnum, Genre.POP);
		addEEnumLiteral(genreEEnum, Genre.OTHER);
		addEEnumLiteral(genreEEnum, Genre.NOVELTY);
		addEEnumLiteral(genreEEnum, Genre.HIP_HOP);
		addEEnumLiteral(genreEEnum, Genre.ELECTRONIC);

		initEEnum(languageEEnum, Language.class, "Language");
		addEEnumLiteral(languageEEnum, Language.ANY);
		addEEnumLiteral(languageEEnum, Language.OTHER);
		addEEnumLiteral(languageEEnum, Language.ENGLISH);
		addEEnumLiteral(languageEEnum, Language.JAPANESE);
		addEEnumLiteral(languageEEnum, Language.CHINESE);
		addEEnumLiteral(languageEEnum, Language.INSTRUMENTAL);
		addEEnumLiteral(languageEEnum, Language.KOREAN);
		addEEnumLiteral(languageEEnum, Language.FRENCH);
		addEEnumLiteral(languageEEnum, Language.GERMAN);
		addEEnumLiteral(languageEEnum, Language.SWEDISH);
		addEEnumLiteral(languageEEnum, Language.SPANISH);
		addEEnumLiteral(languageEEnum, Language.ITALIAN);
	}

} //OsuPackageImpl
