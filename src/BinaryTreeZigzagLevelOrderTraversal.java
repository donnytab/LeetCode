import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {val = x;}
	}
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> ret = new ArrayList<>();
		helper(root, ret, 0);
		return ret;
	}
	
	public void helper(TreeNode node, List<List<Integer>> list, int level) {
		if(node == null)
			return;
		if(list.size() <= level) {
			List<Integer> temp = new ArrayList<>();
			list.add(temp);
		}
		List<Integer> levelList = list.get(level);
		if((level & 1) == 1) 
			levelList.add(node.val);
		else
			levelList.add(0,node.val);
		helper(node.left, list, level+1);
		helper(node.right, list, level+1);
	}
}
