package com.github.jtrinity.dbc.model;

public record DBCPosition3D(float x, float y, float z) {

    public static DBCPosition3D of(float x, float y, float z) {
        return new DBCPosition3D(x, y, z);
    }
}
