
public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parseError("Test inactive");
	}
	
	private static String parseError(String mffail){
		System.out.println("Inside the parseError Method for String -{}"+mffail);
		String error = " " ;
		int i = 0;
		int flength = mffail.length();
		
		while (i < flength ){
			String c = mffail.substring(i, i + 6);
			System.out.println("MassairFlowFailure error string = " + c);
			
			if ((c.compareTo("Error(") == 0)  ){
				error = mffail.substring(i,flength);
				error = error.trim();
				System.out.println(" returned error string = " + error);
				return error;
			}
			
		i = i + 1;
			
		}
		
		
		return error;
		
	}

}
