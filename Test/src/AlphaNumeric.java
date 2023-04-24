public class AlphaNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = new char[]{'1','2','a','b'};
		
	
		
	/*	Pattern pattern = Pattern.compile("\\d+");
	
	
			Stream.of(ch).map(pattern::matcher)
            .filter(Matcher::find)  .collect(Collectors.toList()); */
		
		
	    	
	String.valueOf(ch).chars().filter(n ->  Character.isDigit((char)n)).forEach(n ->  System.out.print((char)n));
		
	}
	
	

}
