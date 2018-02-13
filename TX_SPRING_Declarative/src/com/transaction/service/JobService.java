package com.transaction.service;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.transaction.bo.CompanyBo;
import com.transaction.bo.JobBo;
import com.transaction.bo.JobCommand;
import com.transaction.dao.CompanyDao;
import com.transaction.dao.JobDao;

public class JobService {
private JobDao jobdao;
private CompanyDao companydao;
private DataSourceTransactionManager txManager;

public void setTxManager(DataSourceTransactionManager txManager) {
	this.txManager = txManager;
}
public void setJobdao(JobDao jobdao) {
	this.jobdao = jobdao;
}
public void setCompanydao(CompanyDao companydao) {
	this.companydao = companydao;
}
public void postJob(JobCommand jobcommand){
	JobBo bo=new JobBo();
	bo.setJobId(jobcommand.getJobId());
	bo.setJobType(jobcommand.getJobType());
	bo.setExperience(jobcommand.getExperience());
	bo.setQualification(jobcommand.getQualification());
	jobdao.saveJob(bo);
	CompanyBo cbo=new CompanyBo();
	cbo.setAddress(jobcommand.getAddress());
	cbo.setCompanyId(jobcommand.getCompanyId());
	cbo.setCompanyName(jobcommand.getCompanyName());
	cbo.setJobIdfk(jobcommand.getJobIdfk());
	companydao.saveCompany(cbo);
}

}
