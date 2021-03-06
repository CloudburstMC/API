package org.cloudburstmc.api.event.player;

import org.cloudburstmc.api.event.Cancellable;
import org.cloudburstmc.api.item.ItemStack;
import org.cloudburstmc.api.player.Player;

public final class PlayerDropItemEvent extends PlayerEvent implements Cancellable {

    private final ItemStack drop;

    public PlayerDropItemEvent(Player player, ItemStack drop) {
        super(player);
        this.drop = drop;
    }

    public ItemStack getItem() {
        return this.drop;
    }
}
