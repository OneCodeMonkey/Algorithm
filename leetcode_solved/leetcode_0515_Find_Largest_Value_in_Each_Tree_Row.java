// AC:
// Runtime: 2 ms, faster than 29.55% of Java online submissions for Find Largest Value in Each Tree Row.
// Memory Usage: 39.1 MB, less than 59.71% of Java online submissions for Find Largest Value in Each Tree Row.
// 思路：先层次序，再取最大
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
    public List<Integer> largestValues(TreeNode root) {
        List<List<Integer>> record = new ArrayList<>();
        List<Integer> ret = new LinkedList<>();
        LevelOrderSolve(root, record, 0);
        // 取每一层最后一个
        for (List<Integer> item: record) {
        	// 注意：这里不用 stream() 来取最大，因为发现更慢，具体原因还不清楚..
            int tempMax = item.get(0);
            for (Integer item2: item) {
                if (item2 > tempMax) {
                    tempMax = item2;
                }
            }
            ret.add(tempMax);
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