package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import dao.DepartmentDaoImpl;
import dao.IDepartmentDao;
import entities.Department;

class DepartmentDaoImplTest {

	static IDepartmentDao dao;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		dao=new DepartmentDaoImpl();
	}

	@Test
	@Disabled
	void testInsertDept() {
		Department dept=new Department(110,"Charity","Agra");
		int actual=dao.insertDept(dept);
		assertEquals(actual,1);
	}

	@Test
	@Disabled
	void testUpdateDept() {
		int actual=dao.updateDept(new Department(110,"Gaming","Agra"));
		assertEquals(actual,1);
	}

	@Test
	@Disabled
	void testDeleteOne() {
		int actual=dao.deleteOne(110);
		assertEquals(actual,1);
	}

	@Test
	void testSelectOne() {
		Department dept=dao.selectOne(10);
		//assertNotNull(dept);
		assertTrue(dept.getDno()==10);

	}

	@Test
	void testSelectAll() {
		
		List<Department> list=dao.selectAll();
		Department dept=list.get(0);
		assertNotNull(list);
		
	}

}
