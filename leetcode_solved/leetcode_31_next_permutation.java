// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Next Permutation.
// Memory Usage: 38.8 MB, less than 92.84% of Java online submissions for Next Permutation.
// see wikipedia's explanation about next-permutation
// T:O(n), S:O(1)
//
class Solution {
    public void nextPermutation(int[] nums) {
        int size = nums.length, k, l;
        for (k = size - 2; k >= 0; k--) {
            if (nums[k] < nums[k + 1]) {
                break;
            }
        }
        if (k < 0) {
            // reverse
            for (int i = 0; i < size / 2; i++) {
                int temp = nums[i];
                nums[i] = nums[size - 1 - i];
                nums[size - 1 - i] = temp;
            }
        } else {
            for (l = size - 1; l > k; l--) {
                if (nums[l] > nums[k]) {
                    break;
                }
            }
            int temp = nums[k];
            nums[k] = nums[l];
            nums[l] = temp;
            // reverse [k+1, n)
            for (int i = 0; i < (size - k - 1) / 2; i++) {
                temp = nums[k + 1 + i];
                nums[k + 1 + i] = nums[size - 1 - i];
                nums[size - 1 - i] = temp;
            }
        }
    }
}