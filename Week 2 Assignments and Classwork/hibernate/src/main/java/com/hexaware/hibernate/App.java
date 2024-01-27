package com.hexaware.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate.entities.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		System.out.println(session);

		Transaction txn = session.beginTransaction(); // Mandatory for DML only

		// INSERT
		// Employee emp=new Employee(101,"kumar sharma",12000);

		// Serializable ser=session.save(emp); // insert or update

		// System.out.println(ser.toString());

		// txn.commit();

		// UPDATE
//        Employee emp1=session.get(Employee.class,101);
//        System.out.println(emp1);
//        
//        emp1.setEname("Kumar Sharma");
//        emp1.setSalary(12000);
//        Serializable ser=session.save(emp1);
//        System.out.println("Updated object"+ser.toString());
//     
//        
//        Employee updatedEmp=session.get(Employee.class,101);
//        System.out.println(updatedEmp);
//        
//        //session.delete(updatedEmp);
//        
//        txn.commit();
		
		//INSERT MULTIPLE

//		Employee emp = new Employee(101, "kumar sharma", 12000);
//		Employee emp1 = new Employee(102, "shalu verma", 15000);
//		Employee emp2 = new Employee(103, "dudu gg", 20000);
//		Employee emp3 = new Employee(104, "varu hh", 19000);
//
//		session.save(emp); // insert or update
//		session.save(emp1);
//		session.save(emp2);
//		session.save(emp3);
//
//		
//
//		txn.commit();
		
		//Using SaveorUpdate method
		
//		Employee e = new Employee(103, "chun chun", 25000);
//		session.saveOrUpdate(e);
//		session.persist(e);//does same as save or update
//		
//		txn.commit();
		
		
		

	}

}
