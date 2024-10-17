package com.github.jtrinity.cache;


import java.util.Iterator;
import java.util.function.Consumer;

public interface DbcEntityStore<T extends DbcEntity> extends Iterable<T>, Iterator<T> {
    boolean contains(Integer id);
    T get(Integer id);
    void append(DbcEntity object);
    void put(Integer integer, T object);
    void remove(DbcEntity object);
    int size();
    boolean isEmpty();
}
