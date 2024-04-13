// Runtime 1 ms Beats 100.00% of users with Java
// Memory 42.11 MB Beats 100.00% of users with Java
// Greedy.
// T:O(n), S:O(n)
// 
class Solution {
    public String getSmallestString(String s, int k) {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (k <= 0 || c == 'a') {
                ret.append(c);
                continue;
            }

            if (c - 'a' <= 'z' - c + 1) {
                if (k >= c - 'a') {
                    ret.append('a');
                    k -= c - 'a';
                } else {
                    ret.append((char) ((int) c - k));
                    k = 0;
                }
            } else {
                if (k >= 'z' - c + 1) {
                    ret.append('a');
                    k -= 'z' - c + 1;
                } else {
                    ret.append((char) ((int) c - k));
                    k = 0;
                }
            }
        }

        return ret.toString();
    }
}
