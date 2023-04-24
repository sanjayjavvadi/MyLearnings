import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listOfString = Arrays.asList("Java", "C", "C++", "Go", "JavaScript", "Python", "Scala");
		
		
		Map<String, Integer> stringToLength = listOfString.stream().collect(Collectors.toMap(Function.identity(), String::length)); 
		
		System.out.println("map of string and their length: " + stringToLength);
	}

}
