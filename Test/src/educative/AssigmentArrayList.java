package educative;

import java.util.ArrayList;

public class AssigmentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(3);
		arr.add(2);
	//	arr.add(1,1);
		arr.set(1, 2);
		arr.add(3);
	//	arr.get(1);
	//	
	//	arr.add(3);
	//	arr.remove(1);
		
		System.out.print(arr);
}
}
