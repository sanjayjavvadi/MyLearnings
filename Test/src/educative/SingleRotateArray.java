package educative;

public class SingleRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {2,34,56,67,6};
		rotate(arr );

	}
	
	public static void rotate(int[] arr) {
		int temp= arr[arr.length-1];
		arr[arr.length-1] = arr[0];
		arr[0]= temp;
		
		for(int i=arr.length-1; i > 1 ;i--) {
			temp = arr[i];
			arr[i] = arr[i-1];
			arr[i-1] = temp;	
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+ " ");
		}
		
		
	}

}
