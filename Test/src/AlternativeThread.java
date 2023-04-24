import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AlternativeThread {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	//	ExecutorService executor = Executors.newFixedThreadPool(2);
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
	/*	executor.submit(() -> { for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
			
		}); */
		
		
	
		//char[] task2 =  new char[] {'m','n','o','p','q','r','s','t','w','x','y','z'};

		Callable task1 =  new AlphabetThread();
		Callable task2 =  new AlphabetThread();
		
		List<Callable<Boolean>> callables = Arrays.asList(
				 task1,
				  task2
		      );
	
		executor.invokeAll(callables);
			
		executor.shutdown();
	
		

	}

}
