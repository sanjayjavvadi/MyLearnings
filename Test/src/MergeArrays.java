import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] arr3=		mergeArrays(new int[]{1, 3, 4, 5}, new int[]{2, 6, 7, 8});
        
        for(int i=0;i<arr3.length;i++) {
        	System.out.println(arr3[i]);
        }

	}
	
/*	public static int[] mergeArrays(int[] arr1, int[] arr2) 
    {  
      // write your code here
		int[] arr3 = new int[arr1.length+arr2.length];
		
	    int count =0;
		
		for(int i=0;i<arr1.length;i++) {
			arr3[count] = arr1[i];
			count++;
		}
		
		for(int j=0; j < arr2.length ;j++) {
			
			arr3[count] = arr2[j];
			count++;
			
		}
		
	   Arrays.sort(arr3);
		
      return arr3; // make a new resultant array and return your results in that
    } 
	 */
	
	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		 int s1 = arr1.length;
		    int s2 = arr2.length;
		    int[] resultantArray = new int[s1+s2];
		    int i = 0, j = 0, k = 0;

		    // Traverse both array 
		    while (i < s1 && j < s2) { 
		      // Check if current element of first 
		      // array is smaller than current element 
		      // of second array. If yes, store first 
		      // array element and increment first array 
		      // index. Otherwise do same with second array 
		      if (arr1[i] < arr2[j]) 
		        resultantArray[k++] = arr1[i++]; 
		      else
		        resultantArray[k++] = arr2[j++]; 
		    } 

		    // Store remaining elements of first array 
		    while (i < s1) 
		      resultantArray[k++] = arr1[i++]; 

		    // Store remaining elements of second array 
		    while (j < s2) 
		      resultantArray[k++] = arr2[j++]; 

		    return resultantArray;
	}
	

}
