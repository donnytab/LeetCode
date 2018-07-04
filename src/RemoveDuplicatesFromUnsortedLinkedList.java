// Merge Sort + Remove duplicates from sorted list
// (1) Merge sort
// (2) Get the middle node of linked list (fast, slow)
// (3) Remove node from sorted linked list
// (4) Add a node in front of a list
public class RemoveDuplicatesFromUnsortedLinkedList {
	static Node head = null;
	static class Node{
		int val;
		Node next;
		public Node(int value) {val = value;}
	}
	
	static Node sortedMerge(Node a, Node b){
		Node result = null;
		if(a == null) return b;
		if(b == null) return a;
		
		if(a.val <= b.val) {
			result = a;
			result.next = sortedMerge(a.next, b);
		} else {
			result = b;
			result.next = sortedMerge(a, b.next);
		}
		return result;
	}
	
	static Node mergeSort(Node h) {
		if(h == null || h.next == null) return h;
		Node middle = getMiddle(h);
		Node nextofmiddle = middle.next;
		
		middle.next = null;
		Node left = mergeSort(h);
		Node right = mergeSort(nextofmiddle);
		
		Node sortedList = sortedMerge(left, right);
		return sortedList;
	}
	
	
	// Get the middle of the linked list
	static Node getMiddle(Node h) {
		if(h == null) return h;
		Node fast = h.next;
		Node slow = h;
		
		while(fast != null) {
			fast = fast.next;
			if(fast != null) {
				slow = slow.next;
				fast = fast.next;
			}
		}
		return slow;
	}
	
	static void push(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
	}
	
	static void printList(Node head) {
		while(head != null) {
			System.out.println(head.val + " ");
			head = head.next;
		}
	}
	
	// Remove node from sorted linked list
	static Node removeNode(Node head) {
		if(head == null) return head;
		while(head != null && head.next != null) {
			if(head.val == head.next.val) {
				head.next = head.next.next;
			} else {
				head = head.next;
			}
		}
		return head;
	}
	
	public static void main(String[] args) {
		head = new Node(15);
		push(3);
		push(2);
		push(2);
		push(9);
		printList(head);
		System.out.println("");
		
		head = mergeSort(head);
		removeNode(head);
		printList(head);
;	}
}
