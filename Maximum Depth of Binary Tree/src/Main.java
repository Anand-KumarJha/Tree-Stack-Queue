public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3,t1,null);
        TreeNode t3 = new TreeNode(4,null,t2);
        TreeNode t4 = new TreeNode(5,t2,null);
        TreeNode t5 = new TreeNode(2,t4,t3);

        System.out.println(solution.maxDepth(t5));
    }
}
