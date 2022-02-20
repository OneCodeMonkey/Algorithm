// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Flip Equivalent Binary Trees.
// Memory Usage: 42 MB, less than 11.92% of Java online submissions for Flip Equivalent Binary Trees.
// recursion.
// T:O(2n), S:O(logn), logn is recursion cost by system runtime.
// 
class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 != null && root2 != null && root1.val == root2.val) {
            return (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right)) ||
                    (flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left));
        }

        return false;
    }
}