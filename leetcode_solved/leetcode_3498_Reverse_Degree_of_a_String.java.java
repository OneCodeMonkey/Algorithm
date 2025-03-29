// Runtime 1 ms Beats 100.00% 
// Memory 42.92 MB Beats 46.96%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int reverseDegree(String s) {
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            ret += (26 - (int) (c - 'a')) * (i + 1);
        }

        return ret;
    }
}
