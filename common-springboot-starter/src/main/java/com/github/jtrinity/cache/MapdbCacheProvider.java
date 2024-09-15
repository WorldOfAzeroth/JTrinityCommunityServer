package com.github.jtrinity.cache;

import com.github.jtrinity.utils.FuryUtil;
import org.mapdb.BTreeMap;
import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.mapdb.Serializer;
import org.mapdb.serializer.SerializerCompressionWrapper;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.util.Iterator;
import java.util.Objects;

public class MapdbCacheProvider implements CacheProvider {

    @Value("${worldserver.DataDir}/cache/metadata.db")
    private String pathOfMetadataDBFile;

    private final DB metadataDb;

    public MapdbCacheProvider() {
        this.metadataDb = DBMaker.fileDB(new File(pathOfMetadataDBFile))
                .fileMmapEnableIfSupported()
                .fileMmapPreclearDisable()
                .cleanerHackEnable()
                .make();
    }


    public <T> EntityCache<T> db2Storage(Class<T> clazz) {
        Objects.requireNonNull(clazz, "clazz must not be null");
        FuryUtil.FURY.register(clazz);
        BTreeMap<Integer, byte[]> bTreeMap = this.metadataDb.treeMap(clazz.getSimpleName())
                .valuesOutsideNodesEnable()
                .keySerializer(Serializer.INTEGER)
                .valueSerializer(new SerializerCompressionWrapper<>(Serializer.BYTE_ARRAY))
                .counterEnable()
                .createOrOpen();
        return new MapdbCache<>(clazz, bTreeMap);
    }


    static class MapdbCache<T> implements EntityCache<T>, Iterator<T> {

        private final Class<T> clazz;
        private final BTreeMap<Integer, byte[]> storage;
        private final Iterator<byte[]> iterator;

        private MapdbCache(Class<T> clazz, BTreeMap<Integer, byte[]> storage) {
            this.clazz = clazz;
            this.storage = storage;
            this.iterator = storage.valueIterator();
        }

        @Override
        public boolean hasRecord(int id) {
            return storage.containsKey(id);
        }

        @Override
        public T lookupEntry(int id) {
            return FuryUtil.deserialize(storage.get(id), clazz);
        }

        @Override
        public Iterator<T> iterator() {
            return this;
        }

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public T next() {
            return FuryUtil.deserialize(iterator.next(), clazz);
        }

        @Override
        public void remove() {
            iterator.remove();
        }
    }


}
