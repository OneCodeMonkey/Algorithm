// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Difference Between Node and Ancestor.
// Memory Usage: 42.3 MB, less than 5.11% of Java online submissions for Maximum Difference Between Node and Ancestor.
// recursion
// T:O(n), S:O(1)
// 
class Solution {
    int ret = 0;
    public int maxAncestorDiff(TreeNode root) {
        solve(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return ret;
    }

    private void solve(TreeNode root, int max, int min) {
        if (root == null) {
            return;
        }
        max = Math.max(max, root.val);
        min = Math.min(min, root.val);
        ret = Math.max(ret, max - min);
        solve(root.left, max, min);
        solve(root.right, max, min);
    }
}