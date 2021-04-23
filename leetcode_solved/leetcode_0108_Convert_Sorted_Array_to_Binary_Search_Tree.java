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
// 平衡二叉树：任意一个节点的左右子树的高度差不超过 1.
// AC：
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Sorted Array to Binary Search Tree.
// Memory Usage: 38.4 MB, less than 94.35% of Java online submissions for Convert Sorted Array to Binary Search Tree.
// 复杂度：T：O（logn), S:O(logn)，此处是递归调用栈占用的内存空间。
//
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int size = nums.length;

        return sortedArrayToBST(nums, 0, size - 1);
    }
    private TreeNode sortedArrayToBST(int[] nums, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, low, mid - 1);
        node.right = sortedArrayToBST(nums, mid + 1, high);
        return node;
    }
}