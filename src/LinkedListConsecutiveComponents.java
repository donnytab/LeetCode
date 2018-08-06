import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LinkedListConsecutiveComponents {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }

	public int numComponents(ListNode head, int[] G) {
		Set<Integer> set = new HashSet<>();
		for(int i : G) set.add(i);
		int count = 0;
		while(head != null) {
			if(set.contains(head.val) && (head.next == null || !set.contains(head.next.val))) count++;
			head = head.next;
		}
		return count;
	}
}
