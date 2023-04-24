package educative;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetTest {

	public static void main(String[] args) {
		//
		Map<String, Integer> stockPrice = new HashMap<>();

		stockPrice.put("Oracle", 56);
		stockPrice.put("Fiserv", 117);
		stockPrice.put("BMW", 73);
		stockPrice.put("Microsoft", 213);
		stockPrice.put("Google", 421);
		stockPrice.put("Ford", 456);
		stockPrice.put("Novartis", 43);
		stockPrice.put("TCS", 23);
	  
	    Set<Entry<String,Integer>> stockSet = 	stockPrice.entrySet();
	    
	   String value = stockSet.stream().max((x,y) -> x.getValue().compareTo(y.getValue())).get().getKey();
	   
	   // Highest Company strock value
	   System.out.println(value);
	   
	   // Find the avarage stock price
	   
	   double avg=  stockPrice.values().stream().mapToDouble(Integer::doubleValue).average().orElse(0);
	   
	   System.out.println(avg);
	   
	   stockPrice.entrySet().removeIf(entry -> entry.getValue() < 50);
	   
	   stockPrice.forEach((k,v)-> System.out.println("Key :"+k +"Value :" + v));
	   
	    
	   
	}
	
	

}
