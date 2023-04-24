package educative;

public class ExceptItselfProduct {
	
	public static void main(String args[]){
		
		int[] arr = new int[] {1,2,3,4};
		int[] res=  findProduct(arr);
		
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		
	}
	
	
	public static int[] findProduct(int arr[])  
	  { 
	    int n = arr.length;
	    int i, temp = 1; 

	    // Allocation of result array
	    int result[] = new int[n]; 

	    // Product of elements on left side excluding arr[i]
	    for (i = 0; i < n; i++)  
	    { 
	      result[i] = temp; 
	      temp *= arr[i]; 
	    } 

	    // Initializing temp to 1 for product on right side
	    temp = 1; 

	    // Product of elements on right side excluding arr[i] */
	    for (i = n - 1; i >= 0; i--)  
	    { 
	      result[i] *= temp; 
	      temp *= arr[i]; 
	    } 
	    return result; 
	  } 

}
