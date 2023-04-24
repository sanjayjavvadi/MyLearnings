package educative;

public class ProductofTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int[] {0,1,2};
		int[] product =findProduct(arr);
        for(int i=0;i<product.length;i++) {
        	System.out.print(product[i]+ " ");
        }
	}
	
	public static int[] findProduct(int arr[])  
	  {    
	    int [] result = new int[arr.length];
	    int sum =1;
	    for(int i=0;i<arr.length;i++) {
	    	sum =1;
	    	for(int j=0;j<arr.length;j++) {
	    		if(i!=j) {
	    		sum *=arr[j];
	    		}
	    	}
	    	result[i] =sum;
	    	
	    	
	    }

	   
	    return result; 
	   } 

}
