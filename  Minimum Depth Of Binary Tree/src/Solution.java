class Solution {
    public int minDepth(TreeNode root) {
        if(root == null)return 0;

        int depthLeft = minDepth(root.left);
        int depthRight = minDepth(root.right);

        if(depthLeft == 0 || depthRight == 0)return 1 + depthLeft + depthRight;
        return 1 + Math.min(depthLeft,depthRight);
    }
}