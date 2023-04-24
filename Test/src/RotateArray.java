
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr =new int[] {1, 2, 3, 4, 5};
        rotateArray(arr);
	}

	public static void rotateArray(int[] arr){
       int temp = arr[0];
       arr[0] = arr[arr.length-1];
       arr[arr.length-1]=temp;
       
       int temp1=0;
       for(int i=arr.length-1; i > 0 ;i--) {
    	   int j=arr.length-2;
    	   temp1 = arr[i];
    	   arr[i] = arr[j];
    	   
           arr[j] = temp1;
          
       }
       for(int k=0;k<arr.length;k++) {
    	   System.out.println(arr[k]);
       }
    }
}
