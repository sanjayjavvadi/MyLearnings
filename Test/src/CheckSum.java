
public class CheckSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = findSum(new int[]{1, 21, 3, 14, 5, 60, 7, 6},27);
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}

	}
	
	public static int[] findSum(int[] arr, int n) 
	{
	    int[] result = new int[2];
	    
	    
	    for(int i=0;i <= arr.length-1;i++) {
	    	for(int j=i+1;j < arr.length;j++) {
	    	
	    		if(arr[i] + arr[j] == n) {
	    			result[0] =arr[i];
	    		    result[1] =arr[j];
	    		    return result;
	    		}
	    	}
	    	
	    }
	    
	    
	    return arr;   // return the elements in the array whose sum is equal to the value passed as parameter 
	}

}
