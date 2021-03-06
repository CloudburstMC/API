package org.cloudburstmc.api.event.player;

import org.cloudburstmc.api.event.Cancellable;
import org.cloudburstmc.api.level.Location;
import org.cloudburstmc.api.player.Player;

public final class PlayerTeleportEvent extends PlayerEvent implements Cancellable {

    private final TeleportCause cause;
    private final Location from;
    private final Location to;

    public PlayerTeleportEvent(Player player, Location from, Location to, TeleportCause cause) {
        super(player);
        this.from = from;
        this.to = to;
        this.cause = cause;
    }

    public Location getFrom() {
        return from;
    }

    public Location getTo() {
        return to;
    }

    public TeleportCause getCause() {
        return cause;
    }

    public enum TeleportCause {
        COMMAND,       // For tp command only
        PLUGIN,        // Every plugin
        NETHER_PORTAL, // Teleport using Nether portal
        ENDER_PEARL,   // Teleport by ender pearl
        CHORUS_FRUIT,  // Teleport by chorus fruit
        UNKNOWN        // Unknown cause
    }
}
