/*
 Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 */
public class LinkedListCycleFindOrigin {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int value) {val = value; next = null;}
	}
	
	public ListNode detectCycle(ListNode head) {
		ListNode fast = head, slow = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow) {
				ListNode slow2 = head;
				while(slow2 != slow) {
					slow = slow.next;
					slow2 = slow2.next;
				}
				return slow;
			}
		}
		return null;
	}
}
