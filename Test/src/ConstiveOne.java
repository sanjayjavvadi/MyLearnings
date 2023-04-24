import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConstiveOne {
	
	static int tempmax=0;
    static int max=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	  //  int[] arr = new int[] {1,0,1,1,0,0,0,1,1,1,1,1,1,1,0,0,5,0,0,0,0,1,1,1,1,0};
	    List<Integer> ls = Arrays.asList(1,0,1,1,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,1,1,1,1,0);
	    
	   // List<Integer> ls = Arrays.asList(1,0,1,0);
 
	    
	  /* for(int i=0;i<arr.length;i++) {
	    if(arr[i] == 1) {
		  tempmax=tempmax+1;
		}
		 else {
		     if(tempmax > max) {
		         max=tempmax;
		      }
		  tempmax=0;
		}
      } */
	
	    ArrayList<Integer> values = new ArrayList<Integer>();
	   
        
	    AtomicInteger  counter = new AtomicInteger();
	   ls.stream().forEach( x ->condition(values, counter, x));
	    
	   System.out.println(values.stream().max((o1,o2) -> o1-o2));
	   
	 //  ls.stream().filter(x -> x == 1).filter(predicate)     .  forEach(System.out::println);

	    //ls.stream().forEach( x -> Optional.
	   
	
//	 IntStream.of(arr).forEach(x -> condition(values, counter, x));
	          
			 
			 
		        
	    
	   
	 // ls.stream().forEach( x -> { System.out.println(x);} );
	}

	
	private static void condition(List<Integer> values, AtomicInteger counter, Integer x) {
		if( x==1 && counter.intValue() >= 0 ) {
			counter.getAndIncrement();
			values.add(counter.get());
		} else {
		   /* if(counter.intValue() > 1 ) {
			values.add(counter.get());
			} */
			counter.set(0);
		}
		
	}
	
	
	// Algorthirm
	
	// Step 1. Change the array to List.
	// Step 2. Compare the current and previous element and increment else make it as zero.
	//
	
	public static Long findMostRepeatedNumber(List<Integer> list) {
	    Map<Integer, Long> counts = list.stream()
	    		                        
	                                     .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
	    System.out.println(counts);
	    Optional<Map.Entry<Integer, Long>> entry = counts.entrySet().stream()
	                                                      .max(Map.Entry.comparingByValue());
	    return entry.get().getValue();
	}
	
	
	public static Map<Character, Long> charsCount(String input) {
		
		 return input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors. counting())); 
		}
	
	

}
