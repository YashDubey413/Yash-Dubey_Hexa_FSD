package com.hexaware.springjdbcpractice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.springjdbcpractice.models.HealthCareProvider;

public class HealthCareProviderMapper implements RowMapper<HealthCareProvider>{

	@Override
	public HealthCareProvider mapRow(ResultSet rs, int rowNum) throws SQLException {
		HealthCareProvider healthCareProvider=new HealthCareProvider();
		
		healthCareProvider.setHealthCareId(rs.getInt(1));
		healthCareProvider.setHealthcareProviderName(rs.getString(2));
		healthCareProvider.setProviderGender(rs.getString(3));
		healthCareProvider.setAddress(rs.getString(4));
		healthCareProvider.setEmail(rs.getString(5));
		
		return healthCareProvider;
	}

}
