package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayLst {
	public static void main(String[] args) {
		
		List<Number>list=new ArrayList<>();
		
		list.add(30); //new Integer(30);
		list.add(10);
		list.add(15);
		list.add(15);
		list.add(4.55);
		list.add(4.55f);
		list.add(4661245644145L);
		list.add(null);
		
		System.out.println(list);
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Using for each loop");
		
		for(Number i:list) {
			System.out.println(i);
		}
	}
	
}