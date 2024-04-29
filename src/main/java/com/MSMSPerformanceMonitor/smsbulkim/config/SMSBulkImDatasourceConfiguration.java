package com.MSMSPerformanceMonitor.smsbulkim.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "smsbulkimEntityManagerFactory",
        transactionManagerRef = "smsbulkimTransactionManager",
        basePackages = { "com.MSMSPerformanceMonitor.smsbulkim.repository" })
public class SMSBulkImDatasourceConfiguration {

    @Bean(name="smsbulkimProperties")
    @ConfigurationProperties("spring.datasource.smsbulkim")
    public DataSourceProperties dataSourceProperties() {

        return new DataSourceProperties();
    }

    @Bean(name="smsbulkimDatasource")
    @ConfigurationProperties(prefix = "spring.datasource.smsbulkim")
    public DataSource datasource(@Qualifier("smsbulkimProperties") DataSourceProperties properties){

        return properties.initializeDataSourceBuilder().build();
    }

    @Bean(name="smsbulkimEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean
            (EntityManagerFactoryBuilder builder,
             @Qualifier("smsbulkimDatasource") DataSource dataSource){

        return builder.dataSource(dataSource)
                .packages("com.MSMSPerformanceMonitor.smsbulkim.model")
                .persistenceUnit("smsbulkim").build();
    }

    @Bean(name = "smsbulkimTransactionManager")
    @ConfigurationProperties("spring.jpa")
    public PlatformTransactionManager transactionManager(
            @Qualifier("smsbulkimEntityManagerFactory") EntityManagerFactory entityManagerFactory) {

        return new JpaTransactionManager(entityManagerFactory);
    }
}
