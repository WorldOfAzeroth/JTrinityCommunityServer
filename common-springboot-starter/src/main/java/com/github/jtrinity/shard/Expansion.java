package com.github.jtrinity.shard;

public enum Expansion {

    EXPANSION_LEVEL_CURRENT,
    EXPANSION_CLASSIC,
    EXPANSION_THE_BURNING_CRUSADE,
    EXPANSION_WRATH_OF_THE_LICH_KING,
    EXPANSION_CATACLYSM,
    EXPANSION_MISTS_OF_PANDARIA,
    EXPANSION_WARLORDS_OF_DRAENOR,
    EXPANSION_LEGION,
    MAX_EXPANSIONS,
    // future expansion
    EXPANSION_BATTLE_FOR_AZEROTH,
    MAX_ACCOUNT_EXPANSIONS;

    int getMaxLevel() {
        return switch (this) {
            case EXPANSION_CLASSIC -> 60;
            case EXPANSION_THE_BURNING_CRUSADE -> 70;
            case EXPANSION_WRATH_OF_THE_LICH_KING -> 80;
            case EXPANSION_CATACLYSM -> 85;
            case EXPANSION_MISTS_OF_PANDARIA -> 90;
            case EXPANSION_WARLORDS_OF_DRAENOR -> 100;
            case EXPANSION_LEGION -> 110;
            default -> 0;
        };
    }
}
