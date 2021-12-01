public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] a = new int[]{-10,-3,0,5,9};
        TreeNode head = solution.sortedArrayToBST(a);
        traverse(head);
    }
    public static void traverse(TreeNode head){
        if(head == null)return;
        System.out.println(head.val);
        traverse(head.left);
        traverse(head.right);
    }
}
