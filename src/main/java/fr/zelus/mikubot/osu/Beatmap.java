/**
 */
package fr.zelus.mikubot.osu;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beatmap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getBeatmapId <em>Beatmap Id</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getDifficultyRating <em>Difficulty Rating</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getArtist <em>Artist</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getApproachRate <em>Approach Rate</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getHealthDrain <em>Health Drain</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getOverallDifficulty <em>Overall Difficulty</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getCircleSize <em>Circle Size</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getMode <em>Mode</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getApprovedDate <em>Approved Date</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getLastUpdate <em>Last Update</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getBpm <em>Bpm</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getHitLength <em>Hit Length</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getTotalLength <em>Total Length</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getTags <em>Tags</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getMaxCombo <em>Max Combo</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getSource <em>Source</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getGenre <em>Genre</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getLanguage <em>Language</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.Beatmap#getCreator <em>Creator</em>}</li>
 * </ul>
 *
 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface Beatmap extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>Beatmap Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beatmap Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beatmap Id</em>' attribute.
	 * @see #setBeatmapId(int)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_BeatmapId()
	 * @model
	 * @generated
	 */
	int getBeatmapId();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getBeatmapId <em>Beatmap Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beatmap Id</em>' attribute.
	 * @see #getBeatmapId()
	 * @generated
	 */
	void setBeatmapId(int value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Difficulty Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Difficulty Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty Rating</em>' attribute.
	 * @see #setDifficultyRating(double)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_DifficultyRating()
	 * @model
	 * @generated
	 */
	double getDifficultyRating();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getDifficultyRating <em>Difficulty Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty Rating</em>' attribute.
	 * @see #getDifficultyRating()
	 * @generated
	 */
	void setDifficultyRating(double value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Artist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artist</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artist</em>' reference.
	 * @see #setArtist(Artist)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_Artist()
	 * @model
	 * @generated
	 */
	Artist getArtist();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getArtist <em>Artist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artist</em>' reference.
	 * @see #getArtist()
	 * @generated
	 */
	void setArtist(Artist value);

	/**
	 * Returns the value of the '<em><b>Approach Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approach Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approach Rate</em>' attribute.
	 * @see #setApproachRate(double)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_ApproachRate()
	 * @model
	 * @generated
	 */
	double getApproachRate();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getApproachRate <em>Approach Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approach Rate</em>' attribute.
	 * @see #getApproachRate()
	 * @generated
	 */
	void setApproachRate(double value);

	/**
	 * Returns the value of the '<em><b>Health Drain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Health Drain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Drain</em>' attribute.
	 * @see #setHealthDrain(double)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_HealthDrain()
	 * @model
	 * @generated
	 */
	double getHealthDrain();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getHealthDrain <em>Health Drain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Drain</em>' attribute.
	 * @see #getHealthDrain()
	 * @generated
	 */
	void setHealthDrain(double value);

	/**
	 * Returns the value of the '<em><b>Overall Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overall Difficulty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overall Difficulty</em>' attribute.
	 * @see #setOverallDifficulty(double)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_OverallDifficulty()
	 * @model
	 * @generated
	 */
	double getOverallDifficulty();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getOverallDifficulty <em>Overall Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overall Difficulty</em>' attribute.
	 * @see #getOverallDifficulty()
	 * @generated
	 */
	void setOverallDifficulty(double value);

	/**
	 * Returns the value of the '<em><b>Circle Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circle Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circle Size</em>' attribute.
	 * @see #setCircleSize(double)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_CircleSize()
	 * @model
	 * @generated
	 */
	double getCircleSize();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getCircleSize <em>Circle Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circle Size</em>' attribute.
	 * @see #getCircleSize()
	 * @generated
	 */
	void setCircleSize(double value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.zelus.mikubot.osu.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see fr.zelus.mikubot.osu.Mode
	 * @see #setMode(Mode)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_Mode()
	 * @model
	 * @generated
	 */
	Mode getMode();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see fr.zelus.mikubot.osu.Mode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Mode value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.zelus.mikubot.osu.Status}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see fr.zelus.mikubot.osu.Status
	 * @see #setStatus(Status)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see fr.zelus.mikubot.osu.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Approved Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approved Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved Date</em>' attribute.
	 * @see #setApprovedDate(Date)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_ApprovedDate()
	 * @model
	 * @generated
	 */
	Date getApprovedDate();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getApprovedDate <em>Approved Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approved Date</em>' attribute.
	 * @see #getApprovedDate()
	 * @generated
	 */
	void setApprovedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Update</em>' attribute.
	 * @see #setLastUpdate(Date)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_LastUpdate()
	 * @model
	 * @generated
	 */
	Date getLastUpdate();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getLastUpdate <em>Last Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Update</em>' attribute.
	 * @see #getLastUpdate()
	 * @generated
	 */
	void setLastUpdate(Date value);

	/**
	 * Returns the value of the '<em><b>Bpm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bpm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpm</em>' attribute.
	 * @see #setBpm(double)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_Bpm()
	 * @model
	 * @generated
	 */
	double getBpm();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getBpm <em>Bpm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bpm</em>' attribute.
	 * @see #getBpm()
	 * @generated
	 */
	void setBpm(double value);

	/**
	 * Returns the value of the '<em><b>Hit Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hit Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hit Length</em>' attribute.
	 * @see #setHitLength(int)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_HitLength()
	 * @model
	 * @generated
	 */
	int getHitLength();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getHitLength <em>Hit Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hit Length</em>' attribute.
	 * @see #getHitLength()
	 * @generated
	 */
	void setHitLength(int value);

	/**
	 * Returns the value of the '<em><b>Total Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Length</em>' attribute.
	 * @see #setTotalLength(int)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_TotalLength()
	 * @model
	 * @generated
	 */
	int getTotalLength();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getTotalLength <em>Total Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Length</em>' attribute.
	 * @see #getTotalLength()
	 * @generated
	 */
	void setTotalLength(int value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link fr.zelus.mikubot.osu.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_Tags()
	 * @model
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Max Combo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Combo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Combo</em>' attribute.
	 * @see #setMaxCombo(int)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_MaxCombo()
	 * @model
	 * @generated
	 */
	int getMaxCombo();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getMaxCombo <em>Max Combo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Combo</em>' attribute.
	 * @see #getMaxCombo()
	 * @generated
	 */
	void setMaxCombo(int value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Source)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_Source()
	 * @model
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

	/**
	 * Returns the value of the '<em><b>Genre</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.zelus.mikubot.osu.Genre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genre</em>' attribute.
	 * @see fr.zelus.mikubot.osu.Genre
	 * @see #setGenre(Genre)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_Genre()
	 * @model
	 * @generated
	 */
	Genre getGenre();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getGenre <em>Genre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genre</em>' attribute.
	 * @see fr.zelus.mikubot.osu.Genre
	 * @see #getGenre()
	 * @generated
	 */
	void setGenre(Genre value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.zelus.mikubot.osu.Language}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see fr.zelus.mikubot.osu.Language
	 * @see #setLanguage(Language)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_Language()
	 * @model
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see fr.zelus.mikubot.osu.Language
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' reference.
	 * @see #setCreator(OsuUser)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getBeatmap_Creator()
	 * @model
	 * @generated
	 */
	OsuUser getCreator();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.Beatmap#getCreator <em>Creator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(OsuUser value);

} // Beatmap
