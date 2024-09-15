package com.github.jtrinity.hotfixes.db2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.TestPropertySource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = Db2FileReaderTest.class)
@TestPropertySource( locations = "classpath:worldserver.conf")
@SpringBootApplication
class Db2FileReaderTest {

    @BeforeAll
    static void beforeAll() {
        System.setProperty("spring.config.name", "worldserver");
    }

    @Test
    void entities() throws IOException {

    }
}