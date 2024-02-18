package com.hexaware.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrest.entity.Employee;
import com.hexaware.springrest.repository.IEmployeeRepository;


@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	IEmployeeRepository repository;
	
	@Override
	public Employee addEmp(Employee emp) {
		
		return repository.addEmp(emp);
	}

	@Override
	public Employee updateEmp(Employee emp) {
		
		return repository.updateEmp(emp);
	}

	@Override
	public String deleteEmp(int eid) {
		
		return repository.deleteEmp(eid);
	}

	@Override
	public Employee selectById(int eid) {
		
		return repository.selectById(eid);
	}

	@Override
	public List<Employee> selectAllEmp() {
		
		return repository.selectAllEmp();
	}

}
