import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Calculation  {
	
 	
	public static String reverse(NumericTest<String> nt, String str)
	{
     	return	nt.compute (str) ;
	}
	
	 
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	NumericTest<String> testString  = (str) -> {
			
			String result ="";
			
			for(int i= str.length() -1; i >=0; i--)
			{
				result += str.charAt(i);
			}
			
			return result;
		};
		
		
		
		
		    System.out.println(reverse(testString,"Sanjay"));     */
	     
	     
		NumericTest<Integer>  testInteger = (n) ->{
	    	 
	    	 int fac=1;
	    	 for( int i= n ;i >0; i--)
	    	 {
	    		 fac *= i; 
	    	 }
	    	 
	    	 return fac;
	     };
	     
	     
	     System.out.println(" Factorial number - " + testInteger.compute(5)  );  
	     
	      List<Integer> myList =new ArrayList<Integer>();
	       
	     myList.add(34);
	     myList.add(56);
	     myList.add(78);
	     myList.add(67);
	     myList.add(90);
	     
	     myList.forEach((i) ->
	    		 {
                     System.out.println (i);	    	          	    	 
	    		 });
	     
	       int sum=0;
	     
	       sum = myList.stream().filter(x ->x > 50).mapToInt(x->x).sum();
	     
		   System.out.println("Sum of all integers greater than 25 -"+sum );
		   
		   Stream<Integer> stream = Stream.of( new Integer[] {23,4,5,6});
		   
		   Stream<Integer> stream1 =Stream.of(1,3,4,6,7);
		   
		    List<Integer> intList =stream1.collect(Collectors.toList());
		    System.out.println(intList);
		   
	}

}
