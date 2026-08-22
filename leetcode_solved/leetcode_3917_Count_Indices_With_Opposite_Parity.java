// Runtime 1 ms Beats 100.00% 
// Memory 46.84 MB Beats 56.14%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int[] countOppositeParity(int[] nums) {
        int len = nums.length, countOdd = 0, countEven = 0;
        for (int num : nums) {
            if (num % 2 == 1) {
                countOdd++;
            } else {
                countEven++;
            }
        }
        int curOdd = 0, curEven = 0;
        int[] ret = new int[len];
        for (int i = 0; i < len; i++) {
            if (nums[i] % 2 == 1) {
                curOdd++;
                ret[i] = countEven - curEven;
            } else {
                curEven++;
                ret[i] = countOdd - curOdd;
            }
        }

        return ret;
    }
}

