// Find the number of paths that sum to a given value.
// The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).

public class PathSum3 {
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int value) {
			val = value;
		}
	}
	
	public int pathSum(TreeNode root, int sum) {
		if(root == null) return 0;
		return countSum(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
	}
	
	public int countSum(TreeNode root, int sum) {
		int total = 0;
		if(root == null) {
			return 0;
		}
		if(sum == root.val) {
			total += 1;
		}
		
		return total + countSum(root.left, sum - root.val) + countSum(root.right, sum - root.val);
	}
}
