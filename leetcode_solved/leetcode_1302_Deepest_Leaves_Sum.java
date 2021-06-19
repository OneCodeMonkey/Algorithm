// AC: Runtime: 2 ms, faster than 53.20% of Java online submissions for Deepest Leaves Sum.
// Memory Usage: 40.3 MB, less than 67.36% of Java online submissions for Deepest Leaves Sum.
// level-order travel
// T:O(n), S:O(n)
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
    public int deepestLeavesSum(TreeNode root) {
        List<List<Integer>> record = new LinkedList<>();
        solve(root, 0, record);
        int ret = 0;
        for (int i: record.get(record.size() - 1)) {
            ret += i;
        }

        return ret;
    }

    private void solve(TreeNode root, int depth, List<List<Integer>> out) {
        if (root == null) {
            return;
        }
        if (out.size() < depth + 1) {
            List<Integer> temp = new LinkedList<>();
            temp.add(root.val);
            out.add(temp);
        } else {
            out.get(depth).add(root.val);
        }
        solve(root.left, depth + 1, out);
        solve(root.right, depth + 1, out);
    }
}