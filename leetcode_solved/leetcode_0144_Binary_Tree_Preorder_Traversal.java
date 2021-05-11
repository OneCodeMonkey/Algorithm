// AC:
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new LinkedList<>();
        preorderTraversalSolve(root, ret);
        return ret;
    }

    private void preorderTraversalSolve(TreeNode root, List<Integer> out) {
        if (root == null) {
            return;
        }
        out.add(root.val);
        if (root.left != null) {
            preorderTraversalSolve(root.left, out);
        }
        if (root.right != null) {
            preorderTraversalSolve(root.right, out);
        }
    }
}