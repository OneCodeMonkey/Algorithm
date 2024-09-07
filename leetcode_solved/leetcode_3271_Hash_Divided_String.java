// Runtime 2 ms Beats 100.00%
// Memory 44.45 MB Beats 100.00%
// .
// T:O(n), S:O(n / k)
// 
class Solution {
    public String stringHash(String s, int k) {
        StringBuilder ret = new StringBuilder();
        int len = s.length(), gap = len / k;
        for (int i = 0; i < gap; i++) {
            int count = 0;
            for (int j = k * i; j < k * i + k; j++) {
                count += s.charAt(j) - 'a';
            }
            count %= 26;
            ret.append((char) ('a' + count));
        }

        return ret.toString();
    }
}
