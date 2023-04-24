package educative;

import java.util.ArrayList;
import java.util.List;

public class NumberToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(toNumberString(5678));;
		

	}
	
	private static String toNumberString(int num) {
		
		List<Integer> digitsGether = new ArrayList<Integer>();
		while(num > 0) {
		 	
		 	digitsGether.add(num %10);
		 	num = num /10; 	
       }
		
		String digitString="";
		
		switch(digitsGether.size()) {
		case 3 : digitString = digitsGether.get(2) +  " " + "Hundred " + digitsGether.get(1) + digitsGether.get(0);
		                         break;
		                         
		case 4 : digitString = digitsGether.get(3) +  " " + "Thousand " + digitsGether.get(2)    + digitsGether.get(1) + digitsGether.get(0);
		                         break;            
		
		case 5 : digitString = digitsGether.get(4) +  digitsGether.get(3)  + "Thousand " + digitsGether.get(2) + digitsGether.get(1) + digitsGether.get(0);
                                  break;
                                  
		case 6 : digitString = digitsGether.get(5) +  " " + " Million " + digitsGether.get(4)    + digitsGether.get(3) + "Thousand  " + digitsGether.get(2) + digitsGether.get(1)+digitsGether.get(0) ;
                                break;
        
		case 7 :  digitString = digitsGether.get(6) + digitsGether.get(5) +  " " + " Million " + digitsGether.get(4) + digitsGether.get(3) +"Thousand " + digitsGether.get(2) + digitsGether.get(1) + digitsGether.get(0);
		                        break;
		                        
		
				     
		}
		return digitString;

		
	}		

}
