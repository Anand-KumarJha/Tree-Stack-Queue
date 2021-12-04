class Solution {
    int index = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length < 1){return null;}
        return helper(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public TreeNode helper(int[] preorder, int min, int max){

        if(index >= preorder.length || preorder[index] < min || preorder[index] > max){
            return null;
        }

        int val = preorder[index++];
        TreeNode node = new TreeNode(val);
        node.left = helper(preorder,min,val);
        node.right = helper(preorder,val,max);

        return node;
    }
}