import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableIntefaceExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		Future<String> furture = 	executor.submit(callableTask);
		
		List<Future> futures = new ArrayList<Future>();
		
		futures.add(furture);
		
		

        System.out.println(furture.get());
	}
	
	static Callable<String> callableTask = () -> {
	   return "Task's execution";
	};

}
