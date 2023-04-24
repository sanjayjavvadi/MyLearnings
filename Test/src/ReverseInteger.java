import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ReverseInteger {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ReverseInteger p=new ReverseInteger();
		
		System.out.println( singleNumber(new int[] {1,1,8}) );
	}
	
	
	        
		 public static int singleNumber(int[] nums) {
		       HashMap<Integer,Integer> hastTable = new HashMap<Integer,Integer>();
		        
		        for(int i:nums)
		        {
		        	System.out.println(hastTable.getOrDefault(i,0));
		        	System.out.println("----------------");
		            hastTable.put(i,hastTable.getOrDefault(i,0)+1);
		        }
		        
		        hastTable.entrySet().forEach(entry -> {
		            System.out.println(entry.getKey() + " " + entry.getValue());
		        });
		        
		         for (int i : nums) {
		          if (hastTable.get(i) == 1) {
		          return i;
		        }
		      }
		    return 0;
		    }
		 
	        
	    
}
