package com.github.jtrinity.dbc;


import com.github.jtrinity.cache.CacheProvider;
import com.github.jtrinity.cache.DbcEntityStore;
import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.common.Locale;
import com.github.jtrinity.dbc.db2.Db2EntityReader;
import org.springframework.beans.factory.annotation.Value;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

import static com.github.jtrinity.common.Logs.SERVER_LOADING;

public class HotfixesDbcObjectManager implements DbcObjectManager {

    @Value("${worldserver.dbc.locale}")
    private Locale defaultDbcLocale;

    @Value("${worldserver.datadir}")
    private String dataFolder;

    private final CacheProvider cacheProvider;

    private final EnumMap<DbcObjects, DbcEntityStore<? extends DbcEntity>> entityStoreMap = new EnumMap<>(DbcObjects.class);

    public HotfixesDbcObjectManager(CacheProvider cacheProvider) {
        this.cacheProvider = cacheProvider;
    }

    public void loadEntityStores() {
        loadEntityStores(EnumSet.allOf(DbcObjects.class));
    }

    public void loadEntityStores(Set<DbcObjects> loadObjects) {


        long oldMSTime = System.currentTimeMillis();

        if (!Locale.isValidLocale(defaultDbcLocale)) {
            SERVER_LOADING.error("Incorrect DBC.Locale! Must be >= 0 and < {} and not {} (set to 0)", Locale.TOTAL_LOCALES, Locale.none);
            defaultDbcLocale = Locale.zhCN;
        }

        SERVER_LOADING.info("Using {} DBC Locale", defaultDbcLocale.name());

        List<String> loadErrors = new LinkedList<>();
        EnumSet<Locale> availableDb2Locales = EnumSet.noneOf(Locale.class);

        try (Stream<java.nio.file.Path> listStream = Files.list(Paths.get(dataFolder, "dbc"))) {
            listStream.filter(Files::isDirectory)
                    .map(path -> Locale.fromName(path.toFile().getName()))
                    .filter(Locale::isValidLocale)
                    .forEach(availableDb2Locales::add);
        } catch (IOException e) {
            SERVER_LOADING.error("Unable to load db2 files for {} locale specified in DBC.Locale config!", Paths.get(dataFolder).toAbsolutePath(), e);
            return;
        }

        if (!availableDb2Locales.contains(defaultDbcLocale)) {
            SERVER_LOADING.error("Unable to load db2 files for {} locale specified in DBC.Locale config!", defaultDbcLocale.name());
            return;
        }

        loadObjects.forEach(dbc -> {
            DbcEntityStore<?> dbcEntityStore = loadDb2File(dbc.clazz(), availableDb2Locales, loadErrors);
            entityStoreMap.put(dbc, dbcEntityStore);
        });

    }


    private DbcEntityStore<?> loadDb2File(Class<? extends DbcEntity> clazz, Set<Locale> availableDb2Locales, List<String> loadErrors) {
        DbcEntityStore<? extends DbcEntity> dbcEntityStore = cacheProvider.newDbcEntityStore(clazz);
        try(Stream<? extends DbcEntity> entities = Db2EntityReader.read(dataFolder, defaultDbcLocale, clazz)) {
            entities.forEach(dbcEntityStore::append);
        };
        return dbcEntityStore;
    }


    public <T extends DbcEntity> DbcEntityStore<T> getEntityStore(DbcObjects object) {
        @SuppressWarnings("unchecked")
        DbcEntityStore<T> objectStore = (DbcEntityStore<T>) entityStoreMap.get(object);
        return objectStore;
    }
}
