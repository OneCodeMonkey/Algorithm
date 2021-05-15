// AC:
// Runtime: 7 ms, faster than 19.20% of Java online submissions for Assign Cookies.
// Memory Usage: 39.3 MB, less than 96.54% of Java online submissions for Assign Cookies.
// .
// T:O(nlogn), S:O(logn)
// 
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if (s.length == 0 || g.length == 0) {
            return 0;
        }
        Arrays.sort(s);
        Arrays.sort(g);
        int count = 0, pos = 0;
        for (Integer item: g) {
            if (s.length == 0 || item > s[s.length - 1]) {
                break;
            }
            while (pos < s.length) {
                if (item <= s[pos]) {
                    pos++;
                    count++;
                    break;
                }
                pos++;
            }
        }
        return count;
    }
}