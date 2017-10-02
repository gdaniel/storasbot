/**
 */
package fr.zelus.mikubot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.zelus.mikubot.MikubotPackage
 * @generated
 */
public interface MikubotFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MikubotFactory eINSTANCE = fr.zelus.mikubot.impl.MikubotFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Miku</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Miku</em>'.
	 * @generated
	 */
	Miku createMiku();

	/**
	 * Returns a new object of class '<em>Country Tracker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Country Tracker</em>'.
	 * @generated
	 */
	CountryTracker createCountryTracker();

	/**
	 * Returns a new object of class '<em>Country Tracker Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Country Tracker Entry</em>'.
	 * @generated
	 */
	CountryTrackerEntry createCountryTrackerEntry();

	/**
	 * Returns a new object of class '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Country</em>'.
	 * @generated
	 */
	Country createCountry();

	/**
	 * Returns a new object of class '<em>Player Tracker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player Tracker</em>'.
	 * @generated
	 */
	PlayerTracker createPlayerTracker();

	/**
	 * Returns a new object of class '<em>Player Tracker Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player Tracker Entry</em>'.
	 * @generated
	 */
	PlayerTrackerEntry createPlayerTrackerEntry();

	/**
	 * Returns a new object of class '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player</em>'.
	 * @generated
	 */
	Player createPlayer();

	/**
	 * Returns a new object of class '<em>Play</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Play</em>'.
	 * @generated
	 */
	Play createPlay();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MikubotPackage getMikubotPackage();

} //MikubotFactory
