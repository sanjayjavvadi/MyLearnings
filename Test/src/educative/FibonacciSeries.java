package educative;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lastNumber = 8;
		
		int sum=0;
		int i=0;
		do {
			
			sum = sum + i;
			System.out.println(sum);
			
			i++;
		}while(i <=lastNumber );

	}

}
