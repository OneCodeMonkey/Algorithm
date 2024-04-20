// Runtime 1 ms Beats 100.00% of users with Java
// Memory 41.92 MB Beats 50.00% of users with Java
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int scoreOfString(String s) {
        int ret = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            ret += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }

        return ret;
    }
}
