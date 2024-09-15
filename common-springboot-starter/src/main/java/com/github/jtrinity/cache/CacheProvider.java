package com.github.jtrinity.cache;

public interface CacheProvider {

    <T extends DbcEntity> DbcEntityStore<T> newDbcEntityStore(Class<T> clazz);

}
