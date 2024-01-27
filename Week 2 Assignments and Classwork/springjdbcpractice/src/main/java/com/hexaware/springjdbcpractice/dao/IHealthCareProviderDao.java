package com.hexaware.springjdbcpractice.dao;

import java.util.List;

import com.hexaware.springjdbcpractice.models.HealthCareProvider;

public interface IHealthCareProviderDao {
	
public boolean createHealthCareProvider(HealthCareProvider healthCareProvider);
	
	public List<HealthCareProvider> selectHealthCareProviderByName(String healthCareProviderName);
	
	public List<HealthCareProvider> selectAllHealthCareProvider();

}
