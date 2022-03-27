// AC: Runtime: 30 ms, faster than 52.38% of Java online submissions for Smallest String With A Given Numeric Value.
// Memory Usage: 42.2 MB, less than 88.89% of Java online submissions for Smallest String With A Given Numeric Value.
// greedy.
// T:O(n), S:O(n)
// 
class Solution {
    public String getSmallestString(int n, int k) {
        int res = k - n;
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int charIndex = Math.min(25, res);
            char c = (char) (charIndex + 'a');
            ret.append(c);
            res -= charIndex;
        }

        return ret.reverse().toString();
    }
}