// AC: Runtime 24 ms Beats 33.33% of users with Java
// Memory 56.77 MB Beats 66.67% of users with Java
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len / 3; i++) {
            if (nums[3 * i + 2] - nums[3 * i] > k) {
                return new int[0][];
            }
        }
        int[][] ret = new int[len / 3][3];
        for (int i = 0; i < len / 3; i++) {
            ret[i] = new int[]{nums[3 * i], nums[3 * i + 1], nums[3 * i + 2]};
        }

        return ret;
    }
}
