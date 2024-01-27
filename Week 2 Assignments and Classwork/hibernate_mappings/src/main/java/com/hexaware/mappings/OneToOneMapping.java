package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entities.Address;
import com.hexaware.mappings.entities.Student;

/**
 * Hello world!
 *
 */
public class OneToOneMapping {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		// Address address=new Address(21,"Mumbai");

		// Student student=new Student(101,"Yash",address);

		// Address address1=new Address(22,"Hyderabad");

//		session.persist(address1);
//
//		txn.commit();
		
		
		

//		Address address = new Address(23, "Kolkata");
//		Student student = new Student(102, "Kumar", address);
//
//		session.persist(student);
//
//		txn.commit();
		
		
		
		
//		Student student = new Student(103, "Kumar");
//		Address address = new Address(24, "Delhi",student);
//		
//		
//		session.persist(address);
//		txn.commit();
		
		
		
		
//		Student student = new Student(104,"Ruhi");
//		Address address=new Address();
//		address.setAddressId(25);
//		address.setCity("Chennai");
//		address.setStudent(student);
//		
//		session.persist(address);
//		txn.commit();
		

		session.close();

	}
}
