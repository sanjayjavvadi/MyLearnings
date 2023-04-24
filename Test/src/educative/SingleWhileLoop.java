package educative;

import java.util.Scanner;

public class SingleWhileLoop {

	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
	      System.out.print("What is the length of the square's side? ");
	     
	      int sideLength = keyboard.nextInt();
	      int numberOfStars = sideLength * sideLength;
	      int starCounter = 1;
	      while (starCounter <= numberOfStars)
	      {
	         System.out.print("* ");
	         if (starCounter % sideLength == 0)
	            System.out.println();
	         starCounter++;
	      }
	}

}
