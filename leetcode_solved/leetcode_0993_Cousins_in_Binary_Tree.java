// AC: Runtime: 1 ms, faster than 26.23% of Java online submissions for Cousins in Binary Tree.
// Memory Usage: 38.4 MB, less than 10.64% of Java online submissions for Cousins in Binary Tree.
// level-order traversal
// T:O(n), S:O(1)
// 
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        HashMap<Integer, Integer> record = new HashMap<>();
        int[] a = new int[2];
        levelOrderTraversal(root, 0, record, a, x, y);
        return a[0] != a[1] && record.get(x).equals(record.get(y));
    }

    private void levelOrderTraversal(TreeNode root, int depth, HashMap<Integer, Integer> out, int[] a, int x, int y) {
        if (root == null) {
            return;
        }
        out.put(root.val, depth);
        if (root.left != null) {
            if (root.left.val == x) {
                a[0] = root.val;
            }
            if (root.left.val == y) {
                a[1] = root.val;
            }
            levelOrderTraversal(root.left, depth + 1, out, a, x, y);
        }
        if (root.right != null) {
            if (root.right.val == x) {
                a[0] = root.val;
            }
            if (root.right.val == y) {
                a[1] = root.val;
            }
            levelOrderTraversal(root.right, depth + 1, out, a, x, y);
        }
    }
}