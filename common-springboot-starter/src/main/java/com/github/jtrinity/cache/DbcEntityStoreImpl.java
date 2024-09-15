package com.github.jtrinity.cache;

import com.github.jtrinity.utils.FuryUtil;
import lombok.NonNull;
import org.h2.mvstore.Cursor;
import org.h2.mvstore.MVMap;

import java.util.Iterator;

class DbcEntityStoreImpl<T extends DbcEntity> implements DbcEntityStore<T>, Iterator<T> {

    private final Class<T> clazz;
    private final MVMap<Integer,byte[]> mvMap;
    private Cursor<Integer, byte[]> cursor = null;


    DbcEntityStoreImpl(MVMap<Integer,byte[]> mvMap, Class<T> clazz) {
        this.mvMap = mvMap;
        this.clazz = clazz;
        FuryUtil.FURY.register(clazz);
    }

    @Override
    public boolean contains(Integer id) {
        return mvMap.containsKey(id);
    }

    @Override
    public T get(Integer id) {
        return FuryUtil.deserialize(mvMap.get(id), clazz);
    }

    @Override
    public void append(DbcEntity object) {
        mvMap.append(object.getId(), FuryUtil.serialize(object));
    }

    @Override
    public void put(Integer integer, T object) {
        mvMap.put(integer, FuryUtil.serialize(object));
    }

    @Override
    public void remove(DbcEntity object) {
        mvMap.remove(object.getId());
    }

    @Override
    @NonNull
    public Iterator<T> iterator() {
        Integer firstKey = mvMap.firstKey();
        Integer lastKey = mvMap.lastKey();
        cursor = mvMap.cursor(firstKey, lastKey, true);
        return this;
    }

    @Override
    public boolean hasNext() {
        return cursor.hasNext();
    }

    @Override
    public T next() {
        return FuryUtil.deserialize(cursor.getValue(), clazz);
    }

    @Override
    public void remove() {
        cursor.remove();
    }
}
