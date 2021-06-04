// AC: Runtime: 1 ms, faster than 48.44% of Java online submissions for Minimum Absolute Difference in BST.
// Memory Usage: 39.5 MB, less than 21.49% of Java online submissions for Minimum Absolute Difference in BST.
// in-order travel and compare diff between adjacent two elem.
// T:O(n), S:O(n)
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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> record = new ArrayList<>();
        inOrderTraversal(root, record);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < record.size(); i++) {
            int diff = record.get(i) - record.get(i - 1);
            if (diff < min) {
                min = diff;
            }
        }
        return min;
    }

    private void inOrderTraversal(TreeNode root, List<Integer> out) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inOrderTraversal(root.left, out);
        }
        out.add(root.val);
        if (root.right != null) {
            inOrderTraversal(root.right, out);
        }
    }
}