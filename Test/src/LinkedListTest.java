import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ListNode end = new ListNode(5);
       ListNode node1 = new ListNode(4,end);
       ListNode node2 = new ListNode(3,node1);
       ListNode node3 = new ListNode(2,node2);
       ListNode head = new ListNode(1, node3);

		
		
		
		ListNode dummyNode = new ListNode(0);
		dummyNode.next=head;
		while(dummyNode.next!=null) {
			
			dummyNode=dummyNode.next;
		//	System.out.println(dummyNode.getVal());
		}
		
		System.out.print(reverseList(head));
		
	    
	
		
	}

	 public static ListNode reverseList(ListNode head) {
	        
	       ListNode cur = head;
	       ListNode prev =null;
	        
	       while(cur !=null){
	        ListNode tempNode = cur.next;
	        cur.next=prev;
	        prev=cur;
	        cur=tempNode;
	       } 
	       return prev; 
	        
	    }
}
