package educative;

public class SearchNode {

	
	  static class Node {
	      int value;
	      Node next;
	    };
	   
	    public static Object search(Node head, int num) {
	      // Write your code here
	      // Do not change the input parameters
	      // Change the return type of this function to "boolean"
	       Node temp = head;
	      
	       while(temp != null) {
	    	   System.out.print(temp.value);
	    	   if(temp.value == num) {
	    		   return true;
	    	   }
	    	   else {
	    		   temp = head.next; 
	    		   
	    	   }
	    	
	    	   
	       }
	       return false;
	       

	      
	    // To be modified according to your code should return "true" or "false"
	    } 
	public static void main(String[] args) {
		Node n = new Node();
		n.value=12;
		 
		Node n1 = new Node();
		n.value=23;
		
		Node n2 = new Node();
		n2.value = 34;
		
		n.next = n1;
		n1.next = n2;
		
		
		search(n,34);

	}

}
