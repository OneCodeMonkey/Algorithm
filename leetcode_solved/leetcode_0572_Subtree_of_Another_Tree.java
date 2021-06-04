// AC: Runtime: 3 ms, faster than 97.30% of Java online submissions for Subtree of Another Tree.
// Memory Usage: 38.8 MB, less than 91.41% of Java online submissions for Subtree of Another Tree.
// recursively judge whether two trees are same.
// T:O(n), S:O(1)
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (isSameTree(root, subRoot)) {
            return true;
        }
        if (root.left != null) {
            if (isSubtree(root.left, subRoot)) {
                return true;
            }
        }
        if (root.right != null) {
            if (isSubtree(root.right, subRoot)) {
                return true;
            }
        }

        return false;
    }

    private boolean isSameTree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 != null && root2 != null) {
            if (root1.val != root2.val) {
                return false;
            }
            return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
        }

        return false;
    }
}