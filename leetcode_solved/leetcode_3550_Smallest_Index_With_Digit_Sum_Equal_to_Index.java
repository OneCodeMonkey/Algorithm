// Runtime 1 ms Beats 100.00% 
// Memory 44.10 MB Beats 100.00%
// .
// T:O(nlogk), S:O(1)
// 
class Solution {
    public int smallestIndex(int[] nums) {
        int ret = -1;
        for (int i = 0; i < nums.length; i++) {
            int digitSum = 0;
            while (nums[i] > 0) {
                digitSum += nums[i] % 10;
                nums[i] /= 10;
            }
            if (digitSum == i) {
                ret = i;
                break;
            }
        }

        return ret;
    }
}
