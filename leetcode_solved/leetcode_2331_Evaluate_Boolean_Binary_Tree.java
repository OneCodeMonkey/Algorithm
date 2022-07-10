// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Evaluate Boolean Binary Tree.
// Memory Usage: 47.3 MB, less than 14.29% of Java online submissions for Evaluate Boolean Binary Tree.
// recursion
// T:O(n), S:O(logn)
// 
class Solution {
    public boolean evaluateTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return root.val == 1;
        }

        if (root.val == 2) {
            return evaluateTree(root.left) || evaluateTree(root.right);
        } else {
            return evaluateTree(root.left) && evaluateTree(root.right);
        }
    }
}