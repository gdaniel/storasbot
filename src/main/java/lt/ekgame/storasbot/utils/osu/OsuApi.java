package lt.ekgame.storasbot.utils.osu;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.tillerino.osuApiModel.Downloader;
import org.tillerino.osuApiModel.OsuApiBeatmap;
import org.tillerino.osuApiModel.OsuApiScore;

import com.google.gson.JsonArray;
import com.typesafe.config.Config;

public class OsuApi {
	
	private Downloader downloader;
	
	public OsuApi(Config config) {
		downloader = new Downloader(config.getString("api.osu"));
	}

	public List<OsuApiScore> getUserTop(String userId, OsuMode mode, int num) throws NumberFormatException, IOException {
		return downloader.getUserTop(Integer.parseInt(userId), mode.getValue(), num, OsuApiScore.class);
	}

	public OsuUser getUser(String userId, OsuMode mode) throws NumberFormatException, IOException {
		return downloader.getUser(Integer.parseInt(userId), mode.getValue(), OsuUser.class);
	}

	public OsuApiBeatmap getBeatmap(String beatmapId) throws NumberFormatException, IOException {
		return downloader.getBeatmap(Integer.parseInt(beatmapId), OsuApiBeatmap.class);
	}
	
	public OsuApiBeatmap getBeatmap(int beatmapId) throws IOException {
		return downloader.getBeatmap(beatmapId, OsuApiBeatmap.class);
	}

	public List<OsuApiBeatmap> getBeatmapSet(String setId) throws NumberFormatException, IOException {
		return downloader.getBeatmapSet(Integer.parseInt(setId), OsuApiBeatmap.class);
	}
	
	public List<OsuApiBeatmap> test(Date date) {
		JsonArray array = null;
		try {
			/*
			 *  We need to convert the date into UTC+8, otherwise the query is not consistent regarding
			 *  local time (UTC+2) and database time (UTC+8) zones
			 */
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			c.add(Calendar.HOUR, 6);
			Date utc8Date = c.getTime();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String formattedDate = format.format(utc8Date);
			System.out.println("database date " + formattedDate);
			
			array = (JsonArray) downloader.get(Downloader.GET_BEATMAPS, "since", formattedDate); 
			//, "m", "0", "limit", "10");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<OsuApiBeatmap> result = OsuApiBeatmap.fromJsonArray(array, OsuApiBeatmap.class);
		return result;
	}

	public OsuUser getUserByUsername(String username, OsuMode mode) throws IOException {
		return downloader.getUser(username, mode.getValue(), OsuUser.class);
	}

}
