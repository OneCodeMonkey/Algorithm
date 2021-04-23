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
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Sum of BST.
// Memory Usage: 46.9 MB, less than 77.47% of Java online submissions for Range Sum of BST.
// 思路：递归
// 复杂度：T:O(logn), S:O(logn), logn 是函数递归调用占用空间
// 
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        return rangeSumBSTSolve(root, low, high, sum);
    }

    private int rangeSumBSTSolve(TreeNode root, int low, int high, int tempSum)
    {
        if (root == null) {
            return tempSum;
        }
        if (root.val < low) {
            return tempSum + rangeSumBSTSolve(root.right, low, high, tempSum);
        }
        if (root.val > high) {
            return tempSum + rangeSumBSTSolve(root.left, low, high, tempSum);
        }
        return tempSum + root.val + rangeSumBSTSolve(root.left, low, high, tempSum) + rangeSumBSTSolve(root.right, low, high, tempSum);
    }
}