// AC: Runtime: 4 ms, faster than 40.00% of Java online submissions for Minimum Cost of Buying Candies With Discount.
// Memory Usage: 39.6 MB, less than 20.00% of Java online submissions for Minimum Cost of Buying Candies With Discount.
// sort and choose every two largest.
// O:(nlogn), S:O(logn)
// 
class Solution {
    public int minimumCost(int[] cost) {
        int ret = 0;
        Arrays.sort(cost);
        for (int i = cost.length - 1; i >= 0; i--) {
            if ((cost.length - i) % 3 == 0) {
                continue;
            }
            ret += cost[i];
        }
        return ret;
    }
}