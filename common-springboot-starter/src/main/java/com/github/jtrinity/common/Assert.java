package com.github.jtrinity.common;

import org.slf4j.helpers.MessageFormatter;

public interface Assert {

    static void assertTrue(boolean b) {
        if(!b) {
            throw new AssertionException("Assertion failed, require true but got false");
        }
    }

    static void assertTrue(boolean b, String message, Object... args) {
        if(!b) {
            throw new AssertionException(MessageFormatter.basicArrayFormat(message, args));
        }
    }

    static void fail() {
        throw new AssertionException();
    }

    static void fail(String message) {
        throw new AssertionException();
    }


}
