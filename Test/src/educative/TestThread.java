package educative;

public class TestThread extends Thread {

	Employee emp;
	
   public TestThread(Employee emp) {
	   this.emp = emp;
   }
   
   public void run() {
	   try {
		emp.setName("sanjay.j");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   emp.resetName();
   }

}


