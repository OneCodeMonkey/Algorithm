// Runtime 1 ms Beats 100.00% of users with Java
// Memory 79.60 MB Beats 100.00% of users with Java
// .
// T:O(sum(sqrt(ki)), S:O(1)
// 
class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int len = nums.length, left = -1, right = -1;
        for (int i = 0; i < len; i++) {
            if (checkPrime(nums[i])) {
                left = i;
                break;
            }
        }
        if (left == -1 || left == len - 1) {
            return 0;
        }
        for (int i = len - 1; i >= 0; i--) {
            if (checkPrime(nums[i])) {
                right = i;
                break;
            }
        }

        return right - left;
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
