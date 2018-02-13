package com.transaction.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.transaction.bo.JobCommand;
import com.transaction.controller.JobController;

public class TransactionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("com\\transaction\\common\\application-context.xml");
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
		
		controller.postJob(command);
	}

}
