package Basic;

import java.util.List;

public class MaxDepthOfNaryTree {
	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val,List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	};
	
	private int max = 0;
	public int maxDepth(Node root) {
		if(root == null) return 0;
		dfs(root, 1);
		return max;
	}
	
	private void dfs(Node root, int height) {
		if(root == null) return;
		max = height > max ? height : max;
		for(Node subRoot : root.children) {
			dfs(subRoot, height+1);
		}
	}
}
