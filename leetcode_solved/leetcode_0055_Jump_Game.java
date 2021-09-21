// AC: Runtime: 2 ms, faster than 77.50% of Java online submissions for Jump Game.
// Memory Usage: 39.6 MB, less than 87.08% of Java online submissions for Jump Game.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public boolean canJump(int[] nums) {
        int size = nums.length;
        if (size == 1) {
            return true;
        }
        int reach = 0, i = 0;
        for (; i < size && i <= reach; i++) {
            reach = Math.max(reach, i + nums[i]);
        }

        return i == size;
    }
}