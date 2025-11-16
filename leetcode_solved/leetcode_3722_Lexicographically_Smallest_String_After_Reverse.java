// Runtime 105 ms Beats 57.77% 
// Memory 46.98 MB Beats 8.42%
// Brute-force.
// T:O(n^2), S:(n)
// 
class Solution {
    public String lexSmallest(String s) {
        String ans = "z".repeat(s.length());
        for (int i = 0; i < s.length(); i++) {
            String str1 = generate(s, i), str2 = generate2(s, i);
            if (str1.compareTo(ans) < 0) {
                ans = str1;
            }
            if (str2.compareTo(ans) < 0) {
                ans = str2;
            }
        }

        return ans;
    }

    private String generate(String s, int index) {
        if (index == s.length() - 1) {
            return new StringBuilder(s).reverse().toString();
        }
        return new StringBuilder(s.substring(0, index + 1)).reverse() + s.substring(index + 1);
    }

    private String generate2(String s, int index) {
        if (index == s.length() - 1) {
            return s;
        }
        return s.substring(0, index + 1) + new StringBuilder(s.substring(index + 1)).reverse();
    }
}
