package educative;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FirstUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {4,4,4,3};
		
		findFirstUnique(arr);

	}
	
	public static void keepCountOfCharactersInStringWithGetOrDefault(int[] str) {

		//  HashMap<Character, Integer> map = new HashMap<>();
		
		 Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		  for (int i = 0; i < str.length; i++) {
		    map.put(str[i], map.getOrDefault(str[i], 0) + 1);
		  }
		  
	     map.forEach((k,v) -> System.out.println(k +" " +v  ));
		  
		}
	
	 
	public static void findFirstUnique(int[] arr) 
	 {
	   Map<Integer,Integer> collect = new HashMap<Integer,Integer>();
	   
	   int firstUnique=-1;
	   
	   for(int i=0;i < arr.length;i++) {
		 
		   collect.put(arr[i], collect.getOrDefault(arr[i], 0) + 1);
		
	   }
	   
	   collect.forEach((k,v) -> System.out.println( k + "  " + v ) );
	 
	 //  return firstUnique;
	   
	   
	 }

}
