package educative;

import java.util.Scanner;

public class ValidatePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String pswd = scan.nextLine();
		
		int upperCaseCount=0;
		int lowerCaseCount=0;
		int digitCount=0;
		
		int pwsdLength = pswd.length();
		
		if(pwsdLength < 8) {
			
		}
		
		for(int i=0;i<pwsdLength;i++) {

		   char ch = pswd.charAt(i);
		   
		   if(Character.isDigit(ch)) {
			   digitCount++;
		   }
		   else if(Character.isLowerCase(ch)) {
			   lowerCaseCount++;
		   }
		   else if(Character.isUpperCase(ch)) {
			   upperCaseCount++;
		   }
		   
		   
		   
			
		}

	}

}
