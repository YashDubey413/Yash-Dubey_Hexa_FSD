package dao;

import java.util.List;

import entity.Employee;

public interface IDao {
	
	public int insertEmp(Employee emp) ;
	public int updateEmp(Employee emp);
	
	public Employee selectOne(int eid);
	public int deleteEmp(int eid);
	
	public List<Employee> selectAll();

}
