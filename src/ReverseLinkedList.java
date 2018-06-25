
public class ReverseLinkedList {
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	
	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		ListNode prev = null, current = head;
		
		while(current != null && current.next != null) {
			prev = current.next;
			current.next = current.next.next;
			prev.next = head;
			head = prev;
		}
		return head;
	}
}
