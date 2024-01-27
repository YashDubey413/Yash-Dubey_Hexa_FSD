package com.hexaware.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hexaware.hibernate.entities.Employee;

public class EmployeeDao {
	
	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
	
	Session session = sessionFactory.openSession();

	public List<Employee> getAllEmployees(){
		
		Query<Employee>query=session.createNamedQuery("getAllEmployees");
		
		List<Employee> list= query.getResultList();
		
		return list;
		
		
	}
	
	public Employee getEmployeeByName() {
		Query<Employee> query=session.createNamedQuery("getEmployeeByName");
		query.setParameter("name","chun chun");
		Employee emp=query.getSingleResult();
		return emp;
	}

}
