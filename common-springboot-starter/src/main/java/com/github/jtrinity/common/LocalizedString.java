package com.github.jtrinity.common;

import java.io.Serializable;
import java.util.EnumMap;

public class LocalizedString implements Serializable {

    private final EnumMap<Locale, String> localizedString = new EnumMap<>(Locale.class);


    public String get(final Locale locale) {
        return localizedString.get(locale);
    }

    public void set(final Locale locale, final String value) {
        localizedString.put(locale, value);
    }

    @Override
    public String toString() {
        return localizedString.toString();
    }
}
