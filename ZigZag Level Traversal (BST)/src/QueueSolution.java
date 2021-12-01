import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueSolution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)return list;

        boolean isZigZag = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int count = queue.size();

            for(int i = 0; i < count; i++){
                TreeNode node = queue.poll();
                if(isZigZag){
                    level.add(0,node.val);
                }else{
                    level.add(node.val);
                }

                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }

            }
            list.add(level);
            isZigZag = !isZigZag;

        }return list;
    }
}
