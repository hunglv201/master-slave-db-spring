//package com.example.demo.config;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//@Configuration
//@EnableAutoConfiguration
//@EnableTransactionManagement
////@EnableJpaRepositories(
////        basePackages = {"com.example.demo.repository.read"}, // Đường dẫn đến package chứa repository cho DB1
////        entityManagerFactoryRef = "readEntityManagerFactory",
////        transactionManagerRef = "readTransactionManager"
////)
//public class ReadJpaConfig {
//
//    @Bean(name = "readDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.read")
//    public DataSource dataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "readEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
//            EntityManagerFactoryBuilder builder,
//            @Qualifier("readDataSource") DataSource dataSource) {
//        return builder
//                .dataSource(dataSource)
//                .packages("com.example.demo.model")
//                .persistenceUnit("read")
//                .build();
//    }
//
//    @Bean(name = "readTransactionManager")
//    public PlatformTransactionManager transactionManager(
//            @Qualifier("readEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
//        return new JpaTransactionManager(entityManagerFactory);
//    }
//}
