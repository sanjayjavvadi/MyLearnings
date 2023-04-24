
public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Counter c1 = new Counter();
		
		MyThread mythread = new MyThread(c1);
		Runnable mythread1 = new BufferThread(c1);

		Thread t1 = null;

		t1 = new Thread(mythread);

		t1.start();

		Thread t2 = null;
			t2 = new Thread(mythread1);
			t2.start();
		

		t2.join();

		System.out.println("The Value of counter - " + c1.getCount());

	}

}
