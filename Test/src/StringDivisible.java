import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] number = new String[] {"1","2","3","4","5","6","7","8","9"};
		List<String> numberList =   Arrays.asList(number);
		
		  numberList.stream().filter((i) ->Integer.parseInt(i) % 3 == 0).forEach(System.out::println);
		
 
	}

}
