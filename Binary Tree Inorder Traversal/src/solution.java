import java.util.ArrayList;
import java.util.List;

//   Definition for a binary tree node.
class TreeNode {
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

public class solution {
    List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        inorderHelper(root);
        return this.result;
    }

    private void inorderHelper(TreeNode root) {
        if (root == null) {
            return;
        }
        this.inorderHelper(root.left);
        result.add(root.val);
        this.inorderHelper(root.right);
    }
}