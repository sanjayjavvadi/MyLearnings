package educative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortZeroFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		zeroFirstNonzeroSecond(new int[] {0,4,0,56,0,32});

	}
	
	public static List<Integer> zeroFirstNonzeroSecond(int[] arr){
		List<Integer> actualList = IntStream.of(arr).boxed()
				.collect(Collectors.toCollection(ArrayList :: new));
				
		
	   List <Integer> zero=	   actualList.stream().filter(x -> new Integer(0).equals(x)).collect(Collectors.toList());
		
		
		return zero;
		
	}

}
