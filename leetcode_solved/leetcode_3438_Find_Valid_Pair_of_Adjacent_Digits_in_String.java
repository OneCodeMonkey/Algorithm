// Runtime 3 ms Beats 100% 
// Memory 43.02 MB Beats 100.00%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public String findValidPair(String s) {
        HashMap<Character, Integer> record = new HashMap<>();
        for (char c : s.toCharArray()) {
            record.merge(c, 1, Integer::sum);
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                int v1 = s.charAt(i) - '0', v2 = s.charAt(i + 1) - '0';
                if (v1 == record.get(s.charAt(i)) && v2 == record.get(s.charAt(i + 1))) {
                    return s.substring(i, i + 2);
                }
            }
        }

        return "";
    }
}