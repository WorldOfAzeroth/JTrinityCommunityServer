package com.github.jtrinity.shard;

import com.github.jtrinity.common.AssertionException;

public enum Power {
    POWER_HEALTH                        (-2), // TITLE Health
    POWER_MANA                          ( 0), // TITLE Mana
    POWER_RAGE                          ( 1), // TITLE Rage
    POWER_FOCUS                         ( 2), // TITLE Focus
    POWER_ENERGY                        ( 3), // TITLE Energy
    POWER_HAPPINESS                     ( 4), // TITLE Happiness
    POWER_RUNES                         ( 5), // TITLE Runes
    POWER_RUNIC_POWER                   ( 6), // TITLE Runic Power
    POWER_SOUL_SHARDS                   ( 7), // TITLE Soul Shards
    POWER_LUNAR_POWER                   ( 8), // TITLE Lunar Power
    POWER_HOLY_POWER                    ( 9), // TITLE Holy Power
    POWER_ALTERNATE_POWER               ( 10),// TITLE Alternate
    POWER_MAELSTROM                     ( 11),// TITLE Maelstrom
    POWER_CHI                           ( 12),// TITLE Chi
    POWER_INSANITY                      ( 13),// TITLE Insanity
    POWER_COMBO_POINTS                  ( 14),// TITLE Combo Points
    POWER_DEMONIC_FURY                  ( 15),// TITLE Demonic Fury (Obsolete)
    POWER_ARCANE_CHARGES                ( 16),// TITLE Arcane Charges
    POWER_FURY                          ( 17),// TITLE Fury
    POWER_PAIN                          ( 18),// TITLE Pain
    POWER_ESSENCE                       ( 19),// TITLE Essence
    POWER_RUNE_BLOOD                    ( 20),// TITLE Blood Runes
    POWER_RUNE_FROST                    ( 21),// TITLE Frost Runes
    POWER_RUNE_UNHOLY                   ( 22),// TITLE Unholy Runes
    POWER_ALTERNATE_QUEST               ( 23),// TITLE Alternate (Quest)
    POWER_ALTERNATE_ENCOUNTER           ( 24),// TITLE Alternate (Encounter)
    POWER_ALTERNATE_MOUNT               ( 25),// TITLE Alternate (Mount)
    POWER_BALANCE                       ( 26),// TITLE Balance
    MAX_POWERS                          ( 27),// SKIP
    POWER_ALL                           ( 127); // SKIP

    public final byte value;

    Power(int value) {
        this.value = (byte) value;
    }

    public static Power get(byte powerType) {

        for (Power power : Power.values()) {
            if (power.value == powerType) {
                return power;
            }
        }
        throw new AssertionException("No such power type: " + powerType);
    }
}
