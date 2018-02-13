package com.tx.tset;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tx.bo.JobCommand;
import com.tx.service.JobService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com\\tx\\common\\application-context.xml");
		JobService service=context.getBean("jobservice", JobService.class);
		JobCommand jcommand=new JobCommand();
		jcommand.setJob_id(1234);
		jcommand.setJob_type("Software");
		jcommand.setQualification("MCA");
		jcommand.setExperience("3 Years");
		jcommand.setCompany_name("TCS");
		jcommand.setCompany_id(1008);
		jcommand.setAddress("Adibatla,Hyderabad");
		service.savejob(jcommand);
	
	}

}
