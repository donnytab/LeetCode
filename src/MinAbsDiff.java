
public class MinAbsDiff {
	private int minDiff  = 0;
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {val = x;}
	}
	
	public int getMinimumDifference(TreeNode root) {
		minDiff = (root.left.val-root.val) > (root.right.val-root.val) ? (root.right.val - root.val) : (root.left.val-root.val);
		if(root.left != null) {
			getMinimumDifference(root.left);
		}
		
		if(root.right != null) {
			getMinimumDifference(root.right);
		}
		return minDiff;
	}
}
