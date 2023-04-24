
public class DollarInBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(dollarInBtw("Sanjay"));
	}
	
	public static String dollarInBtw(String str) {
		StringBuilder newstr = new StringBuilder();
		/*for(int i=0;i<str.length();i++) {
			newstr.append(str.charAt(i));
		    if(i< str.length()-1) {
			newstr.append("$");
		    }
			
		}
		return newstr.toString();
		*/
		
	/*	while(size<str.length()) {
			newstr.append(str.charAt(size));
			if(size<str.length()-1) {
			newstr.append("$");
			}
		size++;
		dollarInBtw(str,size);
		}
		
		return newstr.toString();
		*/
		
		if(str.length() <=1) {
			return str;
		}
		
		return str.charAt(0) +"$" + dollarInBtw(str.substring(1));
	}

}
