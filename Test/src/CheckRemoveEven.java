
public class CheckRemoveEven {

	private static int[] newArrs;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1, 2, 4, 5, 10, 6, 3};
   
		int[] oddOnly = removeEven(arr);
		 for(int j=0;j <oddOnly.length; j++) {
			 System.out.println(oddOnly[j]);
		 }
		
	}
	
	public static int[] removeEven(int[] arr) {
        
        int count=0;
		// Write - Your - Code- Here
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 != 0) {
				//newArrs[count] = arr[i];
				count++;
			}
			
		}
		
		newArrs = new int[count];
		 count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 != 0) {
				newArrs[count] = arr[i];
				count++;
			}
			
		}
		
		
		return newArrs; // change this and return the correct result array
	}

}
