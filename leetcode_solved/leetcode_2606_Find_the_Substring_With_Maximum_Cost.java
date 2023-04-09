// AC: Runtime 24 ms Beats 30.39% 
// Memory 43.4 MB Beats 47.89%
// DP.
// T:O(n), S:O(n + 26)
// 
class Solution {
    private HashMap<Character, Integer> charToValue = new HashMap<>();
    public int maximumCostSubstring(String s, String chars, int[] vals) {

        for (int i = 0; i < chars.length(); i++) {
            charToValue.put(chars.charAt(i), i);
        }
        int len = s.length(), ret = 0;
        int[] dp = new int[len + 1];
        for (int i = 0; i < len; i++) {
            int val = getVal(s.charAt(i), chars, vals);
            dp[i + 1] = Math.max(dp[i] + val, val);
            ret = Math.max(ret, dp[i + 1]);
        }

        return ret;
    }

    private int getVal(char c, String chars, int[] vals) {
        if (charToValue.containsKey(c)) {
            return vals[charToValue.get(c)];
        }

        return c - 'a' + 1;
    }
}
