package educative;

public class SmallestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static int smallestSubArray(int S, int[] arr) {
		int  windowEnd=0,windowStart=0;
		int minInt = Integer.MAX_VALUE;
		int sum=0;
		for(;windowEnd<arr.length;windowEnd++) {
			sum+=arr[windowEnd];
			while(sum >= S) {
				minInt = Math.min(minInt, windowEnd - windowStart+1);
				sum-=arr[windowStart];
				windowStart++;
				
			}
		}
		return minInt;
	}

}
