package educative;

import java.util.HashMap;

public class LongestStringWithoutRepeation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println(findLength("abccde")); 

	}
	
	 public static int findLength(String str) {
		 int windowstart=0,maxLength=0;
		    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		    for(int windowEnd=0;windowEnd<str.length();windowEnd++){
		      char rightChar = str.charAt(windowEnd);
		      if(map.containsKey(rightChar)) {
		    	  windowstart = Math.max(windowstart,map.get(rightChar)+1);
		      }
		      map.put(rightChar, windowEnd+1);
		      maxLength =  Math.max(maxLength, windowEnd-windowstart+1);
		    }
		     return maxLength;
	 }

}
