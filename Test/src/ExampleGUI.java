import java.util.Calendar;

public class ExampleGUI {
	
     public	ExampleGUI()
	{
		try {
			jbInit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
  private void jbInit() throws Exception {
		
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
		    public void run() {
				Calendar time1 = Calendar.getInstance();
				time1.set(Calendar.HOUR_OF_DAY, 13);
				time1.set(Calendar.MINUTE, 55);
				time1.set(Calendar.SECOND, 0);	
				
		      System.out.println("********************** EXITING IVEST - GOOD BYE !!! **********************");
		    }
		}); 
    		   

 }
}
