/*
 *
 *
 * @author maoyang
 */
package com.maoyang.enforce.annotation;

import com.maoyang.enforce.ext.IDomainExtension;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 扩展点，注解在{@link IDomainExtension}之上.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Component
public @interface Extension {

    /**
     * The value may indicate a suggestion for a logical component name,
     * to be turned into a Spring bean in case of an autodetected component.
     *
     * @return the suggested component name, if any
     */
    @AliasFor(annotation = Component.class, attribute = "value") String value() default "";

    /**
     * 扩展点编号，bind to {@link Pattern#code()} or {@link Partner#code()}.
     */
    String code();

    /**
     * 扩展点名称.
     */
    String name() default "";
}
