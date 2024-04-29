package com.MSMSPerformanceMonitor.smsbulk.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "smsbulkEntityManagerFactory",
        transactionManagerRef = "smsbulkTransactionManager",
        basePackages = { "com.MSMSPerformanceMonitor.smsbulk.repository" })
public class SMSBulkDatasourceConfiguration {

	@Primary
    @Bean(name="smsbulkProperties")
    @ConfigurationProperties("spring.datasource")
    public DataSourceProperties dataSourceProperties() {

        return new DataSourceProperties();
    }

	@Primary
    @Bean(name="smsbulkDatasource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource datasource(@Qualifier("smsbulkProperties") DataSourceProperties properties){

        return properties.initializeDataSourceBuilder().build();
    }

	@Primary
    @Bean(name="smsbulkEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean
            (EntityManagerFactoryBuilder builder,
             @Qualifier("smsbulkDatasource") DataSource dataSource){

        return builder.dataSource(dataSource)
                .packages("com.MSMSPerformanceMonitor.smsbulk.model")
                .persistenceUnit("smsbulk").build();
    }

	@Primary
    @Bean(name = "smsbulkTransactionManager")
    @ConfigurationProperties("spring.jpa")
    public PlatformTransactionManager transactionManager(
            @Qualifier("smsbulkEntityManagerFactory") EntityManagerFactory entityManagerFactory) {

        return new JpaTransactionManager(entityManagerFactory);
    }
}
