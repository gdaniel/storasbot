/**
 */
package fr.zelus.mikubot.osu;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see fr.zelus.mikubot.osu.OsuFactory
 * @model kind="package"
 * @generated
 */
public interface OsuPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "osu";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fr.zelus.mikubot.osu";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fr.zelus.mikubot.osu";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OsuPackage eINSTANCE = fr.zelus.mikubot.osu.impl.OsuPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.zelus.mikubot.osu.impl.OsuModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.zelus.mikubot.osu.impl.OsuModelImpl
	 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getOsuModel()
	 * @generated
	 */
	int OSU_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Beatmap Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSU_MODEL__BEATMAP_SETS = 0;

	/**
	 * The feature id for the '<em><b>Beatmaps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSU_MODEL__BEATMAPS = 1;

	/**
	 * The feature id for the '<em><b>Artists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSU_MODEL__ARTISTS = 2;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSU_MODEL__TAGS = 3;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSU_MODEL__SOURCES = 4;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSU_MODEL__USERS = 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSU_MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSU_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.zelus.mikubot.osu.impl.BeatmapSetImpl <em>Beatmap Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.zelus.mikubot.osu.impl.BeatmapSetImpl
	 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getBeatmapSet()
	 * @generated
	 */
	int BEATMAP_SET = 1;

	/**
	 * The feature id for the '<em><b>Beatmap Set Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP_SET__BEATMAP_SET_ID = 0;

	/**
	 * The feature id for the '<em><b>Beatmaps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP_SET__BEATMAPS = 1;

	/**
	 * The number of structural features of the '<em>Beatmap Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP_SET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Beatmap Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.zelus.mikubot.osu.impl.BeatmapImpl <em>Beatmap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.zelus.mikubot.osu.impl.BeatmapImpl
	 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getBeatmap()
	 * @generated
	 */
	int BEATMAP = 2;

	/**
	 * The feature id for the '<em><b>Beatmap Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__BEATMAP_ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Difficulty Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__DIFFICULTY_RATING = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Artist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__ARTIST = 4;

	/**
	 * The feature id for the '<em><b>Approach Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__APPROACH_RATE = 5;

	/**
	 * The feature id for the '<em><b>Health Drain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__HEALTH_DRAIN = 6;

	/**
	 * The feature id for the '<em><b>Overall Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__OVERALL_DIFFICULTY = 7;

	/**
	 * The feature id for the '<em><b>Circle Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__CIRCLE_SIZE = 8;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__MODE = 9;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__STATUS = 10;

	/**
	 * The feature id for the '<em><b>Approved Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__APPROVED_DATE = 11;

	/**
	 * The feature id for the '<em><b>Last Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__LAST_UPDATE = 12;

	/**
	 * The feature id for the '<em><b>Bpm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__BPM = 13;

	/**
	 * The feature id for the '<em><b>Hit Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__HIT_LENGTH = 14;

	/**
	 * The feature id for the '<em><b>Total Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__TOTAL_LENGTH = 15;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__TAGS = 16;

	/**
	 * The feature id for the '<em><b>Max Combo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__MAX_COMBO = 17;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__SOURCE = 18;

	/**
	 * The feature id for the '<em><b>Genre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__GENRE = 19;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__LANGUAGE = 20;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP__CREATOR = 21;

	/**
	 * The number of structural features of the '<em>Beatmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP_FEATURE_COUNT = 22;

	/**
	 * The number of operations of the '<em>Beatmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEATMAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.zelus.mikubot.osu.impl.ArtistImpl <em>Artist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.zelus.mikubot.osu.impl.ArtistImpl
	 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getArtist()
	 * @generated
	 */
	int ARTIST = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__NAME = 0;

	/**
	 * The number of structural features of the '<em>Artist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Artist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.zelus.mikubot.osu.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.zelus.mikubot.osu.impl.TagImpl
	 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.zelus.mikubot.osu.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.zelus.mikubot.osu.impl.SourceImpl
	 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.zelus.mikubot.osu.impl.OsuUserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.zelus.mikubot.osu.impl.OsuUserImpl
	 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getOsuUser()
	 * @generated
	 */
	int OSU_USER = 6;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSU_USER__USER_ID = 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSU_USER__USERNAME = 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSU_USER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSU_USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.zelus.mikubot.osu.Mode <em>Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.zelus.mikubot.osu.Mode
	 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 7;

	/**
	 * The meta object id for the '{@link fr.zelus.mikubot.osu.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.zelus.mikubot.osu.Status
	 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 8;

	/**
	 * The meta object id for the '{@link fr.zelus.mikubot.osu.Genre <em>Genre</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.zelus.mikubot.osu.Genre
	 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getGenre()
	 * @generated
	 */
	int GENRE = 9;

	/**
	 * The meta object id for the '{@link fr.zelus.mikubot.osu.Language <em>Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.zelus.mikubot.osu.Language
	 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 10;


	/**
	 * Returns the meta object for class '{@link fr.zelus.mikubot.osu.OsuModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see fr.zelus.mikubot.osu.OsuModel
	 * @generated
	 */
	EClass getOsuModel();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.zelus.mikubot.osu.OsuModel#getBeatmapSets <em>Beatmap Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beatmap Sets</em>'.
	 * @see fr.zelus.mikubot.osu.OsuModel#getBeatmapSets()
	 * @see #getOsuModel()
	 * @generated
	 */
	EReference getOsuModel_BeatmapSets();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.zelus.mikubot.osu.OsuModel#getBeatmaps <em>Beatmaps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beatmaps</em>'.
	 * @see fr.zelus.mikubot.osu.OsuModel#getBeatmaps()
	 * @see #getOsuModel()
	 * @generated
	 */
	EReference getOsuModel_Beatmaps();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.zelus.mikubot.osu.OsuModel#getArtists <em>Artists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artists</em>'.
	 * @see fr.zelus.mikubot.osu.OsuModel#getArtists()
	 * @see #getOsuModel()
	 * @generated
	 */
	EReference getOsuModel_Artists();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.zelus.mikubot.osu.OsuModel#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see fr.zelus.mikubot.osu.OsuModel#getTags()
	 * @see #getOsuModel()
	 * @generated
	 */
	EReference getOsuModel_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.zelus.mikubot.osu.OsuModel#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see fr.zelus.mikubot.osu.OsuModel#getSources()
	 * @see #getOsuModel()
	 * @generated
	 */
	EReference getOsuModel_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.zelus.mikubot.osu.OsuModel#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see fr.zelus.mikubot.osu.OsuModel#getUsers()
	 * @see #getOsuModel()
	 * @generated
	 */
	EReference getOsuModel_Users();

	/**
	 * Returns the meta object for class '{@link fr.zelus.mikubot.osu.BeatmapSet <em>Beatmap Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beatmap Set</em>'.
	 * @see fr.zelus.mikubot.osu.BeatmapSet
	 * @generated
	 */
	EClass getBeatmapSet();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.BeatmapSet#getBeatmapSetId <em>Beatmap Set Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beatmap Set Id</em>'.
	 * @see fr.zelus.mikubot.osu.BeatmapSet#getBeatmapSetId()
	 * @see #getBeatmapSet()
	 * @generated
	 */
	EAttribute getBeatmapSet_BeatmapSetId();

	/**
	 * Returns the meta object for the reference '{@link fr.zelus.mikubot.osu.BeatmapSet#getBeatmaps <em>Beatmaps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Beatmaps</em>'.
	 * @see fr.zelus.mikubot.osu.BeatmapSet#getBeatmaps()
	 * @see #getBeatmapSet()
	 * @generated
	 */
	EReference getBeatmapSet_Beatmaps();

	/**
	 * Returns the meta object for class '{@link fr.zelus.mikubot.osu.Beatmap <em>Beatmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beatmap</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap
	 * @generated
	 */
	EClass getBeatmap();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Beatmap#getBeatmapId <em>Beatmap Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beatmap Id</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getBeatmapId()
	 * @see #getBeatmap()
	 * @generated
	 */
	EAttribute getBeatmap_BeatmapId();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Beatmap#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getTitle()
	 * @see #getBeatmap()
	 * @generated
	 */
	EAttribute getBeatmap_Title();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Beatmap#getDifficultyRating <em>Difficulty Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty Rating</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getDifficultyRating()
	 * @see #getBeatmap()
	 * @generated
	 */
	EAttribute getBeatmap_DifficultyRating();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Beatmap#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getVersion()
	 * @see #getBeatmap()
	 * @generated
	 */
	EAttribute getBeatmap_Version();

	/**
	 * Returns the meta object for the reference '{@link fr.zelus.mikubot.osu.Beatmap#getArtist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Artist</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getArtist()
	 * @see #getBeatmap()
	 * @generated
	 */
	EReference getBeatmap_Artist();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Beatmap#getApproachRate <em>Approach Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approach Rate</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getApproachRate()
	 * @see #getBeatmap()
	 * @generated
	 */
	EAttribute getBeatmap_ApproachRate();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Beatmap#getHealthDrain <em>Health Drain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Health Drain</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getHealthDrain()
	 * @see #getBeatmap()
	 * @generated
	 */
	EAttribute getBeatmap_HealthDrain();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Beatmap#getOverallDifficulty <em>Overall Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overall Difficulty</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getOverallDifficulty()
	 * @see #getBeatmap()
	 * @generated
	 */
	EAttribute getBeatmap_OverallDifficulty();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Beatmap#getCircleSize <em>Circle Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Circle Size</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getCircleSize()
	 * @see #getBeatmap()
	 * @generated
	 */
	EAttribute getBeatmap_CircleSize();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Beatmap#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getMode()
	 * @see #getBeatmap()
	 * @generated
	 */
	EAttribute getBeatmap_Mode();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Beatmap#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getStatus()
	 * @see #getBeatmap()
	 * @generated
	 */
	EAttribute getBeatmap_Status();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Beatmap#getApprovedDate <em>Approved Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approved Date</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getApprovedDate()
	 * @see #getBeatmap()
	 * @generated
	 */
	EAttribute getBeatmap_ApprovedDate();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Beatmap#getLastUpdate <em>Last Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Update</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getLastUpdate()
	 * @see #getBeatmap()
	 * @generated
	 */
	EAttribute getBeatmap_LastUpdate();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Beatmap#getBpm <em>Bpm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bpm</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getBpm()
	 * @see #getBeatmap()
	 * @generated
	 */
	EAttribute getBeatmap_Bpm();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Beatmap#getHitLength <em>Hit Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hit Length</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getHitLength()
	 * @see #getBeatmap()
	 * @generated
	 */
	EAttribute getBeatmap_HitLength();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Beatmap#getTotalLength <em>Total Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Length</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getTotalLength()
	 * @see #getBeatmap()
	 * @generated
	 */
	EAttribute getBeatmap_TotalLength();

	/**
	 * Returns the meta object for the reference list '{@link fr.zelus.mikubot.osu.Beatmap#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getTags()
	 * @see #getBeatmap()
	 * @generated
	 */
	EReference getBeatmap_Tags();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Beatmap#getMaxCombo <em>Max Combo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Combo</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getMaxCombo()
	 * @see #getBeatmap()
	 * @generated
	 */
	EAttribute getBeatmap_MaxCombo();

	/**
	 * Returns the meta object for the reference '{@link fr.zelus.mikubot.osu.Beatmap#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getSource()
	 * @see #getBeatmap()
	 * @generated
	 */
	EReference getBeatmap_Source();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Beatmap#getGenre <em>Genre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genre</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getGenre()
	 * @see #getBeatmap()
	 * @generated
	 */
	EAttribute getBeatmap_Genre();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Beatmap#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getLanguage()
	 * @see #getBeatmap()
	 * @generated
	 */
	EAttribute getBeatmap_Language();

	/**
	 * Returns the meta object for the reference '{@link fr.zelus.mikubot.osu.Beatmap#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Creator</em>'.
	 * @see fr.zelus.mikubot.osu.Beatmap#getCreator()
	 * @see #getBeatmap()
	 * @generated
	 */
	EReference getBeatmap_Creator();

	/**
	 * Returns the meta object for class '{@link fr.zelus.mikubot.osu.Artist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artist</em>'.
	 * @see fr.zelus.mikubot.osu.Artist
	 * @generated
	 */
	EClass getArtist();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Artist#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.zelus.mikubot.osu.Artist#getName()
	 * @see #getArtist()
	 * @generated
	 */
	EAttribute getArtist_Name();

	/**
	 * Returns the meta object for class '{@link fr.zelus.mikubot.osu.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see fr.zelus.mikubot.osu.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.zelus.mikubot.osu.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for class '{@link fr.zelus.mikubot.osu.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see fr.zelus.mikubot.osu.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.Source#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.zelus.mikubot.osu.Source#getName()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Name();

	/**
	 * Returns the meta object for class '{@link fr.zelus.mikubot.osu.OsuUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see fr.zelus.mikubot.osu.OsuUser
	 * @generated
	 */
	EClass getOsuUser();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.OsuUser#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see fr.zelus.mikubot.osu.OsuUser#getUserId()
	 * @see #getOsuUser()
	 * @generated
	 */
	EAttribute getOsuUser_UserId();

	/**
	 * Returns the meta object for the attribute '{@link fr.zelus.mikubot.osu.OsuUser#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see fr.zelus.mikubot.osu.OsuUser#getUsername()
	 * @see #getOsuUser()
	 * @generated
	 */
	EAttribute getOsuUser_Username();

	/**
	 * Returns the meta object for enum '{@link fr.zelus.mikubot.osu.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode</em>'.
	 * @see fr.zelus.mikubot.osu.Mode
	 * @generated
	 */
	EEnum getMode();

	/**
	 * Returns the meta object for enum '{@link fr.zelus.mikubot.osu.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see fr.zelus.mikubot.osu.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for enum '{@link fr.zelus.mikubot.osu.Genre <em>Genre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Genre</em>'.
	 * @see fr.zelus.mikubot.osu.Genre
	 * @generated
	 */
	EEnum getGenre();

	/**
	 * Returns the meta object for enum '{@link fr.zelus.mikubot.osu.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language</em>'.
	 * @see fr.zelus.mikubot.osu.Language
	 * @generated
	 */
	EEnum getLanguage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OsuFactory getOsuFactory();

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
		 * The meta object literal for the '{@link fr.zelus.mikubot.osu.impl.OsuModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.zelus.mikubot.osu.impl.OsuModelImpl
		 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getOsuModel()
		 * @generated
		 */
		EClass OSU_MODEL = eINSTANCE.getOsuModel();

		/**
		 * The meta object literal for the '<em><b>Beatmap Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSU_MODEL__BEATMAP_SETS = eINSTANCE.getOsuModel_BeatmapSets();

		/**
		 * The meta object literal for the '<em><b>Beatmaps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSU_MODEL__BEATMAPS = eINSTANCE.getOsuModel_Beatmaps();

		/**
		 * The meta object literal for the '<em><b>Artists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSU_MODEL__ARTISTS = eINSTANCE.getOsuModel_Artists();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSU_MODEL__TAGS = eINSTANCE.getOsuModel_Tags();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSU_MODEL__SOURCES = eINSTANCE.getOsuModel_Sources();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSU_MODEL__USERS = eINSTANCE.getOsuModel_Users();

		/**
		 * The meta object literal for the '{@link fr.zelus.mikubot.osu.impl.BeatmapSetImpl <em>Beatmap Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.zelus.mikubot.osu.impl.BeatmapSetImpl
		 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getBeatmapSet()
		 * @generated
		 */
		EClass BEATMAP_SET = eINSTANCE.getBeatmapSet();

		/**
		 * The meta object literal for the '<em><b>Beatmap Set Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEATMAP_SET__BEATMAP_SET_ID = eINSTANCE.getBeatmapSet_BeatmapSetId();

		/**
		 * The meta object literal for the '<em><b>Beatmaps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEATMAP_SET__BEATMAPS = eINSTANCE.getBeatmapSet_Beatmaps();

		/**
		 * The meta object literal for the '{@link fr.zelus.mikubot.osu.impl.BeatmapImpl <em>Beatmap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.zelus.mikubot.osu.impl.BeatmapImpl
		 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getBeatmap()
		 * @generated
		 */
		EClass BEATMAP = eINSTANCE.getBeatmap();

		/**
		 * The meta object literal for the '<em><b>Beatmap Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEATMAP__BEATMAP_ID = eINSTANCE.getBeatmap_BeatmapId();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEATMAP__TITLE = eINSTANCE.getBeatmap_Title();

		/**
		 * The meta object literal for the '<em><b>Difficulty Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEATMAP__DIFFICULTY_RATING = eINSTANCE.getBeatmap_DifficultyRating();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEATMAP__VERSION = eINSTANCE.getBeatmap_Version();

		/**
		 * The meta object literal for the '<em><b>Artist</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEATMAP__ARTIST = eINSTANCE.getBeatmap_Artist();

		/**
		 * The meta object literal for the '<em><b>Approach Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEATMAP__APPROACH_RATE = eINSTANCE.getBeatmap_ApproachRate();

		/**
		 * The meta object literal for the '<em><b>Health Drain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEATMAP__HEALTH_DRAIN = eINSTANCE.getBeatmap_HealthDrain();

		/**
		 * The meta object literal for the '<em><b>Overall Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEATMAP__OVERALL_DIFFICULTY = eINSTANCE.getBeatmap_OverallDifficulty();

		/**
		 * The meta object literal for the '<em><b>Circle Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEATMAP__CIRCLE_SIZE = eINSTANCE.getBeatmap_CircleSize();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEATMAP__MODE = eINSTANCE.getBeatmap_Mode();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEATMAP__STATUS = eINSTANCE.getBeatmap_Status();

		/**
		 * The meta object literal for the '<em><b>Approved Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEATMAP__APPROVED_DATE = eINSTANCE.getBeatmap_ApprovedDate();

		/**
		 * The meta object literal for the '<em><b>Last Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEATMAP__LAST_UPDATE = eINSTANCE.getBeatmap_LastUpdate();

		/**
		 * The meta object literal for the '<em><b>Bpm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEATMAP__BPM = eINSTANCE.getBeatmap_Bpm();

		/**
		 * The meta object literal for the '<em><b>Hit Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEATMAP__HIT_LENGTH = eINSTANCE.getBeatmap_HitLength();

		/**
		 * The meta object literal for the '<em><b>Total Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEATMAP__TOTAL_LENGTH = eINSTANCE.getBeatmap_TotalLength();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEATMAP__TAGS = eINSTANCE.getBeatmap_Tags();

		/**
		 * The meta object literal for the '<em><b>Max Combo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEATMAP__MAX_COMBO = eINSTANCE.getBeatmap_MaxCombo();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEATMAP__SOURCE = eINSTANCE.getBeatmap_Source();

		/**
		 * The meta object literal for the '<em><b>Genre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEATMAP__GENRE = eINSTANCE.getBeatmap_Genre();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEATMAP__LANGUAGE = eINSTANCE.getBeatmap_Language();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEATMAP__CREATOR = eINSTANCE.getBeatmap_Creator();

		/**
		 * The meta object literal for the '{@link fr.zelus.mikubot.osu.impl.ArtistImpl <em>Artist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.zelus.mikubot.osu.impl.ArtistImpl
		 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getArtist()
		 * @generated
		 */
		EClass ARTIST = eINSTANCE.getArtist();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIST__NAME = eINSTANCE.getArtist_Name();

		/**
		 * The meta object literal for the '{@link fr.zelus.mikubot.osu.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.zelus.mikubot.osu.impl.TagImpl
		 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.getTag_Name();

		/**
		 * The meta object literal for the '{@link fr.zelus.mikubot.osu.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.zelus.mikubot.osu.impl.SourceImpl
		 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__NAME = eINSTANCE.getSource_Name();

		/**
		 * The meta object literal for the '{@link fr.zelus.mikubot.osu.impl.OsuUserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.zelus.mikubot.osu.impl.OsuUserImpl
		 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getOsuUser()
		 * @generated
		 */
		EClass OSU_USER = eINSTANCE.getOsuUser();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSU_USER__USER_ID = eINSTANCE.getOsuUser_UserId();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSU_USER__USERNAME = eINSTANCE.getOsuUser_Username();

		/**
		 * The meta object literal for the '{@link fr.zelus.mikubot.osu.Mode <em>Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.zelus.mikubot.osu.Mode
		 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getMode()
		 * @generated
		 */
		EEnum MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '{@link fr.zelus.mikubot.osu.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.zelus.mikubot.osu.Status
		 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link fr.zelus.mikubot.osu.Genre <em>Genre</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.zelus.mikubot.osu.Genre
		 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getGenre()
		 * @generated
		 */
		EEnum GENRE = eINSTANCE.getGenre();

		/**
		 * The meta object literal for the '{@link fr.zelus.mikubot.osu.Language <em>Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.zelus.mikubot.osu.Language
		 * @see fr.zelus.mikubot.osu.impl.OsuPackageImpl#getLanguage()
		 * @generated
		 */
		EEnum LANGUAGE = eINSTANCE.getLanguage();

	}

} //OsuPackage
