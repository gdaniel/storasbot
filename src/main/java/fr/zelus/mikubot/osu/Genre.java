/**
 */
package fr.zelus.mikubot.osu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Genre</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.zelus.mikubot.osu.OsuPackage#getGenre()
 * @model
 * @generated
 */
public enum Genre implements Enumerator {
	/**
	 * The '<em><b>ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY(0, "ANY", "ANY"),

	/**
	 * The '<em><b>UNSPECIFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSPECIFIED(1, "UNSPECIFIED", "UNSPECIFIED"),

	/**
	 * The '<em><b>VIDEO GAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_GAME_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_GAME(2, "VIDEO_GAME", "VIDEO_GAME"),

	/**
	 * The '<em><b>ANIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANIME_VALUE
	 * @generated
	 * @ordered
	 */
	ANIME(3, "ANIME", "ANIME"),

	/**
	 * The '<em><b>ROCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROCK_VALUE
	 * @generated
	 * @ordered
	 */
	ROCK(4, "ROCK", "ROCK"),

	/**
	 * The '<em><b>POP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POP_VALUE
	 * @generated
	 * @ordered
	 */
	POP(5, "POP", "POP"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(6, "OTHER", "OTHER"),

	/**
	 * The '<em><b>NOVELTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOVELTY_VALUE
	 * @generated
	 * @ordered
	 */
	NOVELTY(7, "NOVELTY", "NOVELTY"),

	/**
	 * The '<em><b>HIP HOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIP_HOP_VALUE
	 * @generated
	 * @ordered
	 */
	HIP_HOP(9, "HIP_HOP", "HIP_HOP"),

	/**
	 * The '<em><b>ELECTRONIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRONIC_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRONIC(10, "ELECTRONIC", "ELECTRONIC");

	/**
	 * The '<em><b>ANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VALUE = 0;

	/**
	 * The '<em><b>UNSPECIFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNSPECIFIED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSPECIFIED_VALUE = 1;

	/**
	 * The '<em><b>VIDEO GAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VIDEO GAME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIDEO_GAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_GAME_VALUE = 2;

	/**
	 * The '<em><b>ANIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANIME_VALUE = 3;

	/**
	 * The '<em><b>ROCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROCK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROCK_VALUE = 4;

	/**
	 * The '<em><b>POP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POP_VALUE = 5;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 6;

	/**
	 * The '<em><b>NOVELTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOVELTY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOVELTY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOVELTY_VALUE = 7;

	/**
	 * The '<em><b>HIP HOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIP HOP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIP_HOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIP_HOP_VALUE = 9;

	/**
	 * The '<em><b>ELECTRONIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ELECTRONIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELECTRONIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRONIC_VALUE = 10;

	/**
	 * An array of all the '<em><b>Genre</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Genre[] VALUES_ARRAY =
		new Genre[] {
			ANY,
			UNSPECIFIED,
			VIDEO_GAME,
			ANIME,
			ROCK,
			POP,
			OTHER,
			NOVELTY,
			HIP_HOP,
			ELECTRONIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Genre</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Genre> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Genre</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Genre get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Genre result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Genre</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Genre getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Genre result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Genre</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Genre get(int value) {
		switch (value) {
			case ANY_VALUE: return ANY;
			case UNSPECIFIED_VALUE: return UNSPECIFIED;
			case VIDEO_GAME_VALUE: return VIDEO_GAME;
			case ANIME_VALUE: return ANIME;
			case ROCK_VALUE: return ROCK;
			case POP_VALUE: return POP;
			case OTHER_VALUE: return OTHER;
			case NOVELTY_VALUE: return NOVELTY;
			case HIP_HOP_VALUE: return HIP_HOP;
			case ELECTRONIC_VALUE: return ELECTRONIC;
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
	private Genre(int value, String name, String literal) {
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
	
} //Genre
