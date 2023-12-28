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

public class Diameter_of_Binary_Tree {

    static int max = 0; // global variable to hold maximum diameter

    public static int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root); // pass tree through maxDepth method to traverse and update max
        return max; // return the max diameter
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) { // if node is null
            return 0;
        }

        // recursive calls to calculate the left and right subtrees
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        max = Math.max(max, left + right); // update max with the max diameter encountered

        return Math.max(left, right) + 1; // return the maximum depth between the left and right subtrees plus 1
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        System.out.println(diameterOfBinaryTree(root));
    }
}
