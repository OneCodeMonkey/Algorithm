// AC: Runtime: 21 ms, faster than 56.45% of Java online submissions for Minimum Number of Swaps to Make the String Balanced.
// Memory Usage: 72.1 MB, less than 13.39% of Java online submissions for Minimum Number of Swaps to Make the String Balanced.
// 观察规律
// T:O(n), S:O(1)
//
class Solution {
    public int minSwaps(String s) {
        int unmatchedSize = 0, unmatchedSize2 = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[') {
                unmatchedSize++;
            } else {
                if (unmatchedSize > 0) {
                    unmatchedSize--;
                } else {
                    unmatchedSize2++;
                }
            }
        }
        return ((unmatchedSize + unmatchedSize2) / 2 + 1) / 2;
    }
}