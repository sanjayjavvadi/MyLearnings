package educative;

public class TestSynchronization {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestThread1 t1 = new TestThread1();
		System.out.println("Thread t1 started");
		t1.start();
		
		
		
		
		TestThread2 t2 = new TestThread2();
		System.out.println("Thread t2 started");
		t2.start();

	}

}
