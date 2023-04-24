package educative;

public class ReArrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = new int[] {10,-1,20,4,5,-9,-6};
        reArrange(arr);
	}
	
	public static void reArrange(int[] arr) {

		int[] arr1 = new int[arr.length];
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < 0) {
				arr1[count] = arr[i];
				count++;
			}
		}
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j] >= 0) {
				arr1[count] = arr[j];
				count++;
			}
		}
		
		for(int i =0;i< arr1.length;i++) {
			arr[i] =arr1[i];
		}
		
	  }

}
