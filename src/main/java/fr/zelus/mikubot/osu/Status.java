/**
 */
package fr.zelus.mikubot.osu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.zelus.mikubot.osu.OsuPackage#getStatus()
 * @model
 * @generated
 */
public enum Status implements Enumerator {
	/**
	 * The '<em><b>GRAVEYARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAVEYARD_VALUE
	 * @generated
	 * @ordered
	 */
	GRAVEYARD(0, "GRAVEYARD", "GRAVEYARD"),

	/**
	 * The '<em><b>WIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIP_VALUE
	 * @generated
	 * @ordered
	 */
	WIP(1, "WIP", "WIP"),

	/**
	 * The '<em><b>PENDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDING_VALUE
	 * @generated
	 * @ordered
	 */
	PENDING(2, "PENDING", "PENDING"),

	/**
	 * The '<em><b>RANKED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANKED_VALUE
	 * @generated
	 * @ordered
	 */
	RANKED(3, "RANKED", "RANKED"),

	/**
	 * The '<em><b>APPROVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROVED_VALUE
	 * @generated
	 * @ordered
	 */
	APPROVED(4, "APPROVED", "APPROVED"),

	/**
	 * The '<em><b>QUALIFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUALIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	QUALIFIED(5, "QUALIFIED", "QUALIFIED"),

	/**
	 * The '<em><b>LOVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOVED_VALUE
	 * @generated
	 * @ordered
	 */
	LOVED(6, "LOVED", "LOVED");

	/**
	 * The '<em><b>GRAVEYARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GRAVEYARD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAVEYARD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRAVEYARD_VALUE = 0;

	/**
	 * The '<em><b>WIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIP_VALUE = 1;

	/**
	 * The '<em><b>PENDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PENDING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PENDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_VALUE = 2;

	/**
	 * The '<em><b>RANKED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RANKED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RANKED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RANKED_VALUE = 3;

	/**
	 * The '<em><b>APPROVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APPROVED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPROVED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPROVED_VALUE = 4;

	/**
	 * The '<em><b>QUALIFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QUALIFIED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUALIFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFIED_VALUE = 5;

	/**
	 * The '<em><b>LOVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOVED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOVED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOVED_VALUE = 6;

	/**
	 * An array of all the '<em><b>Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Status[] VALUES_ARRAY =
		new Status[] {
			GRAVEYARD,
			WIP,
			PENDING,
			RANKED,
			APPROVED,
			QUALIFIED,
			LOVED,
		};

	/**
	 * A public read-only list of all the '<em><b>Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Status> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Status get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Status result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Status getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Status result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Status get(int value) {
		switch (value) {
			case GRAVEYARD_VALUE: return GRAVEYARD;
			case WIP_VALUE: return WIP;
			case PENDING_VALUE: return PENDING;
			case RANKED_VALUE: return RANKED;
			case APPROVED_VALUE: return APPROVED;
			case QUALIFIED_VALUE: return QUALIFIED;
			case LOVED_VALUE: return LOVED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Status(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Status
