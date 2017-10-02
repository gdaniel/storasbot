/**
 */
package fr.zelus.mikubot.util;

import fr.zelus.mikubot.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.zelus.mikubot.MikubotPackage
 * @generated
 */
public class MikubotAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MikubotPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MikubotAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MikubotPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MikubotSwitch<Adapter> modelSwitch =
		new MikubotSwitch<Adapter>() {
			@Override
			public Adapter caseMiku(Miku object) {
				return createMikuAdapter();
			}
			@Override
			public Adapter caseCountryTracker(CountryTracker object) {
				return createCountryTrackerAdapter();
			}
			@Override
			public Adapter caseCountryTrackerEntry(CountryTrackerEntry object) {
				return createCountryTrackerEntryAdapter();
			}
			@Override
			public Adapter caseCountry(Country object) {
				return createCountryAdapter();
			}
			@Override
			public Adapter casePlayerTracker(PlayerTracker object) {
				return createPlayerTrackerAdapter();
			}
			@Override
			public Adapter casePlayerTrackerEntry(PlayerTrackerEntry object) {
				return createPlayerTrackerEntryAdapter();
			}
			@Override
			public Adapter casePlayer(Player object) {
				return createPlayerAdapter();
			}
			@Override
			public Adapter casePlay(Play object) {
				return createPlayAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.zelus.mikubot.Miku <em>Miku</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.zelus.mikubot.Miku
	 * @generated
	 */
	public Adapter createMikuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.zelus.mikubot.CountryTracker <em>Country Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.zelus.mikubot.CountryTracker
	 * @generated
	 */
	public Adapter createCountryTrackerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.zelus.mikubot.CountryTrackerEntry <em>Country Tracker Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.zelus.mikubot.CountryTrackerEntry
	 * @generated
	 */
	public Adapter createCountryTrackerEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.zelus.mikubot.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.zelus.mikubot.Country
	 * @generated
	 */
	public Adapter createCountryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.zelus.mikubot.PlayerTracker <em>Player Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.zelus.mikubot.PlayerTracker
	 * @generated
	 */
	public Adapter createPlayerTrackerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.zelus.mikubot.PlayerTrackerEntry <em>Player Tracker Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.zelus.mikubot.PlayerTrackerEntry
	 * @generated
	 */
	public Adapter createPlayerTrackerEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.zelus.mikubot.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.zelus.mikubot.Player
	 * @generated
	 */
	public Adapter createPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.zelus.mikubot.Play <em>Play</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.zelus.mikubot.Play
	 * @generated
	 */
	public Adapter createPlayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MikubotAdapterFactory
