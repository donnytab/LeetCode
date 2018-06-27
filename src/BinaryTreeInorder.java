import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorder {
	public class Node {
		int val;
		Node left;
		Node right;
		public Node(int value){val = value;}
	}
	
	public List<Integer> inorderTraversal(Node root) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<Node> stack = new Stack<Node>();
		Node current = root;
		
		while(current != null || !stack.empty()) {
			while(current != null) {
				stack.add(current);
				current = current.left;
			}
			
			current = stack.pop();
			list.add(current.val);
			current = current.right;
		}
		
		return list;
	}
}
