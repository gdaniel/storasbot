/**
 */
package fr.zelus.mikubot.osu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Language</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.zelus.mikubot.osu.OsuPackage#getLanguage()
 * @model
 * @generated
 */
public enum Language implements Enumerator {
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
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(1, "OTHER", "OTHER"),

	/**
	 * The '<em><b>ENGLISH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENGLISH_VALUE
	 * @generated
	 * @ordered
	 */
	ENGLISH(2, "ENGLISH", "ENGLISH"),

	/**
	 * The '<em><b>JAPANESE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAPANESE_VALUE
	 * @generated
	 * @ordered
	 */
	JAPANESE(3, "JAPANESE", "JAPANESE"),

	/**
	 * The '<em><b>CHINESE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHINESE_VALUE
	 * @generated
	 * @ordered
	 */
	CHINESE(4, "CHINESE", "CHINESE"),

	/**
	 * The '<em><b>INSTRUMENTAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTRUMENTAL_VALUE
	 * @generated
	 * @ordered
	 */
	INSTRUMENTAL(5, "INSTRUMENTAL", "INSTRUMENTAL"),

	/**
	 * The '<em><b>KOREAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KOREAN_VALUE
	 * @generated
	 * @ordered
	 */
	KOREAN(6, "KOREAN", "KOREAN"),

	/**
	 * The '<em><b>FRENCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRENCH_VALUE
	 * @generated
	 * @ordered
	 */
	FRENCH(7, "FRENCH", ""),

	/**
	 * The '<em><b>GERMAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GERMAN_VALUE
	 * @generated
	 * @ordered
	 */
	GERMAN(8, "GERMAN", "GERMAN"),

	/**
	 * The '<em><b>SWEDISH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWEDISH_VALUE
	 * @generated
	 * @ordered
	 */
	SWEDISH(9, "SWEDISH", "SWEDISH"),

	/**
	 * The '<em><b>SPANISH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPANISH_VALUE
	 * @generated
	 * @ordered
	 */
	SPANISH(10, "SPANISH", "SPANISH"),

	/**
	 * The '<em><b>ITALIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITALIAN_VALUE
	 * @generated
	 * @ordered
	 */
	ITALIAN(11, "ITALIAN", "ITALIAN");

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
	public static final int OTHER_VALUE = 1;

	/**
	 * The '<em><b>ENGLISH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENGLISH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENGLISH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENGLISH_VALUE = 2;

	/**
	 * The '<em><b>JAPANESE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JAPANESE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAPANESE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JAPANESE_VALUE = 3;

	/**
	 * The '<em><b>CHINESE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHINESE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHINESE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHINESE_VALUE = 4;

	/**
	 * The '<em><b>INSTRUMENTAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INSTRUMENTAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTRUMENTAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSTRUMENTAL_VALUE = 5;

	/**
	 * The '<em><b>KOREAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KOREAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KOREAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KOREAN_VALUE = 6;

	/**
	 * The '<em><b>FRENCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FRENCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRENCH
	 * @model literal=""
	 * @generated
	 * @ordered
	 */
	public static final int FRENCH_VALUE = 7;

	/**
	 * The '<em><b>GERMAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GERMAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GERMAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GERMAN_VALUE = 8;

	/**
	 * The '<em><b>SWEDISH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SWEDISH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SWEDISH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SWEDISH_VALUE = 9;

	/**
	 * The '<em><b>SPANISH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPANISH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPANISH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPANISH_VALUE = 10;

	/**
	 * The '<em><b>ITALIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ITALIAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITALIAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ITALIAN_VALUE = 11;

	/**
	 * An array of all the '<em><b>Language</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Language[] VALUES_ARRAY =
		new Language[] {
			ANY,
			OTHER,
			ENGLISH,
			JAPANESE,
			CHINESE,
			INSTRUMENTAL,
			KOREAN,
			FRENCH,
			GERMAN,
			SWEDISH,
			SPANISH,
			ITALIAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Language</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Language> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Language</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Language get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Language result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Language</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Language getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Language result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Language</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Language get(int value) {
		switch (value) {
			case ANY_VALUE: return ANY;
			case OTHER_VALUE: return OTHER;
			case ENGLISH_VALUE: return ENGLISH;
			case JAPANESE_VALUE: return JAPANESE;
			case CHINESE_VALUE: return CHINESE;
			case INSTRUMENTAL_VALUE: return INSTRUMENTAL;
			case KOREAN_VALUE: return KOREAN;
			case FRENCH_VALUE: return FRENCH;
			case GERMAN_VALUE: return GERMAN;
			case SWEDISH_VALUE: return SWEDISH;
			case SPANISH_VALUE: return SPANISH;
			case ITALIAN_VALUE: return ITALIAN;
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
	private Language(int value, String name, String literal) {
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
	
} //Language
