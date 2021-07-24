// AC: Runtime: 3 ms, faster than 40.07% of Java online submissions for Maximum Binary Tree.
// Memory Usage: 51.9 MB, less than 6.01% of Java online submissions for Maximum Binary Tree.
// recursive
// T:O(n^2), S:O(logn), logn is the system stack cost for recursive
// 
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode ret = new TreeNode();
        solve(ret, nums, 0, nums.length - 1);

        return ret;
    }

    private void solve(TreeNode root, int[] nums, int start, int end) {
        if (root == null) {
            return;
        }
        if (start == end) {
            root.val = nums[start];
            return;
        }
        int numsMax = -1, numsMaxIndex = -1;
        for (int i = start; i <= end; i++) {
            if (nums[i] > numsMax) {
                numsMax = nums[i];
                numsMaxIndex = i;
            }
        }
        root.val = numsMax;
        if (numsMaxIndex == start) {
            root.left = null;
            root.right = new TreeNode();
            solve(root.right, nums, start + 1, end);
        } else if(numsMaxIndex == end) {
            root.right = null;
            root.left = new TreeNode();
            solve(root.left, nums, start, end - 1);
        } else {
            root.left = new TreeNode();
            solve(root.left, nums, start, numsMaxIndex - 1);
            root.right = new TreeNode();
            solve(root.right, nums, numsMaxIndex + 1, end);
        }
    }
}