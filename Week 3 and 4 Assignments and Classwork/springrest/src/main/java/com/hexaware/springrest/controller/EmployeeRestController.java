package com.hexaware.springrest.controller;

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

import com.hexaware.springrest.entity.Employee;
import com.hexaware.springrest.service.IEmployeeService;

@RestController
@RequestMapping("api/employee")
public class EmployeeRestController {
	
	@Autowired
	IEmployeeService service;
	
	@PostMapping("/add")
	public Employee addEmpolyee(@RequestBody Employee emp) {
		
		return service.addEmp(emp);
		
	}
	
	
	
	@GetMapping("/getall")
	public List<Employee> getAllEmployee(){
		
		return service.selectAllEmp();
	}
	
	
	@GetMapping("/get/{eid}")
	public Employee getById(@PathVariable int eid) {  
		
		return service.selectById(eid);
	}
	
	@GetMapping("/get")
	public Employee getByIdtry(@RequestBody int eid) {  // In Postman simply write 101 without any braces or keys
		
		return service.selectById(eid);
	}
	
	@DeleteMapping("/delete/{eid}")
	public String deleteById(@PathVariable int eid) {
		
		return service.deleteEmp(eid);
	}
	
	@DeleteMapping("/delete")
	public String deleteById1(@RequestBody int eid) { // In Postman simply write 101 without any braces or keys
		
		return service.deleteEmp(eid);
	}
	
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee emp) {
		
		return service.updateEmp(emp);
	}
	
	
		
		
	
	

}
