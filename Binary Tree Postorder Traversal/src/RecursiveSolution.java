import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecursiveSolution {
    List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null)return list;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);

        return list;
    }
}
