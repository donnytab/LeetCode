public class RotateList {
	 public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	 }
	 
//    public ListNode rotateRight(ListNode head, int k) {
//        ListNode fakeHead = new ListNode(-999);
//        fakeHead.next = head;
//        ListNode tailFront = fakeHead;
//        ListNode tailBack = fakeHead;
//        ListNode dummy = fakeHead;
//        
//        int len=0;
//        while(dummy.next != null) {
//        	len++;
//        	dummy = dummy.next;
//        }
//        
//        while(k>=0) {
//        	tailFront.next = fakeHead.next;
//        	tailBack = tailBack.next;
//        	fakeHead = fakeHead.next;
//        	k--;
//        }
//    }
}
