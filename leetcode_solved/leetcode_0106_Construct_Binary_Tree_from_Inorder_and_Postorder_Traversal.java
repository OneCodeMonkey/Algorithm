// AC: Runtime: 5 ms, faster than 21.13% of Java online submissions for Construct Binary Tree from Inorder and Postorder Traversal.
// Memory Usage: 40 MB, less than 34.05% of Java online submissions for Construct Binary Tree from Inorder and Postorder Traversal.
// same idea as leetcode105, which construct binary tree from pre-order traversal and in-order traversal.
// T:(n + logn), S:O(n)
//
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, postorder);
    }

    private TreeNode build(int[] inorder, int[] postorder) {
        int size = postorder.length;
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return new TreeNode(postorder[size - 1]);
        }
        TreeNode root = new TreeNode(postorder[size - 1]);
        int splitElem = postorder[size - 1];
        int rootIndex = -1;
        for (int i = 0; i < size; i++) {
            if (inorder[i] == splitElem) {
                rootIndex = i;
                break;
            }
        }
        int[] subPostorder1, subPostorder2;
        int[] subInOrder1, subInOrder2;
        subInOrder1 = Arrays.copyOfRange(inorder, 0, rootIndex);
        subInOrder2 = Arrays.copyOfRange(inorder, rootIndex + 1, size);
        subPostorder1 = Arrays.copyOfRange(postorder, 0, rootIndex);
        subPostorder2 = Arrays.copyOfRange(postorder, rootIndex, size - 1);

        root.left = buildTree(subInOrder1, subPostorder1);
        root.right = buildTree(subInOrder2, subPostorder2);

        return root;
    }
}