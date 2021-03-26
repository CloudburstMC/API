package org.cloudburstmc.api.player;

// LUKE'S NOTE: Do we really need to expose the adventure settings to the player?
//              Could we not have API methods for this stuff? Or a more API friendly PlayerFlags enum?
public enum AdventureSetting {
    WORLD_IMMUTABLE(true),
    NO_PVM(true),
    NO_MVP(false),
    SHOW_NAME_TAGS(false),
    AUTO_JUMP(false),
    ALLOW_FLIGHT(false),
    NO_CLIP(false),
    WORLD_BUILDER(true),
    FLYING(false),
    MUTED(false),
    MINE(true),
    DOORS_AND_SWITCHES(true),
    OPEN_CONTAINERS(true),
    ATTACK_PLAYERS(true),
    ATTACK_MOBS(true),
    OPERATOR(false),
    TELEPORT(false),
    BUILD(true);

    private final boolean defaultValue;

    AdventureSetting(boolean defaultValue) {
        this.defaultValue = defaultValue;
    }

    public boolean getDefaultValue() {
        return this.defaultValue;
    }

}
