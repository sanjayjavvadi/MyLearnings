
public class BufferThread implements Runnable {
	
	private Counter counter;

	public BufferThread(Counter counter) {
		super();
		this.counter = counter;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<500;i++)
		{
			counter.incrementcountby2(counter);
		}
	}

}
