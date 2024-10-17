package com.github.jtrinity.shard;

import com.github.jtrinity.common.AssertionException;

public enum Classes {
    CLASS_NONE,
    CLASS_WARRIOR,
    CLASS_PALADIN,
    CLASS_HUNTER,
    CLASS_ROGUE,
    CLASS_PRIEST,
    CLASS_DEATH_KNIGHT,
    CLASS_SHAMAN,
    CLASS_MAGE,
    CLASS_WARLOCK,
    CLASS_MONK,
    CLASS_DRUID,
    CLASS_DEMON_HUNTER;

    public static Classes get(byte classID) {
        return switch (classID) {
            case 0 -> CLASS_NONE;
            case 1 -> CLASS_WARRIOR;
            case 2 -> CLASS_PALADIN;
            case 3 -> CLASS_HUNTER;
            case 4 -> CLASS_ROGUE;
            case 5 -> CLASS_PRIEST;
            case 6 -> CLASS_DEATH_KNIGHT;
            case 7 -> CLASS_SHAMAN;
            case 8 -> CLASS_MAGE;
            case 9 -> CLASS_WARLOCK;
            case 10 -> CLASS_MONK;
            case 11 -> CLASS_DRUID;
            case 12 -> CLASS_DEMON_HUNTER;
            default -> throw new AssertionException("No such class: " + classID);
        };
    }
}
