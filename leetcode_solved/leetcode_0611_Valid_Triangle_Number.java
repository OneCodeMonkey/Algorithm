// AC: Runtime: 42 ms, faster than 40.06% of Java online submissions for Valid Triangle Number.
// Memory Usage: 38.7 MB, less than 56.96% of Java online submissions for Valid Triangle Number.
// First sort, then use two loops, notice to record the third-index while j++
// T:O(n^2), S:O(1)
// 
class Solution {
    public int triangleNumber(int[] nums) {
        int size = nums.length, ret = 0;
        if (size >= 3) {
            Arrays.sort(nums);
            for (int i = 0; i < size - 2; i++) {
                int startIndex = i + 2;
                for (int j = i + 1; j < size - 1; j++) {
                    int k = Math.max(startIndex, j + 1);
                    while (k < size && nums[k] < nums[i] + nums[j]) {
                        k++;
                    }
                    ret += k - j - 1;
                    startIndex = k;
                }
            }
        }

        return ret;
    }
}