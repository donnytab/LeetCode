import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PathSum2 {
	List<List<Integer>> resultList;
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int value) {val = value;}
	}
	
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		resultList = new ArrayList<List<Integer>>();
		if(root == null) return resultList;
		
		Stack<Integer> pathStack = new Stack<Integer>();
		sumHelper(root, sum, pathStack);
		return resultList;
	}

	public void sumHelper(TreeNode root, int sum, Stack<Integer> pathStack) {
		pathStack.push(root.val);
		
		if(root.left == null && root.right == null && sum - root.val == 0) {
			List<Integer> pathList = new ArrayList<Integer>(pathStack);
			resultList.add(pathList);
		}
		
		if(root.left != null) sumHelper(root.left, sum - root.left.val, pathStack);
		if(root.right != null) sumHelper(root.right, sum - root.right.val, pathStack);
		
		// To restore stack status
		pathStack.pop();
	}
}
