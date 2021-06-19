// AC: Runtime: 1 ms, faster than 90.79% of Java online submissions for Maximum Score After Splitting a String.
// Memory Usage: 37.3 MB, less than 41.27% of Java online submissions for Maximum Score After Splitting a String.
// .
// T:O(n), S:O(1)
//
class Solution {
    public int maxScore(String s) {
        int oneCount = 0, leftZeroCount = 0, size = s.length(), ret = 0;
        for (char c: s.toCharArray()) {
            if (c == '1') {
                oneCount++;
            }
        }
        for (int i = 0; i < size - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeroCount++;
            } else {
                oneCount--;
            }
            ret = Math.max(leftZeroCount + oneCount, ret);
        }

        return ret;
    }
}