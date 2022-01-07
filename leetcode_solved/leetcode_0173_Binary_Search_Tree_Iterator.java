// AC: Runtime: 28 ms, faster than 17.27% of Java online submissions for Binary Search Tree Iterator.
// Memory Usage: 49.3 MB, less than 5.04% of Java online submissions for Binary Search Tree Iterator.
// inorder traversal.
// T:O(n), S:O(n)
// 
class BSTIterator {
    List<Integer> record = new ArrayList<>();
    int currentIndex;

    public BSTIterator(TreeNode root) {
        inorderTraversal(root);
        currentIndex = 0;
    }

    public int next() {
        return record.get(currentIndex++);
    }

    public boolean hasNext() {
        return currentIndex < record.size();
    }

    private void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        record.add(root.val);
        inorderTraversal(root.right);
    }
}