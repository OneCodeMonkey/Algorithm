// AC: untime 38 ms Beats 33.33%
// Memory 44.7 MB Beats 33.33%
// HashMap.
// T:O(n), S:O(1)
// 
class Solution {
    public boolean checkStrings(String s1, String s2) {
        HashMap<Character, Integer> oddCharCount1 = new HashMap<>(), oddCharCount2 = new HashMap<>(),
                evenCharCount1 = new HashMap<>(), evenCharCount2 = new HashMap<>();
        int len = s1.length();
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                oddCharCount1.merge(s1.charAt(i), 1, Integer::sum);
                oddCharCount2.merge(s2.charAt(i), 1, Integer::sum);
            } else {
                evenCharCount1.merge(s1.charAt(i), 1, Integer::sum);
                evenCharCount2.merge(s2.charAt(i), 1, Integer::sum);
            }
        }
        if (oddCharCount1.size() != oddCharCount2.size() || evenCharCount1.size() != evenCharCount2.size()) {
            return false;
        }
        for (char c1 : oddCharCount1.keySet()) {
            if (!oddCharCount2.containsKey(c1) || !oddCharCount1.get(c1).equals(oddCharCount2.get(c1))) {
                return false;
            }
        }
        for (char c1 : evenCharCount1.keySet()) {
            if (!evenCharCount2.containsKey(c1) || !evenCharCount1.get(c1).equals(evenCharCount2.get(c1))) {
                return false;
            }
        }

        return true;
    }
}
