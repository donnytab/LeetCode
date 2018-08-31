import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
	
	// Queue solution
	public List<List<Integer>> levelOrderQueue(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		List<List<Integer>> resultList = new LinkedList<List<Integer>>();
		
		if(root==null) return resultList;
		
		queue.offer(root);
		while(!queue.isEmpty()){
			int levelNum = queue.size();
			List<Integer> subList = new LinkedList<>();
			for(int i=0; i<levelNum; i++) {
				if(queue.peek().left != null) queue.offer(queue.peek().left);
				if(queue.peek().right != null) queue.offer(queue.peek().right);
				subList.add(queue.poll().val);
			}
			resultList.add(subList);
		}
		return resultList;
	}
}
