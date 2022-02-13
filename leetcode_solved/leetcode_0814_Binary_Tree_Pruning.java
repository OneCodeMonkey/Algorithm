// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Pruning.
// Memory Usage: 40 MB, less than 21.28% of Java online submissions for Binary Tree Pruning.
// recursion.
// T:O(n), S:O(logn), logn is the recursion cost by system runtime.
// 
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null && root.val != 1)) {
            return null;
        }

        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.val != 1 && root.left == null && root.right == null) {
            return null;
        }

        return root;
    }
}