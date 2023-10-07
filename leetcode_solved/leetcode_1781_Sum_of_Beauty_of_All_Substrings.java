// AC: Runtime 1022 ms Beats 5.8%
// Memory 43.9 MB Beats 14.59%
// HashMap & brute-force
// T:O(n ^ 2 * k), S:O(k), k = 26
// 
class Solution {
    public int beautySum(String s) {
        int len = s.length(), ret = 0;
        for (int i = 0; i < len - 2; i++) {
            HashMap<Character, Integer> count = new HashMap<>();
            count.merge(s.charAt(i), 1, Integer::sum);
            count.merge(s.charAt(i + 1), 1, Integer::sum);
            for (int j = i + 2; j < len; j++) {
                count.merge(s.charAt(j), 1, Integer::sum);
                int min = Integer.MAX_VALUE, max = 0;
                for (char c : count.keySet()) {
                    min = Math.min(min, count.get(c));
                    max = Math.max(max, count.get(c));
                }
                ret += max - min;
            }
        }

        return ret;
    }
}
