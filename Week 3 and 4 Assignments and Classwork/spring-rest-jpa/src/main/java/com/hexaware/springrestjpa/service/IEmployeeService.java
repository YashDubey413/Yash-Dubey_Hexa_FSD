package com.hexaware.springrestjpa.service;

import java.util.List;

import com.hexaware.springrestjpa.dto.EmployeeDTO;
import com.hexaware.springrestjpa.entities.Employee;

public interface IEmployeeService {

	Employee addEmp(EmployeeDTO empDTO);

	public Employee updateEmp(Employee emp);

	public String deleteEmp(long eid);

	public Employee selectById(long eid);

	public List<Employee> selectAllEmp();

	public List<Employee> selectByEname(String ename);

	public List<Employee> selectSalGreater(double salary);

	public List<Employee> selectAllSalSorted();

	public List<Employee> selectBySalRange(double min,double max);

	public int deleteByEname(String ename);
	
	public int deleteBySal(double salary);

	
	
}
