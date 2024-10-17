package com.github.jtrinity.dbc.model;

import com.github.jtrinity.dbc.domain.PathProperty;

import java.util.List;

public record PathDb2(int id, List<DBCPosition3D> Locations, List<PathProperty> properties) {

    public static PathDb2 of(int id, List<DBCPosition3D> Locations, List<PathProperty> properties) {
        return new PathDb2(id, Locations, properties);
    }
}
