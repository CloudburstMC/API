package org.cloudburstmc.api.entity.component;

import org.checkerframework.checker.index.qual.NonNegative;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.cloudburstmc.api.entity.Entity;
import org.cloudburstmc.api.util.AxisAlignedBB;

public interface Consumable extends EntityComponent {

    default boolean canConsume() {
        return !hasInfiniteDelay() && getDelay() <= 0;
    }

    /**
     * Check if the delay is infinite
     * @return infinite delay
     */
    boolean hasInfiniteDelay();

    /**
     * Set infinite delay which stops the consumable from ever being consumed.
     * @param infiniteDelay true for infinite delay
     */
    void setInfiniteDelay(boolean infiniteDelay);

    /**
     * Gets the period of time (in ticks) before this item stack can be picked up.
     *
     * @return item stack delay
     */
    @NonNegative
    int getDelay();

    /**
     * Sets the period of time (in ticks) before this item stack can be picked up.
     *
     * @param ticks item stack delay ticks
     */
    void setDelay(@NonNegative int ticks);

    /**
     * Gets the bounding box in which to search for entities
     * @return search area
     */
    @Nullable
    AxisAlignedBB getBoundingBox();

    /**
     * Sets the bounding box in which to search for entities
     * @param boundingBox search area
     */
    void setBoundingBox(@Nullable AxisAlignedBB boundingBox);

    /**
     * Directly run consume on a specific entity
     * @param entity entity to consume this consumable.
     * @return true if the consumable was consumed.
     */
    boolean consume(Entity entity);
}
