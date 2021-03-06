package org.cloudburstmc.api.event.player;

import org.cloudburstmc.api.event.Cancellable;
import org.cloudburstmc.api.player.Player;

public final class PlayerToggleGlideEvent extends PlayerEvent implements Cancellable {

    protected final boolean isGliding;

    public PlayerToggleGlideEvent(Player player, boolean isSneaking) {
        super(player);
        this.isGliding = isSneaking;
    }

    public boolean isGliding() {
        return this.isGliding;
    }

}
