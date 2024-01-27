package com.hexaware.hibernate;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import com.hexaware.hibernate.entities.Employee;

public class HibernateSelect {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

//		session.get();
//		session.find();  //give only one record

		// HQL JPQL
		
		//Query with positional parameter
		
		String selectquery = "select e from Employee e where e.salary > ?1";
		// String selectquery="select e from Employee e";
		// String selectquery="from Employee e";

//		Query<Employee> query = session.createQuery(selectquery);
//
//		query.setParameter(1, 15000.0);
//
//		List<Employee> list = query.getResultList();
//
//		for (Employee e : list) {
//			System.out.println(e);
//		}

		
		
		
		
		//Just an example of using like
//		String selectquery1 = "select e from Employee e where e.ename like '%a%'";
//
//		Query query1 = session.createQuery(selectquery1);
//
//		List<Employee> list1 = query1.getResultList();
//
//		for (Employee e : list1) {
//			System.out.println(e);
//		}
		
		
		
		
		//Query with named parameter

//		String selectquery2 = "select e from Employee e where e.eid=:empid";
//
//		Query query2 = session.createQuery(selectquery2);
//
//		query2.setParameter("empid",101);
//		System.out.println( query2.getResultList());
		
		
		
		
		//Native Sql query
		
		String nativequery="select * from Employee_Details";
		
		NativeQuery<Employee> query=session.createNativeQuery(nativequery,Employee.class);
		
		List<Employee> list=query.list();
		
		
		
		System.out.println("Native Query Result");
		System.out.println(list);
		
		
		
		//Native using SQL Query
		
//		SQLQuery<Employee> query1=session.createSQLQuery(nativequery);
//		
//		query1.addEntity(Employee.class);
//		
//		List<Employee> list1=query1.getResultList();
//		System.out.println(list1);
		
		session.close();

	}

}
