package org.cloudburstmc.api.event.player;

import org.cloudburstmc.api.event.Cancellable;
import org.cloudburstmc.api.player.GameMode;
import org.cloudburstmc.api.player.Player;

public final class PlayerGameModeChangeEvent extends PlayerEvent implements Cancellable {

    protected final GameMode gamemode;

    public PlayerGameModeChangeEvent(Player player, GameMode newGameMode) {
        super(player);
        this.gamemode = newGameMode;
    }

    public GameMode getNewGamemode() {
        return gamemode;
    }
}
