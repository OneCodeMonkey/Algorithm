// AC: Runtime 8 ms Beats 20% 
// Memory 51.5 MB Beats 100%
// check prime
// T:O(n * (n / 2)), S:O(1)
// 
class Solution {
    public int diagonalPrime(int[][] nums) {
        int len = nums.length, ret = 0;
        for (int i = 0; i < len; i++) {
            if (checkPrime(nums[i][i])) {
                ret = Math.max(ret, nums[i][i]);
            }
            if (checkPrime(nums[i][len - 1 - i])) {
                ret = Math.max(ret, nums[i][len - 1 - i]);
            }
        }

        return ret;
    }

    private boolean checkPrime(int n) {
        if (n <= 2) {
            return n == 2;
        }

        int top = (int) Math.sqrt(n);
        for (int i = 2; i <= top; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}