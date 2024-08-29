package com.pandaria.auth;


import com.pandaria.auth.repository.BattlenetAccountRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource( locations = "classpath:bnetserver.conf")
@SpringBootApplication
public class AuthServiceIntegrationTest {

    @Autowired
    private BattlenetAccountRepository repository;

    @BeforeAll
    static void beforeAll() {
        System.setProperty("spring.config.name", "bnetserver");
    }

    @Test
    public void testSomeMethod() {
        repository.queryByLoginTicket("");
    }

}
