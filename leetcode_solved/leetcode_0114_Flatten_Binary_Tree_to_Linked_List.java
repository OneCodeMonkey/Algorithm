// 方法1: 使用O(n) 空间存前序遍历的节点
// AC: Runtime: 2 ms, faster than 24.57% of Java online submissions for Flatten Binary Tree to Linked List.
// Memory Usage: 38.4 MB, less than 43.09% of Java online submissions for Flatten Binary Tree to Linked List.
// 略。
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
    public void flatten(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }
        List<TreeNode> record = new LinkedList<>();
        preOrderTraversalSolve(root, record);
        for (int i = 0; i < record.size() - 1; i++) {
            record.get(i).left = null;
            record.get(i).right = record.get(i + 1);
        }
        root = record.get(0);
    }

    private void preOrderTraversalSolve(TreeNode root, List<TreeNode> out) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            out.add(root);
        } else {
            out.add(root);
            preOrderTraversalSolve(root.left, out);
            preOrderTraversalSolve(root.right, out);
        }
    }
}

// 方法2: 原地替换法
// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Flatten Binary Tree to Linked List.
// Memory Usage: 38.4 MB, less than 43.09% of Java online submissions for Flatten Binary Tree to Linked List.
// 思路：从下晚上进行替换，替换中用一个临时 node 存上一次调整完的 root。由于是要前序结果，所以要先递归右边，再递归左边。
// T:O(n), S:O(1)
//
class Solution {
    private TreeNode prevNode = null;

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right = prevNode;
        root.left = null;
        prevNode = root;
    }
}