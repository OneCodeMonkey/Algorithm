// Runtime 8 ms Beats 39.83% of users with Java
// Memory 45.75 MB Beats 7.76% of users with Java
// Recursion: Notice the path must starting from leaf node. We should always append the current char to the judge string front.
// T:O(n), S:O(n)
// 
class Solution {
    public String smallestFromLeaf(TreeNode root) {
        return solve(root, "");
    }

    public String solve(TreeNode root, String cur) {
        char currentChar = (char) (root.val + 'a');
        if (root.left == null && root.right == null) {
            return currentChar + cur;
        }
        if (root.left == null) {
            return solve(root.right, currentChar + cur);
        }
        if (root.right == null) {
            return solve(root.left, currentChar + cur);
        }

        String s1 = solve(root.left, currentChar + cur);
        String s2 = solve(root.right, currentChar + cur);
        return s1.compareTo(s2) <= 0 ? s1 : s2;
    }
}
