import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3,4,5};
		
		int[] result = new int[arr.length];
		
		Arrays.sort(arr);
		
		int index=0;
		
		for(int i=arr.length-1;i>=0;i --) {
			if(index <= arr.length ) {
			result[index] = arr[i];
			index=index+2;
			}
		}
		
		index=1;
        for(int i=0;i<arr.length-2;i++) {
        	if(index <= arr.length-2 ) {
			result[index] = arr[i];
			index=index+2;
        	}
        	
		}
        
        for(int j=0;j<result.length;j++) {
        	arr[j] =result[j];
        }
	}

}
