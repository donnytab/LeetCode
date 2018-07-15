
public class ConstructStringFromBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int value) {val = value; left=right=null;}
	}
	
	public String tree2str(TreeNode t) {
		if(t == null) return "";
		if(t.left == null && t.right == null) {
			return Integer.toString(t.val);
		} else if(t.left != null && t.right == null) {
			return Integer.toString(t.val) + "("+ tree2str(t.left)+")";
		} else if(t.left == null && t.right != null) {
			return Integer.toString(t.val) + "()(" + tree2str(t.right) +")";
		} else {
		return Integer.toString(t.val) + "("+ tree2str(t.left)+")" 
				+ "(" + tree2str(t.right) +")";
		}
	}
	
	/*
	 // Simple recursive solution
	 public String tree2str(TreeNode t) {
        return t == null ? "" : t.val + (t.left != null ? "(" + tree2str(t.left) + ")" : t.right != null ? "()" : "")
                                      + (t.right != null ? "(" + tree2str(t.right) + ")" : "");
    }
	 */
}
