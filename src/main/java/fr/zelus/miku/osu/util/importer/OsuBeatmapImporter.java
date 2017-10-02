package fr.zelus.miku.osu.util.importer;

import java.io.IOException;

import net.dv8tion.jda.entities.User;

import org.tillerino.osuApiModel.Downloader;
import org.tillerino.osuApiModel.OsuApiBeatmap;

import com.typesafe.config.Config;

import fr.inria.atlanmod.neoemf.resource.PersistentResource;
import fr.zelus.mikubot.osu.Artist;
import fr.zelus.mikubot.osu.Beatmap;
import fr.zelus.mikubot.osu.OsuModel;
import fr.zelus.mikubot.osu.Source;

/**
 * An Osu Beatmap importer that provides utility methods to import a beatmap or
 * a set of beatmap matching a condition (specific {@code beatmapId}, date
 * range, title part, author, mapper, etc).
 * <p>
 * This importer returns instance of {@link Beatmap}s that can be stored in a
 * {@link PersistentResource}.
 * <p>
 * Note: all the methods of this API requires a non-null {@link OsuModel}
 * instance that is used to store the generated {@link Beatmap} and search
 * existing {@link Artist}s, {@link Source}s, and {@link User}s (creators)
 * associated to the {@link Beatmap}, and creates them if necessary to ensure
 * the model consistency.
 * 
 * @see BeatmapConverter
 * 
 * @author Zelus
 *
 */
public class OsuBeatmapImporter {

	/**
	 * The low-level {@link Downloader} that performs queries on the osu!API
	 */
	protected Downloader downloader;

	public OsuBeatmapImporter(Config config) {
		downloader = new Downloader(config.getString("api.osu"));
	}

	Beatmap getBeatmap(int beatmapId, OsuModel model) {
		try {
			OsuApiBeatmap apiBeatmap = downloader.getBeatmap(beatmapId,
					OsuApiBeatmap.class);
			return BeatmapConverter.createBeatmap(apiBeatmap, model);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
