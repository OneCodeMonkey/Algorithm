// AC: Runtime: 2 ms, faster than 42.86% of Java online submissions for Find First Palindromic String in the Array.
// Memory Usage: 39.5 MB, less than 28.57% of Java online submissions for Find First Palindromic String in the Array.
// .
// T:O(sum(len(str))), S:O(1)
// 
class Solution {
    public String firstPalindrome(String[] words) {
        for (String word: words) {
            if (checkPalindrome(word)) {
                return word;
            }
        }

        return "";
    }

    private boolean checkPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}