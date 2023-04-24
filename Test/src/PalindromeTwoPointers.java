
public class PalindromeTwoPointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="kayak";
	

      if(isPalidrome(s)) {
    	  System.out.println("It's a palidrome");
      } else {
    	  System.out.println("It's a not palidrome");
      }
	}
	
	

	    static boolean isPalidrome(String s) {
	    	
		for (int i = 0, j = s.length() - 1; j >= 0 && i < s.length() - 1; i++, j--) {
             
			if (Character.compare(s.charAt(i),s.charAt(j)) != 0) {
				return false;
			}

		}
		return true;
	}

}
