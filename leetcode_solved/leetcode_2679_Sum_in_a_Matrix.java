// AC: Runtime 16 ms Beats 50% 
// Memory 68.2 MB Beats 33.33%
// Sort.
// T:O(m * nlogn), S:O(1)
// 
class Solution {
    public int matrixSum(int[][] nums) {
        int row = nums.length, col = nums[0].length, ret = 0;
        for (int[] rowArr : nums) {
            Arrays.sort(rowArr);
        }
        for (int i = 0; i < col; i++) {
            int maxValOfCol = -1;
            for (int[] num : nums) {
                maxValOfCol = Math.max(maxValOfCol, num[i]);
            }
            ret += maxValOfCol;
        }

        return ret;
    }
}
