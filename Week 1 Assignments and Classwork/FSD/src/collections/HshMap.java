package collections;

import java.util.HashMap;
import java.util.Map;

public class HshMap {
	public static void main(String[] args) {
		HashMap <Integer,String>hm=new HashMap<>();
		hm.put(101,"Yash");
		hm.put(102,"Kumar");
		hm.put(103, "Chuha");
		
		System.out.println(hm);
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println("Key: "+m.getKey()+" Value: "+m.getValue());
		}
		
		for(Map.Entry<Integer,String> m:hm.entrySet()) {
			if(m.getKey().equals(103)) {m.setValue("Ravi");}
		}
		System.out.println(hm);
	}
	
	

}
