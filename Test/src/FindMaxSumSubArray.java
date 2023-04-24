
public class FindMaxSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 1, 7, -2, -5, 10, -1 };

		int maxEndHere = 0;
		int maxSoFar = 0;
		for (int i = 0; i < arr.length; i++) {
			maxEndHere += arr[i];
			if (maxEndHere < 0) {
				maxEndHere = 0;
			}
			if (maxSoFar < maxEndHere) {
				maxSoFar = maxEndHere;
			}
		}
		System.out.println(maxSoFar);
	}

}


