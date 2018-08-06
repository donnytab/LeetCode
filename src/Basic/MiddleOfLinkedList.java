package Basic;

public class MiddleOfLinkedList {
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	  
	  public ListNode middleNode(ListNode head) {
		  ListNode fast = head, slow = head;
		  if(head == null) return head;
		  while(fast != null && fast.next != null) {
			  fast = fast.next.next;
			  slow = slow.next;
		  }
		  return slow;
	  }
}
