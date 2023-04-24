package educative;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em = new Employee();
		TestThread t1 = new TestThread(em);
		
		t1.start();
		
	}

}
