package com.hexaware.springrestjpa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.springrestjpa.entities.Employee;

@SpringBootTest
//@Transactional
class EmployeeServiceImpTest {
	
	Logger logger=LoggerFactory.getLogger(EmployeeServiceImpTest.class);

	@Autowired
	IEmployeeService service;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		
		
	}

	@Test
	void testAddEmp() {
		
		Employee emp=new Employee(124,"Kumar",40000);
		
		//Employee e1=service.addEmp(emp);
		
		logger.info("Employee Added successfully");
		
		//assertNotNull(e1);
		//assertEquals(124,e1.getEid());

		
	}

	@Test
	void testUpdateEmp() {
		//fail("Not yet implemented");
	}

	@Test
	void testDeleteEmp() {
		//fail("Not yet implemented");
	}

	@Test
	void testSelectById() {
		
		Employee emp=service.selectById(101);
		assertEquals("yash",emp.getEname());
	}

	@Test
	void testSelectAllEmp() {
		List<Employee> list=service.selectAllEmp();
		
		boolean isEmpty=list.isEmpty();
		
		assertFalse(isEmpty);
	}

}
