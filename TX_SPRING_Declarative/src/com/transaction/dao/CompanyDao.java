package com.transaction.dao;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.transaction.bo.CompanyBo;

public class CompanyDao {
	private NamedParameterJdbcTemplate npjdbctemplate;
	private final String SQL_INSERT_COMPANY="INSERT INTO company_tbl (COMPANY_ID,COMPANY_NAME,ADDRESS,JOB_ID) VALUES(:companyId,:companyName,:address,:jobIdfk)";
	public void setNpjdbctemplate(NamedParameterJdbcTemplate npjdbctemplate) {
		this.npjdbctemplate = npjdbctemplate;
	}
	
	public void saveCompany(CompanyBo cbo){
		BeanPropertySqlParameterSource params=new BeanPropertySqlParameterSource(cbo);
		npjdbctemplate.update(SQL_INSERT_COMPANY, params);
	}

}
