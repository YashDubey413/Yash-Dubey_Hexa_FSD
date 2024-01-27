package functional_interface;

public class ImplJava8 {
	public static void main(String[] args) {
		MyFuctionalInterface m1=(int a, int b)->{return a+b;};
		
		MyFuctionalInterface.show1();
		m1.show2();
		
		
		System.out.println(m1.add(5,4));
		
	}
	

}
