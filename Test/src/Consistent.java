
public class Consistent {

	public static void main(String[] args) {
		int temp =0,tempmax=0;
		int max=0;
		
		int[] arr = new int[] {1,0,1,1,0,0,0,1,1,1,0};
		
		for(int i=0;i<arr.length;i++) {
			
			
			if(arr[i] == 1) {
				tempmax=tempmax+1;
				
			}
			else {
				if(tempmax > max) {
					max=tempmax;
				}
				tempmax=0;
			}
		}
       
		System.out.println(max);
	}

	
}
