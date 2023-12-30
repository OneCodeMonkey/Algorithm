// AC: Runtime 2 ms Beats 100.00% of users with Java
// Memory 44.80 MB Beats 66.67% of users with Java
// .
// T:O(nlogn), S:O(logn)
// 
class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length / 2; i++) {
            ret[2 * i] = nums[2 * i + 1];
            ret[2 * i + 1] = nums[2 * i];
        }

        return ret;
    }
}
