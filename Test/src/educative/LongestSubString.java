package educative;

import java.util.HashMap;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findLength("araaci",2));
	}
	
	
	public static int findLength(String str, int k) {
	    // TODO: Write your code here
	    int windowStart=0,maxLength=0;
	    if(str == null || str =="" )
	   throw new IllegalArgumentException("");
	    
	    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	    for(int windowEnd=0;windowEnd< str.length();windowEnd++){
	       char rightChar= str.charAt(windowEnd);
	       map.put(rightChar,map.getOrDefault(rightChar,0)+1);
	       while(map.size() > k){
	        char leftChar = str.charAt(windowStart);
	        map.put(leftChar,map.get(leftChar) - 1);
	        if(map.get(leftChar) == 0){
	         map.remove(leftChar);

	        }
	        windowStart++;

	       }
	       maxLength=Math.max(maxLength, windowEnd - windowStart +1)  ;
	    }

	    return maxLength;
	  }


}
