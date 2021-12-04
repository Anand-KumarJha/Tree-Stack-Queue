public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        traverse(solution.bstFromPreorder(new int[]{8,5,1,7,10,12}));
    }

    public static void traverse(TreeNode node){
        if(node == null)return;
        System.out.println(node.val);
        traverse(node.left);
        traverse(node.right);
    }
}
