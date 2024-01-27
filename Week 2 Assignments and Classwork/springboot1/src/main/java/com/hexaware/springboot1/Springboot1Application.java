package com.hexaware.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.hexaware.springboot1.entities.Employee;
import com.hexaware.springboot1.service.EmployeeServiceImp;
import com.hexaware.springboot1.service.IEmployeeService;

@SpringBootApplication
public class Springboot1Application {

	public static void main(String[] args) {
		
		ApplicationContext context=SpringApplication.run(Springboot1Application.class, args);
		//System.out.println(context);
		
		Employee emp=context.getBean(Employee.class);
		emp.setEid(101);
		emp.setEname("Yash");
		System.out.println(emp);
		
		String str=context.getBean(String.class);
		System.out.println(str);
		
		int a=context.getBean(Integer.class);
		System.out.println(a);
		
		IEmployeeService service=context.getBean(EmployeeServiceImp.class);
		
		service.getService();
		
	}

    @Bean
    String anynameyoucangive() { //no need to make public
		return "yash dubey";
	}
    
    @Bean
    int anynameyoucangive1() {
    	return 69;
    }

}
