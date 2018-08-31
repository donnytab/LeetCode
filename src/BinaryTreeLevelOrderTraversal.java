import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {val =x;}
	}
	
	// BFS solution
	public List<List<Integer>> levelOrderBFS(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		levelHelper(list, root, 0);
		return list;
	}
	
	public void levelHelper(List<List<Integer>> list, TreeNode root, int height) {
		if(root == null) return;
		if(height>=list.size()) {
			list.add(new LinkedList<Integer>());
		}
		list.get(height).add(root.val);
		levelHelper(list, root.left, height+1);
		levelHelper(list, root.right, height+1);
	}
}
