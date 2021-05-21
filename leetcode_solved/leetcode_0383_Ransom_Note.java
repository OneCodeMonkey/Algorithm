// AC: Runtime: 10 ms, faster than 24.19% of Java online submissions for Ransom Note.
// Memory Usage: 39 MB, less than 88.93% of Java online submissions for Ransom Note.
// .
// T:O(max(len1, len2)), S:O(max(len1, len2))
// 
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> record = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            record.merge(magazine.charAt(i), 1, Integer::sum);
            if (i < ransomNote.length()) {
                record.merge(ransomNote.charAt(i), -1, Integer::sum);
            }
        }
        for (char c: record.keySet()) {
            if (record.get(c) < 0) {
                return false;
            }
        }
        return true;
    }
}