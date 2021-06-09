// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Univalued Binary Tree.
// Memory Usage: 36.2 MB, less than 82.04% of Java online submissions for Univalued Binary Tree.
// recursively.
// T:O(n), S:O(1)
//
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        
        if (root.left != null) {
            if (root.val != root.left.val) {
                return false;
            }
        }
        if (root.right != null) {
            if (root.val != root.right.val) {
                return false;
            }
        }

        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}