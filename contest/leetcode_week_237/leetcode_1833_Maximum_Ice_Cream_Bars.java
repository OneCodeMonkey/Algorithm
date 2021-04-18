// AC:
// Runtime: 28 ms, faster than 100.00% of Java online submissions for Maximum Ice Cream Bars.
// Memory Usage: 55.9 MB, less than 25.00% of Java online submissions for Maximum Ice Cream Bars.
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum = 0;
        for(int i = 0; i < costs.length; i++) {
            sum += costs[i];
            if (sum == coins) {
                return i + 1;
            }
            if (sum > coins) {
                if (sum == 0) {
                    return 0;
                } else {
                    return i;
                }
            }
        }
        return costs.length;
    }
}