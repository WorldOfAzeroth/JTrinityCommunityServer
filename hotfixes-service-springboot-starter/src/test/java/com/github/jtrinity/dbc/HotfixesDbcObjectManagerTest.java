package com.github.jtrinity.dbc;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest(classes = HotfixesDbcObjectManagerTest.class)
@SpringBootApplication
class HotfixesDbcObjectManagerTest {
    @Autowired
    HotfixesDbcObjectManager hotfixesDbcObjectManager;

    @BeforeAll
    static void beforeAll() {
        System.setProperty("spring.config.location", "../test-resources/etc/worldserver.conf");
    }

    @Test
    void loadEntityStores() {
        //hotfixesDbcObjectManager.loadEntityStores(Set.of(DbcObjects.PlayerCondition));

        hotfixesDbcObjectManager.loadDbcObjects();

    }
}