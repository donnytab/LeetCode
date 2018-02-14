public class RemoveNthNodeFromEnd {
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	}
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode duplicatedList = head;
        while(head.next != null) {
        	size++;
        	head = head.next;
        }
//        head = duplicatedList;
        for(int i=0; i<size-n; i++) {
        	duplicatedList = duplicatedList.next;
        }
        if(duplicatedList.next.next != null) {
        	duplicatedList.next = duplicatedList.next.next;
        }
        else {
        	duplicatedList.next = null;
        }
        return duplicatedList;
    }
}
