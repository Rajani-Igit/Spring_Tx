package com.at.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.at.command.JobCommand;
import com.at.controller.JobController;
import com.at.javaconfig.RootConfig;

public class TxTest {
public static void main(String[] args) {
	ApplicationContext ctx=new  AnnotationConfigApplicationContext(RootConfig.class);
	JobController controller=ctx.getBean("jobController", JobController.class);
	JobCommand command=new JobCommand();
	command.setAddress("Hyderabad");
	command.setCompanyId(324);
	command.setCompanyName("TCS");
	command.setExperience("3Years");
	command.setJobId(2020);
	command.setJobType("IT");
	command.setJobIdfk(2021);
	command.setQualification("MCA");
	
	controller.createjob(command);
	
}
}
