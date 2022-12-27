//package com.digipay.controller;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//import javax.sql.DataSource;
//import java.util.Properties;
//
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories("com.digipay")
//@ComponentScan("com.digipay")
////@ComponentScan(basePackages ="com.digipay" )
//@EnableWebMvc
////public class SpringRestConfig implements WebMvcConfigurer {
//public class SpringRestConfig  {
////
////        private final String PROPERTY_DRIVER = "driver";
////        private final String PROPERTY_URL = "url";
////        private final String PROPERTY_USERNAME = "user";
////        private final String PROPERTY_PASSWORD = "password";
//        private final String PROPERTY_SHOW_SQL = "hibernate.show_sql";
//        private final String PROPERTY_DIALECT = "hibernate.dialect";
//
//        @Bean
//        LocalContainerEntityManagerFactoryBean entityManagerFactory(){
//            LocalContainerEntityManagerFactoryBean lfb = new LocalContainerEntityManagerFactoryBean();
//            lfb.setDataSource(dataSource());
//            lfb.setPackagesToScan("com.digipay");
//            lfb.setJpaProperties(hibernateProps());
//            HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//            lfb.setJpaVendorAdapter(vendorAdapter);
//            lfb.setPackagesToScan("com.digipay");
//            return lfb;
//        }
//
//        @Bean
//        DataSource dataSource() {
//            DriverManagerDataSource ds = new DriverManagerDataSource();
//            ds.setUrl("jdbc:oracle:thin:@//localhost:1521/XEPDB1");
//            ds.setUsername("vahid");
//            ds.setPassword("vahid");
//            ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//
//            return ds;
//        }
//
//        Properties hibernateProps() {
//            Properties properties = new Properties();
//            properties.setProperty(PROPERTY_DIALECT, "org.hibernate.dialect.Oracle10gDialect");
//            properties.setProperty(PROPERTY_SHOW_SQL, "true");
//            properties.setProperty("hibernate.hbm2ddl.auto", "update");
//            return properties;
//        }
//
//        @Bean
//        JpaTransactionManager transactionManager() {
//            JpaTransactionManager transactionManager = new JpaTransactionManager();
//            transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
//            return transactionManager;
//        }
//
//
//    }
//
//
//
//
