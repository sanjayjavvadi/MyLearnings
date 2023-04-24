package educative;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[] { 1, 3, 4, 5 };
		int[] arr2 = new int[] { 2, 6, 7, 8 };
		int[] result = mergeArrays(arr1, arr2);

		for (int x = 0; x < result.length; x++) {
			System.out.println(result[x]);
		} 
	}

	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		// write your code here
		int[] arr3 = new int[arr1.length + arr2.length];
		int length = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr3[length] = arr1[i];
			++length;
		}
		
		

		for (int j = 0; j < arr2.length; j++) {
			arr3[length] = arr2[j];
			++length;
		}
		
		
		
		// sort the array 
		int temp=0;
		
		for(int i=0;i<arr3.length;i++) {
			for(int j=i+1;j<arr3.length;j++) {
				if(arr3[i] > arr3[j]) {
					temp=arr3[j];
					arr3[j]=arr3[i];
					arr3[i]=temp;
				}
			}
		}  

		return arr3;   // make a new resultant array and return your results in that

	}
}
