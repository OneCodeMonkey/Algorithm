// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Increasing Order Search Tree.
// Memory Usage: 36.6 MB, less than 28.64% of Java online submissions for Increasing Order Search Tree.
// inorder traversal and rearrange
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
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> record = new LinkedList<>();
        inorderTraversal(root, record);
        for (int i = 0; i < record.size() - 1; i++) {
            record.get(i).left = null;
            record.get(i).right = record.get(i + 1);
        }
        record.get(record.size() - 1).left = null;
        record.get(record.size() - 1).right = null;

        return record.get(0);
    }

    private void inorderTraversal(TreeNode root, List<TreeNode> out) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            out.add(root);
        } else {
            inorderTraversal(root.left, out);
            out.add(root);
            inorderTraversal(root.right, out);
        }
    }
}