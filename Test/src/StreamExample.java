import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	List<String> fruitNames = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		
		
		Map<String, Long> fruitMap =  fruitNames.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		fruitMap.forEach((k,v) ->{
		         System.out.println(k + " "+ v);
		});
		*/
		
		List<Integer> numbers = Arrays.asList(2,3,4,5,6,6);
		
		List<Integer> doubleNum =  numbers.stream().map((i) -> i * i).collect(Collectors.toList());
		
		for(Integer i : doubleNum) {
			System.out.println();
		}
		
		
		

	}

}
