
public class MyThread implements Runnable {

	private Counter counter;

	public MyThread(Counter counter) {
		super();
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			this.counter.incrementcount(counter);
		}

	}

}
