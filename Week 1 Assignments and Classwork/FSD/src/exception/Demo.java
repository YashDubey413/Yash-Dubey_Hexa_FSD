package exception;

public class Demo {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Finally block");
		}
		
		System.out.println("Hello world");
		System.out.println(10/5);
		
	}
	

}
