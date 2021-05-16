// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Kth Smallest Element in a BST.
// Memory Usage: 38.6 MB, less than 74.81% of Java online submissions for Kth Smallest Element in a BST.
// inorder traversal.
// T:O(k), S:O(k)
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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ret = new LinkedList<>();
        inorderTraversalWithK(root, ret, k);
        return ret.get(k - 1);
    }

    private void inorderTraversalWithK(TreeNode root, List<Integer> out, int k) {
        if (root == null || out.size() >= k) {
            return;
        }
        if (root.left == null && root.right == null) {
            out.add(root.val);
        } else {
            inorderTraversalWithK(root.left, out, k);
            out.add(root.val);
            inorderTraversalWithK(root.right, out, k);
        }
    }
}