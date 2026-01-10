// Runtime 21 ms Beats 40.46% 
// Memory 115.41 MB Beats 26.95%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public long minCost(String s, int[] cost) {
        long sum = 0, max = 0;
        HashMap<Character, Long> perCharCost = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sum += (long) cost[i];
            perCharCost.merge(c, (long) cost[i], Long::sum);
        }
        for (char c : perCharCost.keySet()) {
            max = Math.max(max, perCharCost.get(c));
        }

        return sum - max;
    }
}
