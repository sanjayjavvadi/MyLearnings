public class ListNode {
     int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
 }