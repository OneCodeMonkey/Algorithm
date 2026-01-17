// Runtime 2 ms Beats 100.00% 
// Memory 44.65 MB Beats 100.00%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public String reversePrefix(String s, int k) {
        if (k == 1) {
            return s;
        }
        return new StringBuilder(s.substring(0, k)).reverse() + s.substring(k);
    }
}
