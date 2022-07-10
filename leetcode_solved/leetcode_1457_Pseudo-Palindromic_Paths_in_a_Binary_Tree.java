// AC: Runtime: 78 ms, faster than 33.51% of Java online submissions for Pseudo-Palindromic Paths in a Binary Tree.
// Memory Usage: 133.2 MB, less than 24.16% of Java online submissions for Pseudo-Palindromic Paths in a Binary Tree.
// recursion & hashmap.
// T:O(n), S:O(n)
// 
class Solution {
    private HashMap<Integer, Integer> record;
    private int ret;

    public int pseudoPalindromicPaths(TreeNode root) {
        record = new HashMap<>();
        ret = 0;
        solve(root);

        return ret;
    }

    private void solve(TreeNode root) {
        if (root == null) {
            return;
        }
        int curNodeVal = root.val;
        record.merge(curNodeVal, 1, Integer::sum);

        if (root.left == null && root.right == null) {
            if (checkPalindrome(record)) {
                ret++;
            }
        }
        solve(root.left);
        solve(root.right);

        record.merge(curNodeVal, -1, Integer::sum);
    }

    private boolean checkPalindrome(HashMap<Integer, Integer> map) {
        int oddCount = 0;
        for (int i : map.keySet()) {
            if (map.get(i) % 2 == 1) {
                oddCount++;
            }
            if (oddCount > 1) {
                return false;
            }
        }

        return true;
    }
}