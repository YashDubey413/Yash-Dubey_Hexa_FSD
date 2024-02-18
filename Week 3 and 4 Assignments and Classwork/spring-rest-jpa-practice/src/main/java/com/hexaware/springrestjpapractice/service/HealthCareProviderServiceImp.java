package com.hexaware.springrestjpapractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrestjpapractice.entities.HealthCareProvider;
import com.hexaware.springrestjpapractice.repository.HealthCareRepository;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class HealthCareProviderServiceImp implements IHealthCareProviderServices {

	@Autowired
	HealthCareRepository repo;
	
	
	@Override
	public HealthCareProvider addHealthCare(HealthCareProvider hp) {
		
		return repo.save(hp);
	}

	@Override
	public HealthCareProvider updateHealthCare(HealthCareProvider hp) {
		return repo.save(hp);
	}

	@Override
	public HealthCareProvider updateHealthCarediff(HealthCareProvider hp) {
		
		
		return repo.save(hp);
	}

	@Override
	public List<HealthCareProvider> getAllHealthCare() {
		
		return repo.findAll();
	}

	@Override
	public HealthCareProvider getHealthCareById(long healthCareId) {
		
		return repo.findById(healthCareId).orElse(null);
	}

	@Override
	public List<HealthCareProvider> getHealthCareByName(String healthCareName) {
		
		return repo.findByHealthcareProviderName(healthCareName);
	}

	@Override
	public String deleteHealthCare(long healthCareId) {
		// TODO Auto-generated method stub
		repo.deleteById(healthCareId);
		return "deleted sucessfully";
	}

	@Override
	public int deleteHealthCareByName(String healthCareName) {
		
		return repo.deleteHealthCareByName(healthCareName);
	}

	@Override
	public List<HealthCareProvider> getHealthCareByNameFirst(char a) {
		
		return repo.findByHealthcareProviderNameFirst(a);
	}

}
