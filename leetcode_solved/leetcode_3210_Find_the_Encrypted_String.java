// Runtime 1 ms Beats 100.00%
// Memory 42.42 MB Beats 100.00%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public String getEncryptedString(String s, int k) {
        int len = s.length();
        k = k % len;
        return s.substring(k, len) + s.substring(0, k);
    }
}
