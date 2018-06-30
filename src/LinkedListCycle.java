/*
 Given a linked list, determine if it has a cycle in it.
 */
public class LinkedListCycle {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int value) {val = value; next = null;}
	}
	
	public boolean hasCycle(ListNode head) {
		if(head == null) {
			return false;
		}
		
		ListNode fast = head, slow = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow.val == fast.val) {
				return true;
			}
		}
		return false;
	}
}
