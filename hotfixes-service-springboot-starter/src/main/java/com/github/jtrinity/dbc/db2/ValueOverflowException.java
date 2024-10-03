package com.github.jtrinity.dbc.db2;

public class ValueOverflowException extends RuntimeException {

    public ValueOverflowException(String message) {
        super(message);
    }

    public ValueOverflowException(String message, Throwable cause) {
        super(message, cause);
    }
}
