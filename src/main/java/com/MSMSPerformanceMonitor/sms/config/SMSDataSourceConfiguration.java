package com.MSMSPerformanceMonitor.sms.config;


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
        entityManagerFactoryRef = "smsEntityManagerFactory",
        transactionManagerRef = "smsTransactionManager",
        basePackages = { "com.MSMSPerformanceMonitor.sms.repository" })
public class SMSDataSourceConfiguration {

    @Bean(name="smsProperties")
    @ConfigurationProperties("spring.datasource.sms")
    public DataSourceProperties dataSourceProperties() {

        return new DataSourceProperties();
    }

    @Bean(name="smsDatasource")
    @ConfigurationProperties(prefix = "spring.datasource.sms")
    public DataSource datasource(@Qualifier("smsProperties") DataSourceProperties properties){

        return properties.initializeDataSourceBuilder().build();
    }

    @Bean(name="smsEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean
            (EntityManagerFactoryBuilder builder,
             @Qualifier("smsDatasource") DataSource dataSource){

        return builder.dataSource(dataSource)
                .packages("com.MSMSPerformanceMonitor.sms.model")
                .persistenceUnit("sms").build();
    }

    @Bean(name = "smsTransactionManager")
    @ConfigurationProperties("spring.jpa")
    public PlatformTransactionManager transactionManager(
            @Qualifier("smsEntityManagerFactory") EntityManagerFactory entityManagerFactory) {

        return new JpaTransactionManager(entityManagerFactory);
    }
}