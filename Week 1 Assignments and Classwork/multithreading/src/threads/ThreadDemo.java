package threads;

public class ThreadDemo extends Thread{
	
	@Override
	public void run() {
		//System.out.println("Run method called");
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread");
			
		}
		
	}
	
	public static void main(String[] args) { //Main thread created by jvm
		
		ThreadDemo t=new ThreadDemo();
		
		System.out.println(t);
		
		//t.run();
		t.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
