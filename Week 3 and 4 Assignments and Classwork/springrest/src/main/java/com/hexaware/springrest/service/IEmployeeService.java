package com.hexaware.springrest.service;

import java.util.List;

import com.hexaware.springrest.entity.Employee;

public interface IEmployeeService {
	
	public Employee addEmp(Employee emp) ;
	
	public Employee updateEmp(Employee emp);
	
	public String deleteEmp(int eid);
	
	public Employee selectById(int eid);
	
	public List<Employee> selectAllEmp();

	

}
