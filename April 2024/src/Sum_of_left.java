import javax.swing.tree.TreeNode;

public class Sum_of_left  {
    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int sumOfLeftLeaves(TreeNode A) {
        if(A==null){
            return 0 ;
        }
        int count = 0;
        if(A.left != null && A.left.left==null && A.left.right==null){
            count+=A.left.val;
        }
        count+=sumOfLeftLeaves(A.left);
        count+=sumOfLeftLeaves(A.right);
        return count;
    }
}
