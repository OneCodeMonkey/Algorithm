// Runtime: 13 ms, faster than 14.69% of Java online submissions for Valid Anagram.
// Memory Usage: 39.3 MB, less than 47.81% of Java online submissions for Valid Anagram.
// .
// T:O(n), S:O(n)
//
class Solution {
    public boolean isAnagram(String s, String t) {
        int sizeS = s.length();
        int sizeT = t.length();
        if (sizeS != sizeT) {
            return false;
        }
        HashMap<Character, Integer> recordS = new HashMap<>();
        HashMap<Character, Integer> recordT = new HashMap<>();
        for (int i = 0; i < sizeS; i++) {
            recordS.merge(s.charAt(i), 1, Integer::sum);
            recordT.merge(t.charAt(i), 1, Integer::sum);
        }
        if (recordS.keySet().size() != recordT.keySet().size()) {
            return false;
        }
        for (char item: recordS.keySet()) {
            if (recordT.get(item) == null || recordS.get(item).intValue() != recordT.get(item).intValue()) {
                return false;
            }
        }
        return true;
    }
}