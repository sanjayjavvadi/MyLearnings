
public class FirstNonUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {5,7,7,5,9,9};
		
		System.out.println(findFirstUnique(arr));
	}
	
	 public static int findFirstUnique(int[] arr) {
		    //Inside Inner Loop Check Each index of outerLoop If it's repeated in array
		    //If it's not repeated then return this as first unique Integer
		    boolean isRepeated = false;

		    for (int i = 0; i < arr.length; i++) {

		      for (int j = 0; j < arr.length; j++) {

		        if (arr[i] == arr[j] && i != j) {
		          isRepeated = true;
		          break;
		        }
		      } //end of InnerLoop

		      if (isRepeated == false) {
		        return arr[i];
		      }
		      else {
		        isRepeated = false;
		      }
		    
		    } //end of OuterLoop
		    return - 1;
		  }

}
