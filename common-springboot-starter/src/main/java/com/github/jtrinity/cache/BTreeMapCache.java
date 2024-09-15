package com.github.jtrinity.cache;

import com.github.jtrinity.utils.FuryUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.mapdb.BTreeMap;
import org.mapdb.BTreeMapJava;
import org.mapdb.SortedTableMap;
import org.mapdb.Store;
import org.mapdb.serializer.GroupSerializer;

import java.io.PrintStream;
import java.util.*;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

class BTreeMapCache<K, V> implements MapCache<K, V> {

    Class<V> clazz;

    BTreeMap<K, byte[]> map;

    SortedTableMap<K, byte[]> test;

    public V get( K key) {
        return FuryUtil.deserialize(map.get(key), clazz);
    }

    public V put(K key, V value) {
        byte[] bytes = map.put(key, FuryUtil.serialize(value));
        if(bytes != null) {
            return FuryUtil.deserialize(bytes, clazz);
        }
        return null;
    }

    public K findLowerKey(K key, boolean inclusive) {
        return map.findLowerKey(key, inclusive);
    }

    public K higherKey(K key) {
        return map.higherKey(key);
    }

    public int size() {
        return map.size();
    }

    public void assertCurrentThreadUnlocked() {
        map.assertCurrentThreadUnlocked();
    }

    public boolean isClosed() {
        return map.isClosed();
    }

   @Nullable
    public Object remove(@Nullable Object key) {
        return map.remove(key);
    }

    public boolean remove(Object key, Object value) {
        return map.remove(key, value);
    }



    public void putAll(@NotNull Map from) {
        map.putAll(from);
    }

    public Object lastKey() {
        return map.lastKey();
    }

    public NavigableSet keySet() {
        return map.keySet();
    }

    @NotNull
    public GroupSerializer getKeySerializer() {
        return map.getKeySerializer();
    }

    @NotNull
    public Collection getValues() {
        return map.getValues();
    }

    public boolean getHasValues() {
        return map.getHasValues();
    }

    public void forEach(@NotNull BiConsumer action) {
        map.forEach(action);
    }


    public boolean isEmpty() {
        return map.isEmpty();
    }

    public void clear() {
        map.clear();
    }

    public V putIfAbsent(K key, V value) {
        byte[] bytes = map.putIfAbsent(key, FuryUtil.serialize(value));
        return FuryUtil.deserialize(bytes, clazz);
    }


    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return null;
    }
}
