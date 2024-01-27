package threads;

public class MyRunnable implements Runnable{
	
	public static void main(String[] args) {
		
		Runnable m=new MyRunnable();
		
		//Thread t1=new Thread(m);
		Thread t1=new Thread(m,"Yash's Thread");
		
		System.out.println(m);
		System.out.println(t1);
		
		t1.start();
		
	}

	@Override
	public void run() {
		
		System.out.println("run is called");
		
	}

}
