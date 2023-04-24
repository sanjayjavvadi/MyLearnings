package educative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(uglyOrNot(15));

	}
	
	public static boolean uglyOrNot(int num) {
		
		List<Integer> checkFactors = Arrays.asList(2,3,5);
		List<Integer> factors = new ArrayList<Integer>();
		int i=2;
		while(i <= num) {
			if(num % i== 0) {
				factors.add(i);
				num = num/i;	
			}
			i++;
		}
		
		if((factors.contains(checkFactors.get(0)) && factors.contains(checkFactors.get(1))) || (factors.contains(checkFactors.get(0)) && factors.contains(checkFactors.get(2)) || (factors.contains(checkFactors.get(1)) && factors.contains(checkFactors.get(2))))) {
			return true;
		}
		
		return false;
	}

}
