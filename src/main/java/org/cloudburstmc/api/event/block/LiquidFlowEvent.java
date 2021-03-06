package org.cloudburstmc.api.event.block;

import org.cloudburstmc.api.block.Block;
import org.cloudburstmc.api.block.BlockState;
import org.cloudburstmc.api.event.Cancellable;

public final class LiquidFlowEvent extends BlockEvent implements Cancellable {

    private final BlockState to;
    private final Block source;
    private final int newFlowDecay;

    public LiquidFlowEvent(BlockState to, Block source, int newFlowDecay) {
        super(source);
        this.to = to;
        this.source = source;
        this.newFlowDecay = newFlowDecay;
    }

    public int getNewFlowDecay() {
        return this.newFlowDecay;
    }

    public Block getSource() {
        return this.source;
    }

    public BlockState getTo() {
        return this.to;
    }
}
