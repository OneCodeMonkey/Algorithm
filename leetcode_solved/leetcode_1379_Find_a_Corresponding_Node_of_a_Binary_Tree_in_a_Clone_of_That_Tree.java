// AC: Runtime: 1 ms, faster than 97.93% of Java online submissions for Find a Corresponding Node of a Binary Tree in a Clone of That Tree.
// Memory Usage: 47.1 MB, less than 26.58% of Java online submissions for Find a Corresponding Node of a Binary Tree in a Clone of That Tree.
// just search in the tree directly, both dfs and bfs are ok.
// T:O(n), S:O(1)
// 
class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return binarySearch(cloned, target.val);
    }

    private TreeNode binarySearch(TreeNode root, int target) {
        if (root == null) {
            return null;
        }
        if (root.val == target) {
            return root;
        }

        TreeNode leftAns = binarySearch(root.left, target);
        return leftAns == null ? binarySearch(root.right, target) : leftAns;
    }
}