
public class KthSmallestElementInBST {
	private int number = 0;
	private int count = 0;
	
	public int kthSmallest(TreeNode root, int k) {
		count = k;
		helper(root);
		return number;
	}
	
	public void helper(TreeNode n) {
		if(n.left != null) 
			helper(n.left);
		count--;
		if(count==0) {
			number = n.val;
			return;
		}
		if(n.right != null)
			helper(n.right);
	}
	
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
}
