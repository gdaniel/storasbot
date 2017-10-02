/**
 */
package fr.zelus.mikubot.osu.impl;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import fr.zelus.mikubot.osu.OsuPackage;
import fr.zelus.mikubot.osu.OsuUser;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.zelus.mikubot.osu.impl.OsuUserImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.impl.OsuUserImpl#getUsername <em>Username</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OsuUserImpl extends DefaultPersistentEObject implements OsuUser {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsuUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsuPackage.Literals.OSU_USER;
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
	public int getUserId() {
		return (Integer)eGet(OsuPackage.Literals.OSU_USER__USER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserId(int newUserId) {
		eSet(OsuPackage.Literals.OSU_USER__USER_ID, newUserId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return (String)eGet(OsuPackage.Literals.OSU_USER__USERNAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		eSet(OsuPackage.Literals.OSU_USER__USERNAME, newUsername);
	}

} //OsuUserImpl
