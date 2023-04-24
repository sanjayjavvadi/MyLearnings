import java.util.Arrays;

public class ThreeDigitstarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   int nums[] = new int[] {1,7,2,4,10};
	   Arrays.sort(nums);
	   int target=19;
	   int length =nums.length-1;
	   
	   
	   
	   
	   for(int i=0;i<nums.length-1;i++) {
		   int j=i+1;
		   int k=length;
		   while(j<k) {
			   
			   if(nums[i]+ nums[j]+nums[k]==target) {
				   System.out.println("Index are ---"+ i +"--"+j +"--"+k);
				   System.out.println("Numbers  are---"+ nums[i] +"--"+nums[j] +"--"+nums[k]);
				   break;
				 //  return;
			   }
			   else if( (nums[i]+ nums[j]+nums[k]) > target) {
				   k--;
			   }
			   else {
				   i++;
			   }
			   
		   }
		   
	   }

	}

}
