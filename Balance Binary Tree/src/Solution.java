class Solution {
    public boolean isBalanced(TreeNode root) {
        return traverse(root) >= 0;
    }

    public int traverse(TreeNode root){
        if(root == null)return 0;


        int right = traverse(root.right);
        int left = traverse(root.left);

        if(right == left || right == left + 1 || left == right + 1){
            return 1+Math.max(right,left);
        }else{
            return Integer.MIN_VALUE;
        }

    }
}