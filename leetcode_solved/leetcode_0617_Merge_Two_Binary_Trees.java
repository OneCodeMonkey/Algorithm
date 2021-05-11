// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Binary Trees.
// Memory Usage: 39 MB, less than 78.66% of Java online submissions for Merge Two Binary Trees.
// 思路：递归
// 复杂度：T:O(n), S:O(logn), logn 是函数递归调用栈占用空间
// 
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1, root2);
    }
    private TreeNode merge(TreeNode t1, TreeNode t2) {
        TreeNode newTreeNode = new TreeNode();
        if (t1 == null && t2 == null) {
            return null;
        }
        if (t1 == null) {
            newTreeNode = t2;
        } else if (t2 == null) {
            newTreeNode = t1;
        } else {
            newTreeNode.val = t1.val + t2.val;
            newTreeNode.left = mergeTrees(t1.left, t2.left);
            newTreeNode.right = mergeTrees(t1.right, t2.right);
        }

        return newTreeNode;
    }
}