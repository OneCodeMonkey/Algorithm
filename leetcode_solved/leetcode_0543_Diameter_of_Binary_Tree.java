// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Diameter of Binary Tree.
// Memory Usage: 38.9 MB, less than 67.84% of Java online submissions for Diameter of Binary Tree.
// recursive. remain the max depth of left child tree and right child tree, and max(left, right) + 1 return to upper parent node.
// T:O(n), S:O(logn)
//
class Solution {
    private int MAX_DIS = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        preOrderTraversal(root);
        return MAX_DIS;
    }

    private int preOrderTraversal(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        int left = 0, right = 0;
        if (root.left != null) {
            left = preOrderTraversal(root.left);
        }
        if (root.right != null) {
            right = preOrderTraversal(root.right);
        }

        MAX_DIS = Math.max(MAX_DIS, left + right);

        return Math.max(left, right) + 1;
    }
}