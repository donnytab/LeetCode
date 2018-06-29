public class RemoveDuplicateDistinct {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int value) {val = value;}
	}
	
	// Fast list & slow list solution
	public ListNode deleteDuplicateDistinct(ListNode head) {
		ListNode dummy = new ListNode(0), fast = head, slow = dummy;
		slow.next = fast;
		while(fast != null) {
			while(fast.next != null && fast.val == fast.next.val) {
				fast = fast.next;	// find the last node
			}
			
			if(slow.next != fast) {		// find duplicates
				slow.next = fast.next;	// remove duplicates
				fast = slow.next;		// reposition fast pointer
			} else {
				// No duplicates
				slow = slow.next;
				fast = fast.next;
			}
		}
		return dummy.next;
	}
}
