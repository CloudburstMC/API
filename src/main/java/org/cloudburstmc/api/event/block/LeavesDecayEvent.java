package org.cloudburstmc.api.event.block;

import org.cloudburstmc.api.block.Block;
import org.cloudburstmc.api.event.Cancellable;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public final class LeavesDecayEvent extends BlockEvent implements Cancellable {

    public LeavesDecayEvent(Block blockState) {
        super(blockState);
    }

}
