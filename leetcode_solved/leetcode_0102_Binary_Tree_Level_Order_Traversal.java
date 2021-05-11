// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Level Order Traversal.
// Memory Usage: 39.5 MB, less than 17.09% of Java online submissions for Binary Tree Level Order Traversal.
// . 
// T:O(n), S:O(n)
//
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new LinkedList<>();
        levelOrderSolve(root, ret, 0);
        return ret;
    }

    private void levelOrderSolve(TreeNode root, List<List<Integer>> out, int depth) {
        if (root == null) {
            return;
        }
        if (out.size() < depth + 1) {
            List<Integer> temp = new LinkedList<>();
            out.add(temp);
        }
        out.get(depth).add(root.val);
        levelOrderSolve(root.left, out, depth + 1);
        levelOrderSolve(root.right, out, depth + 1);
    }
}