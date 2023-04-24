
public class PrimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		PrimeTest p=new PrimeTest();
		
		p.showPrimes(10);
	}
	
  public void  showPrimes(int n) {
	  nextPrime: 
		  for (int  i = 2; i < n; i++) {

		    // check if i is a prime number
		    for (int  j = 2; j < i; j++) {
		      if (i % j == 0) continue nextPrime;
		    }

		    System.out.println(i);
		  }
		}

}
