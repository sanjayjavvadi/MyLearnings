package educative;

import java.util.HashMap;
import java.util.Map;

public class TargetSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int target = 19;
		int[] arr = new int[] { 11, 3, 7, 8, 14, 2, 4, 21 };

		int[] res = new int[2];

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			int secno = target - arr[i];
			if (map.containsKey(secno)) {
				res[0] = i;
				res[1] = map.get(secno);
				break;
			}
			map.put(arr[i], i);
		}

		System.out.println(res[0]);
		System.out.println(res[1]);
	}

}
