// AC: Runtime: 7 ms, faster than 13.55% of Java online submissions for Construct Binary Tree from Preorder and Inorder Traversal.
// Memory Usage: 39.8 MB, less than 33.65% of Java online submissions for Construct Binary Tree from Preorder and Inorder Traversal.
// thoughts: 1.如果结果为空。直接 return null
// 2.如果不为空，则先以后序数组的最后一个元素作为根节点，去切割中序数组，得到中序左数组和中序右数组。
// 3.对于得到的两个中序数组，根据这两段的长度，依次在后序数组中取等长的两段，这两个后序切割段一定是对应于我们前一步得到的两个中序数组的子数的后序遍历结果的，那么我们拿着这两棵后序树的遍历结果再去切割中序树，即重复步骤二。
// 4.重复 2，3 步骤，递归得到最终构造的二叉树。
// T:O(n + logn), S:O(n)
// 
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder);
    }

    private TreeNode build(int[] preorder, int[] inorder) {
        int size = preorder.length;
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return new TreeNode(preorder[0]);
        }
        TreeNode root = new TreeNode(preorder[0]);
        int splitElem = preorder[0];
        int rootIndex = -1;
        for (int i = 0; i < size; i++) {
            if (inorder[i] == splitElem) {
                rootIndex = i;
                break;
            }
        }
        int[] subPreOrder1, subPreOrder2;
        int[] subInOrder1, subInOrder2;
        subPreOrder1 = Arrays.copyOfRange(preorder, 1, rootIndex + 1);
        subPreOrder2 = Arrays.copyOfRange(preorder, rootIndex + 1, size);
        subInOrder1 = Arrays.copyOfRange(inorder, 0, rootIndex);
        subInOrder2 = Arrays.copyOfRange(inorder, rootIndex + 1, size);

        root.left = buildTree(subPreOrder1, subInOrder1);
        root.right = buildTree(subPreOrder2, subInOrder2);

        return root;
    }
}