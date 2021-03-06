package org.cloudburstmc.api.event.block;

import org.cloudburstmc.api.blockentity.Lectern;
import org.cloudburstmc.api.event.Cancellable;
import org.cloudburstmc.api.item.ItemStack;
import org.cloudburstmc.api.player.Player;

public final class LecternDropBookEvent extends BlockEvent implements Cancellable {

    private final Player player;
    private final Lectern lectern;
    private ItemStack book;

    public LecternDropBookEvent(Player player, Lectern lectern, ItemStack book) {
        super(lectern.getBlock());

        this.player = player;
        this.lectern = lectern;
        this.book = book;
    }

    public Lectern getLectern() {
        return lectern;
    }

    public Player getPlayer() {
        return player;
    }

    public ItemStack getBook() {
        return book;
    }

    public void setBook(ItemStack book) {
        this.book = book;
    }

}
