package org.cloudburstmc.api.entity.system;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import org.cloudburstmc.api.entity.EntityComponentType;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public final class EntitySystem {
    private final Set<EntityComponentType<?>> expectedComponents;
    private final EntitySystemRunner runner;

    private EntitySystem(Set<EntityComponentType<?>> expectedComponents, EntitySystemRunner runner) {
        this.expectedComponents = expectedComponents;
        this.runner = runner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public final Set<EntityComponentType<?>> getExpectedComponents() {
        return expectedComponents;
    }

    public final EntitySystemRunner getRunner() {
        return runner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntitySystem system = (EntitySystem) o;
        return Objects.equals(expectedComponents, system.expectedComponents) &&
                Objects.equals(runner, system.runner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expectedComponents, runner);
    }

    @Override
    public String toString() {
        return "System(expectedComponents=" + expectedComponents + ", runner=" + runner + ')';
    }

    public static class Builder {
        private final ImmutableSet.Builder<EntityComponentType<?>> expectedComponents = ImmutableSet.builder();
        private EntitySystemRunner runner;

        private Builder() {

        }

        public final Builder expectComponent(EntityComponentType<?> component) {
            expectedComponents.add(component);
            return this;
        }

        public final Builder expectComponents(EntityComponentType<?>... components) {
            expectedComponents.addAll(Arrays.asList(components));
            return this;
        }

        public final Builder runner(EntitySystemRunner runner) {
            this.runner = runner;
            return this;
        }

        public final EntitySystem build() {
            Preconditions.checkArgument(runner != null, "no runner set");
            return new EntitySystem(expectedComponents.build(), runner);
        }
    }
}