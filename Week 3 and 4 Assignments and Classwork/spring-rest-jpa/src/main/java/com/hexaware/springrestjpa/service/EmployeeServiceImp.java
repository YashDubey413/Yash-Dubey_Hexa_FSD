package com.hexaware.springrestjpa.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.hexaware.springrestjpa.dto.EmployeeDTO;
import com.hexaware.springrestjpa.entities.Employee;
import com.hexaware.springrestjpa.repository.EmployeeRepository;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	EmployeeRepository repo;
	
	Logger logger =LoggerFactory.getLogger(EmployeeServiceImp.class);
	
	@Override
	public Employee addEmp(EmployeeDTO empDTO) {
		logger.info(empDTO+ "id added from add service");
		
		Employee employee=new Employee();
		employee.setEid(empDTO.getEid());
		employee.setEname(empDTO.getEname());
		employee.setSalary(empDTO.getSalary());
		
		return repo.save(employee);
	}

	@Override
	public Employee updateEmp(Employee emp) {
		
		return repo.save(emp);
	}

	@Override
	public String deleteEmp(long eid) {
		repo.deleteById(eid);
		return "record deleted";
		
	}

	@Override
	public Employee selectById(long eid) {
		
		
		//repo.getById(eid);
		
//		Employee emp=null;
//		Optional<Employee> optional=repo.findById(eid);  //This is from crud repository
//		
//		if (optional.isPresent()) {
//			emp=optional.get();
//		}
		
		return repo.findById(eid).orElse(null);
	}

	@Override
	public List<Employee> selectAllEmp() {
		
		return repo.findAll();
	}

	@Override
	public List<Employee> selectByEname(String ename) {
		
		return repo.findByEname(ename);
	}

	@Override
	public List<Employee> selectSalGreater(double salary) {
		
		return repo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> selectAllSalSorted() {
		
		//return repo.findAll(Sort.by("salary"));
		
		//return repo.findAll(Sort.by(Order.asc("salary")));
		
		return repo.findAll(Sort.by(Order.desc("salary")));
		
		//return repo.findAll(Sort.by(Direction.DESC,"salary"));
	}

	@Override
	public List<Employee> selectBySalRange(double min, double max) {
		
		return repo.findBySalRange(min, max);
	}

	@Override
	public int deleteByEname(String ename) {
		
		return repo.deleteByName(ename);
	}

	@Override
	public int deleteBySal(double salary) {
		
		return repo.deleteBySal(salary);
	}

	
	
	
	//input validation
	
	public static boolean validateEmployeeData(EmployeeDTO emp) {
		String ename=emp.getEname();
		boolean flag=false;
		if(emp.getEid()>99 && emp.getSalary()>1000 && ename.equals(ename.toUpperCase())) {
			flag=true;
		}
		
		return flag;
		
	}
	
	
}
