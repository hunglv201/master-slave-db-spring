//package com.example.demo.config;
//
//import org.springframework.beans.factory.annotation.Qualifier;
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
//@EnableTransactionManagement
////@EnableJpaRepositories(
////        basePackages = {"com.example.demo.repository.write", "com.example.demo.repository.common"}, // Đường dẫn đến package chứa repository cho DB1
////        entityManagerFactoryRef = "writeEntityManagerFactory",
////        transactionManagerRef = "writeTransactionManager"
////)
//public class WriteJpaConfig {
//
//    @Primary
//    @Bean(name = "writeDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.write")
//    public DataSource dataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Primary
//    @Bean(name = "writeEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
//            EntityManagerFactoryBuilder builder,
//            @Qualifier("writeDataSource") DataSource dataSource) {
//        return builder
//                .dataSource(dataSource)
//                .packages("com.example.demo.model")
//                .persistenceUnit("write")
//                .build();
//    }
//
//    @Primary
//    @Bean(name = "writeTransactionManager")
//    public PlatformTransactionManager transactionManager(
//            @Qualifier("writeEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
//        return new JpaTransactionManager(entityManagerFactory);
//    }
//}
