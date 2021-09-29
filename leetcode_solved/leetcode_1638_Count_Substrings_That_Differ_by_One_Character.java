// AC: Runtime: 4 ms, faster than 76.37% of Java online submissions for Count Substrings That Differ by One Character.
// Memory Usage: 36.8 MB, less than 91.64% of Java online submissions for Count Substrings That Differ by One Character.
// three loop check.
// T:O(m * n * min(m, n)), S:O(1)
//
class Solution {
    public int countSubstrings(String s, String t) {
        int sizeS = s.length(), sizeT = t.length(), ret = 0;
        for (int i = 0; i < sizeS; i++) {
            for (int j = 0; j < sizeT; j++) {
                int missMatchCount = 0;
                for (int offset = 0; (i + offset) < sizeS && (j + offset) < sizeT; offset++) {
                    if (s.charAt(i + offset) != t.charAt(j + offset)) {
                        missMatchCount++;
                        if (missMatchCount > 1) {
                            break;
                        }
                    }
                    if (missMatchCount == 1) {
                        ret++;
                    }
                }
            }
        }

        return ret;
    }
}