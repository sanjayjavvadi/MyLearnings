
public class MinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMinimum(new int[] {2,34,56,3,78} ));
	}
	
	public static int findMinimum(int[] arr) {
	   int temp = arr[0];
	   for(int i=1;i< arr.length ; i++) {
		   if(temp > arr[i]) {
			  temp = arr[i];
		   }
		   
	   }
	    return temp;        
	  }

}
