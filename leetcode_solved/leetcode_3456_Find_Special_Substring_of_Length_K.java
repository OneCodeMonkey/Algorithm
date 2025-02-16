// Runtime 1 ms Beats 100.00% 
// Memory 42.36 MB Beats 100.00%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        char prev = ' ';
        int len = s.length(), count = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (prev == ' ') {
                count++;
                if (k == count && (i + 1 >= len || (i + 1 < len && s.charAt(i + 1) != c))) {
                    return true;
                }
            } else if (prev == c) {
                count++;
                if (k == count && (i + 1 >= len || i + 1 < len && s.charAt(i + 1) != c)) {
                    return true;
                }
            } else {
                count = 1;
                if (k == count && (i + 1 >= len || i + 1 < len && s.charAt(i + 1) != c)) {
                    return true;
                }
            }

            prev = c;
        }

        return false;
    }
}
