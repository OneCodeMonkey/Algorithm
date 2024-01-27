// Runtime 2 ms Beats 100.00% of users with Java
// Memory 43.98 MB Beats 50.00% of users with Java
// Greedy: sort.
// T:O(nlogn), S:O(logn)
// 
class Solution {
    public int minimumCost(int[] nums) {
        int first = nums[0], second = -1, third = -1;
        Arrays.sort(nums);
        boolean skipFirstOneTime = false;
        for (int i = 0; ; i++) {
            if (!skipFirstOneTime && nums[i] == first) {
                skipFirstOneTime = true;
                continue;
            }
            if (second == -1) {
                second = nums[i];
            } else {
                third = nums[i];
            }
            if (second != -1 && third != -1) {
                break;
            }
        }

        return first + second + third;
    }
}
