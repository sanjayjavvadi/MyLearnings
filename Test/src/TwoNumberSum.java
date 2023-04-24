import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TwoNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] num = new int[] {4,3,5,6,9,45,15};
	   int[] numbers =	findSum(num,15);
	   System.out.println(numbers[0]);
	   System.out.println(numbers[1]);
	}

	 public static int[] findSum(int[] arr, int n) 
	  {
	    int[] result = new int[2];
	    // write your code here
	    result[0]=0;
	    result[1]=0;
	    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	    
	    for(int i=0;i< arr.length;i++) {
	    	if(map.containsKey(arr[i])){
	    		
	    	}else {
	    		map.put(arr[i], n-arr[i]);
	    	}
	     }
	    
	    for(Entry<Integer,Integer> entry : map.entrySet())
	    {
	      for(int i=0;i < arr.length;i++) {
	    	  
	    	 if(entry.getValue() == arr[i]) {
	    		 result[0]=entry.getKey();
	    		 result[1]=entry.getValue();
	    	 }
	      }
	      
	    }
	    
	    
	    
	    return result;   // return the elements in the array whose sum is equal to the value passed as parameter 
	  }
}
