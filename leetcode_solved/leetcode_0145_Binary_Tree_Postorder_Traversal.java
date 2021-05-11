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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new LinkedList<>();
        postorderTraversalSolve(root, ret);
        return ret;
    }

    private void postorderTraversalSolve(TreeNode root, List<Integer> out) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            postorderTraversalSolve(root.left, out);
        }
        if (root.right != null) {
            postorderTraversalSolve(root.right, out);
        }
        out.add(root.val);
    }
}