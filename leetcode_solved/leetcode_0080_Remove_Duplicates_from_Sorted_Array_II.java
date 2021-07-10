// AC: Runtime: 1 ms, faster than 30.57% of Java online submissions for Remove Duplicates from Sorted Array II.
// Memory Usage: 38.9 MB, less than 85.24% of Java online submissions for Remove Duplicates from Sorted Array II.
// since the nums[i] ∈ [-10^4, 10^4], if we find three or above duplicates, we sign it as -10001, then move the element in O(n) complexity.
// T:O(n), S:O(1)
// 
class Solution {
    public int removeDuplicates(int[] nums) {
        int size = nums.length, dup = 0, tempCount = 1, prev = -10001;
        if (size > 1) {
            for (int i = 1; i < size; i++) {
                if (nums[i] == nums[i - 1] || nums[i] == prev) {
                    tempCount++;
                    prev = nums[i];
                    if (tempCount >= 3) {
                        dup++;
                        // sign as a unique num.
                        nums[i] = -10001;
                    }
                } else {
                    prev = -10001;
                    tempCount = 1;
                }
            }

            int pos = 0;
            for (int i = 0; i < size; i++, pos++) {
                if (nums[i] == -10001) {
                    while (pos < size && nums[pos] == -10001) {
                        pos++;
                    }
                    if (pos >= size) {
                        break;
                    }
                    nums[i] = nums[pos];
                    nums[pos] = -10001;
                }
            }
        }

        return size - dup;
    }
}