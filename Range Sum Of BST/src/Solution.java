class Solution {
    int count = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null)return 0;
        if(root.val <= high && root.val >= low){count += root.val;}
        rangeSumBST(root.left,low,high);
        rangeSumBST(root.right,low,high);

        return count;
    }
}