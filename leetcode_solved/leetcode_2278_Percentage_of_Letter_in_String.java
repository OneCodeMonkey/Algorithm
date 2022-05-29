// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Percentage of Letter in String.
// Memory Usage: 42.3 MB, less than 30.50% of Java online submissions for Percentage of Letter in String.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int percentageLetter(String s, char letter) {
        int letterCount = 0;
        for (char c : s.toCharArray()) {
            if (letter == c) {
                letterCount++;
            }
        }
        return letterCount * 100 / s.length();
    }
}