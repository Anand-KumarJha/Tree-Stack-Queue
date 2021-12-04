import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution{

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null)return "X";

        String left = serialize(root.left);
        String right = serialize(root.right);
        return root.val + "," + left + "," + right;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(data.split(",")));
        return helper(queue);
    }

    public TreeNode helper(Queue<String> queue){
        String s = queue.poll();
        if(s.equals("X"))return null;
        TreeNode node = new TreeNode(Integer.valueOf(s));
        node.left = helper(queue);
        node.right = helper(queue);
        return node;
    }
}