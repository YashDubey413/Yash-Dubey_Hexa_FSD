package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class Employee{
	String name;
	int salary;
	public Employee(String name,int salary) {
		this.name=name;
		this.salary=salary;
	}
}

public class LinkedLst {
	public static void main(String[] args) {
		ArrayList<Employee> li=new ArrayList<Employee>();
		li.add(new Employee("Yash",6000));
		li.add(new Employee("Dubey",7000));
		li.add(new Employee("Chumu",8000));
		li.add(new Employee("Kumu",9000));
		
//		for(Employee i:li) {
//			System.out.println(i.name+" "+i.salary);
//		}
		
		Iterator<Employee> itr=li.iterator();
		while(itr.hasNext()) {
			Employee e= (Employee) itr.next();
			System.out.println(e.name+" "+e.salary);
			//System.out.println(itr.next());
		}
	}
	
	
	
	

}
