// AC: Runtime: 3 ms, faster than 6.92% of Java online submissions for Convert BST to Greater Tree.
// Memory Usage: 39.4 MB, less than 47.56% of Java online submissions for Convert BST to Greater Tree.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public TreeNode convertBST(TreeNode root) {
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