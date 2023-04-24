package educative;

public class Encode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encode("It is a beautiful day in the neighborhood.");
	}
	
	 public static void encode(String message) 
	   {
	      String encoded = message.toLowerCase();
	      
	     
	      encoded=	encoded.replace("a", "@");
	      encoded=	encoded.replace("A", "@");
	     
	      encoded=	encoded.replace("e", "#");
	      encoded=	encoded.replace("E", "@");
	     
	      encoded=	encoded.replace("i", "!");
	      encoded=encoded.replace("I", "!");
	     
	      encoded= encoded.replace("o", "&");
	      encoded= encoded.replace("O", "&");
	     
	      encoded= encoded.replace("u", "%");
	      encoded=	 encoded.replace("U", "%");





	      System.out.println(encoded);
	  }

}
