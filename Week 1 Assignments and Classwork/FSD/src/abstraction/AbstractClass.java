package abstraction;

abstract class Abs{
	public void mthd1() {
		System.out.println("Non abstract m1");
	}
	
	public abstract void mthd2(); 	
	
}

public class AbstractClass extends Abs{
	
	public void mthd2() {
		System.out.println("Abstract m2");
	}
	
	public void mthd1() {
		System.out.println("Overriding m1");
	}
	
	public static void main(String[] args) {
		
		//Abs a=new Abs();//cannot create objects of abstract class
		
		AbstractClass a=new AbstractClass();
		a.mthd1();
		a.mthd2();
	}

}
