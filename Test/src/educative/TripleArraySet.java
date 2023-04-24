package educative;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TripleArraySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {7,-6,3,8,-1,8,-11,-11,7,-6,-1,3};

		int target = 0;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		List<Integer> arrList = Arrays.asList(2, 1, -2, 2, -1, 3, 4, 5, 2);

		Map<Integer, Long> mapList = arrList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Arrays.sort(arr);
		

		for (int i = 0; i < arr.length - 1; i++) {

			if (i == 0 || (i != i - 1)) {
				
				int j = i + 1, k = arr.length - 1;

				while (j < k) {

					if (arr[j] + arr[k] == target - arr[i]) {
                     System.out.println(arr[i]+ " " +arr[j]+ " " +arr[k] );
                     while( j < k && arr[j] == arr[j+1]) j++;
                     while( j < k && arr[k] == arr[k-1]) k--;
                     
                     j++;
                     k--;
					}

					else if (arr[j] + arr[k] < target - arr[i]) {
						j++;

					}

					else {
                           k--;
					}

				}
			}

		}

	}

}
