package com.at.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.at.command.JobCommand;
import com.at.service.JobService;

@Controller("jobController")
public class JobController {
@Autowired
private JobService jservice;
public void createjob(JobCommand jobcommand){
	jservice.postJob(jobcommand);
}
}
