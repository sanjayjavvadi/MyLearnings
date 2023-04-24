
public class ProductArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] summ= findProduct(new int[] {4,5,6,8,9});
		 
		 for(int i=0;i<summ.length;i++) {
			 System.out.println(summ[i]);
		 }
		 
		

	}
	
	public static int[] findProduct(int arr[])  
	  {    
	   
	    
	    int n = arr.length;
	    int i, temp = 1; 

	    // write your code here
	   
	    int result[] = new int[n]; 

	    // Product of elements on left side excluding arr[i]
	   for (i = 0; i < n; i++)  
	    { 
	      result[i] = temp; 
	      temp *= arr[i]; 
	    } 
	    
	    temp = 1;
	    
	    for (i = n - 1; i >= 0; i--)  
	    { 
	      result[i] *= temp; 
	      temp *= arr[i]; 
	    }

	    return result; 
	   } 

}
