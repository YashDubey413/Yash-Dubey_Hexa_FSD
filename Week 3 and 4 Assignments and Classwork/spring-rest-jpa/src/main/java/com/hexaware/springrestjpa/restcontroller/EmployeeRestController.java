package com.hexaware.springrestjpa.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestjpa.dto.EmployeeDTO;
import com.hexaware.springrestjpa.entities.Employee;
import com.hexaware.springrestjpa.exception.EmployeeNotFoundException;
import com.hexaware.springrestjpa.service.EmployeeServiceImp;
import com.hexaware.springrestjpa.service.IEmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/employees")
public class EmployeeRestController {
	
	Logger logger=LoggerFactory.getLogger(EmployeeRestController.class);

	
	@Autowired
	IEmployeeService service;
	
	@PostMapping("/add")
	public Employee insertEmp(@RequestBody EmployeeDTO emp) {
		
		logger.info("Employee Rest Controller executed");
		
		return service.addEmp(emp);
		
	}
	
	@PutMapping("/update")
	public Employee updateEmp(@RequestBody @Valid Employee emp) {
		
		return service.updateEmp(emp);
		
	}
	
	@GetMapping("/select/{eid}")
	public Employee getEmployeeById(@PathVariable long eid) {
		
		Employee emp= service.selectById(eid);
		if(emp==null) {
			throw new EmployeeNotFoundException();
		}
		return emp;
		
	}
	
	@GetMapping("/selectall")
	public List<Employee> getAllEmployee() {
		
		return service.selectAllEmp();
		
	}
	
	
	@DeleteMapping("delete/{eid}")
	public String deleteEmployeeById(@PathVariable long eid) {
		
		return service.deleteEmp(eid);
	}
	
	@GetMapping("/getbyname/{ename}")
	public List<Employee> getByEname(@PathVariable String ename) {  
		
		return service.selectByEname(ename);
	}

	
	@GetMapping("/getbysalgt/{salary}")
	public List<Employee> getBySalgt(@PathVariable double salary) {  
		
		return service.selectSalGreater(salary);
	}
	
	@GetMapping("/getbysalsorted")
	public List<Employee> getAllSalSorted() {  
		
		return service.selectAllSalSorted();
	}
	
	@GetMapping("/getbysalrange/{min}/{max}")
	public List<Employee> getBySalRange(@PathVariable double min,@PathVariable double max) {  
		
		return service.selectBySalRange(min, max);
	}
	
	@DeleteMapping("/deletebyname/{ename}")
	public String deleteByName(@PathVariable String ename) {
		
		int count=service.deleteByEname(ename);
		
		return count+" records deleted";
		
	}
	
	@DeleteMapping("/deletebysal/{salary}")
	public String deleteBySal(@PathVariable double salary) {
		int count=service.deleteBySal(salary);
		
		return count+" records deleted having salary "+salary;
		
	}

	
}
