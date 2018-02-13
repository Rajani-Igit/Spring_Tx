package com.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tx.bo.CompanyBo;
import com.tx.bo.JobBo;
import com.tx.bo.JobCommand;
import com.tx.dao.CompanyDao;
import com.tx.dao.JobDao;

@Service("jobservice")
public class JobService {
	@Autowired
	private JobDao jobdao;
	@Autowired
	private CompanyDao cdao;
	@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
	public void savejob(JobCommand jcommand){
		JobBo jbo=new JobBo();
		jbo.setJob_id(jcommand.getJob_id());
		jbo.setJob_type(jcommand.getJob_type());
		jbo.setQualification(jcommand.getQualification());
		jbo.setExperience(jcommand.getExperience());
		jobdao.insetJob(jbo);
		CompanyBo cbo=new CompanyBo();
		cbo.setCompany_id(jcommand.getCompany_id());
		cbo.setCompany_name(jcommand.getCompany_name());
		cbo.setAddress(jcommand.getAddress());
		//cbo.setJob_id(jcommand.getJob_id());
		cbo.setJob_id(876);
		cdao.saveCompany(cbo);
	}

}
