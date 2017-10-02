/**
 */
package fr.zelus.mikubot.osu;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.zelus.mikubot.osu.OsuUser#getUserId <em>User Id</em>}</li>
 *   <li>{@link fr.zelus.mikubot.osu.OsuUser#getUsername <em>Username</em>}</li>
 * </ul>
 *
 * @see fr.zelus.mikubot.osu.OsuPackage#getOsuUser()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface OsuUser extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Id</em>' attribute.
	 * @see #setUserId(int)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getOsuUser_UserId()
	 * @model
	 * @generated
	 */
	int getUserId();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.OsuUser#getUserId <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' attribute.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(int value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see fr.zelus.mikubot.osu.OsuPackage#getOsuUser_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link fr.zelus.mikubot.osu.OsuUser#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

} // OsuUser
