/**
 */
package fr.zelus.mikubot.osu;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beatmap Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.zelus.mikubot.osu.BeatmapSet#getBeatmapSetId <em>Beatmap Set Id</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.BeatmapSet#getBeatmaps <em>Beatmaps</em>}</li>
 * </ul>
 *
 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmapSet()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface BeatmapSet extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>Beatmap Set Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beatmap Set Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beatmap Set Id</em>' attribute.
	 * @see #setBeatmapSetId(int)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmapSet_BeatmapSetId()
	 * @model
	 * @generated
	 */
	int getBeatmapSetId();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.BeatmapSet#getBeatmapSetId <em>Beatmap Set Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beatmap Set Id</em>' attribute.
	 * @see #getBeatmapSetId()
	 * @generated
	 */
	void setBeatmapSetId(int value);

	/**
	 * Returns the value of the '<em><b>Beatmaps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beatmaps</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beatmaps</em>' reference.
	 * @see #setBeatmaps(Beatmap)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmapSet_Beatmaps()
	 * @model
	 * @generated
	 */
	Beatmap getBeatmaps();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.BeatmapSet#getBeatmaps <em>Beatmaps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beatmaps</em>' reference.
	 * @see #getBeatmaps()
	 * @generated
	 */
	void setBeatmaps(Beatmap value);

} // BeatmapSet
