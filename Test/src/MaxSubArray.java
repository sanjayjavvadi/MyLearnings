
public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {-2, 10, 7, -5, 15, 6};
		
		System.out.println(findMaxSumSubArray(arr)); 

	}
	
	 public static int findMaxSumSubArray(int[] arr) {
		 int currMax = arr[0];
	        int globalMax = arr[0];
	        int lengtharray = arr.length;
	         for(int i=0;i<arr.length;i++) {
	        	 if (currMax < 0) {
	                 currMax = arr[i];
	                 } else {
	                 currMax += arr[i];
	                 }

	                 if (globalMax < currMax) {
	                 globalMax = currMax;
	                 }
	        	 
	         }
		   return globalMax;
	    }

}
