package educative;

public class TwoPointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static void twoPointers(String s1){
        int left = 0;
        int right = s1.length()-1;
        while (left <= right){
           
            left = left + 1;
            right = right -1;
        }
    }

}
