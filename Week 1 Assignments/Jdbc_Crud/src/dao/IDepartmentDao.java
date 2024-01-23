package dao;

import java.util.List;

import entities.Department;

public interface IDepartmentDao {
	
	public int insertDept(Department dept);
	public int updateDept(Department dept);
	
	public int deleteOne(int dno);
	public Department selectOne(int dno);
	
	public List<Department> selectAll();
	
	

}
