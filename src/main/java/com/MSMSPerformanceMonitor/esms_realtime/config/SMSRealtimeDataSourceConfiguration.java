package com.MSMSPerformanceMonitor.esms_realtime.config;

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
        entityManagerFactoryRef = "smsRealtimeEntityManagerFactory",
        transactionManagerRef = "smsRealtimeTransactionManager",
        basePackages = { "com.MSMSPerformanceMonitor.esms_realtime.repository" })
public class SMSRealtimeDataSourceConfiguration {

    @Bean(name="smsRealtimeProperties")
    @ConfigurationProperties("spring.datasource.esmsrealtime")
    public DataSourceProperties dataSourceProperties() {

        return new DataSourceProperties();
    }

    @Bean(name="smsRealtimeDatasource")
    @ConfigurationProperties(prefix = "spring.datasource.esmsrealtime")
    public DataSource datasource(@Qualifier("smsRealtimeProperties") DataSourceProperties properties){

        return properties.initializeDataSourceBuilder().build();
    }

    @Bean(name="smsRealtimeEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean
            (EntityManagerFactoryBuilder builder,
             @Qualifier("smsRealtimeDatasource") DataSource dataSource){

        return builder.dataSource(dataSource)
                .packages("com.MSMSPerformanceMonitor.esms_realtime.model")
                .persistenceUnit("smsRealtime").build();
    }

    @Bean(name = "smsRealtimeTransactionManager")
    @ConfigurationProperties("spring.jpa")
    public PlatformTransactionManager transactionManager(
            @Qualifier("smsRealtimeEntityManagerFactory") EntityManagerFactory entityManagerFactory) {

        return new JpaTransactionManager(entityManagerFactory);
    }
}
