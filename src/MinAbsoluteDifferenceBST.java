
public class MinAbsoluteDifferenceBST {
	int minDiff = Integer.MAX_VALUE;
	TreeNode prev;
	
	public class TreeNode {
		TreeNode left;
		TreeNode right;
		int val;
		TreeNode(){}
	}
	public int getMinimumDifference(TreeNode root) {
		inorder(root);
		return minDiff;
	}
	
	public void inorder(TreeNode node){
		if(node == null) return;
		inorder(node.left);
		if(prev != null)
			minDiff = Math.min(minDiff, prev.val - node.val);
		prev = node;
		inorder(node.right);
	}
}
