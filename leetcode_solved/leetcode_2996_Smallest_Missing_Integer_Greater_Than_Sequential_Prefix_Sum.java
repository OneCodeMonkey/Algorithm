// AC: Runtime 1 ms Beats 92.72% of users with Java
// Memory 41.94 MB Beats 89.97% of users with Java
// Notice: only needs to find array. prefix.
// T:O(n), S:O(n)
// 
class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> record = new HashSet<>();
        int len = nums.length, curSum = 0;
        boolean flag = true;
        for (int i = 0; i < len; i++) {
            if (flag) {
                if (i == 0) {
                    curSum = nums[i];
                } else {
                    if (nums[i] - nums[i - 1] == 1) {
                        curSum += nums[i];
                    } else {
                        flag = false;
                    }
                }
            }
            if (i == 0 || (!flag && nums[i] >= curSum)) {
                record.add(nums[i]);
            }
        }
        for (int i = curSum; ; i++) {
            if (!record.contains(i)) {
                return i;
            }
        }
    }
}
