// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Add One Row to Tree.
// Memory Usage: 41.7 MB, less than 70.71% of Java online submissions for Add One Row to Tree.
// recursion.
// T:O(n), S:O(logn), logn is recursion cost by runtime.
// 
class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;

            return newRoot;
        }
        levelOrderTraversal(root, val, depth, 1);

        return root;
    }

    private void levelOrderTraversal(TreeNode root, int val, int targetDepth, int curDepth) {
        if (root == null) {
            return;
        }
        if (curDepth == targetDepth - 1) {
            TreeNode newLeft = new TreeNode(val), newRight = new TreeNode(val);
            newLeft.left = root.left;
            newRight.right = root.right;
            root.left = newLeft;
            root.right = newRight;
        }
        levelOrderTraversal(root.left, val, targetDepth, curDepth + 1);
        levelOrderTraversal(root.right, val, targetDepth, curDepth + 1);
    }
}