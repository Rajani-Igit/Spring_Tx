package com.at.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.at.bo.CompanyBo;
import com.at.bo.JobBo;
import com.at.command.JobCommand;
import com.at.dao.CompanyDao;
import com.at.dao.JobDao;

@Service
public class JobService {
@Autowired
private JobDao jdao;
@Autowired
private CompanyDao cdao;
@Transactional(readOnly=false)
public void postJob(JobCommand jobcommand){
	JobBo bo=new JobBo();
	bo.setJobId(jobcommand.getJobId());
	bo.setJobType(jobcommand.getJobType());
	bo.setExperience(jobcommand.getExperience());
	bo.setQualification(jobcommand.getQualification());
	jdao.saveJob(bo);
	CompanyBo cbo=new CompanyBo();
	cbo.setAddress(jobcommand.getAddress());
	cbo.setCompanyId(jobcommand.getCompanyId());
	cbo.setCompanyName(jobcommand.getCompanyName());
	cbo.setJobIdfk(jobcommand.getJobIdfk());
	cdao.saveCompany(cbo);


}

}
