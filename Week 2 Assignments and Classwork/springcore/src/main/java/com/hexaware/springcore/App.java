package com.hexaware.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springcore.entities.Employee;
import com.hexaware.springcore.services.IService;
import com.hexaware.springcore.services.ServiceImp;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        
        //Address addr=context.getBean(Address.class);
        //addr.setCity("Mumbai");
        
        Employee emp=context.getBean("emp",Employee.class);
        emp.setEid(101);
        emp.setEname("Yash");
        //emp.setAddress(addr);
        
        System.out.println(emp);
        
        Employee emp2=context.getBean("emp",Employee.class);
        System.out.println(emp2.getAddress());
        
        IService service=context.getBean(ServiceImp.class);
        service.getService();
        
        String name=context.getBean(String.class);
        System.out.println(name);
        
    }
}
