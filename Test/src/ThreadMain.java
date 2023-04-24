import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadMain  {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService	es = Executors.newFixedThreadPool(2);

	    Mutex mutex = new Mutex();
	    OddPrinter op = new OddPrinter(mutex);
	    EvenPrinter ep = new EvenPrinter(mutex);
	  
	    Mutex.oddFlag = true;
	    
	    es.execute(op);
	    es.execute(ep);
	  
	    System.out.print("ES= "+ es);

	    if(null != es){
	        es.shutdown();
	        try {
	            es.awaitTermination(1, TimeUnit.MINUTES);
	            System.out.print("Wait Es "+ es);
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupted();
	        }
	    }
	    
	     
		
		 
		
		  
		}
	
	

	}

