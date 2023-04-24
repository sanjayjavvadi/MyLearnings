import java.util.ArrayDeque;

public class MaxSlide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {3,54,67,58,90,5};
		System.out.println(findMaxSlidingWindow( arr,6 ));

	}
	
	public static int findMaxSlidingWindow(int[] arr, int windowSize) {
	    ArrayDeque<Integer> result = new ArrayDeque<>(); 
	    int max=arr[0];
	    
	    for(int i=1;i<arr.length;i++) {
	    	if(max < arr[i]) {
	    		max=arr[i];
	    	}
	    }
	    
	    return max; 
	  }

}
