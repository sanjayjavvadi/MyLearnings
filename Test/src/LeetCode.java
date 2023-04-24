import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode {

	public static void main(String[] args) throws IOException 
	{
		//int  longSubString= 	getLongString("abcsedddfddgvs");
		
	   
	  // System.out.println(longSubString); 
	/*	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
	}
	
	public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        //write your code here
        for(String str : list){
            
            if(result.get(str)!=null){
                int value =result.get(str);
                result.put(str,++value);
           }
           else{
                result.put(str,0);
           }
        }


        return result;
    }
	
	
	public static int  getLongString(String input)
	{
		
		
		ArrayList<Integer> arr =new ArrayList<Integer>();
		int output=0;
		
		for(int i=0;i<input.length();i++)
		{
			Set<Character> longDuplicateString= new HashSet<Character>();
			 
			for(int j=i;j<input.length();j++)
			{
				if(!longDuplicateString.contains(input.charAt(j)))
				{
					longDuplicateString.add(input.charAt(j));
				}
				
				else
				{
					break;
				}
			}
			
		 if(output < longDuplicateString.size())
			 output=longDuplicateString.size();
		}
		
		return output;
	}
	
	
/*	public static  String  getHighestPalidrome(String input)
	{
		
		
		StringBuilder reserve=new StringBuilder();
		for(int i=input.length()-1;i>=0;i--)
		{
			reserve.append(input.charAt(i));
		}
		
		if(input.equalsIgnoreCase(reserve.toString()))
		{
		   return  true;
		}
		else
		{
			return false;
		}
			
			
	} */
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        int[] array = new int[30];
	        for (int i = 0; i < 30; i++) {
	            array[i] = Integer.parseInt(reader.readLine());
	        }

	        sort(array);
            
	        for(int i=0;i< array.length;i++) {
	        	System.out.println(array[i]);
	        }
	      //  System.out.println(array[9]);
	      //  System.out.println(array[10]);
	    }

	    public static void sort(int[] array) {
	        //write your code here
	        int  temp;
	        for(int i=0;i<array.length;i++){
	            for(int j=i+1;j<array.length;j++){
	                if(array[i] > array[j]){
	                    temp=array[i];
	                    array[i] =array[j];
	                    array[j]=temp;
	                }
	            }
	        }
	        
	    }
	  	 
 }

