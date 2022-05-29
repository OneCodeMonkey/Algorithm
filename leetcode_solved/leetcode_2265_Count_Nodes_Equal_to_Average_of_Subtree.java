// AC: Runtime: 23 ms, faster than 10.76% of Java online submissions for Count Nodes Equal to Average of Subtree.
// Memory Usage: 49.1 MB, less than 5.26% of Java online submissions for Count Nodes Equal to Average of Subtree.
// recursive, record sum of subtree nodes and amount of subtree nodes.
// T:O(n), S:O(logn), logn is system cost of recursion
//
class Solution {
    private int count = 0;

    public int averageOfSubtree(TreeNode root) {
        solve(root);
        return count;
    }

    private String solve(TreeNode root) {
        if (root == null) {
            return "0#0";
        }
        if (root.left == null && root.right == null) {
            count++;
            return root.val + "#" + 1;
        }
        String leftSumAndNodeCount = solve(root.left);
        String[] arr = leftSumAndNodeCount.split("#");
        int leftSum = Integer.parseInt(arr[0]), leftCount = Integer.parseInt(arr[1]);
        String rightSumAndNodeCount = solve(root.right);
        arr = rightSumAndNodeCount.split("#");
        int rightSum = Integer.parseInt(arr[0]), rightCount = Integer.parseInt(arr[1]);
        if (root.val == (leftSum + rightSum + root.val) / (leftCount + rightCount + 1)) {
            count++;
        }

        return (leftSum + rightSum + root.val) + "#" + (leftCount + rightCount + 1);
    }
}