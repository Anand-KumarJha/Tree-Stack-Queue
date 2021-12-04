class Solution {
    int count = Integer.MAX_VALUE;
    public int maxDepth(TreeNode root) {
        if(root == null)return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(right, left);
    }
} 