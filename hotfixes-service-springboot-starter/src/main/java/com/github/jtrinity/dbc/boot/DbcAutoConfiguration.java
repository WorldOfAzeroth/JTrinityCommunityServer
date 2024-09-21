package com.github.jtrinity.dbc.boot;

import com.github.jtrinity.cache.CacheProvider;
import com.github.jtrinity.dbc.DbcObjectManager;
import com.github.jtrinity.dbc.HotfixesDbcObjectManager;
import com.github.jtrinity.dbc.domain.Achievement;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Objects;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "hotfixesEntityManagerFactory",
        transactionManagerRef = "hotfixesTransactionManager"
)
public class DbcAutoConfiguration {

    @Bean
    DbcObjectManager dbcObjectManager(CacheProvider cacheProvider) {
        return new HotfixesDbcObjectManager(cacheProvider);
    }


    @Bean
    @ConfigurationProperties(prefix = "worldserver.hotfixdatabaseinfo")
    DataSource hotfixesDataSource() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @Bean
    @ConfigurationProperties(prefix = "worldserver.hotfixdatabaseinfo.jpa")
    Properties hotfixesJpaProperties() {
        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.hbm2ddl.auto", "none");
        jpaProperties.put("hibernate.show_sql", "true");
        jpaProperties.put("hibernate.order_inserts", "true");
        jpaProperties.put("hibernate.order_updates", "true");
        jpaProperties.put("hibernate.batch_versioned_data", "true");
        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        return jpaProperties;
    }


    @Bean
    LocalContainerEntityManagerFactoryBean hotfixesEntityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em
                = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(hotfixesDataSource());
        em.setPackagesToScan(Achievement.class.getPackage().getName());
        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setPersistenceUnitName("hotfixes");
        em.setJpaVendorAdapter(vendorAdapter);
        em.setJpaProperties(hotfixesJpaProperties());
        return em;
    }


    @Bean
    PlatformTransactionManager hotfixesTransactionManager() {
        return new JpaTransactionManager(Objects.requireNonNull(hotfixesEntityManagerFactory().getObject()));
    }

}
