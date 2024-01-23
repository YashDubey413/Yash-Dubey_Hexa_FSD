package presentation;

import java.util.List;
import java.util.Scanner;

import dao.DaoImpl;
import dao.IDao;
import entity.Employee;

public class Client {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		IDao dao=new DaoImpl();
		
		boolean flag=true;
		while(flag) {
			System.out.println("EMS");
			
			System.out.println("1. Get All Employees");
			System.out.println("2. Insert Employee");
			System.out.println("3. Exit");
			
			
			int choice=sc.nextInt();
			
			
			switch(choice) {
			case 1:
				List<Employee> list=dao.selectAll();
				list.stream().forEach(System.out::println);
				break;
				
			case 2:
				int count=dao.insertEmp(new Employee(113, "Kumar", 25000, 100, "Cleaner", "2024-01-19", 101, 70));
				System.out.println(count+" Records inserted...");
				break;
				
			case 3:  
				flag=false;
				System.out.println("Exiting");
				sc.close();
				break;
			 		
			}
			
		}
		
			
	}
	
	public static Employee readEmployee(){
		
		
		return null;
		
	}

}
