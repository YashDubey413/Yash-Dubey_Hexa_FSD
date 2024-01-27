package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<String>st=new TreeSet<String>();
		
		st.add("A");
		st.add("D");
		st.add("B");
		st.add("C");
		
		System.out.println(st);
		
	}

}
