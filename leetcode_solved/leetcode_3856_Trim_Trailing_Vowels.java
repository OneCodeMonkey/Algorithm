// Runtime 2 ms Beats 22.60% 
// Memory 44.68 MB Beats 17.72%
// .
// T:O(n), S:(n)
// 
class Solution {
    public String trimTrailingVowels(String s) {
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        StringBuilder ret = new StringBuilder();
        boolean flag = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (flag) {
                ret.append(s.charAt(i));
            } else {
                boolean find = false;
                for (char c : vowels) {
                    if (c == s.charAt(i)) {
                        find = true;
                        break;
                    }
                }
                if (!find) {
                    ret.append(s.charAt(i));
                    flag = true;
                }
            }
        }

        return ret.reverse().toString();
    }
}
