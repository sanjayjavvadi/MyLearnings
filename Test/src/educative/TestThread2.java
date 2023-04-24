package educative;

public class TestThread2 extends Thread{
	
   Employee2 emp1= new Employee2();
	
	  public void run() {	
		   emp1.setName("Thread 2");
		   System.out.println(emp1.getName());
		   		  
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
	}

}
