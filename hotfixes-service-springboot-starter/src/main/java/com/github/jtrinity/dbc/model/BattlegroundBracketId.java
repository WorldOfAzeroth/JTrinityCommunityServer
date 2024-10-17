package com.github.jtrinity.dbc.model;

public interface BattlegroundBracketId {

    byte BG_BRACKET_ID_FIRST          = 0;
    byte BG_BRACKET_ID_LAST           = 11;

    // must be max value in PvPDificulty slot + 1
    byte MAX_BATTLEGROUND_BRACKETS = 12;
}
