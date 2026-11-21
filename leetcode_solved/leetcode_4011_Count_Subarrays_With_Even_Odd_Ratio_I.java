// Runtime 43 ms Beats 44.14% 
// Memory 46.53 MB Beats 46.57%
// Brute-force.
// T:O(n^2), S:O(1)
// 
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int ret = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            int countOdd = 0, countEven = 0;
            for (int j = i; j < len; j++) {
                if (nums[j] % 2 == 1) {
                    countOdd++;
                } else {
                    countEven++;
                }
                if (b * countEven <= a * countOdd) {
                    ret++;
                }
            }
        }

        return ret;
    }
}
