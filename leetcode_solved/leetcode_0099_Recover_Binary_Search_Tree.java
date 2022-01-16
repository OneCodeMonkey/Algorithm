// Solution 1: O(n)
// AC: Runtime: 7 ms, faster than 9.23% of Java online submissions for Recover Binary Search Tree.
// Memory Usage: 44.6 MB, less than 13.37% of Java online submissions for Recover Binary Search Tree.
// get the elements and sort, and inorder travel recursively set values.
// T:O(n), S:O(n)
// 
class Solution {
    List<Integer> record = new ArrayList<>();
    int pos = 0;
    public void recoverTree(TreeNode root) {
        inorderTravel(root);
        Collections.sort(record);
        recover(root);
    }

    private void inorderTravel(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTravel(root.left);
        record.add(root.val);
        inorderTravel(root.right);
    }

    private void recover(TreeNode root) {
        if (root == null) {
            return;
        }
        recover(root.left);
        root.val = record.get(pos++);
        recover(root.right);
    }
}