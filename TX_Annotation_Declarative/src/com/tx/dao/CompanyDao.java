package com.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.tx.bo.CompanyBo;
@Repository
public class CompanyDao {
	private final String SQL_INSERT_SAVECOMPANY="INSERT INTO company_tbl (COMPANY_ID,COMPANY_NAME,ADDRESS,JOB_ID) VALUES(:company_id,:company_name,:address,:job_id)";
	@Autowired
	private NamedParameterJdbcTemplate npjdbctemplate;
	public void saveCompany(CompanyBo cbo){
		//SqlParameterSource paramSource=new MapSqlParameterSource();
		BeanPropertySqlParameterSource paramSource=new BeanPropertySqlParameterSource(cbo);
		npjdbctemplate.update(SQL_INSERT_SAVECOMPANY, paramSource);
	}

}
