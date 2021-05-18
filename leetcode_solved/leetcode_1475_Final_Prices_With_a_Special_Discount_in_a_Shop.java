// 1. brute-force
// AC: Runtime: 1 ms, faster than 97.60% of Java online submissions for Final Prices With a Special Discount in a Shop.
// Memory Usage: 39 MB, less than 53.60% of Java online submissions for Final Prices With a Special Discount in a Shop.
// 
// T:O(n^2), S:O(n)
// 
class Solution {
    public int[] finalPrices(int[] prices) {
        int size = prices.length;
        int[] ret = new int[size];

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (prices[i] >= prices[j]) {
                    ret[i] = prices[i] - prices[j];
                    break;
                } else {
                    ret[i] = prices[i];
                }
            }
        }
        ret[size - 1] = prices[size - 1];

        return ret;
    }
}

// 2.