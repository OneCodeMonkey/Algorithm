// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Distribute Coins in Binary Tree.
// Memory Usage: 42.5 MB, less than 40.14% of Java online submissions for Distribute Coins in Binary Tree.
// recursion.
// T:O(n), S:O(logn), logn is recursion cost.
// 
class Solution {
    int ret = 0;

    public int distributeCoins(TreeNode root) {
        solve(root);
        return ret;
    }

    public int solve(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = solve(root.left), right = solve(root.right);
        ret += Math.abs(left) + Math.abs(right);
        return root.val + left + right - 1;
    }
}