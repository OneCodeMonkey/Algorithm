// Runtime 35 ms Beats 82.95% 
// Memory 60.36 MB Beats 31.15%
// Greedy & Sort. Or using set both are ok.
// T:O(nlogn), S:O(1)
// 
class Solution {
    public int minIncrementForUnique(int[] nums) {
        int cur = -1, ret = 0;
        Arrays.sort(nums);
        for (int num : nums) {
            if (num > cur) {
                cur = num;
            } else if (num == cur) {
                ret += 1;
                cur += 1;
            } else {
                ret += cur - num + 1;
                cur += 1;
            }
        }

        return ret;
    }
}
