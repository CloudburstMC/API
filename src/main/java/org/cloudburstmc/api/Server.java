package org.cloudburstmc.api;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.cloudburstmc.api.event.EventManager;
import org.cloudburstmc.api.level.Difficulty;
import org.cloudburstmc.api.level.Level;
import org.cloudburstmc.api.permission.PermissionManager;
import org.cloudburstmc.api.player.GameMode;
import org.cloudburstmc.api.player.Player;
import org.cloudburstmc.api.plugin.PluginManager;
import org.cloudburstmc.api.registry.GameRuleRegistry;

import java.util.Collection;
import java.util.UUID;

public interface Server {

    JsonMapper JSON_MAPPER = new JsonMapper();
    String BROADCAST_CHANNEL_ADMINISTRATIVE = "cloudburst.broadcast.admin";
    String BROADCAST_CHANNEL_USERS = "cloudburst.broadcast.user";

    /**
     * Gets the name of this server implementation.
     *
     * @return name of this server
     */
    String getName();

    /**
     * Gets the version of this server implementation.
     *
     * @return version of this server
     */
    String getImplementationVersion();

    /**
     * Returns the Minecraft version supported by this server implementation.
     *
     * @return the supported Minecraft version
     */
    String getMinecraftVersion();

    /**
     * Returns the current version of this API.
     *
     * @return the API version
     */
    String getApiVersion();

    /**
     * Gets a collection of players currently online on this server.
     *
     * @return a collection of online players
     */
    Collection<? extends Player> getOnlinePlayers();

    /**
     * Find a player by their username.
     *
     * @param name the name of the player
     * @return an instance of that player if online
     */
    Player findPlayer(String name);

    /**
     * Find a player by their UUID.
     *
     * @param uuid the UUID of the player
     * @return an instance of that player if online
     */
    Player findPlayer(UUID uuid);

    /**
     * Gets the plugin manager for interfacing with plugins.
     *
     * @return the plugin manager
     */
    PluginManager getPluginManager();

    /**
     * Gets the event manager for managing events.
     *
     * @return the event manager
     */
    EventManager getEventManager();

    PermissionManager getPermissionManager();
    GameRuleRegistry getGameRuleRegistry();

    /**
     * Shutdown the server.
     */
    void shutdown();

    /**
     * Returns this server implementations running status.
     *
     * @return true if the server if running, otherwise false
     */
    boolean isRunning();

    int getTick();


    // LUKE'S NOTE: The following is basically just config stuff so we can leave that for now and figure
    //              out what to do with it later

    boolean getAllowFlight();

    String getMotd();

    GameMode getGamemode();

    Level getDefaultLevel();

    int getMaxPlayers();

    boolean hasWhitelist();

    void addWhitelist(Player who);

    void removeWhitelist(Player who);

    boolean isWhitelisted(Player who);

    boolean isBanned(Player who);

    boolean isIPBanned(Player who);

    void setBanned(Player who, boolean banned, boolean byIP);

    default void ban(Player who) {
        setBanned(who, true, false);
    }

    default void banIP(Player who) {
        setBanned(who, true, true);
    }

    default void unban(Player who) {
        setBanned(who, false, false);
    }

    void addOp(Player who);

    void addOp(String name);

    void removeOp(Player who);

    void removeOp(String name);

    boolean isOp(Player who);

    int getPort();

    String getIp();

    Difficulty getDifficulty();

    void addOnlinePlayer(Player who);

    void onPlayerCompleteLoginSequence(Player who);

    void setAutoSave(boolean autoSave);
}
