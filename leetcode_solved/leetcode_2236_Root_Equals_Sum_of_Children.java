// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Root Equals Sum of Children.
// Memory Usage: 40.1 MB, less than 92.42% of Java online submissions for Root Equals Sum of Children.
// .
// T:O(1), S:O(1)
// 
class Solution {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}