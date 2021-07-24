// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Longest Uncommon Subsequence I.
// Memory Usage: 36.9 MB, less than 57.26% of Java online submissions for Longest Uncommon Subsequence I.
// if not equal length, return max one, if same length not equal string, return length of any one
// T:O(n), S:O(1)
// 
class Solution {
    public int findLUSlength(String a, String b) {
        return a.length() != b.length() ? Math.max(a.length(), b.length()) : (a.equals(b) ? -1 : a.length());
    }
}