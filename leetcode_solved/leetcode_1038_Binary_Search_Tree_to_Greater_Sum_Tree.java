// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search Tree to Greater Sum Tree.
// Memory Usage: 36.5 MB, less than 43.41% of Java online submissions for Binary Search Tree to Greater Sum Tree.
// inOrder traversal and record the greater elements' sum.
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
    public TreeNode bstToGst(TreeNode root) {
        List<Integer> record = new ArrayList<>();
        inOrderTraversal(root, record);
        HashMap<Integer, Integer> greaterSum = new HashMap<>();
        int pos = record.size() - 1, tempSum = 0;
        for (int i = record.size() - 1; i >= 0; i--) {
            greaterSum.put(record.get(i), tempSum);
            tempSum += record.get(i);
        }

        setValue(root, greaterSum);
        
        return root;
    }

    private void inOrderTraversal(TreeNode root, List<Integer> out) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left, out);
        out.add(root.val);
        inOrderTraversal(root.right, out);
    }

    private void setValue(TreeNode root, HashMap<Integer, Integer> record) {
        if (root == null) {
            return;
        }
        root.val += record.get(root.val);
        setValue(root.left, record);
        setValue(root.right, record);
    }
}