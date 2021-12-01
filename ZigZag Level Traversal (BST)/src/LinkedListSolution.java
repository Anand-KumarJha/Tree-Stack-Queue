import java.util.ArrayList;
import java.util.List;

class LinkedListSolution {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        traverse(list,root,0);
        return list;
    }

    public void traverse(List<List<Integer>> list,TreeNode root,int level){
        if(root == null)return;

        if(level >= list.size()){
            List<Integer> subList = new ArrayList<>();
            list.add(subList);
        }
        if(level%2==0){
            list.get(level).add(root.val);
        }else{
            list.get(level).add(0,root.val);
        }


        traverse(list,root.left,level+1);
        traverse(list,root.right,level+1);

    }
}