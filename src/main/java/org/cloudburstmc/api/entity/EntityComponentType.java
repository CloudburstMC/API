package org.cloudburstmc.api.entity;

import org.cloudburstmc.api.entity.component.EntityComponent;
import org.cloudburstmc.api.util.Identifier;

import static lombok.Lombok.checkNotNull;

public final class EntityComponentType<T extends EntityComponent> {
    private final Identifier identifier;
    private final Class<T> component;

    private EntityComponentType(Identifier identifier, Class<T> component) {
        this.identifier = identifier;
        this.component = component;
    }

    public static <T extends EntityComponent> EntityComponentType<T> from(String identifier, Class<T> component) {
        checkNotNull(identifier, "identifier");
        checkNotNull(component, "component");
        return new EntityComponentType<>(Identifier.fromString(identifier), component);
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public Class<T> getComponent() {
        return component;
    }
}
