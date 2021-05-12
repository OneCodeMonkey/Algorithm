// AC：
// Runtime: 1 ms, faster than 100.00% of Java online submissions for Arranging Coins.
// Memory Usage: 36.1 MB, less than 62.65% of Java online submissions for Arranging Coins.
// 注意踩坑：题目 n ∈ [1, 2^31 - 1]，所以中途乘以2 开方， 或相乘，都要用 long 型
// 复杂度：T:O(sqrt(n)),S:O(1)
//
class Solution {
    public int arrangeCoins(int n) {
        // 从sqrt(2*n) 开始遍历
        long start = (long) (Math.sqrt(2 * (long)n) + 1);
        while (start >= 1) {
            long temp = n - start * (start - 1) / 2;
            if (temp <= start && temp >= 0) {
                // 最后一层齐
                if (temp == start) {
                    return (int)start;
                } else {
                    return (int)(start - 1);
                }
            }
            start--;
        }
        return 0;
    }
}