// AC: Runtime: 4 ms, faster than 60.00% of Java online submissions for Most Frequent Number Following Key In an Array.
// Memory Usage: 46.8 MB, less than 20.00% of Java online submissions for Most Frequent Number Following Key In an Array.
// hashmap.
// T:O(n), S:O(1)
// 
class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> record = new HashMap<>();
        int curMaxTime = 0, curMax = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == key) {
                record.merge(nums[i], 1, Integer::sum);
                if (record.get(nums[i]) > curMaxTime) {
                    curMaxTime = record.get(nums[i]);
                    curMax = nums[i];
                }
            }
        }

        return curMax;
    }
}