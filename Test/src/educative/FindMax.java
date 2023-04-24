package educative;

public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {1, 7, -2, -5, 10, -1};
		System.out.println(findMaxSumSubArray(arr));
	}
	
	public static int findMaxSumSubArray(int[] arr) {
        int max=0;
	         int sum=0;
	         for(int i=0;i<arr.length;i++) {
	        	 sum+=arr[i];
	        	 if( sum > max) {
	        		 max=sum;
	        	 }	
	        	 
	         }
		   return max;
   }

}
