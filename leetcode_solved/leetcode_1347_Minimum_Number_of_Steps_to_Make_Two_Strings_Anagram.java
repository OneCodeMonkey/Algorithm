// AC: Runtime: 13 ms, faster than 71.32% of Java online submissions for Minimum Number of Steps to Make Two Strings Anagram.
// Memory Usage: 39.4 MB, less than 71.08% of Java online submissions for Minimum Number of Steps to Make Two Strings Anagram.
// record every char's count diff, and the diff sum / 2 is answer.
// T:O(n), S:O(1)
// 
class Solution {
    public int minSteps(String s, String t) {
        int[] recordS = new int[26], recordT = new int[26];
        for (int i = 0; i < s.length(); i++) {
            recordS[s.charAt(i) - 'a']++;
            recordT[t.charAt(i) - 'a']++;
        }
        int diffCount = 0;
        for (int i = 0; i < 26; i++) {
            diffCount += Math.abs(recordS[i] - recordT[i]);
        }

        return diffCount / 2;
    }
}