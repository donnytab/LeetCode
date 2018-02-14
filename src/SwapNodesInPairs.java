public class SwapNodesInPairs {
	 public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	 }
	 
	 public ListNode swapPairs(ListNode head) {
		 ListNode fakeHead = new ListNode(-999);
		 fakeHead.next = head;
		 ListNode tail = fakeHead;
		 while(tail.next != null && tail.next.next != null) {
			 ListNode adjacentFirst = tail.next;
			 ListNode adjacentSecond = tail.next.next;
			 adjacentFirst.next = adjacentSecond.next;
			 tail.next = adjacentSecond;
			 tail.next.next = adjacentFirst;
			 tail = tail.next.next;
		 }
		 return fakeHead.next;
	 }
}
