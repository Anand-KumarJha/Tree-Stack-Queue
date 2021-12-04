class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }else if(p == null && q != null || q == null && p != null){
            return false;
        }else if(p.val != q.val){
            return false;
        }

        boolean a = isSameTree(p.right, q.right);
        boolean b = isSameTree(p.left, q.left);

        if(!a || !b){
            return false;
        }else{
            return true;
        }
    }
}