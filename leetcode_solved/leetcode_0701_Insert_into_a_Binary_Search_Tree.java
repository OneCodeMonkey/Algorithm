// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Insert into a Binary Search Tree.
// Memory Usage: 39.6 MB, less than 74.46% of Java online submissions for Insert into a Binary Search Tree.
// recursively binary search and insert
// T:O(logn), S:O(1)
// 
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            TreeNode temp = new TreeNode();
            temp.val = val;
            return temp;
        }

        solve(root, val);

        return root;
    }

    private void solve(TreeNode root, int val) {
        if (root.val > val) {
            if (root.left == null) {
                TreeNode temp = new TreeNode();
                temp.val = val;
                root.left = temp;
            } else {
                solve(root.left, val);
            }
        } else {
            if (root.right == null) {
                TreeNode temp = new TreeNode();
                temp.val = val;
                root.right = temp;
            } else {
                solve(root.right, val);
            }
        }
    }
}