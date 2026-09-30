// Runtime 1 ms Beats 95.50% 
// Memory 42.55 MB Beats 48.02%
// .
// T:O(logn), S:O(1)
// 
class Solution {
    public boolean checkGoodInteger(int n) {
        int diffSum = 0;
        while (n > 0) {
            int digit = n % 10;
            diffSum += digit * (digit - 1);
            if (diffSum >= 50) {
                return true;
            }
            n /= 10;
        }

        return false;
    }
}
