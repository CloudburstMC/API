package org.cloudburstmc.api.entity.component;

public interface EntityComponentFactory<D, C extends EntityComponent> {

    C create(D definition);
}
