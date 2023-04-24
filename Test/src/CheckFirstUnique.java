
public class CheckFirstUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static int findFirstUnique(int[] arr) {
		 boolean isReapted = false;
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 for(int j=0;j<arr.length;j++) {
				 
				 if(arr[i]==arr[j] && i!=j) {
					 isReapted= true;
					 break;
				 }
			 }
		 }
	 }

}
