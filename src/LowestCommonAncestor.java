
public class LowestCommonAncestor {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int v) {val=v;}
	}
	
	public TreeNode getLCA(TreeNode root, TreeNode p, TreeNode q) {
		if(root==null || p==null || q==null) return root;
		TreeNode left = getLCA(root.left, p, q);
		TreeNode right = getLCA(root.right, p, q);
		return left==null ? right : (right==null? left : root);
	}
}
