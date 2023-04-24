package educative;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2.0;
	      int n = 5;
	      int power;
	      double product=1;
	      int i=1;
	      while(i<=n) {
	    	  product *= x;
	    	  i++;
	    	  
	      }
	      System.out.println("For while "+product);
	       product=1;
	       i=1;
	      do {
	    	  product *= x;
	    	  i++;
	      }while(i<=n);
	      
	      
	      
	      System.out.println("do while "+product);
	}
	
	

}
