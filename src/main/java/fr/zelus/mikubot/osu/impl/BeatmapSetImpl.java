/**
 */
package fr.zelus.mikubot.osu.impl;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import fr.zelus.mikubot.osu.Beatmap;
import fr.zelus.mikubot.osu.BeatmapSet;
import fr.zelus.mikubot.osu.OsuPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Beatmap Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapSetImpl#getBeatmapSetId <em>Beatmap Set Id</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapSetImpl#getBeatmaps <em>Beatmaps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BeatmapSetImpl extends DefaultPersistentEObject implements BeatmapSet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeatmapSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsuPackage.Literals.BEATMAP_SET;
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
	public int getBeatmapSetId() {
		return (Integer)eGet(OsuPackage.Literals.BEATMAP_SET__BEATMAP_SET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeatmapSetId(int newBeatmapSetId) {
		eSet(OsuPackage.Literals.BEATMAP_SET__BEATMAP_SET_ID, newBeatmapSetId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Beatmap getBeatmaps() {
		return (Beatmap)eGet(OsuPackage.Literals.BEATMAP_SET__BEATMAPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeatmaps(Beatmap newBeatmaps) {
		eSet(OsuPackage.Literals.BEATMAP_SET__BEATMAPS, newBeatmaps);
	}

} //BeatmapSetImpl
