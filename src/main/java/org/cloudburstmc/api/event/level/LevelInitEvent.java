package org.cloudburstmc.api.event.level;

import org.cloudburstmc.server.level.Level;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
@Deprecated()
public class LevelInitEvent extends LevelEvent {

    public LevelInitEvent(Level level) {
        super(level);
    }

}