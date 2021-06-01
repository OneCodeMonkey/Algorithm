// AC: Runtime: 3 ms, faster than 100.00% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
// Memory Usage: 39.8 MB, less than 54.08% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
// .
// T:O(logn), S:O(1)
//
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 位于同一侧子树
        while ((root.val - p.val) * (root.val - q.val) > 0) {
            root = p.val < root.val ? root.left : root.right;
        }
        return root;
    }
}

// 法二：
// 
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q || root == null) {
            return root;
        }
        TreeNode left = null, right = null;
        if (root.val > p.val && root.val > q.val) {
            left = lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            right = lowestCommonAncestor(root.right, p, q);
        } else {
            left = lowestCommonAncestor(root.left, p, q);
            right = lowestCommonAncestor(root.right, p, q);
        }
        if (left != null && right != null) {
            return root;
        }
        if (left != null) {
            return left;
        }
        return right;
    }
}