// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Construct Binary Search Tree from Preorder Traversal.
// Memory Usage: 37.3 MB, less than 71.09% of Java online submissions for Construct Binary Search Tree from Preorder Traversal.
// using preorder[0] to split array into left subtree preorder array and right subtree's, and recursively construct left subtree and right subtree.
// T:O(n), S:O(n)
// 
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int leftSubEndIndex = 0, rightSubEndIndex = -1;
        for (int i = 1; i < preorder.length; i++) {
            if (preorder[i] < preorder[0]) {
                leftSubEndIndex = i;
            } else {
                rightSubEndIndex = i;
            }
        }

        if (leftSubEndIndex != 0) {
            root.left = bstFromPreorder(Arrays.copyOfRange(preorder, 1, leftSubEndIndex + 1));
        } else {
            root.left = null;
        }
        if (rightSubEndIndex != -1) {
            root.right = bstFromPreorder(Arrays.copyOfRange(preorder, leftSubEndIndex + 1, preorder.length));
        } else {
            root.right = null;
        }

        return root;
    }
}