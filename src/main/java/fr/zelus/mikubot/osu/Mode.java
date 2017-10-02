/**
 */
package fr.zelus.mikubot.osu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.zelus.mikubot.osu.OsuPackage#getMode()
 * @model
 * @generated
 */
public enum Mode implements Enumerator {
	/**
	 * The '<em><b>OSU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSU_VALUE
	 * @generated
	 * @ordered
	 */
	OSU(0, "OSU", "OSU"),

	/**
	 * The '<em><b>TAIKO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAIKO_VALUE
	 * @generated
	 * @ordered
	 */
	TAIKO(1, "TAIKO", "TAIKO"),

	/**
	 * The '<em><b>CTB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTB_VALUE
	 * @generated
	 * @ordered
	 */
	CTB(2, "CTB", "CTB"),

	/**
	 * The '<em><b>MANIA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANIA_VALUE
	 * @generated
	 * @ordered
	 */
	MANIA(3, "MANIA", "MANIA");

	/**
	 * The '<em><b>OSU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OSU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OSU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OSU_VALUE = 0;

	/**
	 * The '<em><b>TAIKO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TAIKO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAIKO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TAIKO_VALUE = 1;

	/**
	 * The '<em><b>CTB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CTB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CTB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CTB_VALUE = 2;

	/**
	 * The '<em><b>MANIA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANIA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANIA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANIA_VALUE = 3;

	/**
	 * An array of all the '<em><b>Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Mode[] VALUES_ARRAY =
		new Mode[] {
			OSU,
			TAIKO,
			CTB,
			MANIA,
		};

	/**
	 * A public read-only list of all the '<em><b>Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Mode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Mode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Mode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Mode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Mode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Mode get(int value) {
		switch (value) {
			case OSU_VALUE: return OSU;
			case TAIKO_VALUE: return TAIKO;
			case CTB_VALUE: return CTB;
			case MANIA_VALUE: return MANIA;
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
	private Mode(int value, String name, String literal) {
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
	
} //Mode
