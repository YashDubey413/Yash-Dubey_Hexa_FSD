package com.hexaware.hibernate_practice.dao;

import java.util.List;

import com.hexaware.hibernate_practice.models.HealthCareProvider;

public interface IHealthCareProviderDao {
	
public void createHealthCareProvider(HealthCareProvider healthCareProvider);
	
	public void updateHealthCareProvider(HealthCareProvider healthCareProvider);
	
	public void deleteHealthCareProvider(HealthCareProvider healthCareProvider);
	
	public List<HealthCareProvider> selectHealthCareProviderByName(String healthCareProviderName);
	
	public List<HealthCareProvider> selectAllHealthCareProvider();


}
