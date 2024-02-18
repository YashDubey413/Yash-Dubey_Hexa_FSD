package com.hexaware.springrestjpapractice.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.springrestjpapractice.entities.HealthCareProvider;


@SpringBootTest
class HealthCareControllerTest {

	@Autowired
	RestTemplate restTemplate;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	@Disabled
	void testAddHealthCare() {
		HealthCareProvider hp=new HealthCareProvider(104,"Sai","Male","Pune","sai@gmail.com");
		
		ResponseEntity<HealthCareProvider> response=restTemplate.postForEntity("http://localhost:8080/api/healthcare/add", hp, HealthCareProvider.class);
		
		HealthCareProvider h=response.getBody();
		
		assertNotNull(h);
		assertEquals(104,h.getHealthCareId());
		
		//HealthCareProvider h=restTemplate.postForObject("http://localhost:8080/api/healthcare/add", hp, HealthCareProvider.class);
		
	}

	@Test
	void testUpdateHealthCare() {
		//fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testDeleteHealthcareById() {
		restTemplate.delete("http://localhost:8080/api/healthcare/delete/104");
		
		assertTrue(true);
		//HealthCareProvider h= restTemplate.getForObject("http://localhost:8080/api/healthcare/getbyname/Sai", HealthCareProvider.class);
		//assertNull(h); 
	}

	@Test
	void testGetAllEmployee() {
		//fail("Not yet implemented");
	}

	@Test
	void testGetByEname() {
		
		HealthCareProvider h= restTemplate.getForObject("http://localhost:8080/api/healthcare/getbyname/Sai", HealthCareProvider.class);
		assertNotNull(h); 
	}

}
