// 法一：中序遍历，再对结果取最小相邻差
// AC: Runtime: 1 ms, faster than 13.85% of Java online submissions for Minimum Distance Between BST Nodes.
// Memory Usage: 38.3 MB, less than 8.26% of Java online submissions for Minimum Distance Between BST Nodes.
// T:O(n), S:O(n)
//
class Solution {
    public int minDiffInBST(TreeNode root) {
        List<Integer> record = new LinkedList<>();
        inOrderTraversal(root, record);
        int ret = Integer.MAX_VALUE;
        for (int i = 0; i < record.size() - 1; i++) {
            int diff = record.get(i + 1) - record.get(i);
            if (diff < ret) {
                ret = diff;
            }
        }

        return ret;
    }

    private void inOrderTraversal(TreeNode root, List<Integer> out) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left, out);
        out.add(root.val);
        inOrderTraversal(root.right, out);
    }
}

// 法二：不存结果，直接中间判断 root - max(root.left) 和 min(root.right) - root
// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Distance Between BST Nodes.
// Memory Usage: 38.8 MB, less than 5.10% of Java online submissions for Minimum Distance Between BST Nodes.
// every time we compare root and the max of root.left and the min of the root.right
// T:O(n), S:O(1)
//
class Solution {
    private int minDiff = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        if (root.left != null) {
            minDiff = Math.min(minDiff, root.val - getRightMax(root.left));
        }
        if (root.right != null) {
            minDiff = Math.min(minDiff, getLeftMin(root.right) - root.val);
        }
        minDiffInBST(root.left);
        minDiffInBST(root.right);

        return minDiff;
    }

    private int getLeftMin(TreeNode root) {
        if (root.left == null) {
            return root.val;
        }
        return getLeftMin(root.left);
    }

    private int getRightMax(TreeNode root) {
        if (root.right == null) {
            return root.val;
        }
        return getRightMax(root.right);
    }
}