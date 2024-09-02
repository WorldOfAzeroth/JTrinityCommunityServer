package com.pandaria.config;


import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;
import java.time.Duration;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

@SpringBootTest
@SpringBootApplication
public class DynamicConfigurationTest {


    @Autowired
    private TestPropertiess pro;

    @Autowired
    private BeanFactoryProperties beanFactoryProperties;

    @BeforeAll
    static void beforeAll() {
        System.setProperty("spring.config.name", "bnetserver");
    }





    @Test
    public void testDynamicConfiguration() {

        Assertions.assertEquals(Duration.ofMillis(3600), beanFactoryProperties.getTicketDuration());
        Assertions.assertEquals("", pro.sourceDirectory);
        Assertions.assertEquals("", pro.logsDir);
        Configuration.reload(new ClassPathResource("bnetserver_reload.conf"));
        Assertions.assertEquals("192.168.1.1", beanFactoryProperties.getExternalAddress());
        Assertions.assertEquals("192.168.1.1", beanFactoryProperties.getLocalAddress());
        Assertions.assertEquals(Duration.ofMillis(5600), beanFactoryProperties.getTicketDuration());
        Assertions.assertEquals("test-reload", pro.sourceDirectory);
        Assertions.assertEquals("test-reload", pro.logsDir);

    }


}
