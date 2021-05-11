// AC:
// Runtime: 2 ms, faster than 79.21% of Java online submissions for Average of Levels in Binary Tree.
// Memory Usage: 41.3 MB, less than 20.54% of Java online submissions for Average of Levels in Binary Tree.
// .
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> record = new ArrayList<>();
        List<Double> ret = new LinkedList<>();
        LevelOrderSolve(root, record, 0);
        // 取每一层最后一个
        for (List<Integer> item: record) {
            long tempSum = 0;
            for (int i = 0; i < item.size(); i++) {
                tempSum += item.get(i);
            }
            ret.add(tempSum / (item.size() * 1.00000));
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