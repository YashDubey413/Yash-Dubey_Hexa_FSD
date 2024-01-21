package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Employee;

public class DaoImpl implements IDao {
	Connection conn = null;

	public DaoImpl() {
		conn = DBUtil.getConnection();
	}

	@Override
	public int insertEmp(Employee emp) {
		int count=0;
		try {

			PreparedStatement prp = conn.prepareStatement("insert into employees values(?,?,?,?,?,?,?,?)");
			prp.setInt(1,emp.getEid());
			prp.setString(2,emp.getEname());
			prp.setDouble(3,emp.getSalary());
			prp.setDouble(4,emp.getComm());
			prp.setString(5,emp.getJob());
			prp.setString(6,emp.getDoj());
			prp.setInt(7,emp.getMid());
			prp.setInt(8,emp.getDno());
			
			count=prp.executeUpdate();
			

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int updateEmp(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee selectOne(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteEmp(int eid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> selectAll() {
		List<Employee> list = new ArrayList<Employee>();

		try {

			PreparedStatement prp = conn.prepareStatement("select * from employees");

			ResultSet rs = prp.executeQuery();
			while (rs.next()) {
				list.add(new Employee(rs.getInt("eid"), rs.getString("ename"), rs.getDouble("salary"),
						rs.getDouble("comm"), rs.getString("job"), rs.getString("doj"), rs.getInt("mid"),
						rs.getInt("dno")));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return list;
	}

}
