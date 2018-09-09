
public class MaxDepthOfBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int value) {val=value;}
	}
	public int maxDepth(TreeNode root) {
		if(root == null) return 0;
		return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
	}
}
