/**
 * AC: Runtime: 47 ms, faster than 26.75% of Java online submissions for Find All Anagrams in a String.
 * Memory Usage: 40.4 MB, less than 21.17% of Java online submissions for Find All Anagrams in a String.
 */
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ret = new LinkedList<>();
        if (s.length() < p.length()) {
            return ret;
        }
        HashMap<String, Integer> pRecord = new HashMap<>();
        HashMap<String, Integer> sTempRecord = new HashMap<>();
        for(int i = 0; i < p.length(); i++) {
            String tempChar = String.valueOf(p.charAt(i));
            String sTempChar = String.valueOf(s.charAt(i));
            pRecord.merge(tempChar, 1, Integer::sum);
            sTempRecord.merge(sTempChar, 1, Integer::sum);
        }

        for(int i = 0; i < s.length() + 1 - p.length(); i++) {
            if (i != 0) {
                String char1 = String.valueOf(s.charAt(i - 1));
                String char2 = String.valueOf(s.charAt(i + p.length() - 1));
                sTempRecord.merge(char1, -1, Integer::sum);
                if (sTempRecord.get(char1) == 0) {
                    sTempRecord.remove(char1);
                }
                sTempRecord.merge(char2, 1, Integer::sum);
            }
            if (sTempRecord.equals(pRecord)) {
                ret.add(i);
            }
        }

        return ret;
    }
}