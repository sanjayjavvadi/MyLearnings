/**
 * 
 */

/**
 * @author yyy1z67
 *
 */
public class StringReserve {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str ="your code goes here";  
          
          int i=0;
          int j=0;
          
          char[] letters = str.toCharArray();
          while(j <= letters.length) {
        	 if(j==letters.length ||  letters[j] ==' ' ) {
        		 reserve(letters,i,j-1);
        		 i=j+1;
        	 }
        	 j++;
          }
        reserve(letters,0,str.length()-1);
        String strmodified =  new String(letters);
        System.out.println(strmodified);
	}
	
	private static void reserve(char[] letters ,int i,int j) {
		
		for(;i<=j;j--,i++) {
	    char temp = letters[i];
		letters[i]=letters[j];
		letters[j]=temp;
		}
	
	}

}
