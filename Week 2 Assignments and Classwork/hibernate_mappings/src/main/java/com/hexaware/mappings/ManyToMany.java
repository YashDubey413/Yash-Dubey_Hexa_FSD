package com.hexaware.mappings;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entities.Order;
import com.hexaware.mappings.entities.Product;

public class ManyToMany {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		
		
		Product p1=new Product();
		p1.setProductId(1);
		p1.setProductName("Shirt");
		
		Product p2=new Product();
		p2.setProductId(2);
		p2.setProductName("Jeans");
		
		Product p3=new Product();
		p3.setProductId(3);
		p3.setProductName("Cap");
		
		LocalDate d1=LocalDate.of(2020,01,20);
		Order o1=new Order();
		o1.setOrderId(101);
		o1.setPurchasedDate(d1);
		
		o1.addProduct(p1);
		o1.addProduct(p3);
		
		
		Order o2=new Order();
		o2.setOrderId(102);
		o2.setPurchasedDate(LocalDate.now());
		
		o2.addProduct(p1);
		o2.addProduct(p2);
		o2.addProduct(p3);
		
		session.persist(o1);
		session.persist(o2);
		
		txn.commit();
		
		
		session.close();

	}

}
