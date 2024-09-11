package com.github.jtrinity.hotfixes;

import com.github.jtrinity.auth.repository.BuildInfoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = ArrayToResultConverterTest.class)
@TestPropertySource( locations = "classpath:bnetserver.conf")
@SpringBootApplication

class ArrayToResultConverterTest {


    @Autowired
    private BuildInfoRepository buildInfoRepo;

    @BeforeAll
    static void beforeAll() {
        System.setProperty("spring.config.name", "bnetserver");
    }


    @Test
    @Transactional
    public void testArrayToResultConverter() {

        buildInfoRepo.stream().forEach(e->{
            Assertions.assertNotNull(e.authKey());
            Assertions.assertNotNull(e.buildInfo());
        });
    }

}