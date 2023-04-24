
public class OddPrinter implements Runnable {
	private Mutex mutex;

	
	public OddPrinter(Mutex mutex) {
	    this.mutex = mutex;
	}


	@Override
	public void run() {
		 System.out.println("Started Thread: OddPrinter");
		 System.out.println("Outside While loop"+Mutex.oddFlag);
		    int i;
		    for(i=1; i<20; i+=2 ) {System.out.println(" mutex :"+mutex);
		        synchronized (mutex) {
		            while(!Mutex.oddFlag) {
		            	  System.out.println("Inside While loop"+Mutex.oddFlag);
		          		
		                try {
		                    mutex.wait();
		                } catch (InterruptedException ie) {
		                    Thread.currentThread().interrupted();
		                }
		            }

		            if(Mutex.oddFlag == true) {
		                System.out.println("Print from OddPrinter: "+i);
		                Mutex.oddFlag = false;
		                mutex.notify();
		            }


		        }
		        
		        System.out.println("Mubtex ?="+mutex);
		
	}

}
}
