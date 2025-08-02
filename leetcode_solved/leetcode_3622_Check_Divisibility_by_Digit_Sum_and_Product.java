// Runtime 0 ms Beats 100.00% 
// Memory 41.34 MB Beats 100.00%
// .
// T:O(logn), S:O(1)
// 
class Solution {
    public boolean checkDivisibility(int n) {
        int sum1 = 0, sum2 = 1, n1 = n;
        while (n1 > 0) {
            sum1 += n1 % 10;
            n1 /= 10;
        }
        n1 = n;
        while (n1 > 0) {
            sum2 *= n1 % 10;
            n1 /= 10;
        }

        return n % (sum1 + sum2) == 0;
    }
}
