// Solution 1: inOrder travel, store an array, and judge if the array is stricty increasing.
// AC: Runtime: 1 ms, faster than 30.54% of Java online submissions for Validate Binary Search Tree.
// Memory Usage: 38.7 MB, less than 55.09% of Java online submissions for Validate Binary Search Tree.
// T:O(n), S:O(n)
//
class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> record = new LinkedList<>();
        inOrderTraversal(root, record);
        if (record.size() <= 1) {
            return true;
        }
        int prev = record.get(0);
        boolean skipFirst = false;
        for (int i: record) {
            if (!skipFirst) {
                skipFirst = true;
            } else {
                if (i <= prev) {
                    return false;
                } else {
                    prev = i;
                }
            }
        }

        return true;
    }

    private void inOrderTraversal(TreeNode root, List<Integer> out) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            out.add(root.val);
            return;
        }
        inOrderTraversal(root.left, out);
        out.add(root.val);
        inOrderTraversal(root.right, out);
    }
}

// Solution 2: recursive judge. inOrder traver
// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Validate Binary Search Tree.
// Memory Usage: 38.8 MB, less than 28.40% of Java online submissions for Validate Binary Search Tree.
// T:O(n), S:O(logn)
// 
class Solution {
    private int curMaxValue = Integer.MIN_VALUE;
    private boolean isFirst = true;
    public boolean isValidBST(TreeNode root) {
        return solve(root);
    }

    private boolean solve(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean leftCheck = solve(root.left);
        // 特殊 case 单独处理
        if (isFirst && root.val == Integer.MIN_VALUE) {
            isFirst = false;
        } else {
            if (curMaxValue < root.val) {
                curMaxValue = root.val;
                isFirst = false;
            } else {
                return false;
            }
        }
        boolean rightCheck = solve(root.right);

        return leftCheck && rightCheck;
    }
}