package com.hexaware.springrest.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springrest.entity.Employee;

@Repository
public class EmployeeRepositoryImp implements IEmployeeRepository {

	JdbcTemplate jdbcTemplate;

	@Autowired
	public EmployeeRepositoryImp(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
		System.out.println(jdbcTemplate);
	}

	public EmployeeRepositoryImp() {
	}

	@Override
	public Employee addEmp(Employee emp) {

		Employee employee = null;

		String insert = "insert into employee_table values(?,?,?)";

		int count = jdbcTemplate.update(insert, emp.getEid(), emp.getEname(), emp.getSalary());

		if (count > 0) {
			employee = emp;

		}
		return employee;
	}

	@Override
	public Employee updateEmp(Employee emp) {
		Employee employee=null;
		
		String update="update employee_table set ename=?,salary=? where eid=?";
		
		int count=jdbcTemplate.update(update,emp.getEname(),emp.getSalary(),emp.getEid());
		
		if(count>0) {
			employee=emp;
		}
		
		return employee;
	}

	@Override
	public String deleteEmp(int eid) {
		String delete = "delete from employee_table where eid=?";
		int count=jdbcTemplate.update(delete,eid);
		return count+" records deleted";
		
	}

	@Override
	public Employee selectById(int eid) {

		String selectById = "select eid,ename,salary from employee_table where eid=?";

		Employee emp = jdbcTemplate.queryForObject(selectById, new EmployeeMapper(), eid);

		return emp;
	}

	@Override
	public List<Employee> selectAllEmp() {

		String selectAll = "select eid,ename,salary from employee_table";

		List<Employee> list = jdbcTemplate.query(selectAll, new EmployeeMapper());

		return list;
	}

}
