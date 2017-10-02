/**
 */
package fr.zelus.mikubot.osu.impl;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import fr.zelus.mikubot.osu.Artist;
import fr.zelus.mikubot.osu.Beatmap;
import fr.zelus.mikubot.osu.Genre;
import fr.zelus.mikubot.osu.Language;
import fr.zelus.mikubot.osu.Mode;
import fr.zelus.mikubot.osu.OsuPackage;
import fr.zelus.mikubot.osu.OsuUser;
import fr.zelus.mikubot.osu.Source;
import fr.zelus.mikubot.osu.Status;
import fr.zelus.mikubot.osu.Tag;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Beatmap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getBeatmapId <em>Beatmap Id</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getDifficultyRating <em>Difficulty Rating</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getArtist <em>Artist</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getApproachRate <em>Approach Rate</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getHealthDrain <em>Health Drain</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getOverallDifficulty <em>Overall Difficulty</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getCircleSize <em>Circle Size</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getApprovedDate <em>Approved Date</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getLastUpdate <em>Last Update</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getBpm <em>Bpm</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getHitLength <em>Hit Length</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getTotalLength <em>Total Length</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getMaxCombo <em>Max Combo</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getGenre <em>Genre</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.BeatmapImpl#getCreator <em>Creator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BeatmapImpl extends DefaultPersistentEObject implements Beatmap {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeatmapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsuPackage.Literals.BEATMAP;
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
	public int getBeatmapId() {
		return (Integer)eGet(OsuPackage.Literals.BEATMAP__BEATMAP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeatmapId(int newBeatmapId) {
		eSet(OsuPackage.Literals.BEATMAP__BEATMAP_ID, newBeatmapId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return (String)eGet(OsuPackage.Literals.BEATMAP__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		eSet(OsuPackage.Literals.BEATMAP__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDifficultyRating() {
		return (Double)eGet(OsuPackage.Literals.BEATMAP__DIFFICULTY_RATING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDifficultyRating(double newDifficultyRating) {
		eSet(OsuPackage.Literals.BEATMAP__DIFFICULTY_RATING, newDifficultyRating);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)eGet(OsuPackage.Literals.BEATMAP__VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eSet(OsuPackage.Literals.BEATMAP__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artist getArtist() {
		return (Artist)eGet(OsuPackage.Literals.BEATMAP__ARTIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtist(Artist newArtist) {
		eSet(OsuPackage.Literals.BEATMAP__ARTIST, newArtist);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getApproachRate() {
		return (Double)eGet(OsuPackage.Literals.BEATMAP__APPROACH_RATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApproachRate(double newApproachRate) {
		eSet(OsuPackage.Literals.BEATMAP__APPROACH_RATE, newApproachRate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHealthDrain() {
		return (Double)eGet(OsuPackage.Literals.BEATMAP__HEALTH_DRAIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealthDrain(double newHealthDrain) {
		eSet(OsuPackage.Literals.BEATMAP__HEALTH_DRAIN, newHealthDrain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOverallDifficulty() {
		return (Double)eGet(OsuPackage.Literals.BEATMAP__OVERALL_DIFFICULTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallDifficulty(double newOverallDifficulty) {
		eSet(OsuPackage.Literals.BEATMAP__OVERALL_DIFFICULTY, newOverallDifficulty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCircleSize() {
		return (Double)eGet(OsuPackage.Literals.BEATMAP__CIRCLE_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircleSize(double newCircleSize) {
		eSet(OsuPackage.Literals.BEATMAP__CIRCLE_SIZE, newCircleSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode getMode() {
		return (Mode)eGet(OsuPackage.Literals.BEATMAP__MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(Mode newMode) {
		eSet(OsuPackage.Literals.BEATMAP__MODE, newMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		return (Status)eGet(OsuPackage.Literals.BEATMAP__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		eSet(OsuPackage.Literals.BEATMAP__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getApprovedDate() {
		return (Date)eGet(OsuPackage.Literals.BEATMAP__APPROVED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovedDate(Date newApprovedDate) {
		eSet(OsuPackage.Literals.BEATMAP__APPROVED_DATE, newApprovedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastUpdate() {
		return (Date)eGet(OsuPackage.Literals.BEATMAP__LAST_UPDATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastUpdate(Date newLastUpdate) {
		eSet(OsuPackage.Literals.BEATMAP__LAST_UPDATE, newLastUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBpm() {
		return (Double)eGet(OsuPackage.Literals.BEATMAP__BPM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpm(double newBpm) {
		eSet(OsuPackage.Literals.BEATMAP__BPM, newBpm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHitLength() {
		return (Integer)eGet(OsuPackage.Literals.BEATMAP__HIT_LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHitLength(int newHitLength) {
		eSet(OsuPackage.Literals.BEATMAP__HIT_LENGTH, newHitLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalLength() {
		return (Integer)eGet(OsuPackage.Literals.BEATMAP__TOTAL_LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalLength(int newTotalLength) {
		eSet(OsuPackage.Literals.BEATMAP__TOTAL_LENGTH, newTotalLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Tag> getTags() {
		return (EList<Tag>)eGet(OsuPackage.Literals.BEATMAP__TAGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxCombo() {
		return (Integer)eGet(OsuPackage.Literals.BEATMAP__MAX_COMBO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCombo(int newMaxCombo) {
		eSet(OsuPackage.Literals.BEATMAP__MAX_COMBO, newMaxCombo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getSource() {
		return (Source)eGet(OsuPackage.Literals.BEATMAP__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Source newSource) {
		eSet(OsuPackage.Literals.BEATMAP__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Genre getGenre() {
		return (Genre)eGet(OsuPackage.Literals.BEATMAP__GENRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenre(Genre newGenre) {
		eSet(OsuPackage.Literals.BEATMAP__GENRE, newGenre);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language getLanguage() {
		return (Language)eGet(OsuPackage.Literals.BEATMAP__LANGUAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(Language newLanguage) {
		eSet(OsuPackage.Literals.BEATMAP__LANGUAGE, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsuUser getCreator() {
		return (OsuUser)eGet(OsuPackage.Literals.BEATMAP__CREATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(OsuUser newCreator) {
		eSet(OsuPackage.Literals.BEATMAP__CREATOR, newCreator);
	}

} //BeatmapImpl
