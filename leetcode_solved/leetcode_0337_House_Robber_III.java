// AC: Runtime: 2 ms, faster than 41.52% of Java online submissions for House Robber III.
// Memory Usage: 39 MB, less than 19.68% of Java online submissions for House Robber III.
// recursive. if rob root, then rob root's left and right subtree's childs. if not rob root, then rob root's left and right subtrees.
// T:O(n), S:O(n)
// 
class Solution {
    private HashMap<TreeNode, Integer> record;
    public int rob(TreeNode root) {
        record = new HashMap<>();
        return solve(root);
    }

    private int solve(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.val;
        }
        if (record.containsKey(root)) {
            return record.get(root);
        }
        int val1 = root.val;
        if (root.left != null) {
            val1 += solve(root.left.left) + solve(root.left.right);
        }
        if (root.right != null) {
            val1 += solve(root.right.left) + solve(root.right.right);
        }

        int val2 = solve(root.left) + solve(root.right);

        int ret = Math.max(val1, val2);
        record.put(root, ret);

        return ret;
    }
}