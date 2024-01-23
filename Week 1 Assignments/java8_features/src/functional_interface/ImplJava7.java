package functional_interface;

public class ImplJava7 implements MyFuctionalInterface{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	public static void main(String[] args) {
		
		
		MyFuctionalInterface i=new ImplJava7();
		System.out.println(i.add(5, 5));
		
		

	}

}
