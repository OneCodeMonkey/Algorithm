// AC:
// Runtime: 5 ms, faster than 59.38% of Java online submissions for Minimum Depth of Binary Tree.
// Memory Usage: 60.1 MB, less than 42.60% of Java online submissions for Minimum Depth of Binary Tree.
// 递归
// T:O(n), S:O(logn), logn 为函数递归栈调用
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
    public int minDepth(TreeNode root) {
        // curMin 给一个无限大无法超过的深度数值即可，
        return minDepth(root, 0, 99999999);
    }
    private int minDepth(TreeNode root, int depth, int curMin) {
        if (root == null) {
            return depth;
        }
        // 叶子节点
        if (root.left == null && root.right == null) {
            return Math.min(curMin, depth + 1);
        } else if (root.left == null) {
            return minDepth(root.right, depth + 1, curMin);
        } else if (root.right == null) {
            return minDepth(root.left, depth + 1, curMin);
        } else {
            return Math.min(minDepth(root.right, depth + 1, curMin), minDepth(root.left, depth + 1, curMin));
        }
    }
}