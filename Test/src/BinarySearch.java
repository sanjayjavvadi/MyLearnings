
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,6,7,9,12,23,34,43,56,78};
		int target =56;
		int ceilingTar = 32;
		
	//	System.out.println(search(arr,target));
		
		System.out.println(ceiling( arr, ceilingTar));
	//	System.out.println(flooring(arr, ceilingTar));
	}
	
	private static int search(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = start + (end - start)/2;
		    if(arr[mid] < target) {
		    	start = mid+1;
		    } else if(arr[mid] > target) {
		    	end = mid-1;
		    } else {
		    	return mid;
		    }
		}
		
		return -1;
		
	}
	
	private static int ceiling(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = start + (end - start)/2;
		    if(arr[mid] < target) {
		    	start = mid+1;
		    } else if(arr[mid] > target) {
		    	end = mid-1;
		    } else {
		    	return arr[start+1];
		    }
		}
		
		return arr[start];
	}
	
	private static int flooring(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = start + (end - start)/2;
		    if(arr[mid] < target) {
		    	start = mid+1;
		    } else if(arr[mid] > target) {
		    	end = mid-1;
		    } else {
		    	return mid;
		    }
		}
		
		return arr[end];
	}

}
