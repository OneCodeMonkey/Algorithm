// 优化方法
// todo

// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Get Maximum in Generated Array.
// Memory Usage: 35.6 MB, less than 83.56% of Java online submissions for Get Maximum in Generated Array.
// brute-force
// T:O(n), S:O(n)
//
class Solution {
    public int getMaximumGenerated(int n) {
        int[] record = new int[n + 1];
        int ret = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        record[0] = 0;
        record[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                record[i] = record[i / 2];
            } else {
                record[i] = record[i / 2] + record[i / 2 + 1];
            }
            if (record[i] > ret) {
                ret = record[i];
            }
        }
        
        return ret;
    }
}