// AC: Runtime 1 ms Beats 100.00% of users with Java
// Memory 43.36 MB Beats 100.00% of users with Java
// String comparison,Notice the common prefix length is >= 1.
// T:O(n), S:O(1)
//
class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int len1 = s1.length(), len2 = s2.length(), len3 = s3.length(), minLen = Math.min(len1, Math.min(len2, len3)),
                pos = -1;
        for (int i = 0; i < minLen; i++) {
            char c1 = s1.charAt(i), c2 = s2.charAt(i), c3 = s3.charAt(i);
            if (c1 != c2 || c1 != c3) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            return len1 + len2 + len3 - 3 * minLen;
        } else if (pos < 1) {
            return -1;
        } else {
            return len1 + len2 + len3 - 3 * pos;
        }
    }
}
