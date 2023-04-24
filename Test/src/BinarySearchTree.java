
public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] arr = new int[] {1, 3, 9, 10, 12};
	
	 System.out.println(binarySearch(arr,10));

	}
	
	static int binarySearch(int[] nums, int target) {
		// TODO: Write - Your - Code
		int low = nums[0];
		int high = nums.length-1;
		
		while(low <= high) {
			
			int mid = low + ((high-low)/2);
			
			if(nums[mid] == target) {
				return mid;
			}
			
			else if(target < nums[mid]) {
				high = mid-1;
			}
			
			else if(target > nums[mid]) {
				low = mid+1;
			}
		}
		
		return -1;
	}

}
