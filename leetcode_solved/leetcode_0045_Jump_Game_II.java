// AC: Runtime: 2 ms, faster than 63.33% of Java online submissions for Jump Game II.
// Memory Usage: 46.1 MB, less than 29.12% of Java online submissions for Jump Game II.
// greedy.
// T:O(n), S:O(1)
//
class Solution {
    public int jump(int[] nums) {
        int size = nums.length;
        int ret = 0, curEnd = 0, curFarthest = 0;
        for (int i = 0; i < size - 1; i++) {
            curFarthest = Math.max(curFarthest, i + nums[i]);
            if (i == curEnd) {
                ret++;
                curEnd = curFarthest;
            }
        }

        return ret;
    }
}