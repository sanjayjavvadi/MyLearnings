package educative;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		sortArray(new int[] {34,56,78,11,4,67,75},7);
		
	}
	
	
	public static void sortArray(int[] array, int n) {
	    // Write your code here
	    if(n == 1){
           return;
	    }
	    else{
	    	  for(int i=0;i< array.length ;i++) {
	    		  swap(i, array);
	    		 
	    	  }
	    	  
	    	  for(int i : array) {
	    		  System.out.println(i);
	    	  }
	    	    
	    }

	   
	  }

	public static void swap(int a, int[] array) {
		int temp;
		for(int i=0 ;i< array.length ; i++) {
			if(array[a] < array[i]) {
				temp = array[i] ;
				array[i] = array[a] ;	
				array[a] = temp ;
			    
			}
		}
		
		
		
	}
}
