package educative;

public class ReserveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reserveString("Hello")); 
	}
	
	private static String reserveString(String str) {
		if(str.isEmpty()) {
			return str;
			
		}
		else {
			return reserveString(str.substring(1)) +str.charAt(0);
		}
		
	}

}
