package educative;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> stockPrice = new HashMap<>();

		stockPrice.put("Oracle", 56);
		stockPrice.put("Fiserv", 117);
		stockPrice.put("BMW", 73);
		stockPrice.put("Microsoft", 213);
		stockPrice.put("Google", 421);
		stockPrice.put("Ford", 456);
		stockPrice.put("Novartis", 43);
		stockPrice.put("TCS", 23);
		
	   int maxValue = Collections.max(stockPrice.values());
	   
	  for(Entry<String,Integer> entry : stockPrice.entrySet()) {
		  if(entry.getValue() == maxValue) {
			  System.out.println(entry.getKey());
		  }
	  }
	   
	  // Find average stock stock price
	  
	 double avgStock= stockPrice.entrySet().stream().mapToDouble(i->i.getValue()).average().orElse(0);
	 System.out.println(avgStock);
	 
	 stockPrice.entrySet().removeIf(entry -> entry.getValue() < 50);
	 
	 for(Entry<String,Integer> entry : stockPrice.entrySet()) {
		 System.out.println(entry.getKey() + " " + entry.getValue());
 }
	 
	  
	  

	}

}
