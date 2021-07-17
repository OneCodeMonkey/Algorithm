// AC: Runtime: 25 ms, faster than 44.47% of Java online submissions for Find Elements in a Contaminated Binary Tree.
// Memory Usage: 43.4 MB, less than 74.39% of Java online submissions for Find Elements in a Contaminated Binary Tree.
// using hashset to make find complexity O(1)
// T:O(n), S:O(n)
// 
class FindElements {
    private TreeNode rootE;
    private HashSet<Integer> record = new HashSet<>();

    public FindElements(TreeNode root) {
        root.val = 0;
        record.add(0);
        constructBinaryTree(root);
        rootE = root;
    }

    public boolean find(int target) {
        return record.contains(target);
    }

    private void constructBinaryTree(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            int temp = 2 * root.val + 1;
            root.left.val = temp;
            record.add(temp);
            constructBinaryTree(root.left);
        }
        if (root.right != null) {
            int temp = 2 * root.val + 2;
            root.right.val = temp;
            record.add(temp);
            constructBinaryTree(root.right);
        }
    }
}
