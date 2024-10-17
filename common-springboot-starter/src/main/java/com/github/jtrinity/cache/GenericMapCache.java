package com.github.jtrinity.cache;

import com.github.jtrinity.utils.FuryUtil;
import org.h2.mvstore.MVMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

class GenericMapCache<K, V> implements Map<K, V> {


    private final MVMap<byte[],byte[]> mvMap;
    private final Class<V> valueClazz;

    GenericMapCache(MVMap<byte[],byte[]> mvMap, Class<K> keyClazz, Class<V> valueClazz) {
        this.mvMap = mvMap;
        this.valueClazz = valueClazz;
        FuryUtil.FURY.register(keyClazz);
        FuryUtil.FURY.register(valueClazz);
    }

    GenericMapCache(MVMap<byte[],byte[]> mvMap, TypeReference<K, V> typeReference) {
        this(mvMap, typeReference.getKeyType(), typeReference.getValueType());
    }

    @Override
    public int size() {
        return mvMap.size();
    }

    @Override
    public boolean isEmpty() {
        return mvMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        byte[] bytes = FuryUtil.serialize(key);
        return mvMap.containsKey(bytes);
    }

    @Override
    public boolean containsValue(Object value) {
        byte[] bytes = FuryUtil.serialize(value);
        return mvMap.containsValue(bytes);
    }

    @Override
    public V get(Object key) {
        byte[] bytes = FuryUtil.serialize(key);
        byte[] valueByte = mvMap.get(bytes);
        return FuryUtil.deserialize(valueByte, valueClazz);
    }

    @Override
    public V put(K key, V value) {
        byte[] keyByte = FuryUtil.serialize(key);
        byte[] valueByte = FuryUtil.serialize(value);
        byte[] bytes = mvMap.put(keyByte, valueByte);
        if(bytes != null) {
            return FuryUtil.deserialize(bytes, valueClazz);
        }
        return null;
    }

    @Override
    public V remove(Object key) {
        byte[] bytes = FuryUtil.serialize(key);
        byte[] valueBytes = mvMap.remove(bytes);
        if(valueBytes != null) {
            return FuryUtil.deserialize(bytes, valueClazz);
        }
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

        for (Entry<? extends K, ? extends V> entry : m.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            byte[] keyByte = FuryUtil.serialize(key);
            byte[] valueByte = FuryUtil.serialize(value);
            mvMap.put(keyByte, valueByte);
        }

    }

    @Override
    public void clear() {
        mvMap.clear();
    }

    @Override
    public Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Collection<V> values() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException();
    }
}
