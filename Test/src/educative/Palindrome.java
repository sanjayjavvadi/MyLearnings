package educative;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validPalindrome("radar"));
		
	}
	
	private static Boolean  validPalindrome(String str) {
		StringBuffer sbr = new StringBuffer(str);
		
		sbr.reverse();
		if(str.equals(sbr.toString())) {
			return true;
		}
		return false;
		
	}

}
