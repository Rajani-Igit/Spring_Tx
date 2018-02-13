package com.at.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.at.bo.JobBo;

@Repository
public class JobDao {
private final String SQL_INSERT_JOB="INSERT INTO job_tbl (JOB_ID, EXPERIENCE, QUALIFICATION,JOB_TYPE) VALUES(?,?,?,?)";
@Autowired
private JdbcTemplate jdbctemplate;
public void saveJob(JobBo jbo){
	jdbctemplate.update(SQL_INSERT_JOB, jbo.getJobId(),jbo.getExperience(),jbo.getQualification(),jbo.getJobType());
}
}
