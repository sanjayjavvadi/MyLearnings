package educative;

public class MaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.out.println(findMaxSumSubArray(3, new int[]{ 2, 1, 5, 1, 3, 2 }));  
	}
	
	public static int findMaxSumSubArray(int k, int[] arr) {
		int windowEnd=0,windowStart=0;
		int sum = 0,max=0;
		
	    for(;windowEnd < arr.length;windowEnd++) {
	    	sum+=arr[windowEnd];
	    	
	    	
	    	if(windowEnd >= k-1) {
	    		max=Math.max(sum,max);
	    		sum-=arr[windowStart];
	    		windowStart++;
	    	}
	    	
	    }
	    
	    return max;
		
	  }

}
