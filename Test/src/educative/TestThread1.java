package educative;

public class TestThread1 extends Thread {

	Employee2 emp= new Employee2();
	
	  public void run() {
		   emp.setName("Thread 1");
		   System.out.println(emp.getName());
		   
		   
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
         
	}

}
