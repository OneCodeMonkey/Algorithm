// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Leaves With a Given Value.
// Memory Usage: 38.7 MB, less than 55.39% of Java online submissions for Delete Leaves With a Given Value.
// for every loop, check and delete leaves with target value, until there is no leaf deleted in one loop, and exit.
// T:O(n^2), S:O(logn)
// 
class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        int deleted = 0;
        do {
            // check root itself
            if (root.left == null && root.right == null) {
                if (root.val == target) {
                    return null;
                } else {
                    return root;
                }
            }

            // check root's subtrees and deleted target nodes.
            deleted = deleteTargetLeaf(root, target);
        } while (deleted > 0);

        return root;
    }

    private int deleteTargetLeaf(TreeNode root, int target) {
        if (root == null) {
            return 0;
        }
        int deleted = 0;

        if (root.left != null) {
            // check left subtree's leaves
            if (root.left.left == null && root.left.right == null) {
                if (root.left.val == target) {
                    root.left = null;
                    deleted++;
                }
            } else {
                deleted += deleteTargetLeaf(root.left, target);
            }
        }
        if (root.right != null) {
            // check right subtree's leaves
            if (root.right.left == null && root.right.right == null) {
                if (root.right.val == target) {
                    root.right = null;
                    deleted++;
                }
            } else {
                deleted += deleteTargetLeaf(root.right, target);
            }
        }

        return deleted;
    }
}