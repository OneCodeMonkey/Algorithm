// AC: Runtime 16 ms Beats 33.33% 
// Memory 44.6 MB Beats 16.67%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuilder prefix = new StringBuilder(), suffix = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            char c1 = s.charAt(i), c2 = s.charAt(n - 1 - i);
            if (c1 < c2) {
                prefix.append(c1);
                suffix.append(c1);
            } else {
                prefix.append(c2);
                suffix.append(c2);
            }
        }
        if (n % 2 == 1) {
            prefix.append(s.charAt(n / 2));
        }
        prefix.append(suffix.reverse());

        return prefix.toString();
    }
}