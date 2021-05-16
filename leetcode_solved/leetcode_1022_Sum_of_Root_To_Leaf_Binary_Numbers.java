// AC: Runtime: 2 ms, faster than 30.83% of Java online submissions for Sum of Root To Leaf Binary Numbers.
// Memory Usage: 38.7 MB, less than 26.15% of Java online submissions for Sum of Root To Leaf Binary Numbers.
// inorder traversal
// T:O(n), S:(n)
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
    public int sumRootToLeaf(TreeNode root) {
        int ret = 0;
        List<List<Integer>> record = new LinkedList<>();
        solve(root, new LinkedList<>(), record);
        for (List<Integer> row: record) {
            int num = 0, exp = 1;
            for (int i = row.size() - 1; i >= 0; i--) {
                num += row.get(i) * exp;
                exp *= 2;
            }
            ret += num;
        }

        return ret;
    }

    private void solve(TreeNode root, List<Integer> curPath, List<List<Integer>> out) {
        if (root == null) {
            return;
        }
        List<Integer> copy = new LinkedList<>(curPath);
        copy.add(root.val);
        if (root.left == null && root.right == null) {
            out.add(copy);
        } else {
            solve(root.left, copy, out);
            solve(root.right, copy, out);
        }
    }
}