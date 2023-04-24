import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class ExampleLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, List<Integer>> map = new HashMap<>();
		map.put("A", Arrays.asList(1, 2, 3));
		map.put("B", Arrays.asList(4, 5, 6));
		
		map.forEach((x,y)-> System.out.println("Key --"+x +"Values --"+y ));
		
		

	}

}
