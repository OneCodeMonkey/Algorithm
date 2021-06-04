// AC: Runtime: 14 ms, faster than 10.02% of Java online submissions for Valid Palindrome II.
// Memory Usage: 51.7 MB, less than 5.17% of Java online submissions for Valid Palindrome II.
// thouhgts: when meets two char not equal, compare the string that remove any one of the two char is palindrome.
// T: O(n), S:O(1)
//
class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        
        return true;
    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}