// Runtime 38 ms Beats 63.24% 
// Memory 56.93 MB Beats 82.65%
// Prefix sum & tricky.
// T:O(n), S:O(n)
// 
class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> diffCount = new HashMap<>();
        int len = nums.length;
        long ret = 0;
        for (int i = 0; i < len; i++) {
            diffCount.merge(nums[i] - i, 1, Integer::sum);
        }
        for (int i = 0; i < len; i++) {
            ret += len - diffCount.get(nums[i] - i);
        }

        return ret / 2;
    }
}
