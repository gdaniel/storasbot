/**
 */
package fr.zelus.mikubot.osu;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.zelus.mikubot.osu.OsuModel#getBeatmapSets <em>Beatmap Sets</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.OsuModel#getBeatmaps <em>Beatmaps</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.OsuModel#getArtists <em>Artists</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.OsuModel#getTags <em>Tags</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.OsuModel#getSources <em>Sources</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.OsuModel#getUsers <em>Users</em>}</li>
 * </ul>
 *
 * @see fr.zelus.mikubot.osu.OsuPackage#getOsuModel()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface OsuModel extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>Beatmap Sets</b></em>' containment reference list.
	 * The list contents are of type {@link fr.zelus.mikubot.osu.BeatmapSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beatmap Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beatmap Sets</em>' containment reference list.
	 * @see fr.zelus.mikubot.osu.OsuPackage#getOsuModel_BeatmapSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<BeatmapSet> getBeatmapSets();

	/**
	 * Returns the value of the '<em><b>Beatmaps</b></em>' containment reference list.
	 * The list contents are of type {@link fr.zelus.mikubot.osu.Beatmap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beatmaps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beatmaps</em>' containment reference list.
	 * @see fr.zelus.mikubot.osu.OsuPackage#getOsuModel_Beatmaps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Beatmap> getBeatmaps();

	/**
	 * Returns the value of the '<em><b>Artists</b></em>' containment reference list.
	 * The list contents are of type {@link fr.zelus.mikubot.osu.Artist}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artists</em>' containment reference list.
	 * @see fr.zelus.mikubot.osu.OsuPackage#getOsuModel_Artists()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artist> getArtists();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link fr.zelus.mikubot.osu.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see fr.zelus.mikubot.osu.OsuPackage#getOsuModel_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link fr.zelus.mikubot.osu.Source}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see fr.zelus.mikubot.osu.OsuPackage#getOsuModel_Sources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Source> getSources();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link fr.zelus.mikubot.osu.OsuUser}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see fr.zelus.mikubot.osu.OsuPackage#getOsuModel_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<OsuUser> getUsers();

} // OsuModel
