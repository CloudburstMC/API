package org.cloudburstmc.api.event.level;

import org.cloudburstmc.api.event.Event;
import org.cloudburstmc.api.level.Level;

/**
 * author: funcraft
 * Nukkit Project
 */
public abstract class WeatherEvent extends Event {

    private final Level level;

    public WeatherEvent(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }
}
