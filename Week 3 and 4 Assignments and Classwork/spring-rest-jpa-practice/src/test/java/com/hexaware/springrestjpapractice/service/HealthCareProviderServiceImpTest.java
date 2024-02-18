package com.hexaware.springrestjpapractice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.springrestjpapractice.entities.HealthCareProvider;


@SpringBootTest
class HealthCareProviderServiceImpTest {

	
	@Autowired
	IHealthCareProviderServices service;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	@Disabled
	void testAddHealthCare() {
		HealthCareProvider hp=new HealthCareProvider(104,"Sai","Male","Pune","sai@gmail.com");
		
		HealthCareProvider h= service.addHealthCare(hp);
		
		assertNotNull(h);
		
		assertEquals(104,h.getHealthCareId());
	}

	@Test
	@Disabled
	void testUpdateHealthCare() {
		
		HealthCareProvider hp=new HealthCareProvider(104,"Raju","Male","Gahwli","raju@gmail.com");
		
		HealthCareProvider h=service.updateHealthCare(hp);
		
		assertNotNull(h);
		
		assertEquals("Raju",h.getHealthcareProviderName());
		
		assertEquals("Gahwli",h.getAddress());
		
	}

	@Test
	void testGetAllHealthCare() {
		List<HealthCareProvider> list=service.getAllHealthCare();
		
		assertFalse(list.isEmpty());
		//assertTrue(list.size()>0);
	}

	@Test
	void testGetHealthCareById() {
		
		HealthCareProvider hp=service.getHealthCareById(101);
		assertNotNull(hp);
		
		assertEquals(101,hp.getHealthCareId());
		
	}

	@Test
	void testGetHealthCareByName() {
		//fail("Not yet implemented");
	}

	@Test
	void testDeleteHealthCare() {
		
		String del=service.deleteHealthCare(104);
		
		assertNotNull(del);
		
		HealthCareProvider hp=service.getHealthCareById(104);
		
		assertNull(hp);
		
		
		
	}

}
