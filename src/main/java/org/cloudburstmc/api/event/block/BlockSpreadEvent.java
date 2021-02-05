package org.cloudburstmc.api.event.block;

import org.cloudburstmc.api.block.Block;
import org.cloudburstmc.api.event.Cancellable;
import org.cloudburstmc.server.block.BlockState;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class BlockSpreadEvent extends BlockFormEvent implements Cancellable {

    private final Block source;

    public BlockSpreadEvent(Block block, Block source, BlockState newState) {
        super(block, newState);
        this.source = source;
    }

    public Block getSource() {
        return source;
    }
}