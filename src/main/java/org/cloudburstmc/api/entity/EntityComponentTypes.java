package org.cloudburstmc.api.entity;

import org.cloudburstmc.api.entity.component.Explodable;
import org.cloudburstmc.api.entity.component.Consumable;

public class EntityComponentTypes {
    public static final EntityComponentType<Explodable> EXPLODABLE = EntityComponentType.from("explodable", Explodable.class);

    public static final EntityComponentType<Consumable> CONSUMABLE = EntityComponentType.from("consumable", Consumable.class);
}
