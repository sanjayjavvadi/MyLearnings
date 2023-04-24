package educative;

public class OtherFactorial {
	
	private static int factorial(int n) {
	      // Base case
	      if (n == 1) {
	        return 1;
	      }
	      // Recursive case
	      else {
	        return (n * factorial(n-1));
	      }
	    }
	
	 public static int gcd(int num1, int num2) {

	        // Base case
	        if (num1 == num2) {
	            return num1;
	        }
	        // Recursive case
	        if (num1 > num2) {
	            return gcd(num1-num2, num2);
	        }
	        else {
	            return gcd(num1, num2-num1);
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result =  gcd(56,42);
		System.out.println(result);
		
	}

}
