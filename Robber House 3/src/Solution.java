class Solution {
    int count = 0;
    int count1 = 0;

    public int rob(TreeNode root) {
        int[] robbed = robbing(root);
        return Math.max(robbed[0], robbed[1]);
    }

    public int[] robbing(TreeNode root){
        if(root == null)return new int[]{0,0};

        int[] left = robbing(root.left);
        int[] right = robbing(root.right);

        int rob = root.val + left[1] + right[1];
        int rob1 = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return new int[]{rob,rob1};
    }
}