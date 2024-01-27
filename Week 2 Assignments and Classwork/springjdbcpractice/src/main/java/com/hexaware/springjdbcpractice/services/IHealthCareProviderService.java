package com.hexaware.springjdbcpractice.services;

import java.util.List;

import com.hexaware.springjdbcpractice.models.HealthCareProvider;

public interface IHealthCareProviderService {
	
	public boolean createHealthCareProvider(HealthCareProvider healthCareProvider);
	
	public List<HealthCareProvider> selectHealthCareProviderByName(String healthCareProviderName);
	
	public List<HealthCareProvider> selectAllHealthCareProvider();

}
