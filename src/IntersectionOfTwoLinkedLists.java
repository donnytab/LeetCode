/*
 Write a program to find the node at which the intersection of two singly linked lists begins.
 A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
 B:     b1 → b2 → b3
 Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class IntersectionOfTwoLinkedLists {
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int value) {
			val = value;
			next = null;
		}
	}
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lengthA = getLength(headA);
		int lengthB = getLength(headB);
		
		// Move to the same starting point
		while(lengthA < lengthB) {
			headB = headB.next;
			lengthB--;
		}
		while(lengthA > lengthB) {
			headA = headA.next;
			lengthA--;
		}
		
		while(headA != headB) {
			headA = headA.next;
			headB = headB.next;
		}
		return headA;
	}
	
	private int getLength(ListNode head) {
		int length = 0;
		while(head != null) {
			length++;
			head = head.next;
		}
		return length;
	}
}
