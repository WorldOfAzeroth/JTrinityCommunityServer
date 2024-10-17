package com.github.jtrinity.dbc.model;

public record DBCPosition2D(float x, float y) {

    public static DBCPosition2D of(float x, float y) {
        return new DBCPosition2D(x, y);
    }
}