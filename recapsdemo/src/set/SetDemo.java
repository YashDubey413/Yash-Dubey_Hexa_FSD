package set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> st=new HashSet<>();
		
		st.add(3);
		st.add(1);
		st.add(null);
		st.add(3);
		st.add(3);
		st.add(null);
		
		System.out.println(st); // printed on basis of hashcode
		
		for (Integer integer : st) {
			System.out.println(integer);
		}
	}

}
