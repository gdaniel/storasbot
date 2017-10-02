package lt.ekgame.storasbot;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

import javax.security.auth.login.LoginException;

import lt.ekgame.storasbot.commands.engine.CommandListener;
import lt.ekgame.storasbot.plugins.GuildSettings;
import lt.ekgame.storasbot.plugins.Settings;
import lt.ekgame.storasbot.utils.osu.OsuApi;
import lt.ekgame.storasbot.utils.osu.OsuUserCatche;
import net.dv8tion.jda.JDA;
import net.dv8tion.jda.JDABuilder;
import net.dv8tion.jda.MessageBuilder;
import net.dv8tion.jda.entities.Guild;
import net.dv8tion.jda.entities.Message;
import net.dv8tion.jda.entities.MessageChannel;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.utils.SimpleLog;
import net.dv8tion.jda.utils.SimpleLog.Level;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.tillerino.osuApiModel.OsuApiBeatmap;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import fr.inria.atlanmod.neoemf.data.PersistenceBackendFactoryRegistry;
import fr.inria.atlanmod.neoemf.data.blueprints.BlueprintsPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.data.blueprints.neo4j.option.BlueprintsNeo4jOptionsBuilder;
import fr.inria.atlanmod.neoemf.data.blueprints.util.BlueprintsURI;
import fr.inria.atlanmod.neoemf.resource.PersistentResource;
import fr.inria.atlanmod.neoemf.resource.PersistentResourceFactory;
import fr.zelus.miku.osu.util.importer.BeatmapConverter;
import fr.zelus.mikubot.Miku;
import fr.zelus.mikubot.MikubotFactory;
import fr.zelus.mikubot.MikubotPackage;
import fr.zelus.mikubot.osu.Artist;
import fr.zelus.mikubot.osu.Beatmap;
import fr.zelus.mikubot.osu.Mode;
import fr.zelus.mikubot.osu.OsuFactory;
import fr.zelus.mikubot.osu.OsuModel;
import fr.zelus.mikubot.osu.OsuPackage;
import fr.zelus.mikubot.osu.OsuUser;
import fr.zelus.mikubot.osu.Source;
import fr.zelus.mikubot.osu.Status;

public class StorasDiscord {
	
	private static JDA client;
	private static Database database;
	private static Config config;
	private static OsuApi osuApi;
	private static OsuUserCatche osuUserCatche;
	private static CommandListener commandHandler;
	private static GuildSettings guildSettings;
	private static List<String> operators = new ArrayList<>();
	
	public static void main(String... args) throws SQLException, LoginException, IllegalArgumentException {
		try {
			if (args.length > 1 && args[1].equalsIgnoreCase("-d"))
				SimpleLog.LEVEL = Level.DEBUG;
			else
				SimpleLog.LEVEL = Level.INFO;
			
//			config = ConfigFactory.parseFile(new File(args[0])); // Very important that this is first
			config = ConfigFactory.parseFile(new File("/home/gdaniel/Documents/MikuBot/storasbot/src/main/java/sample-config.conf"));
//			database = new Database(config);
//			database.testConnection();
			osuApi = new OsuApi(config);
//			osuUserCatche = new OsuUserCatche();
//			guildSettings = new GuildSettings(database);
			
			EPackage.Registry.INSTANCE.put(MikubotPackage.eNS_URI, MikubotPackage.eINSTANCE);
			EPackage.Registry.INSTANCE.put(OsuPackage.eNS_URI, OsuPackage.eINSTANCE);
			OsuFactory osuFactory = OsuFactory.eINSTANCE;
			MikubotFactory mikuFactory = MikubotFactory.eINSTANCE;
			PersistenceBackendFactoryRegistry.register(BlueprintsURI.SCHEME, BlueprintsPersistenceBackendFactory.getInstance());
			ResourceSet rSet = new ResourceSetImpl();
			rSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put(BlueprintsURI.SCHEME, PersistentResourceFactory.getInstance());
			File dbFile = new File("database/mikudb.graphdb");
			boolean dbPreviouslyCreated = dbFile.exists();
			Resource neoResource = rSet.createResource(BlueprintsURI.createFileURI(dbFile));
			Map<String, Object> options = BlueprintsNeo4jOptionsBuilder.newBuilder().autocommit().asMap();
			Miku miku = null;
			OsuModel model = null;
			if(dbPreviouslyCreated) {
				neoResource.load(options);
				miku = (Miku)neoResource.getContents().get(0);
				model = miku.getOsuModel();
				SimpleLog.getLog("Import").info("OsuModel contains " + model.getBeatmaps().size() + " beatmaps");
				if(model.getBeatmaps().size() > 0) {
					Beatmap beatmap = model.getBeatmaps().get(0);
					SimpleLog.getLog("Import").info("Testing Beatmap " + beatmap.getBeatmapId() + " \"" + beatmap.getTitle() + "\"");
				}
//				List<Beatmap> beatmaps = model.getBeatmaps();
//				SimpleLog.getLog("Initialization").info("MikuDB contains " + beatmaps.size() + " beatmaps");
//				for(Beatmap b : beatmaps) {
//					SimpleLog.getLog("Initialization").info("Beatmap " + b.getBeatmapId() + "\"" + b.getTitle() + "\"");
//				}
			}
			else {
				neoResource.save(options);
				miku = mikuFactory.createMiku();
				model = osuFactory.createOsuModel();
				miku.setOsuModel(model);
				neoResource.getContents().add(miku);
//				Beatmap testBeatmap = osuFactory.createBeatmap();
//				model.getBeatmaps().add(testBeatmap);
//				testBeatmap.setBeatmapId(123);
//				testBeatmap.setTitle("No Title");
			}
			
			Date lastDatabaseCheckTimestamp = miku.getLastDatabaseCheckTimestamp();
			if(lastDatabaseCheckTimestamp == null) {
				lastDatabaseCheckTimestamp = Calendar.getInstance().getTime();
				System.out.println("now: " + lastDatabaseCheckTimestamp.toString());
				miku.setLastDatabaseCheckTimestamp(lastDatabaseCheckTimestamp);
			}
			System.out.println("lastDatabaseCheckTimestamp " + lastDatabaseCheckTimestamp.toString());
			Calendar c = Calendar.getInstance();
			c.setTime(lastDatabaseCheckTimestamp);
			c.add(Calendar.DATE, -10);
			Date newDate = c.getTime();
			System.out.println("getting beatmaps since " + newDate.toString());
			
			SimpleLog.getLog("Initialization").info("Retrieving Beatmaps");
			List<OsuApiBeatmap> beatmaps = osuApi.test(newDate);
			SimpleLog.getLog("Initialization").info("Found " + beatmaps.size() + " beatmaps");
			
			StringBuffer buffer = new StringBuffer();
			int count = 0;
			for(OsuApiBeatmap bm : beatmaps) {
				Date approvedDate = new Date(bm.getApprovedDate());
				System.out.println(approvedDate.toString());
				System.out.println("vs");
				System.out.println(lastDatabaseCheckTimestamp.toString());
				if(approvedDate.after(lastDatabaseCheckTimestamp)) {
					SimpleLog.getLog("Import").info("Beatmap " + bm.getBeatmapId() + " \"" + bm.getTitle() + "\" already stored");
					continue;
				}
				BeatmapConverter.importBeatmap(bm, model);
				
				count++;
				SimpleLog.getLog("Initialization").info("#" + count + ": " + bm.getTitle() + "[" + bm.getVersion() + "] " + "(" + String.format("%.2f", bm.getStarDifficulty()) + "*) " + "%\n");
				Date apDate = new Date(bm.getApprovedDate());
				Date d2 = new Date(apDate.toInstant().plusSeconds(6*3600).toEpochMilli());
				
				SimpleLog.getLog("Initialization").info(d2.toString());
//				neoResource.getContents().add(mikuBeatmap);
//				model.getBeatmaps().add(mikuBeatmap);
			}
			
			miku.setLastDatabaseCheckTimestamp(newDate);
			
			neoResource.save(options);
			SimpleLog.getLog("Initialization").info("NeoResource contains " + ((Miku)neoResource.getContents().get(0)).getOsuModel().getBeatmaps().size() + " beatmaps");
			Beatmap bbbb = ((Miku)neoResource.getContents().get(0)).getOsuModel().getBeatmaps().get(0);
			SimpleLog.getLog("Initialization").info("Beatmap " + bbbb.getBeatmapId() + "\"" + bbbb.getTitle() + "\"");
			((PersistentResource)neoResource).close();
			System.exit(0);
			
			String token = config.getString("api.discord");
//			operators = config.getStringList("general.operators");
			client = new JDABuilder().setBotToken(token)
//				.addListener(new OsuTracker(osuUserCatche))
				.addListener(commandHandler = new CommandListener())
//				.addListener(new BeatmapLinkExaminer())
//				.addListener(new AntiShitImageHosts())
//				.addListener(new BanchoStatusChecker(config))
//				.addListener(new GameChanger(config))
				.buildAsync();
			
		} catch (Exception e) {
			SimpleLog.getLog("Initialization").fatal("Initialization failed.");
			e.printStackTrace();
		}
	}
	
	public static JDA getJDA() {
		return client;
	}
	
	public static Database getDatabase() {
		return database;
	}
	
	public static Config getConfig() {
		return config;
	}
	
	public static OsuApi getOsuApi() {
		return osuApi;
	}
	
	public static OsuUserCatche getOsuUserCatche() {
		return osuUserCatche;
	}
	
	public static CommandListener getCommandHandler() {
		return commandHandler;
	}
	
	public static Settings getSettings(Guild guild) {
		return guildSettings.getSettings(guild);
	}
	
	public static boolean isOperator(User user) {
		return operators.contains(user.getId());
	}
	
	public static String getPrefix(Guild guild) {
		String nickname = guild.getNicknameForUser(client.getSelfInfo());
		return "@" + (nickname != null ? nickname : client.getSelfInfo().getUsername());
	}
	
	public static void sendMessage(MessageChannel messageChannel, String message, Consumer<Message> consumer) {
		messageChannel.sendMessageAsync(message, consumer);
	}
	
	public static void sendMessage(MessageChannel messageChannel, String message) {
		messageChannel.sendMessageAsync(message, null);
	}
	
	public static void sendFile(MessageChannel messageChannel, String message, File file, Consumer<Message> consumer) {
		messageChannel.sendFileAsync(file, new MessageBuilder().appendString(message).build(), consumer);
	}
	
	public static void sendFile(MessageChannel messageChannel, String message, File file) {
		messageChannel.sendFileAsync(file, new MessageBuilder().appendString(message).build(), null);
	}
	
	public static void editMessage(Message message, String newText, Consumer<Message> consumer) {
		message.updateMessageAsync(newText, consumer);
	}
	
	public static void editMessage(Message message, String newText) {
		message.updateMessageAsync(newText, null);
	}
}
