// AC: Runtime 1 ms Beats 66.67%
// Memory 39.4 MB Beats 33.33%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sum2 += i;
            } else {
                sum1 += i;
            }
        }

        return sum1 - sum2;
    }
}
