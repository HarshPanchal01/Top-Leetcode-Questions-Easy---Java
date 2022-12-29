import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

public class Binary_Tree_Inorder {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>(); // create list and stack
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root; // create variable to hold current node

        while (currentNode != null || !stack.empty()) { // while it isnt null or while the stack is not emtpy
            if (currentNode != null) { // while its not null push val into stack and go left
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            else { // otherwise pop that value from stack and add to list and go to the right
                currentNode = stack.pop();
                list.add(currentNode.val);
                currentNode = currentNode.right;
            }
        }

        return list; // return list
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(inorderTraversal(root));
    }
}