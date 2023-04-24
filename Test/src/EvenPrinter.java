
public class EvenPrinter implements Runnable {
	
	private Mutex mutex;

	public EvenPrinter(Mutex mutex) {
	    this.mutex = mutex;
	}
	
	public synchronized void run() {
	    System.out.println("Started Thread: EvenPrinter");
	    int i;
	    for(i=2; i<20; i+=2) {
	        synchronized (mutex) {
	            while(Mutex.oddFlag) {
	                try {
	                    mutex.wait();
	                } catch (InterruptedException ie) {
	                    Thread.currentThread().interrupted();
	                }
	            }

	            if(!(Mutex.oddFlag == true)) {
	                System.out.println("Print from EvenPrinter: "+i);
	                Mutex.oddFlag = true;
	                mutex.notify();
	            }

	        }
	    }
	    System.out.println("Finished Thread: EvenPrinter: "+i);
	 
	}


}
