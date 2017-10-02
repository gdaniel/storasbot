package fr.zelus.miku.osu.util.importer;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Date;
import java.util.Optional;

import net.dv8tion.jda.utils.SimpleLog;

import org.tillerino.osuApiModel.OsuApiBeatmap;

import fr.inria.atlanmod.neoemf.resource.PersistentResource;
import fr.zelus.mikubot.osu.Artist;
import fr.zelus.mikubot.osu.Beatmap;
import fr.zelus.mikubot.osu.Mode;
import fr.zelus.mikubot.osu.OsuFactory;
import fr.zelus.mikubot.osu.OsuModel;
import fr.zelus.mikubot.osu.OsuUser;
import fr.zelus.mikubot.osu.Source;
import fr.zelus.mikubot.osu.Status;

/**
 * Converts {@link OsuApiBeatmap} into {@link Beatmap} that can be stored in a
 * {@link PersistentResource}.
 * <p>
 * Note: all the methods of this API requires a non-null {@link OsuModel}
 * instance that is used to store the generated {@link Beatmap} and search
 * existing {@link Artist}s, {@link Source}s, and {@link User}s (creators)
 * associated to the {@link Beatmap}, and creates them if necessary to ensure
 * the model consistency.
 * 
 * @author Zelus
 *
 */
public class BeatmapConverter {

	private static OsuFactory factory = OsuFactory.eINSTANCE;
	private static SimpleLog LOG = SimpleLog.getLog(BeatmapConverter.class.getName());

	/**
	 * Creates a new {@link Beatmap} from the provided {@link OsuApiBeatmap},
	 * and adds it it the provided {@code model}.
	 * <p>
	 * This method uses the provided {@code model} to retrieve artists, sources,
	 * and creators of the generated {@link Beatmap}. Note that instances of
	 * these elements will be created and added to the {@code model} if they
	 * don't already exist.
	 * <p>
	 * Calling this method ensures the {@code model} consistency: instances of
	 * an artist, source, and creator with a given name are unique in the
	 * {@code model}, and can be reliably used as query starting points.
	 * 
	 * 
	 * @param apiBeatmap
	 *            the {@link OsuApiBeatmap} returned by the raw osu! API
	 * @param model
	 *            the {@link OsuModel} that stores the created {@link Beatmap}
	 *            and the associated {@link Artist}, {@link Source}, and
	 *            {@link User} (creator)
	 */
	public static void importBeatmap(final OsuApiBeatmap apiBeatmap, final OsuModel model) {
		createBeatmap(apiBeatmap, model);
	}
	
	/**
	 * Creates a new {@link Beatmap} from the provided {@link OsuApiBeatmap},
	 * adds it it the provided {@code model}, and returns it to the caller.
	 * <p>
	 * This method uses the provided {@code model} to retrieve artists, sources,
	 * and creators of the generated {@link Beatmap}. Note that instances of
	 * these elements will be created and added to the {@code model} if they
	 * don't already exist.
	 * <p>
	 * Calling this method ensures the {@code model} consistency: instances of
	 * an artist, source, and creator with a given name are unique in the
	 * {@code model}, and can be reliably used as query starting points.
	 * 
	 * @param apiBeatmap
	 *            the {@link OsuApiBeatmap} returned by the raw osu! API
	 * @param model
	 *            the {@link OsuModel} that stores the created {@link Beatmap}
	 *            and the associated {@link Artist}, {@link Source}, and
	 *            {@link User} (creator)
	 * @return the created {@link Beatmap}
	 */
	public static Beatmap createBeatmap(final OsuApiBeatmap apiBeatmap, final OsuModel model) {
		checkNotNull(model, "Cannot create a new Beatmap: provided model is null");
		Beatmap mikuBeatmap = factory.createBeatmap();
		LOG.info("Creating Beatmap [" + apiBeatmap.getBeatmapId() + "] \"" + apiBeatmap.getTitle()
				+ "\"");
		mikuBeatmap.setBeatmapId(apiBeatmap.getBeatmapId());
		mikuBeatmap.setTitle(apiBeatmap.getTitle());
		mikuBeatmap.setDifficultyRating(apiBeatmap.getStarDifficulty());
		mikuBeatmap.setVersion(apiBeatmap.getVersion());
		/*
		 * Searches if the OsuModel already contains the Artist associated to
		 * the Beatmap and creates it if necessary.
		 */
		Optional<Artist> artist = model.getArtists().stream()
				.filter(a -> a.getName().equals(apiBeatmap.getArtist())).findAny();
		if (artist.isPresent()) {
			LOG.info("\tArtist \"" + apiBeatmap.getArtist() + "\" found in the OsuModel");
			mikuBeatmap.setArtist(artist.get());
		} else {
			LOG.info("\tCreating new Artist \"" + apiBeatmap.getArtist() + "\"");
			Artist newArtist = factory.createArtist();
			newArtist.setName(apiBeatmap.getArtist());
			mikuBeatmap.setArtist(newArtist);
			model.getArtists().add(newArtist);
		}
		mikuBeatmap.setApproachRate(apiBeatmap.getApproachRate());
		mikuBeatmap.setHealthDrain(apiBeatmap.getHealthDrain());
		mikuBeatmap.setOverallDifficulty(apiBeatmap.getOverallDifficulty());
		mikuBeatmap.setCircleSize(apiBeatmap.getCircleSize());
		mikuBeatmap.setMode(Mode.get(apiBeatmap.getMode()));
		mikuBeatmap.setStatus(Status.get(apiBeatmap.getApproved()));
		mikuBeatmap.setApprovedDate(new Date(apiBeatmap.getApprovedDate()));
		mikuBeatmap.setLastUpdate(new Date(apiBeatmap.getLastUpdate()));
		mikuBeatmap.setBpm(apiBeatmap.getBpm());
		mikuBeatmap.setHitLength(apiBeatmap.getHitLength());
		/*
		 * Note: tags are not provided by the raw API
		 */
		mikuBeatmap.setMaxCombo(apiBeatmap.getMaxCombo());
		/*
		 * Searches if the OsuModel already contains the Source associated to
		 * the Beatmap and creates it if necessary.
		 */
		Optional<Source> source = model.getSources().stream()
				.filter(s -> s.getName().equals(apiBeatmap.getSource())).findAny();
		if (source.isPresent()) {
			LOG.info("\tSource \"" + apiBeatmap.getSource() + "\" found in the OsuModel");
			mikuBeatmap.setSource(source.get());
		} else {
			LOG.info("\tCreating new Source \"" + apiBeatmap.getSource() + "\"");
			Source newSource = factory.createSource();
			newSource.setName(apiBeatmap.getSource());
			model.getSources().add(newSource);
			mikuBeatmap.setSource(newSource);
		}
		// Note: genre and language are not provided by the raw API
		/*
		 * Searches if the OsuModel already contains the User (creator)
		 * associated to the Beatmap and creates it if necessary.
		 */
		Optional<OsuUser> creator = model.getUsers().stream()
				.filter(u -> u.getUsername().equals(apiBeatmap.getCreator())).findAny();
		if (creator.isPresent()) {
			LOG.info("\tUser (creator) \"" + apiBeatmap.getCreator() + "\" found in the OsuModel");
			mikuBeatmap.setCreator(creator.get());
		} else {
			LOG.info("\tCreating new User (creator) \"" + apiBeatmap.getCreator() + "\"");
			OsuUser newUser = factory.createOsuUser();
			newUser.setUsername(apiBeatmap.getCreator());
			model.getUsers().add(newUser);
			mikuBeatmap.setCreator(newUser);
		}
		model.getBeatmaps().add(mikuBeatmap);
		return mikuBeatmap;
	}

}
