package com.github.jtrinity.cache;


import java.util.Iterator;

public interface EntityCache<T> extends Iterable<T>, Iterator<T> {
    boolean hasRecord(int id);
    T lookupEntry(int id);

}
