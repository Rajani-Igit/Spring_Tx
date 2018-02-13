package com.at.javaconfig;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class PersistancyConfig {
	@Bean
	public DriverManagerDataSource newDataSource(){
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/test");
		datasource.setUsername("root");
		datasource.setPassword("root");
		return datasource;
	}
	@Bean(name="jdbcTemplate",autowire=Autowire.BY_TYPE)
	public JdbcTemplate newjdbcTemplate(){
		return new JdbcTemplate();
	} 
    @Bean(name="datasourcetransactionmanager",autowire=Autowire.BY_TYPE)
	public DataSourceTransactionManager getDatasourceTransactionmanager(){
		return new DataSourceTransactionManager();
	}
}
