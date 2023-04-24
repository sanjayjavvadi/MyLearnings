package educative;

public class MinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	  public static int findMinimum(int[] arr) {
		    // Write your code here
		    int min = arr[0];
		   
		    for(int i=0;i<arr.length;i++) {
		    	if(min < arr[i]) {
		    		min=arr[i];		
		    	}
		    }
		    return min;
		  }
}
