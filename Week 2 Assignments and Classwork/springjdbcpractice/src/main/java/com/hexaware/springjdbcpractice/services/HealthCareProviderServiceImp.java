package com.hexaware.springjdbcpractice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springjdbcpractice.dao.IHealthCareProviderDao;
import com.hexaware.springjdbcpractice.models.HealthCareProvider;

@Service
public class HealthCareProviderServiceImp implements IHealthCareProviderService {
	
	@Autowired
	IHealthCareProviderDao dao;

	@Override
	public boolean createHealthCareProvider(HealthCareProvider healthCareProvider) {
		
		return dao.createHealthCareProvider(healthCareProvider);
	}

	@Override
	public List<HealthCareProvider> selectHealthCareProviderByName(String healthCareProviderName) {
		
		return dao.selectHealthCareProviderByName(healthCareProviderName);
	}

	@Override
	public List<HealthCareProvider> selectAllHealthCareProvider() {
		
		return dao.selectAllHealthCareProvider();
	}

}
