// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Count Asterisks.
// Memory Usage: 40.7 MB, less than 85.71% of Java online submissions for Count Asterisks.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int countAsterisks(String s) {
        int ret = 0;
        boolean start = false;
        for (char c : s.toCharArray()) {
            if (c == '|') {
                start = !start;
            } else if (c == '*' && !start) {
                ret++;
            }
        }

        return ret;
    }
}