// AC: Runtime: 37 ms, faster than 35.96% of Java online submissions for Find All Anagrams in a String.
// Memory Usage: 43.3 MB, less than 53.65% of Java online submissions for Find All Anagrams in a String.
// hashmap compare.
// T:O(s.length()), S:O(p.length())
// 
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int lenP = p.length(), lenS = s.length();
        List<Integer> ret = new LinkedList<>();
        if (lenP > lenS) {
            return ret;
        }
        HashMap<Character, Integer> record = new HashMap<>();
        for (int i = 0; i < lenP; i++) {
            record.merge(p.charAt(i), 1, Integer::sum);
        }
        for (int i = 0; i < lenP; i++) {
            record.merge(s.charAt(i), -1, Integer::sum);
        }
        for (int i = lenP - 1; i < lenS; i++) {
            if (check(record)) {
                ret.add(i - lenP + 1);
            }
            if (i + 1 < lenS) {
                record.merge(s.charAt(i - lenP + 1), 1, Integer::sum);
                record.merge(s.charAt(i + 1), -1, Integer::sum);
            }
        }

        return ret;
    }
    private boolean check(HashMap<Character, Integer> record) {
        for (char c: record.keySet()) {
            if (record.get(c) != 0) {
                return false;
            }
        }

        return true;
    }
}