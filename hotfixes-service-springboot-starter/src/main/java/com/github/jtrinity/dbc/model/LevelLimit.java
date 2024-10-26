package com.github.jtrinity.dbc.model;

public interface LevelLimit {

    // Client expected level limitation, like as used in DBC item max levels for "until max player level"
    // use as default max player level, must be fit max level for used client
    // also see MAX_LEVEL and STRONG_MAX_LEVEL define
    short DEFAULT_MAX_LEVEL = 110;

    // client supported max level for player/pets/etc. Avoid overflow or client stability affected.
    // also see GT_MAX_LEVEL define
    short MAX_LEVEL = 110;

    // Server side limitation. Base at used code requirements.
    // also see MAX_LEVEL and GT_MAX_LEVEL define
    short STRONG_MAX_LEVEL = 255;
}
