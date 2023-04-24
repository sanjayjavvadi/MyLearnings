package educative;

public class CheckMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = new int[] {3,56,78,31,67,89};
		maxMin(arr);
	}
	
	public static void maxMin(int[] arr) {
       int temp =0;
	   for(int i=0;i<arr.length;i++) {
		   temp = 0;
		   for(int j=i+1;j<arr.length;j++) {
			  if(arr[i]>arr[j]) {
				  temp =arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			  }
		   }
	    }
	   
	   for(int j=0;j<arr.length;j++) {
		   System.out.print(arr[j]+ " ");
	   }
	   
	   int lowerPoint=0;
	   int higherPoint= arr.length-1;
	   int [] arr1 = new int[arr.length];
	    
	   boolean highVal =true;
	   for(int i=0;i<arr.length;i++) {
		   if(highVal) {
			   arr1[i] = arr[higherPoint--];
			   highVal = false;
		   } else {
			   arr1[i] = arr[lowerPoint++];
			   highVal = true;
		   }
		  
	   }
	   System.out.println();
	   System.out.println("-----------");
	   for(int i=0;i<arr1.length;i++) {
		   System.out.print(arr1[i]+ " ");
	   }
	   
	  }

}
