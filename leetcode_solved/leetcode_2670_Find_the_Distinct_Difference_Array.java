// AC: Runtime 9 ms Beats 100% 
// Memory 43.8 MB Beats 20%
// Hashmap
// T:O(n), S:O(n)
// 
class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        HashMap<Integer, Integer> prefix = new HashMap<>(), suffix = new HashMap<>();
        for (int i : nums) {
            suffix.merge(i, 1, Integer::sum);
        }
        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            prefix.merge(nums[i], 1, Integer::sum);
            if (suffix.get(nums[i]) == 1) {
                suffix.remove(nums[i]);
            } else {
                suffix.merge(nums[i], -1, Integer::sum);
            }
            ret[i] = prefix.size() - suffix.size();
        }

        return ret;
    }
}
