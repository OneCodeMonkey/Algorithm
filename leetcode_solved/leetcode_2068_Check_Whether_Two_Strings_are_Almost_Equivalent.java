// AC: Runtime: 1 ms, faster than 62.50% of Java online submissions for Check Whether Two Strings are Almost Equivalent.
// Memory Usage: 38.8 MB, less than 62.50% of Java online submissions for Check Whether Two Strings are Almost Equivalent.
// just do as it says.
// T:O(n), S:O(1)
// 
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] letterCount1 = new int[26], letterCount2 = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            letterCount1[word1.charAt(i) - 'a']++;
            letterCount2[word2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (Math.abs(letterCount1[i] - letterCount2[i]) > 3) {
                return false;
            }
        }

        return true;
    }
}