// Runtime 86 ms Beats 69.22% 
// Memory 46.95 MB Beats 69.36%
// Two-layer travel & maintain a dynamic set, check current sum is in this set.
// T:O(n^2), S:O(n)
// 
class Solution {
    public int centeredSubarrays(int[] nums) {
        int ret = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            int sum = 0;
            HashSet<Integer> record = new HashSet<>();
            for (int j = i; j < len; j++) {
                sum += nums[j];
                record.add(nums[j]);
                if (record.contains(sum)) {
                    ret++;
                }
            }
        }

        return ret;
    }
}
