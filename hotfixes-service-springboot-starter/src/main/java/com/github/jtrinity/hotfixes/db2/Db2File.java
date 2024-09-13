package com.github.jtrinity.hotfixes.db2;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE})
@Retention(RUNTIME)
public @interface Db2File {
    String name() default "";
    int fileDataId() default -1;
    int layoutHash() default -1;
    int indexField() default -1;
    int parentIndexField() default -1;
}
