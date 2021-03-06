package org.cloudburstmc.api.event.player;

import org.cloudburstmc.api.block.BlockState;
import org.cloudburstmc.api.event.Cancellable;
import org.cloudburstmc.api.item.ItemStack;
import org.cloudburstmc.api.player.Player;
import org.cloudburstmc.api.util.Direction;

public abstract class PlayerBucketEvent extends PlayerEvent implements Cancellable {

    private final BlockState blockStateClicked;

    private final Direction direction;

    private final ItemStack bucket;

    private ItemStack item;


    public PlayerBucketEvent(Player player, BlockState
            blockStateClicked, Direction direction, ItemStack bucket, ItemStack itemInHand) {
        super(player);
        this.blockStateClicked = blockStateClicked;
        this.direction = direction;
        this.item = itemInHand;
        this.bucket = bucket;
    }

    /**
     * Returns the bucket used in this event
     *
     * @return bucket
     */
    public ItemStack getBucket() {
        return this.bucket;
    }

    /**
     * Returns the item in hand after the event
     *
     * @return item
     */
    public ItemStack getItem() {
        return this.item;
    }

    public void setItem(ItemStack item) {
        this.item = item;
    }

    public BlockState getBlockClicked() {
        return this.blockStateClicked;
    }

    public Direction getBlockFace() {
        return this.direction;
    }
}
