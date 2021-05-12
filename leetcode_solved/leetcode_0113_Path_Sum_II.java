// AC:
// Runtime: 8 ms, faster than 5.12% of Java online submissions for Path Sum II.
// Memory Usage: 51.6 MB, less than 5.20% of Java online submissions for Path Sum II.
// 递归
// T:O(n), S:O(nlog2(n))
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> record = new LinkedList<>();
        solve(root, new LinkedList<>(), record, targetSum);

        return record;
    }

    private void solve(TreeNode root, List<Integer> curPath, List<List<Integer>> record, int target) {
        if (root == null) {
            return;
        }
        curPath.add(root.val);
        List<Integer> copy = new LinkedList<>(curPath);
        // 叶子节点，判断路径是否满足，满足则添加
        if (root.left == null && root.right == null) {
            int tempSum = 0;
            for (Integer i: curPath) {
                tempSum += i;
            }
            if (tempSum == target) {
                record.add(curPath);
            }
        } else {
            solve(root.left, curPath, record, target);
            // 重置
            curPath = copy;
            solve(root.right, curPath, record, target);
        }
    }
}