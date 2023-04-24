
public class AscendingOrderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {-7,-3,2,3,11};
		
		int[] squareArray = new int[nums.length];
		
		int left =0;
		int right =nums.length-1;
		int result;
		
		for(int i=nums.length-1;i>=0;i--) {
			
			if(Math.abs(nums[left]) > Math.abs(nums[right])) {
		    	result= nums[left];
				left++;			
			}
			else {
				result= nums[right];
				right--;
				
			}
			
			squareArray[i] = result * result;
			
		}
		
		 for(int s=0 ;s<squareArray.length;s++) {
			 System.out.println(squareArray[s]);
		 }
				
				
			

	}

}
