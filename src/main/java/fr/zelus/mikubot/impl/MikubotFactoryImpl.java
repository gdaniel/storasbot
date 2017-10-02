/**
 */
package fr.zelus.mikubot.impl;

import fr.zelus.mikubot.*;

import org.eclipse.emf.ecore.EClass;
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
public class MikubotFactoryImpl extends EFactoryImpl implements MikubotFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MikubotFactory init() {
		try {
			MikubotFactory theMikubotFactory = (MikubotFactory)EPackage.Registry.INSTANCE.getEFactory(MikubotPackage.eNS_URI);
			if (theMikubotFactory != null) {
				return theMikubotFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MikubotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MikubotFactoryImpl() {
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
			case MikubotPackage.MIKU: return (EObject)createMiku();
			case MikubotPackage.COUNTRY_TRACKER: return (EObject)createCountryTracker();
			case MikubotPackage.COUNTRY_TRACKER_ENTRY: return (EObject)createCountryTrackerEntry();
			case MikubotPackage.COUNTRY: return (EObject)createCountry();
			case MikubotPackage.PLAYER_TRACKER: return (EObject)createPlayerTracker();
			case MikubotPackage.PLAYER_TRACKER_ENTRY: return (EObject)createPlayerTrackerEntry();
			case MikubotPackage.PLAYER: return (EObject)createPlayer();
			case MikubotPackage.PLAY: return (EObject)createPlay();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Miku createMiku() {
		MikuImpl miku = new MikuImpl();
		return miku;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountryTracker createCountryTracker() {
		CountryTrackerImpl countryTracker = new CountryTrackerImpl();
		return countryTracker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountryTrackerEntry createCountryTrackerEntry() {
		CountryTrackerEntryImpl countryTrackerEntry = new CountryTrackerEntryImpl();
		return countryTrackerEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country createCountry() {
		CountryImpl country = new CountryImpl();
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerTracker createPlayerTracker() {
		PlayerTrackerImpl playerTracker = new PlayerTrackerImpl();
		return playerTracker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerTrackerEntry createPlayerTrackerEntry() {
		PlayerTrackerEntryImpl playerTrackerEntry = new PlayerTrackerEntryImpl();
		return playerTrackerEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Play createPlay() {
		PlayImpl play = new PlayImpl();
		return play;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MikubotPackage getMikubotPackage() {
		return (MikubotPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MikubotPackage getPackage() {
		return MikubotPackage.eINSTANCE;
	}

} //MikubotFactoryImpl
