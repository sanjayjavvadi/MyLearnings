package educative;

public class StringEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println(blankInteger("Sanjayjavvadi"));
	}
	
	public static int blankInteger(String name) {
		
		int index=0;
		int stringLength = name.length();
		int result =-1;
		while(index < stringLength &&  name.charAt(index) !=' ')
		 index++;
		
		if(index < stringLength)
		 result =index+1;
			
		return result;
		
	}
}
