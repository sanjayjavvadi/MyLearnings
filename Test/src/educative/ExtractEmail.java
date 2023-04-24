package educative;

import java.util.Scanner;

public class ExtractEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extractEmail("My e-mail address is Jamie.J.Java@gmail.com");
	}

	public static void extractEmail(String address) {
		// address = "My e-mail address is Jamie.J.Java@gmail.com"
		String email = "";

		// The email address begins after the 4th space in the string
		Scanner scanner = new Scanner(System.in);

		address = scanner.nextLine();
		String[] mutlipleString = address.split(" ");
		
		email= mutlipleString[3];
		

	}
}
