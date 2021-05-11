// AC：
// Runtime: 1 ms, faster than 72.77% of Java online submissions for Binary Tree Right Side View.
// Memory Usage: 37.5 MB, less than 78.81% of Java online submissions for Binary Tree Right Side View.
// 思路：先层次序，再取每层最后一个
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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> record = new ArrayList<>();
        List<Integer> ret = new LinkedList<>();
        LevelOrderSolve(root, record, 0);
        // 取每一层最后一个
        for (List<Integer> item: record) {
            ret.add(item.get(item.size() - 1));
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