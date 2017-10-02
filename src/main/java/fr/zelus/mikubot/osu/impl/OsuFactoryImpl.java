/**
 */
package fr.zelus.mikubot.osu.impl;

import fr.zelus.mikubot.osu.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsuFactoryImpl extends EFactoryImpl implements OsuFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OsuFactory init() {
		try {
			OsuFactory theOsuFactory = (OsuFactory)EPackage.Registry.INSTANCE.getEFactory(OsuPackage.eNS_URI);
			if (theOsuFactory != null) {
				return theOsuFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OsuFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsuFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OsuPackage.OSU_MODEL: return (EObject)createOsuModel();
			case OsuPackage.BEATMAP_SET: return (EObject)createBeatmapSet();
			case OsuPackage.BEATMAP: return (EObject)createBeatmap();
			case OsuPackage.ARTIST: return (EObject)createArtist();
			case OsuPackage.TAG: return (EObject)createTag();
			case OsuPackage.SOURCE: return (EObject)createSource();
			case OsuPackage.OSU_USER: return (EObject)createOsuUser();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OsuPackage.MODE:
				return createModeFromString(eDataType, initialValue);
			case OsuPackage.STATUS:
				return createStatusFromString(eDataType, initialValue);
			case OsuPackage.GENRE:
				return createGenreFromString(eDataType, initialValue);
			case OsuPackage.LANGUAGE:
				return createLanguageFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OsuPackage.MODE:
				return convertModeToString(eDataType, instanceValue);
			case OsuPackage.STATUS:
				return convertStatusToString(eDataType, instanceValue);
			case OsuPackage.GENRE:
				return convertGenreToString(eDataType, instanceValue);
			case OsuPackage.LANGUAGE:
				return convertLanguageToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsuModel createOsuModel() {
		OsuModelImpl osuModel = new OsuModelImpl();
		return osuModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeatmapSet createBeatmapSet() {
		BeatmapSetImpl beatmapSet = new BeatmapSetImpl();
		return beatmapSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Beatmap createBeatmap() {
		BeatmapImpl beatmap = new BeatmapImpl();
		return beatmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artist createArtist() {
		ArtistImpl artist = new ArtistImpl();
		return artist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsuUser createOsuUser() {
		OsuUserImpl osuUser = new OsuUserImpl();
		return osuUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createModeFromString(EDataType eDataType, String initialValue) {
		Mode result = Mode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatusFromString(EDataType eDataType, String initialValue) {
		Status result = Status.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Genre createGenreFromString(EDataType eDataType, String initialValue) {
		Genre result = Genre.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenreToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguageFromString(EDataType eDataType, String initialValue) {
		Language result = Language.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsuPackage getOsuPackage() {
		return (OsuPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OsuPackage getPackage() {
		return OsuPackage.eINSTANCE;
	}

} //OsuFactoryImpl
