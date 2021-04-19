// AC:
// Runtime: 1 ms, faster than 64.93% of Java online submissions for Number of Good Pairs.
// Memory Usage: 36.4 MB, less than 50.01% of Java online submissions for Number of Good Pairs.
// 思路：略
// 复杂度：T：O(n), S:O(n)
// 
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            record.merge(nums[i], 1, Integer::sum);
        }
        int ret = 0;
        for (Integer item : record.keySet()) {
            int occurTimes = record.get(item);
            if (occurTimes > 1) {
                ret += occurTimes * (occurTimes - 1) / 2;
            }
        }

        return ret;
    }
}