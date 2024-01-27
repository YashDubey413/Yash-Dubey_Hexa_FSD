package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entities.Department;
import com.hexaware.mappings.entities.Employee;

public class OneToManyMapping_ManyToOne {
	
	public static void main(String[] args) {
		
	
	
	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session = factory.openSession();
	Transaction txn = session.beginTransaction();
	
	Employee emp1=new Employee(101,"Yash",10000);
	Employee emp2=new Employee(102,"Jani",15000);
	Employee emp3=new Employee(103,"Varun",50000);
	Employee emp4=new Employee(104,"Priya",25000);
	
	
	Department dept1=new Department();
	dept1.setDepartmentId(10);
	dept1.setDepartmentName("Logistics");
	
	dept1.addEmployee(emp1);
	dept1.addEmployee(emp2);
	dept1.addEmployee(emp3);
	dept1.addEmployee(emp4);
	
	session.persist(dept1);
	txn.commit();
	
	
	
	
	
	session.close();
	
	
	
	}	
}

