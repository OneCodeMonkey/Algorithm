// AC:
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root, new LinkedList<>(), targetSum);
    }

    private boolean solve(TreeNode root, List<Integer> curPath, int target) {
        if (root == null) {
            return false;
        }
        curPath.add(root.val);
        List<Integer> copy = new LinkedList<>(curPath);
        // 叶子节点，进行判断
        if (root.left == null && root.right == null) {
            int tempSum = 0;
            for (Integer i: curPath) {
                tempSum += i;
            }
            if (tempSum == target) {
                return true;
            }
            return false;
        } else {
            boolean checkLeft = solve(root.left, curPath, target);
            if (checkLeft) {
                return true;
            }
            // 这里很关键，要重置一次，否则 curPath 在上一步可能已经发生了变化
            curPath = copy;
            boolean checkRight = solve(root.right, curPath, target);
            if (checkRight) {
                return true;
            }
            return false;
        }
    }
}