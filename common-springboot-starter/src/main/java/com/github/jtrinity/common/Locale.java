package com.github.jtrinity.common;

import org.springframework.core.convert.converter.Converter;

import java.util.Arrays;

public enum Locale {
    enUS,
    koKR,
    frFR,
    deDE,
    zhCN,
    zhTW,
    esES,
    esMX,
    ruRU,
    none,
    ptBR,
    itIT,
    TOTAL_LOCALES;

    public static Locale fromName(String name) {
        return Arrays.stream(Locale.values())
                .filter(e -> e.name().endsWith(name))
                .findFirst().orElse(TOTAL_LOCALES);
    }

    public static boolean isValidLocale(Locale locale) {
        return locale.ordinal() < TOTAL_LOCALES.ordinal() && locale != none;
    }

}
