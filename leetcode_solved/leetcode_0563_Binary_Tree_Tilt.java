// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Tilt.
// Memory Usage: 38.6 MB, less than 87.44% of Java online submissions for Binary Tree Tilt.
// pre-order travel and record diff sum.
// T:O(n), S:o(1)
// 
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
    public int findTilt(TreeNode root) {
        int[] ret = new int[1];
        preOrderTravelSolve(root, ret);
        return ret[0];
    }

    private int preOrderTravelSolve(TreeNode root, int[] ret) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.val;
        }
        int left = 0, right = 0;
        if (root.left != null) {
            left = preOrderTravelSolve(root.left, ret);
        }
        if (root.right != null) {
            right = preOrderTravelSolve(root.right, ret);
        }
        ret[0] += Math.abs(left - right);
        return root.val + left + right;
    }
}