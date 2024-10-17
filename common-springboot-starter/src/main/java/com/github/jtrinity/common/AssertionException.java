package com.github.jtrinity.common;

public class AssertionException extends RuntimeException {

    public AssertionException() {
        super();
    }

    public AssertionException(String formatted) {
        super(formatted);
    }
}
