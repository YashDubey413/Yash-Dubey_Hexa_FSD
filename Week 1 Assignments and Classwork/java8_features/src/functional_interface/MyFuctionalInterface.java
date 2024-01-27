package functional_interface;

public interface MyFuctionalInterface {
	
	public abstract int add(int a, int b); //Function Functional Interface

	static void show1() {
		System.out.println("Static method call");
	}
	
	default void show2() {
		System.out.println("Default method call");
	}
	
}
