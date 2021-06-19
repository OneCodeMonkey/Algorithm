// AC: Runtime: 1 ms, faster than 26.76% of Java online submissions for Sum Root to Leaf Numbers.
// Memory Usage: 36.9 MB, less than 22.81% of Java online submissions for Sum Root to Leaf Numbers.
// dfs, traverl tree and restore paths.
// T:O(n), S:O(n),
// 
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
    public int sumNumbers(TreeNode root) {
        List<List<Integer>> record = new ArrayList<>();
        solve(root, new LinkedList<>(), record);
        int ret = 0;
        for (List<Integer> path: record) {
            for (int i = 0; i < path.size(); i++) {
                ret += path.get(i) * (int)Math.pow(10, path.size() - i - 1);
            }
        }
        return ret;
    }

    private void solve(TreeNode root, List<Integer> cur, List<List<Integer>> out) {
        if (root == null) {
            return;
        }
        cur.add(root.val);
        // leaf-node
        if (root.left == null && root.right == null) {
            out.add(cur);
        }
        if (root.left != null) {
            List<Integer> curCopy = new LinkedList<>(cur);
            solve(root.left, curCopy, out);
        }
        if (root.right != null) {
            List<Integer> curCopy2 = new LinkedList<>(cur);
            solve(root.right, curCopy2, out);
        }
    }
}