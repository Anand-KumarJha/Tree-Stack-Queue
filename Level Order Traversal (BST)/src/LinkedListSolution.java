import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class LinkedListSolution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        levelHelper(list,root,0);
        return list;
    }

    public void levelHelper(List<List<Integer>> list, TreeNode root, int level){
        if(root==null)return;
        if(level >= list.size()){
            List<Integer> list1 = new LinkedList<>();
            list.add(list1);
        }
        list.get(level).add(root.val);
        levelHelper(list,root.left,level+1);
        levelHelper(list,root.right,level+1);
    }
}