package org.cloudburstmc.api.plugin.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines a plugin.
 *
 * The main class of every plugin must contain this annotation at the class
 * level so as to identify the plugin.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Plugin {

    /**
     * The unique ID of this plugin.
     *
     * This should be an alphanumeric name. Slashes are also allowed.
     */
    String id();

    /**
     * The name of this plugin.
     */
    String name() default "";

    /**
     * The version of this plugin.
     */
    String version();

    /**
     * The description of this plugin.
     */
    String description() default "";

    /**
     * The website URL of this plugin.
     */
    String url() default "";

    /**
     * The authors of this plugin.
     */
    String[] authors() default {};

    /**
     * An array of plugins that this plugin depends on.
     * @see Dependency
     */
    Dependency[] dependencies() default {};
}
