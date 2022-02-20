// AC: Runtime: 10 ms, faster than 81.74% of Java online submissions for Number of Substrings Containing All Three Characters.
// Memory Usage: 45.5 MB, less than 21.84% of Java online submissions for Number of Substrings Containing All Three Characters.
// Sliding window: when find a substring that just contain such letters at least once, then plus the left endpoint to the starting distance.
// T:O(n), S:O(1)
// 
class Solution {
    public int numberOfSubstrings(String s) {
        int[] countLetter = new int[]{0, 0, 0};
        int leftPos = 0, ret = 0;
        for (int i = 0; i < s.length(); i++) {
            countLetter[s.charAt(i) - 'a']++;
            while (countLetter[0] > 0 && countLetter[1] > 0 && countLetter[2] > 0) {
                countLetter[s.charAt(leftPos++) - 'a']--;
            }

            ret += leftPos;
        }

        return ret;
    }
}