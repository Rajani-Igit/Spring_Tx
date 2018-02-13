package com.transaction.dao;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.transaction.bo.JobBo;

public class JobDao {
	private NamedParameterJdbcTemplate npjdbctemplate;
	private DataSourceTransactionManager txmanager;
	private final String SQL_INSERT_JOB="INSERT INTO job_tbl (JOB_ID, EXPERIENCE, QUALIFICATION,JOB_TYPE) VALUES(:jobId,:experience,:qualification,:jobType)";
	
	public void setNpjdbctemplate(NamedParameterJdbcTemplate npjdbctemplate) {
		this.npjdbctemplate = npjdbctemplate;
	}
	
	public void setTxmanager(DataSourceTransactionManager txmanager) {
		this.txmanager = txmanager;
	}
	
	public void saveJob(JobBo bo){
		BeanPropertySqlParameterSource params=new BeanPropertySqlParameterSource(bo);
		npjdbctemplate.update(SQL_INSERT_JOB, params);
	}

}
