// Runtime 46 ms Beats 35.37% 
// Memory 145.82 MB Beats 59.19%
// Greedy.
// T:O(nlogn), S:O(logn)
// 
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double ret = 0.0;
        Arrays.sort(discounts);
        Arrays.sort(prices);
        int j = discounts.length - 1;
        for (int i = prices.length - 1; i >= 0; i--) {
            int discount = j >= 0 ? discounts[j--] : 0;
            ret += (100 - discount) * prices[i] / 100.0;
        }

        return ret;
    }
}
