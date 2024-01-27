package com.hexaware.hibernate_practice.services;

import java.util.List;

import com.hexaware.hibernate_practice.dao.HealthCareProviderDaoImp;
import com.hexaware.hibernate_practice.dao.IHealthCareProviderDao;
import com.hexaware.hibernate_practice.models.HealthCareProvider;

public class HealthCareProviderServiceImp implements IHealthCareProviderService {
	
	IHealthCareProviderDao dao=new HealthCareProviderDaoImp();

	@Override
	public void createHealthCareProvider(HealthCareProvider healthCareProvider) {
		// TODO Auto-generated method stub
		 dao.createHealthCareProvider(healthCareProvider);
	}

	@Override
	public void updateHealthCareProvider(HealthCareProvider healthCareProvider) {
		dao.updateHealthCareProvider(healthCareProvider);
	}

	@Override
	public void deleteHealthCareProvider(HealthCareProvider healthCareProvider) {
		// TODO Auto-generated method stub
		dao.deleteHealthCareProvider(healthCareProvider);
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
