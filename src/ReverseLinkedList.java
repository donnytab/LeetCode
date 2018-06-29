
public class ReverseLinkedList {
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	
	// Iteration solution
//	public ListNode reverseList(ListNode head) {
//		if(head == null || head.next == null) {
//			return head;
//		}
//		
//		ListNode prev = null, current = head;
//		
//		while(current != null && current.next != null) {
//			prev = current.next;
//			current.next = current.next.next;
//			prev.next = head;
//			head = prev;
//		}
//		return head;
//	}
	 
	 public ListNode reverseList(ListNode head) {
		 ListNode currentNode = head, nextNode = null, prevNode = null;
		 while(currentNode != null) {
			 nextNode = currentNode.next;
			 currentNode.next = prevNode;
			 prevNode = currentNode;
			 currentNode = nextNode;
		 }
		 head = prevNode;
		 return head;
	 }
	
	// Recursion solution
	/*
	 public ListNode reverseList(ListNode head) {
	 	return reverseListInt(head, null);
	 }
	 
	 public ListNode reverseListInt(ListNode head, ListNode newHead) {
	 	if(head == null) {
	 		return newHead;
	 	}
	 	ListNode next = head.next;
	 	head.next = newHead;
	 	return reverseListInt(next, head);
	 }
	 */
}
