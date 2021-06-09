// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Leaf-Similar Trees.
// Memory Usage: 36.7 MB, less than 64.06% of Java online submissions for Leaf-Similar Trees.
// thoughts: in-order, post-order, pre-order all is ok for getting leave values.
// T:O(n), S:O(n)
// 
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> out1 = new LinkedList<>();
        List<Integer> out2 = new LinkedList<>();
        inOrderTraversal(root1, out1);
        inOrderTraversal(root2, out2);
        return out1.equals(out2);
    }

    private void inOrderTraversal(TreeNode root, List<Integer> out) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            out.add(root.val);
        }
        if (root.left != null) {
            inOrderTraversal(root.left, out);
        }
        if (root.right != null) {
            inOrderTraversal(root.right, out);
        }
    }
}