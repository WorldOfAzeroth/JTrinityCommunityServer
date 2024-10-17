package com.github.jtrinity.shard;

import com.github.jtrinity.common.Locale;

public interface SharedDefine {


    Locale DEFAULT_LOCALE = Locale.zhCN;

    int MAX_CLASSES = 13;
    int MAX_POWER = 20;
    int MAX_TALENT_TIERS = 7;
    int MAX_TALENT_COLUMNS = 3;
    int MAX_PVP_TALENT_TIERS = 6;
    int MAX_PVP_TALENT_COLUMNS = 3;


    int MIN_SPECIALIZATION_LEVEL = 10;
    int MAX_SPECIALIZATIONS = 4;
    int PET_SPEC_OVERRIDE_CLASS_INDEX = MAX_CLASSES;


    short BATTLE_PET_SPECIES_MAX_ID = 2164;
}
