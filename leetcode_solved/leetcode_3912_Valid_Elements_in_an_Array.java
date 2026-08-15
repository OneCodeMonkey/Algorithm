// Runtime 1 ms Beats 100.00% 
// Memory 46.76 MB Beats 41.13%
// Prefix sum.
// T:O(n), S:O(n)
// 
class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int len = nums.length;
        List<Integer> ret = new ArrayList<>();
        if (len < 3) {
            for (int i : nums) {
                ret.add(i);
            }
        } else {
            int[] leftLargest = new int[len];
            int curMax = -1;
            for (int i = len - 1; i >= 1; i--) {
                curMax = Math.max(curMax, nums[i]);
                leftLargest[i] = curMax;
            }

            ret.add(nums[0]);
            int max1 = nums[0];
            for (int i = 1; i < len - 1; i++) {
                if (nums[i] > max1 || nums[i] > leftLargest[i + 1]) {
                    ret.add(nums[i]);
                }
                max1 = Math.max(max1, nums[i]);
            }
            ret.add(nums[len - 1]);
        }

        return ret;
    }
}
