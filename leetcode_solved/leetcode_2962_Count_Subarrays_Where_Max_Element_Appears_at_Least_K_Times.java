// AC: Runtime 28 ms Beats 13.98% of users with Java
// Memory 58.48 MB Beats 84.52% of users with Java
// Prefix sum.
// T:O(n), S:O(n)
// 
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int len = nums.length, maxElem = 0, countMax = 0;
        long ret = 0;
        HashMap<Integer, Integer> countMaxToMinIndex = new HashMap<>();
        countMaxToMinIndex.put(0, -1);
        for (int i : nums) {
            maxElem = Math.max(maxElem, i);
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] == maxElem) {
                countMax++;
            }
            countMaxToMinIndex.putIfAbsent(countMax, i);
            if (countMax >= k) {
                ret += countMaxToMinIndex.get(countMax - k + 1) + 1;
            }
        }

        return ret;
    }
}
