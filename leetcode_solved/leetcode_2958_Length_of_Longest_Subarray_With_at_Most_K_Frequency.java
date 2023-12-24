// AC: Runtime 59 ms Beats 87.90% of users with Java
// Memory 55.86 MB Beats 97.17% of users with Java
// Sliding-window.
// T:O(n), S:O(1)
// 
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int leftPos = 0, ret = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            count.merge(nums[i], 1, Integer::sum);
            if (count.get(nums[i]) > k) {
                while (count.get(nums[i]) > k) {
                    count.merge(nums[leftPos], -1, Integer::sum);
                    leftPos++;
                }
            }
            ret = Math.max(ret, i - leftPos + 1);
        }

        return ret;
    }
}
