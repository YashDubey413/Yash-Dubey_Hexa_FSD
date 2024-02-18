package com.hexaware.springrestjpapractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hexaware.springrestjpapractice.entities.HealthCareProvider;
import com.hexaware.springrestjpapractice.service.IHealthCareProviderServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/healthcare")
public class HealthCareController {
	
	@Autowired
	IHealthCareProviderServices service;
	
	@PostMapping("/add")
	public HealthCareProvider addHealthCare(@RequestBody @Valid HealthCareProvider hp) {
		
		return service.addHealthCare(hp);
		
	}
	
	@PutMapping("/update")
	public HealthCareProvider updateHealthCare(@RequestBody @Valid HealthCareProvider hp) {
		
		return service.updateHealthCare(hp);
		
	}
	
	@PutMapping("/updatediff/{healthCareId}")
	public HealthCareProvider updateHealthCareDiff(@PathVariable  long healthCareId,@RequestBody @Valid String healthcareProviderName,@RequestBody @Valid  String providerGender,
			@RequestBody @Valid String address,@RequestBody @Valid  String email) {
		HealthCareProvider hp=new HealthCareProvider(healthCareId,healthcareProviderName,providerGender,address,email);
		return service.updateHealthCarediff(hp);
		
	}
	
	@DeleteMapping("/delete/{eid}")
	public String deleteHealthcareById(@PathVariable long eid) {
		
		return service.deleteHealthCare(eid);
	}
	
	@DeleteMapping("/deletebyname/{ename}")
	public String deleteHealthCareByName(@PathVariable String ename) {
		
		int count=service.deleteHealthCareByName(ename);
		
		return count+" records deleted";
		
	}
	
	@GetMapping("/getall")
	public List<HealthCareProvider> getAllEmployee() {
		
		return service.getAllHealthCare();
		
	}
	
	
	@GetMapping("/getbyname/{ename}")
	public List<HealthCareProvider> getByEname(@PathVariable String ename) {  
		
		return service.getHealthCareByName(ename);
	}
	
	@GetMapping("/getbynamefirst/{a}")
	public List<HealthCareProvider> getByEnameFirst(@PathVariable char a) {  
		
		return service.getHealthCareByNameFirst(a);
	}

}















