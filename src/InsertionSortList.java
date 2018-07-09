
public class InsertionSortList {
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int value) {
			val = value;
			next = null;
		}
	}
	
	public ListNode insertionSortList(ListNode head){
		ListNode helper=new ListNode(0);
	    ListNode pre=helper;
	    ListNode current=head;
	    while(current!=null) {
	        pre=helper;
	        while(pre.next!=null&&pre.next.val<current.val) {
	            pre=pre.next;
	        }
	        ListNode next=current.next;
	        current.next=pre.next;
	        pre.next=current;
	        current=next;
	    }
	    return helper.next;
	}
	}
}
