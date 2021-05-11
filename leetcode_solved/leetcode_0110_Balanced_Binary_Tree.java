// AC：
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Balanced Binary Tree.
// Memory Usage: 39 MB, less than 63.42% of Java online submissions for Balanced Binary Tree.
// 递归，先获取左右子树高度，再判断高度差是否小于 1， 然后再判断左右字数是否满足同样的条件。
// T:O(n), S:O(n^2), 极端情况会递归判断 n*(n+1)/2 次
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
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(getDepth(root.left, 1) - getDepth(root.right, 1)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int getDepth(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        if (root.left == null && root.right == null) {
            return depth + 1;
        } else if (root.left != null && root.right == null) {
            return getDepth(root.left, depth + 1);
        } else if (root.left == null) {
            return getDepth(root.right, depth + 1);
        } else {
            return Math.max(getDepth(root.left, depth + 1), getDepth(root.right, depth + 1));
        }
    }
}
