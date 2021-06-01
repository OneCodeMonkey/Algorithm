// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Segments in a String.
// Memory Usage: 36.6 MB, less than 86.96% of Java online submissions for Number of Segments in a String.
// 注意直接 split，多个连续的空格会被分出多个子串
// T:O(n), S:O(n)
//
class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        String[] arr = s.split(" ");
        int ret = 0;
        for (String str: arr) {
            if (!str.isEmpty()) {
                ret++;
            }
        }
        return ret;
    }
}
