package com.github.jtrinity.cache;

import java.util.Map;

public interface CacheProvider {

    <T extends DbcEntity> DbcEntityStore<T> newDbcEntityStore(Class<T> clazz);
    <K, V> Map<K, V> newGenericMapCache(String cacheName, Class<K> keyClazz, Class<V> valueClazz);
    <K, V> Map<K, V> newGenericMapCache(String cacheName, TypeReference<K, V> valueClazz);

}

