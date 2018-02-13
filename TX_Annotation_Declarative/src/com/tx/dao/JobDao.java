package com.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.object.MappingSqlQueryWithParameters;
import org.springframework.stereotype.Repository;

import com.tx.bo.JobBo;

@Repository
public class JobDao {
	private final String SQL_INSERT_SAVEJOB="insert into job_tbl (JOB_ID,EXPERIENCE,QUALIFICATION,JOB_TYPE) values(:job_id,:experience,:qualification,:job_type)";
	@Autowired
	private NamedParameterJdbcTemplate npjdbctemplate;
	public void insetJob(JobBo jbo){
		BeanPropertySqlParameterSource params=new BeanPropertySqlParameterSource(jbo);
		npjdbctemplate.update(SQL_INSERT_SAVEJOB, params);
		//SqlParameterSource parm=new MapSqlParameterSource(); 
	}
	

}
