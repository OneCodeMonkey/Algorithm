// AC: Runtime: 21 ms, faster than 13.85% of Java online submissions for Construct String from Binary Tree.
// Memory Usage: 69.4 MB, less than 5.28% of Java online submissions for Construct String from Binary Tree.
// in-order traversal.
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
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }
        if (root.left == null && root.right == null) {
            return String.valueOf(root.val);
        }
        StringBuilder ret = new StringBuilder();
        ret.append(root.val);
        if (root.left != null) {
            ret.append("(");
            ret.append(tree2str(root.left));
            ret.append(")");
        } else {
            ret.append("()");
        }
        if (root.right != null) {
            ret.append("(");
            ret.append(tree2str(root.right));
            ret.append(")");
        }

        return ret.toString();
    }
}