// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Complete Tree Nodes.
// Memory Usage: 41.3 MB, less than 77.67% of Java online submissions for Count Complete Tree Nodes.
// 递归
// T:O(n), S:O(logn), logn 为函数调用递归栈占用
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
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 判断是一个叶节点
        // 由于是完全二叉树，所以 left == null 则必有 right == null，即这是一个叶节点。
        if (root.left == null) {
            return 1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}