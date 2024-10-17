package com.github.jtrinity.dbc.model;

public enum CharBaseSectionVariation {
    Skin,
    Face,
    FacialHair,
    Hair3,
    Underwear,
    CustomDisplay1,
    CustomDisplay2,
    CustomDisplay3;

    public static CharBaseSectionVariation get(int value) {
        return CharBaseSectionVariation.values()[value];
    }


}
