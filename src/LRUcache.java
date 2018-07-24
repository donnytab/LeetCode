import java.util.HashMap;

public class LRUcache {
	HashMap<Integer, Node> map;
	int capacity, count;
	Node head, tail;
	
	public class Node {
		int key;
		int value;
		Node pre;
		Node next;
		Node(int k, int val) {key = k; value = val;}
	}
	
	public LRUcache(int capacity){
		this.capacity = capacity;
		map = new HashMap<>();
		head = new Node(0, 0);
		tail = new Node(0, 0);
		head.next = tail;
		tail.pre = head;
		head.pre = null;
		tail.next = null;
		count = 0;
	}
	
	public void deleteNode(Node node) {
		node.pre.next = node.next;
		node.next.pre = node.pre;
	}
	
	public void addToHead(Node node) {
		node.next = head.next;
		node.next.pre = node;
		node.pre = head;
		head.next = node;
	}
	
	public int get(int key) {
		if(map.get(key) != null) {
			Node node = map.get(key);
			int result = node.value;
			deleteNode(node);
			addToHead(node);
			return result;
		}
		return -1;
	}
	
	public void set(int key, int value) {
		if(map.get(key) != null) {
			Node node = map.get(key);
			deleteNode(node);
			addToHead(node);
		} else {
			Node node = new Node(key, value);
			map.put(key, node);
			if(count < capacity) {
				count++;
				addToHead(node);
			} else {
				map.remove(tail.pre.key);
				deleteNode(tail.pre);
				addToHead(node);
			}
		}
	}
}
/*
 LRUCache cache = new LRUCache( 2 );

cache.put(1, 1);
cache.put(2, 2);
cache.get(1);       // returns 1
cache.put(3, 3);    // evicts key 2
cache.get(2);       // returns -1 (not found)
cache.put(4, 4);    // evicts key 1
cache.get(1);       // returns -1 (not found)
cache.get(3);       // returns 3
cache.get(4);       // returns 4
 */
