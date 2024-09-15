package com.github.jtrinity.cache;

import org.h2.mvstore.MVMap;
import org.h2.mvstore.MVStore;
import org.springframework.beans.factory.annotation.Value;

public class MapdbCacheProvider implements CacheProvider {

    @Value("${worldserver.DataDir}/cache/metadata.db")
    private String pathOfCacheFile;

    private final MVStore mvStore;



    public MapdbCacheProvider() {
        mvStore = new MVStore.Builder().fileName(pathOfCacheFile)
                .compress()
                .cacheSize(64)
                .autoCommitBufferSize(64)
                .open();

    }


    @Override
    public <T extends DbcEntity> DbcEntityStore<T> newDbcEntityStore(Class<T> clazz) {
        MVMap<Integer, byte[]> mvMap = mvStore.openMap(clazz.getSimpleName());
        return new DbcEntityStoreImpl<>(mvMap, clazz);
    }

    public void destroy() {
        if(mvStore != null) {
            mvStore.closeImmediately();
        }
    }
}
