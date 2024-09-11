package com.github.jtrinity.hotfixes.db2;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD, METHOD})
@Retention(RUNTIME)
public @interface Db2FieldMeta {

    boolean signed() default false;
    Db2Type type();
    int fieldIndex() default -1;
}
