package com.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;

@SpringBootApplication
public class BootDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(BootDemo1Application.class, args);
	}


	@Bean
	@Profile("test")
	public DataSource dataSource(){
		
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("org.h2.Driver");
		ds.setUrl("jdbc:h2:file:./data/testdb;DB_CLOSE_ON_EXIT=FALSE");
		ds.setUsername("sa");
		return ds;
	}



}
