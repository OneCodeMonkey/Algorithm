// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Level Order Traversal II.
// Memory Usage: 38.8 MB, less than 96.89% of Java online submissions for Binary Tree Level Order Traversal II.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        LevelOrderSolve(root, ret, 0);
        for (int i = 0; i < ret.size() / 2; i++) {
            Collections.swap(ret, i, ret.size() - 1 - i);
        }

        return ret;
    }

    private void LevelOrderSolve(TreeNode root, List<List<Integer>> out, int depth) {
        if (root == null) {
            return;
        }
        if (out.size() < depth + 1) {
            List<Integer> temp = new ArrayList<>();
            out.add(temp);
        }
        out.get(depth).add(root.val);
        LevelOrderSolve(root.left, out, depth + 1);
        LevelOrderSolve(root.right, out, depth + 1);
    }
}