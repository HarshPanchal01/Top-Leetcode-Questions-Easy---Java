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

public class Convert_Arr_BST {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return constructTreeNodeFromArray(nums, 0, nums.length-1); // pass to recursive function
    }

    public static TreeNode constructTreeNodeFromArray(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int midpoint = left + (right - left) / 2; // get the midpoint
        TreeNode node = new TreeNode(nums[midpoint]); // set the root at the midpoint in the array
        node.left = constructTreeNodeFromArray(nums, left, midpoint-1); // recursively make left nodes from left to midpoint
        node.right = constructTreeNodeFromArray(nums, midpoint+1, right); // recursively make right nodes from midpoint to right
        return node;
    }
    public static void main(String[] args) {
        int nums[] = {-10,-3,0,5,9};

        System.out.println(sortedArrayToBST(nums));
    }
}