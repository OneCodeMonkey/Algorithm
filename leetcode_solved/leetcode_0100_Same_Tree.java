// Runtime 0 ms Beats 100.00% of users with Java
// Memory 36.22 MB Beats 100.00% of users with Java
// Recursion.
// T:O(n), S:O(1)
// 
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if ((p != null && q == null) || (p == null && q != null)) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
