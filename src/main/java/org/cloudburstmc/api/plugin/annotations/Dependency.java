package org.cloudburstmc.api.plugin.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines a plugin dependency.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Dependency {

    /**
     * The unique ID of the dependency.
     *
     * This should be an alphanumeric name. Slashes are also allowed.
     */
    String id();

    /**
     * The version of the dependency.
     */
    String version() default "";

    /**
     * Whether the plugin can load without the dependency or not.
     */
    boolean optional() default false;
}
