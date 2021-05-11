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
// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
// Memory Usage: 39.2 MB, less than 12.82% of Java online submissions for Maximum Depth of Binary Tree.
// 思路：迭代判断即可
// 复杂度：T:O(n), S:O(logn), logn 为迭代的调用栈空间占用
// 
class Solution {
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    private int maxDepth(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        if (root.left == null && root.right == null) {
            return depth + 1;
        }
        if (root.left == null && root.right != null) {
            return maxDepth(root.right, depth + 1);
        }
        if (root.left != null && root.right == null) {
            return maxDepth(root.left, depth + 1);
        }

        return Math.max(maxDepth(root.left, depth + 1), maxDepth(root.right, depth + 1));
    }
}