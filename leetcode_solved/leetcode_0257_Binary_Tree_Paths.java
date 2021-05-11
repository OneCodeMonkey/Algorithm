// AC:
// Runtime: 2 ms, faster than 75.50% of Java online submissions for Binary Tree Paths.
// Memory Usage: 39 MB, less than 80.66% of Java online submissions for Binary Tree Paths.
// 递归，回溯。注意临时 list 在一次左子树递归完，右子树开始递归前要重置
// T:O(n), S:O(n*log2(n)), 极限情况要存 (n + 1)/2 * log2(n) 个节点
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ret = new LinkedList<>();
        List<List<Integer>> record = new LinkedList<>();
        solve(root, new LinkedList<>(), record);
        for (List<Integer> path: record) {
            StringBuilder temp = new StringBuilder();
            for (Integer i: path) {
                temp.append(i);
                temp.append("->");
            }
            String pathStr = temp.substring(0, temp.length() - 2);
            ret.add(pathStr);
        }
        return ret;
    }

    private void solve(TreeNode root, List<Integer> curPath, List<List<Integer>> record) {
        if (root == null) {
            return;
        }
        curPath.add(root.val);
        List<Integer> copy = new LinkedList<>(curPath);
        // 叶子节点，生成一条新路径
        if (root.left == null && root.right == null) {
            record.add(curPath);
        } else {
            solve(root.left, curPath, record);
            // 这里很关键，要重置一次，否则 curPath 在上一步可能已经发生了变化
            curPath = copy;
            solve(root.right, curPath, record);
        }
    }
}