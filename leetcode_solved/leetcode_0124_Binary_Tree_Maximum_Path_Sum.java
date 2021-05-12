/**
 * AC: T:O(logn) S:O(logn) (递归栈调用消耗)
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Maximum Path Sum.
 * Memory Usage: 40.5 MB, less than 92.68% of Java online submissions for Binary Tree Maximum Path Sum.
 *
 * 思路：树的原始递归,重点在于理解题意,一个子树要么直接贡献一条最大和路径,要么共享 root+max(左子树递归,右子树递归).用一个外部变量记录中间可能产生的最大值.
 */
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
	public int maxPathSum(TreeNode root) {
		int leftMax = maxPathSum1(root.left);
		int rightMax = maxPathSum1(rootright);

		return Math.max(leftMax, rightMax);
	}
    public int maxPathSum1(TreeNode root) {
        if (root == null) {
        	return 0;
        }
        if (root.left == null && root.right == null) {
        	return root.val;
        }
        int left = maxPathSum(root.left);
        int right = maxPathSum(root.right);
        return root.val + (left > right ? left : right);
    }
}