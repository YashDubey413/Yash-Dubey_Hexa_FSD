package com.hexaware.springrestjpapractice.service;

import java.util.List;

import com.hexaware.springrestjpapractice.entities.HealthCareProvider;

public interface IHealthCareProviderServices {
	
	public HealthCareProvider addHealthCare(HealthCareProvider hp);
	
	public HealthCareProvider updateHealthCare(HealthCareProvider hp);
	
	public HealthCareProvider updateHealthCarediff(HealthCareProvider hp);
	
	public List<HealthCareProvider> getAllHealthCare();
	
	public HealthCareProvider getHealthCareById(long healthCareId);
	
	public List<HealthCareProvider> getHealthCareByName(String healthCareName);
	
	public String deleteHealthCare(long healthCareId);
	
	public int deleteHealthCareByName(String healthCareName);
	
	public List<HealthCareProvider> getHealthCareByNameFirst(char a);
	
}
