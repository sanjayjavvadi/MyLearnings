package educative;

import java.util.Arrays;

public class CheckSecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr = new int[] {9,2,3,6};
         findSecondMaximum(arr);
	}
	
	public static int findSecondMaximum(int[] arr)
	  {
	/*      int temp = 0;
	      for(int i=0;i<arr.length;i++) {
	    	  for(int j=i+1;j<arr.length;j++) {
	    		  if(arr[i] > arr[j]) {
	    			  temp = arr[j];
	    			  arr[j] = arr[i];
	    			  arr[i] = temp;
	    		  }
	    	  }
	      }
	      
	      if(arr[arr.length-1] == arr[arr.length-2]) {
	    	  return arr[arr.length-3];
	      }
	      
	      return arr[arr.length-1];  */
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				secondMax =max;
				max= arr[i];
				
			} else if(arr[i] > secondMax && arr[i] < max) {
				secondMax= arr[i];
			}
		}
		
		return secondMax;
	  }

}
