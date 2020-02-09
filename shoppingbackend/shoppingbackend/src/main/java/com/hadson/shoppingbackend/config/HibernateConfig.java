package com.hadson.shoppingbackend.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = { "com.hadson.shoppingbackend.dto" })
@EnableTransactionManagement
public class HibernateConfig {

	private final static String DATABASE_URL = "jdbc:h2:tcp://localhost/~/test";
	private final static String DATABASE_DRIVER = "org.h2.Driver";
	private final static String DATABASE_DIALECT = "org.hibernate.dialect.H2Dialect";
	private final static String DATABASE_USERNAME = "sa";
	private final static String DATABASE_PASSWORD = "";

}
