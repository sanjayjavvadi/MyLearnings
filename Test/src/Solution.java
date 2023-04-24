
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = new int[] {1,2,3,1};
       
       System.out.println(rob(nums)); 
       }
	
	
	public static int rob(int[] nums) 
    {
        int n = nums.length;
        if(n < 1)
            return 0;
        if(n== 1)
            return nums[0];
        
        int dp[] = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0],nums[1]);

        for(int i=2; i<n; i++)
        {
            int rob = nums[i]+dp[i-2]; 
            int skip = dp[i-1]; 
            dp[i] = Math.max(rob,skip);
        }
        return dp[nums.length-1];
    }


}
