
public class Counter {

	int count;

	public synchronized void incrementcount(Counter obj) {
		count = obj.count + 1;

	}

	public synchronized void incrementcountby2(Counter obj) {
		count = obj.count + 2;
	}

	public int getCount() {
		return count;
	}

}
