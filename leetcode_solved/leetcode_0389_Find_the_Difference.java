// AC: Runtime: 6 ms, faster than 25.12% of Java online submissions for Find the Difference.
// Memory Usage: 37.6 MB, less than 23.96% of Java online submissions for Find the Difference.
// hashmap.
// T:O(n), S:O(n)
// 
class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> record = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            record.merge(t.charAt(i), 1, Integer::sum);
            if (i < s.length()) {
                record.merge(s.charAt(i), -1, Integer::sum);
            }
        }
        for (char c: record.keySet()) {
            if (record.get(c) > 0) {
                return c;
            }
        }
        return ' ';
    }
}