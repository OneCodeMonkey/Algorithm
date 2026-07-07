// Runtime 0 ms Beats 100.00% 
// Memory 43.46 MB Beats 41.82%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int firstMatchingIndex(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) == s.charAt(len - 1 - i)) {
                return i;
            }
        }
        if (len % 2 == 1) {
            return len / 2;
        }

        return -1;
    }
}
