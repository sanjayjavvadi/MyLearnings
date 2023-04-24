
public class CheckMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]    {1, 2, 3, 4, 5};
		maxMin(arr);

	}
	
	 public static void maxMin(int[] arr) {
      
		 int[] newArray = new int[arr.length];
		 int k=0;
		 for(int i=0,j=arr.length-1;i < arr.length && j > 0 && k < arr.length ;i++,j--) {
			
		
			  newArray[k]= arr[j];
			 
			 
			 
			 if(k < arr.length-1) {
			 newArray[++k]=arr[i];
			 ++k;
		   }
		 }
		 
		 for(int z=0;z<newArray.length;z++) {
			 System.out.println(newArray[z]);
		 }
		   
	}

}
