package org.cloudburstmc.api.entity.component;

import org.checkerframework.checker.index.qual.NonNegative;

public interface Explodable extends EntityComponent {

    boolean isPrimed();

    void prime();

    int getFuse();

    void setFuse(int fuse);

    /**
     * Return the radius of this explosive's explosion
     *
     * @return the radius of blocks affected
     */
    @NonNegative
    int getRadius();

    /**
     * Set the radius affected by this explosive's explosion
     *
     * @param radius The explosive radius
     */
    void setRadius(@NonNegative int radius);

    /**
     * Starts the explosion, ignoring any fuse delay
     */
    void explode();
}
