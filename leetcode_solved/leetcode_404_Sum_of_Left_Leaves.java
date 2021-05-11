// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Left Leaves.
// Memory Usage: 36.5 MB, less than 88.94% of Java online submissions for Sum of Left Leaves.
// 递归
// T:O(n), S:O(logn), logn 为函数递归调用栈占用
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
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, 0);
    }
    private int sumOfLeftLeaves(TreeNode root, int sum) {
        if (root == null) {
            return sum;
        }
        if (root.left == null) {
            return sumOfLeftLeaves(root.right, sum);
        } else {
            // 左叶子节点
            if (root.left.left == null && root.left.right == null) {
                return root.left.val + sumOfLeftLeaves(root.right, sum);
            } else {
                return sumOfLeftLeaves(root.left, sum) + sumOfLeftLeaves(root.right, sum);
            }
        }
    }
}