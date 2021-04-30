// Runtime: 1 ms, faster than 94.60% of Java online submissions for Reverse String.
// Memory Usage: 45.9 MB, less than 32.96% of Java online submissions for Reverse String.
// 
class Solution {
    public void reverseString(char[] s) {
        char tempChar;
        int size = s.length;
        for (int i = 0; i < size / 2; i++) {
            tempChar = s[size - 1 - i];
            s[size - 1 - i] = s[i];
            s[i] = tempChar;
        }
    }
}