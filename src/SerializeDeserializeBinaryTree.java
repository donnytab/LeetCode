import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SerializeDeserializeBinaryTree {
	public class TreeNode {
		public TreeNode(int value) {
			val = value;
		}
		int val;
		TreeNode left;
		TreeNode right;
	}
	
	// Serialize Binary Tree
	public String serialize(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		buildString(root, sb);
        return sb.toString();
	}

	private void buildString(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("$").append(",");
        } else {
            sb.append(root.val).append(",");
            buildString(root.left, sb);
            buildString(root.right,sb);
        }
	}
	
	// Deserialize Binary Tree
    public TreeNode deserialize(String data) {
        Deque<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(",")));
        return buildTree(nodes);
    }
    
    private TreeNode buildTree(Deque<String> nodes) {
        String val = nodes.remove();
        if (val.equals("$")) return null;
        else {
            TreeNode node = new TreeNode(Integer.valueOf(val));
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }
    }
}
