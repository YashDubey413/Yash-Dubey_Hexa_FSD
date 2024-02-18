package com.hexaware.springrestjpa.restcontroller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.springrestjpa.entities.Employee;

@SpringBootTest
class EmployeeRestControllerTest {

	@Autowired
	RestTemplate restTemplate; 
	

	@Test
	void testInsertEmp() {
		
		Employee emp=new Employee(123,"Wawa",15000);
		ResponseEntity<Employee> response=restTemplate.postForEntity("http://localhost:8080/api/employees/add", emp,Employee.class);
		
		Employee e=response.getBody();
		assertEquals(123,e.getEid());
	}

	@Test
	void testUpdateEmp() {
		//fail("Not yet implemented");
	}

	@Test
	void testGetEmployeeById() {
		int eid=101;
		
		ResponseEntity<Employee> response=restTemplate.getForEntity("http://localhost:8080/api/employees/select/"+eid, Employee.class);
		
		Employee emp=response.getBody();
		assertNotNull(emp);
		assertEquals(101, emp.getEid());
	}

	@Test
	void testGetAllEmployee() {
		ResponseEntity<List> response=restTemplate.getForEntity("http://localhost:8080/api/employees/selectall", List.class);
		
		List<Employee> list=response.getBody();
		
		assertTrue(list.size()>0);
		
		List<Employee> list2=restTemplate.getForObject("http://localhost:8080/api/employees/selectall",List.class);
		
		assertNotNull(list2);
		
	}

	@Test
	void testDeleteEmployeeById() {
		//fail("Not yet implemented");
	}

}
