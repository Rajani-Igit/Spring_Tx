package com.transaction.controller;

import com.transaction.bo.JobCommand;
import com.transaction.service.JobService;

public class JobController {

	private JobService service;

	public void setService(JobService service) {
		this.service = service;
	}
	
	public void postJob(JobCommand command){
		
		service.postJob(command);
	}
	
}
