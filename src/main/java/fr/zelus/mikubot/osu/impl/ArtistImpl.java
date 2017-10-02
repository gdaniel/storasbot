/**
 */
package fr.zelus.mikubot.osu.impl;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import fr.zelus.mikubot.osu.Artist;
import fr.zelus.mikubot.osu.OsuPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.zelus.mikubot.osu.impl.ArtistImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtistImpl extends DefaultPersistentEObject implements Artist {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsuPackage.Literals.ARTIST;
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
	public String getName() {
		return (String)eGet(OsuPackage.Literals.ARTIST__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(OsuPackage.Literals.ARTIST__NAME, newName);
	}

} //ArtistImpl
