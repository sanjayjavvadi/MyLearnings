
public class RotateArrayByN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {1,2,3,4,5};
		
		int n=3;
		int temp=0;
		for(int i=0; i<n ;i++) {
		  
		  int  last =arr[arr.length-1];
		  temp = arr[0];
		  arr[0] = last;
		  arr[arr.length-1] = temp;
	      for(int j= 1;j<=arr.length-1;j++) {
	        temp = arr[j]; 
	    	arr[j]=arr[arr.length-1];
	    	arr[arr.length-1]=temp;
	    	 	  
	      }
			
		}
		
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}

	}

}
