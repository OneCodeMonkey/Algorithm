// AC: Runtime: 89 ms, faster than 24.84% of Java online submissions for Minimum Number of Steps to Make Two Strings Anagram II.
// Memory Usage: 49.8 MB, less than 89.01% of Java online submissions for Minimum Number of Steps to Make Two Strings Anagram II.
// hashmap.
// T:O(m + n), S:O(1)
// 
class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> sRecord = new HashMap<>(), tRecord = new HashMap<>();
        for (char c : s.toCharArray()) {
            sRecord.merge(c, 1, Integer::sum);
        }
        for (char c : t.toCharArray()) {
            tRecord.merge(c, 1, Integer::sum);
        }
        int commonChars = 0;
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            commonChars += Math.max(sRecord.getOrDefault(c, 0), tRecord.getOrDefault(c, 0));
        }

        return 2 * commonChars - s.length() - t.length();
    }
}