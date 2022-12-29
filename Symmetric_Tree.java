class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Symmetric_Tree {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return check(root.left, root.right); // call function to check
    }
    public static boolean check(TreeNode left, TreeNode right) {
        if (left == null || right == null) { // if one of them ends check if they equal at last point
            return left == right;
        }
        if (left.val != right.val) { // if they dont equal
            return false;
        }
        return check(left.left, right.right) && check(left.right, right.left); // recursively check through
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(isSymmetric(root));
    }    
}
