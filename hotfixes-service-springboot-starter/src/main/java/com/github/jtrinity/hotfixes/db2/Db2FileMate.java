package com.github.jtrinity.hotfixes.db2;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE})
@Retention(RUNTIME)
public @interface Db2FileMate {
    int fileDataId() default 0;
    int layoutHash() default 0;
    int indexField() default 0;
    int parentIndexField() default 0;
}
