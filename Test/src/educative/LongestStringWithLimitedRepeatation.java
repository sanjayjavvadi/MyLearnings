package educative;

import java.util.HashMap;

public class LongestStringWithLimitedRepeatation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(findLength("aabccbb", 1));
	}
	
	public static int findLength(String str, int k) {
	     int windowStart=0,maxLength=0;
	     int maxRepeatLetterCount=0;
	     HashMap<Character,Integer> maxNoOfFrequency = new HashMap<Character,Integer> ();
		for(int windowEnd=0;windowEnd<str.length();windowEnd++) {
			maxNoOfFrequency.put(str.charAt(windowEnd),maxNoOfFrequency.getOrDefault(str.charAt(windowEnd), 0)+1 );
			maxRepeatLetterCount= Math.max(maxRepeatLetterCount ,maxNoOfFrequency.get(str.charAt(windowEnd)));
			
			if (windowEnd - windowStart + 1 - maxRepeatLetterCount > k) {
				System.out.println("Current Cursor Position ---"+windowEnd);
		        char leftChar = str.charAt(windowStart);
		        maxNoOfFrequency.put(leftChar, maxNoOfFrequency.get(leftChar) - 1);
		        windowStart++;
		      }
			 maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
		}
		
		maxNoOfFrequency.forEach((key,value) ->System.out.println(key + " "+ value));  
		return maxLength;
	  }

}
