package com.lombardinternational.classtest.springdata.config;

import com.lombardinternational.classtest.springdata.service.TransactionRepositoryService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.lombardinternational.classtest.springdata.repository")
@EnableTransactionManagement
@ComponentScan(basePackageClasses = TransactionRepositoryService.class)
public class SpringDataConfig {

}
