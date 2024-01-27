package com.hexaware.hibernate_practice.services;

import java.util.List;

import com.hexaware.hibernate_practice.models.HealthCareProvider;

public interface IHealthCareProviderService {
	
	public void createHealthCareProvider(HealthCareProvider healthCareProvider);
	
	public void updateHealthCareProvider(HealthCareProvider healthCareProvider);
	
	public void deleteHealthCareProvider(HealthCareProvider healthCareProvider);
	
	public List<HealthCareProvider> selectHealthCareProviderByName(String healthCareProviderName);
	
	public List<HealthCareProvider> selectAllHealthCareProvider();

}
