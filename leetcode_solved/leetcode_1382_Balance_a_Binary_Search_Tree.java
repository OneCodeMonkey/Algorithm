// AC: Runtime: 10 ms, faster than 10.10% of Java online submissions for Balance a Binary Search Tree.
// Memory Usage: 61.1 MB, less than 5.99% of Java online submissions for Balance a Binary Search Tree.
// convert BST to sorted array, then convert sorted array to BST with every middle element be the root of tree.
// T:O(n), S:O(n)
// 
class Solution {
    List<Integer> record = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        convertBSTToArray(root);
        return convertArrayToBST(record);
    }
    
    private void convertBSTToArray(TreeNode root) {
        if (root == null) {
            return;
        }
        convertBSTToArray(root.left);
        record.add(root.val);
        convertBSTToArray(root.right);
    }

    private TreeNode convertArrayToBST(List<Integer> record) {
        if (record.size() == 0) {
            return null;
        } else if (record.size() == 1) {
            return new TreeNode(record.get(0));
        } else {
            int middleIndex = record.size() / 2;
            TreeNode retRoot = new TreeNode(record.get(middleIndex));
            retRoot.left = convertArrayToBST(record.subList(0, middleIndex));
            retRoot.right = convertArrayToBST(record.subList(middleIndex + 1, record.size()));
            return retRoot;
        }
    }
}