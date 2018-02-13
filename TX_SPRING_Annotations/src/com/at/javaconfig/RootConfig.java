package com.at.javaconfig;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Import(value = {PersistancyConfig.class})
@ComponentScan(basePackages={"com.at.dao","com.at.service","com.at.controller"})
@EnableTransactionManagement
public class RootConfig {

}
