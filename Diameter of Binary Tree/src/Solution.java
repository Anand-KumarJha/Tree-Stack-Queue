class Solution{
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        traverseDiameter(root);
        return ans;
    }

    public int traverseDiameter(TreeNode root){
        if(root == null)return 0;

        int left = traverseDiameter(root.left);
        int right = traverseDiameter(root.right);

        ans = Math.max(ans, right + left);
        return 1 + Math.max(right, left);

    }
}