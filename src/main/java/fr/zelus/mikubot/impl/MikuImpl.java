/**
 */
package fr.zelus.mikubot.impl;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import fr.zelus.mikubot.CountryTracker;
import fr.zelus.mikubot.Miku;
import fr.zelus.mikubot.MikubotPackage;
import fr.zelus.mikubot.PlayerTracker;

import fr.zelus.mikubot.osu.OsuModel;
import java.util.Date;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Miku</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.zelus.mikubot.impl.MikuImpl#getCountryTracker <em>Country Tracker</em>}</li>
 *   <li>{@link fr.zelus.mikubot.impl.MikuImpl#getPlayerTracker <em>Player Tracker</em>}</li>
 *   <li>{@link fr.zelus.mikubot.impl.MikuImpl#getOsuModel <em>Osu Model</em>}</li>
 *   <li>{@link fr.zelus.mikubot.impl.MikuImpl#getLastDatabaseCheckTimestamp <em>Last Database Check Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MikuImpl extends DefaultPersistentEObject implements Miku {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MikuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MikubotPackage.Literals.MIKU;
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
	public CountryTracker getCountryTracker() {
		return (CountryTracker)eGet(MikubotPackage.Literals.MIKU__COUNTRY_TRACKER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountryTracker(CountryTracker newCountryTracker) {
		eSet(MikubotPackage.Literals.MIKU__COUNTRY_TRACKER, newCountryTracker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerTracker getPlayerTracker() {
		return (PlayerTracker)eGet(MikubotPackage.Literals.MIKU__PLAYER_TRACKER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayerTracker(PlayerTracker newPlayerTracker) {
		eSet(MikubotPackage.Literals.MIKU__PLAYER_TRACKER, newPlayerTracker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsuModel getOsuModel() {
		return (OsuModel)eGet(MikubotPackage.Literals.MIKU__OSU_MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsuModel(OsuModel newOsuModel) {
		eSet(MikubotPackage.Literals.MIKU__OSU_MODEL, newOsuModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastDatabaseCheckTimestamp() {
		return (Date)eGet(MikubotPackage.Literals.MIKU__LAST_DATABASE_CHECK_TIMESTAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastDatabaseCheckTimestamp(Date newLastDatabaseCheckTimestamp) {
		eSet(MikubotPackage.Literals.MIKU__LAST_DATABASE_CHECK_TIMESTAMP, newLastDatabaseCheckTimestamp);
	}

} //MikuImpl
