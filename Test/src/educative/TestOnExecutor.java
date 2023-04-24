package educative;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestOnExecutor  implements Callable<String>{

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(10);
		TestOnExecutor myexecutor = new TestOnExecutor();
		Future<String> future =executor.submit(myexecutor);
		
		System.out.println(future.get());
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		return Thread.currentThread().getName();
	}

}
