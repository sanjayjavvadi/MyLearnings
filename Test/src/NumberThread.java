import java.util.concurrent.Callable;

public class NumberThread implements Callable {

	int[] numbers =  new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
	@Override
	public Boolean call() {
		// TODO Auto-generated method stub
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		return false;
		
	}
}
