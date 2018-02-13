package com.at.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.at.bo.CompanyBo;
@Repository
public class CompanyDao {
@Autowired
private JdbcTemplate jdbcTemplate;
private final String SQL_INSERT_COMPANY="INSERT INTO company_tbl (COMPANY_ID,COMPANY_NAME,ADDRESS,JOB_ID) VALUES(?,?,?,?)";
public void saveCompany(CompanyBo cbo){
	jdbcTemplate.update(SQL_INSERT_COMPANY, cbo.getCompanyId(),cbo.getCompanyName(),cbo.getAddress(),cbo.getJobIdfk());
 
}
}
