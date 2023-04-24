package educative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 List<Character> al=  Arrays.asList('a','b','b','c','c','c','d');
		 ArrayList<Character> newArrayList = new ArrayList<Character> (al);
		 removeDuplicates(newArrayList);
		  
	}

	
	 public static void removeDuplicates(ArrayList<Character> arrList) {
	        //write your code here
	        List<Character> nonDuplicatearrList  = new ArrayList<Character>();
	        for(Character ch :  arrList){
	           if(!nonDuplicatearrList.contains(ch)){
	             nonDuplicatearrList.add(ch);
	           }
	           
	        }
	        arrList.clear();
	        for(Character ch :  nonDuplicatearrList){
	             arrList.add(ch);
	        }
	       
	        
	        System.out.println(arrList);
	         

	    }
}
