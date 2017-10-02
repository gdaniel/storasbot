/**
 */
package fr.zelus.mikubot.osu.impl;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import fr.zelus.mikubot.osu.Artist;
import fr.zelus.mikubot.osu.Beatmap;
import fr.zelus.mikubot.osu.BeatmapSet;
import fr.zelus.mikubot.osu.OsuModel;
import fr.zelus.mikubot.osu.OsuPackage;
import fr.zelus.mikubot.osu.OsuUser;
import fr.zelus.mikubot.osu.Source;
import fr.zelus.mikubot.osu.Tag;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.zelus.mikubot.osu.impl.OsuModelImpl#getBeatmapSets <em>Beatmap Sets</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.OsuModelImpl#getBeatmaps <em>Beatmaps</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.OsuModelImpl#getArtists <em>Artists</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.OsuModelImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.OsuModelImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.OsuModelImpl#getUsers <em>Users</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OsuModelImpl extends DefaultPersistentEObject implements OsuModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsuModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsuPackage.Literals.OSU_MODEL;
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
	@SuppressWarnings("unchecked")
	public EList<BeatmapSet> getBeatmapSets() {
		return (EList<BeatmapSet>)eGet(OsuPackage.Literals.OSU_MODEL__BEATMAP_SETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Beatmap> getBeatmaps() {
		return (EList<Beatmap>)eGet(OsuPackage.Literals.OSU_MODEL__BEATMAPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Artist> getArtists() {
		return (EList<Artist>)eGet(OsuPackage.Literals.OSU_MODEL__ARTISTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Tag> getTags() {
		return (EList<Tag>)eGet(OsuPackage.Literals.OSU_MODEL__TAGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Source> getSources() {
		return (EList<Source>)eGet(OsuPackage.Literals.OSU_MODEL__SOURCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OsuUser> getUsers() {
		return (EList<OsuUser>)eGet(OsuPackage.Literals.OSU_MODEL__USERS, true);
	}

} //OsuModelImpl
