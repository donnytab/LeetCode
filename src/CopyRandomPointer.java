import java.util.HashMap;

public class CopyRandomPointer {
	class RandomListNode {
		int label;
		RandomListNode next, random;
		RandomListNode(int x) {this.label = x;}
	}
	
	public RandomListNode copyRandomList(RandomListNode head) {
		if(head == null) return head;
		HashMap<RandomListNode, RandomListNode> hashmap = new HashMap<>();
		RandomListNode temp = head;
		
		while(temp != null) {
			hashmap.put(temp, new RandomListNode(temp.label)); // deep copy
			temp = temp.next;
		}
		
		temp = head;
		while(temp != null) {
			hashmap.get(temp).next = hashmap.get(temp.next);
			hashmap.get(temp).random = hashmap.get(temp.random);
			temp = temp.next;
		}
		return hashmap.get(head);
	}
}
