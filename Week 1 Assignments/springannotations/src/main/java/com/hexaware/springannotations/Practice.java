package com.hexaware.springannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.hexaware.springannotations.beans.Patient;


@ComponentScan(basePackages="com.hexaware.springannotations.beans.*")
public class Practice {
	
	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(Practice.class);
		
	    Patient p1=context.getBean(Patient.class);
	    p1.setPatientName("Yash");
	    p1.setPatientId(1);
	    p1.setGender('M');
	    
	    System.out.println(p1);
	    System.out.println(p1.getPatientId()+" "+p1.getPatientName()+" "+p1.getGender());
		
	}

}
