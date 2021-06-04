// AC: Runtime: 240 ms, faster than 25.29% of Java online submissions for Fair Candy Swap.
// Memory Usage: 40.4 MB, less than 75.74% of Java online submissions for Fair Candy Swap.
// .
// T:O(m* n), S:O(1)
// 
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int size1 = aliceSizes.length, size2 = bobSizes.length, sum1 = 0, sum2 = 0, diff;
        for (int i: aliceSizes) {
            sum1 += i;
        }
        for (int i: bobSizes) {
            sum2 += i;
        }
        diff = (sum1 - sum2) / 2;
        int[] ret = new int[2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (aliceSizes[i] - bobSizes[j] == diff) {
                    ret[0] = aliceSizes[i];
                    ret[1] = bobSizes[j];
                    return ret;
                }
            }
        }
        return ret;
    }
}