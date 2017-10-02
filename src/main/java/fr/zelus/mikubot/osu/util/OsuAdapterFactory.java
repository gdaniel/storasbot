/**
 */
package fr.zelus.mikubot.osu.util;

import fr.zelus.mikubot.osu.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.zelus.mikubot.osu.OsuPackage
 * @generated
 */
public class OsuAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OsuPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsuAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OsuPackage.eINSTANCE;
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
	protected OsuSwitch<Adapter> modelSwitch =
		new OsuSwitch<Adapter>() {
			@Override
			public Adapter caseOsuModel(OsuModel object) {
				return createOsuModelAdapter();
			}
			@Override
			public Adapter caseBeatmapSet(BeatmapSet object) {
				return createBeatmapSetAdapter();
			}
			@Override
			public Adapter caseBeatmap(Beatmap object) {
				return createBeatmapAdapter();
			}
			@Override
			public Adapter caseArtist(Artist object) {
				return createArtistAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter caseSource(Source object) {
				return createSourceAdapter();
			}
			@Override
			public Adapter caseOsuUser(OsuUser object) {
				return createOsuUserAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.zelus.mikubot.osu.OsuModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.zelus.mikubot.osu.OsuModel
	 * @generated
	 */
	public Adapter createOsuModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.zelus.mikubot.osu.BeatmapSet <em>Beatmap Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.zelus.mikubot.osu.BeatmapSet
	 * @generated
	 */
	public Adapter createBeatmapSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.zelus.mikubot.osu.Beatmap <em>Beatmap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.zelus.mikubot.osu.Beatmap
	 * @generated
	 */
	public Adapter createBeatmapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.zelus.mikubot.osu.Artist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.zelus.mikubot.osu.Artist
	 * @generated
	 */
	public Adapter createArtistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.zelus.mikubot.osu.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.zelus.mikubot.osu.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.zelus.mikubot.osu.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.zelus.mikubot.osu.Source
	 * @generated
	 */
	public Adapter createSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.zelus.mikubot.osu.OsuUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.zelus.mikubot.osu.OsuUser
	 * @generated
	 */
	public Adapter createOsuUserAdapter() {
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

} //OsuAdapterFactory
