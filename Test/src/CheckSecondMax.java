
public class CheckSecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {9,2,3,6};
		
		int[] result=  findSecondMaximum(arr);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}

	}

	 public static int[] findSecondMaximum(int[] arr)
	  {
		 int temp=0;
	    for(int i=0;i< arr.length;i++) {
	    	
	    	for(int j=0;j<arr.length;j++) {
	    			 
	    		if(arr[j] > arr[i] && i!=j) {
	    			temp= arr[j];
	    			arr[i]=arr[j];
	    			arr[j]=temp;
	    		}
	    	}
	    }
		 
	    return arr;
	  }
 }

