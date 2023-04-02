// AC: Runtime 13 ms Beats 35.44% 
// Memory 59.5 MB Beats 27.67%
// Greedy & two-pointer.
// T:O(nlogn), S:O(logn)
// 
class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int ret = 0, len = nums.length, pos = len - 1;
        for (int i = len - 1; i >= 0; i--) {
            while (pos >= 0 && nums[i] <= nums[pos]) {
                pos--;
            }
            if (pos >= 0 && nums[i] > nums[pos]) {
                ret++;
                pos--;
            }
            if (pos < 0) {
                break;
            }
        }

        return ret;
    }
}
