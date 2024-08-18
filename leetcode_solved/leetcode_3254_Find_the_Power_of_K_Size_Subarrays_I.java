// Runtime 3 ms Beats 100.00%
// Memory 45.50 MB Beats 100.00%
// Brute-force
// T:O(n^2), S:O(n)
// 
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if (k == 1) {
            return nums;
        }
        int len = nums.length;
        int[] ret = new int[len + 1 - k];
        for (int i = 0; i <= len - k; i++) {
            int startVal = nums[i];
            boolean flag = true;
            for (int j = i + 1; j < i + k; j++) {
                if (nums[j] - startVal != j - i) {
                    flag = false;
                }
            }
            ret[i] = flag ? nums[i + k - 1] : -1;
        }

        return ret;
    }
}
