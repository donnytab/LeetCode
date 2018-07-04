
public class MaxTreePathSum {
	int max;
	class Node {
		int val;
		Node left;
		Node right;
		Node(int value) {
			val=value;
			left = null;
			right = null;
		}
	}
	
	public int maxPathSum(Node root) {
		max = Integer.MIN_VALUE;
		sumBuilder(root);
		return max;
	}
	
	public int sumBuilder(Node root) {
		if(root == null)
			return 0;
		int left = Math.max(0, maxPathSum(root.left));
		int right = Math.max(0, maxPathSum(root.right));
		max = Math.max(max, root.val+left+right);
		return Math.max(left, right) + root.val;
	}
}
