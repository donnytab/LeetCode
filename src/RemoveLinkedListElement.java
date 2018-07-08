
public class RemoveLinkedListElement {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int value){val = value;}
	}
	
	public ListNode removeElement(ListNode head, int val) {
		ListNode temp = head;
		if(temp == null) return head;
		
		while(temp.next != null) {
			if(temp.next.val == val) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}
		
		return head.val == val ? head.next : head;
	}
}
